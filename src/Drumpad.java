/* SOURCE CODE WRITTEN AND COMPILED BY YASH BRID
 * GIT HUB : yashbrid03
 *  */

import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;
import javax.swing.*;
import java.io.File;
import java.awt.*;
import java.awt.event.*;



public class Drumpad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drumpad frame = new Drumpad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Color a = new Color(175, 175, 220);
	 Color b = new Color(45, 132, 138);
	Color c = new Color(162, 250, 163); 
	 Color d = new Color(231, 107, 116); 
	 Color e = new Color(135, 92, 116); 
	 Color f = new Color(112, 162, 136); 
	// Color g = new Color(252, 176, 126); 
	Color h = new Color(213, 137, 111); 
	Color i = new Color(216, 30, 91); 
	
	public static final String s1="D:\\sounds\\bubbles.mp3";
	public static final String s2="D:\\sounds\\clay.mp3";
	public static final String s3="D:\\sounds\\confetti.mp3";
	public static final String s4="D:\\sounds\\glimmer.mp3";
	public static final String s5="D:\\sounds\\moon.mp3";
	public static final String s6="D:\\sounds\\ufo.mp3";
	public static final String s7="D:\\sounds\\7.mp3";
	public static final String s8="D:\\sounds\\8.mp3";
	public static final String s9="D:\\sounds\\9.mp3";
	MP3Player mp3player1= new MP3Player(new File(s1));
	MP3Player mp3player2= new MP3Player(new File(s2));
	MP3Player mp3player3= new MP3Player(new File(s3));
	MP3Player mp3player4= new MP3Player(new File(s4));
	MP3Player mp3player5= new MP3Player(new File(s5));
	MP3Player mp3player6= new MP3Player(new File(s6));
	MP3Player mp3player7= new MP3Player(new File(s7));
	MP3Player mp3player8= new MP3Player(new File(s8));
	MP3Player mp3player9= new MP3Player(new File(s9));
	
	Canvas canvas = new Canvas();
	
	
	public Drumpad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		canvas.setBackground(Color.ORANGE);
		canvas.setBounds(10, 65, 303, 56);
		contentPane.add(canvas);
		
		JLabel lblNewLabel = new JLabel("Drum Pad");
		lblNewLabel.setFont(new Font("Elephant", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 303, 56);
		contentPane.add(lblNewLabel);
		
		JButton btn1 = new JButton("BUBBLES");
		btn1.setBackground(a);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player1.play();
				update(canvas);
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player1.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player1.setRepeat(false);
				    }}
			  });
		btn1.setBounds(11, 144, 100, 100);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("CLAY");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBackground(b);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player2.play();
				update2(canvas);
			}
		});
		btn2.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player2.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player2.setRepeat(false);
				    }}
			  });
		btn2.setBounds(113, 144, 100, 100);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("CONFETTI");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn3.setBackground(c);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player3.play();
				update3(canvas);
			}
		});
		btn3.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player3.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player3.setRepeat(false);
				    }}
			  });
		btn3.setBounds(214, 144, 100, 100);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("GLIMMER");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn4.setBackground(d);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mp3player4.play();
				update4(canvas);
			}
		});
		btn4.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player4.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player4.setRepeat(false);
				    }}
			  });
		btn4.setBounds(11, 246, 100, 100);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("MOON");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn5.setBackground(e);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player5.play();
				update5(canvas);
			}
		});
		btn5.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player5.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player5.setRepeat(false);
				    }}
			  });
		btn5.setBounds(113, 246, 100, 100);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("UFO");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn6.setBackground(f);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player6.play();
				update6(canvas);
			}
		});
		btn6.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player6.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player6.setRepeat(false);
				    }}
			  });
		btn6.setBounds(215, 246, 100, 100);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("Kick 1");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn7.setBackground(Color.pink);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player7.play();
				update7(canvas);
			}
		});
		btn7.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player7.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player7.setRepeat(false);
				    }}
			  });
		btn7.setBounds(11, 348, 100, 100);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("Kick 2");
		btn8.setBackground(h);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player8.play();
				update8(canvas);
			}
		});
		btn8.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player8.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player8.setRepeat(false);
				    }}
			  });
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn8.setBounds(113, 348, 100, 100);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("Kick 3");
		btn9.setBackground(i);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp3player9.play();
				update9(canvas);
			}
		});
		btn9.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent evt) {
			    
			    if (evt.getClickCount() == 2) {

			      // Double-click detected
			      mp3player9.setRepeat(true);
			    }
			    if (evt.getClickCount() == 3) {

				      // Double-click detected
				      mp3player9.setRepeat(false);
				    }}
			  });
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn9.setBounds(215, 348, 100, 100);
		contentPane.add(btn9);
		
		
		 
	}
	
	public void update(Canvas canvas) {
		  
		canvas.setBackground(a);
	}
	public void update2(Canvas canvas) {
		 
		canvas.setBackground(b);
	}
	public void update3(Canvas canvas) {
		 
		canvas.setBackground(c);
	}
	public void update4(Canvas canvas) {
		
		canvas.setBackground(d);
	}
	public void update5(Canvas canvas) {
		
		canvas.setBackground(e);
	}
	public void update6(Canvas canvas) {
		
		canvas.setBackground(f);
	}
	public void update7(Canvas canvas) {
		
		canvas.setBackground(Color.pink);
	}
	public void update8(Canvas canvas) {
		 
		canvas.setBackground(h);
	}
	public void update9(Canvas canvas) {
		 
		canvas.setBackground(i);
	}
}
