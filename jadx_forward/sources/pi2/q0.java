package pi2;

/* loaded from: classes10.dex */
public final class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final zh2.c I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.p f436336J;
    public final java.util.LinkedList K;
    public int L;
    public final jz5.g M;
    public r45.jf5 N;
    public final java.util.LinkedList P;
    public final jz5.g Q;
    public final java.util.LinkedList R;
    public int S;
    public final jz5.g T;
    public final java.util.LinkedList U;
    public int V;
    public final jz5.g W;
    public fg2.m1 X;
    public boolean Y;
    public java.lang.String Z;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f436337p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context, gk2.e liveData, zh2.c pluginAbility, yz5.p settingInvoke) {
        super(context, false, null, 0.6666667f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingInvoke, "settingInvoke");
        this.H = liveData;
        this.I = pluginAbility;
        this.f436336J = settingInvoke;
        this.K = new java.util.LinkedList();
        this.M = jz5.h.b(new pi2.l0(context, this));
        this.N = new r45.jf5();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.N);
        linkedList.add(new r45.jf5());
        this.P = linkedList;
        this.Q = jz5.h.b(new pi2.j0(context, this));
        this.R = new java.util.LinkedList();
        this.T = jz5.h.b(new pi2.p0(context, this));
        this.U = new java.util.LinkedList();
        this.W = jz5.h.b(new pi2.n0(context, this));
        this.Z = "";
        this.f436337p0 = jz5.h.b(new pi2.h0(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570488ds5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.f563868bp;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f563868bp);
        if (c22661xa3a2b3c0 != null) {
            i17 = com.p314xaae8f345.mm.R.id.f564242r32;
            android.view.View a17 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564242r32);
            if (a17 != null) {
                i17 = com.p314xaae8f345.mm.R.id.che;
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.che);
                if (c1095x65355f89 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.rjj;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rjj);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.rjn;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rjn);
                        if (viewOnClickListenerC22631x1cc07cc8 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.rjv;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rjv);
                            if (frameLayout != null) {
                                i17 = com.p314xaae8f345.mm.R.id.gz9;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.gz9);
                                if (textView2 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.rx6;
                                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rx6);
                                    if (textView3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.rx7;
                                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rx7);
                                        if (textView4 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.rx9;
                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rx9);
                                            if (c1073x7e08a787 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.rx_;
                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rx_);
                                                if (textView5 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.rxa;
                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxa);
                                                    if (textView6 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.rxb;
                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxb);
                                                        if (c22699x3dcdb352 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.rxc;
                                                            android.view.View a18 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxc);
                                                            if (a18 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.rxd;
                                                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxd);
                                                                if (c1073x7e08a7872 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.rxe;
                                                                    android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxe);
                                                                    if (textView7 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.rxf;
                                                                        android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxf);
                                                                        if (textView8 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.rxg;
                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxg);
                                                                            if (c22699x3dcdb3522 != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.rxh;
                                                                                android.view.View a19 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxh);
                                                                                if (a19 != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.rxi;
                                                                                    android.view.View a27 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxi);
                                                                                    if (a27 != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.rxj;
                                                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxj);
                                                                                        if (c1073x7e08a7873 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.rxk;
                                                                                            android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxk);
                                                                                            if (textView9 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.rxl;
                                                                                                android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxl);
                                                                                                if (textView10 != null) {
                                                                                                    i17 = com.p314xaae8f345.mm.R.id.rxm;
                                                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxm);
                                                                                                    if (c22699x3dcdb3523 != null) {
                                                                                                        i17 = com.p314xaae8f345.mm.R.id.rxw;
                                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxw);
                                                                                                        if (c22699x3dcdb3524 != null) {
                                                                                                            i17 = com.p314xaae8f345.mm.R.id.rxx;
                                                                                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxx);
                                                                                                            if (c1073x7e08a7874 != null) {
                                                                                                                i17 = com.p314xaae8f345.mm.R.id.rxy;
                                                                                                                android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxy);
                                                                                                                if (textView11 != null) {
                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.rxz;
                                                                                                                    android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxz);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.f567454ry0;
                                                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567454ry0);
                                                                                                                        if (c22699x3dcdb3525 != null) {
                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.f567462ry2;
                                                                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567462ry2);
                                                                                                                            if (c22699x3dcdb3526 != null) {
                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.f567463ry3;
                                                                                                                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567463ry3);
                                                                                                                                if (c1073x7e08a7875 != null) {
                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.f567464ry4;
                                                                                                                                    android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567464ry4);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.f567465ry5;
                                                                                                                                        android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567465ry5);
                                                                                                                                        if (textView14 != null) {
                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.ry6;
                                                                                                                                            android.widget.TextView textView15 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ry6);
                                                                                                                                            if (textView15 != null) {
                                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.ry7;
                                                                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ry7);
                                                                                                                                                if (c22699x3dcdb3527 != null) {
                                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.s3l;
                                                                                                                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s3l);
                                                                                                                                                    if (linearLayout != null) {
                                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.s3m;
                                                                                                                                                        android.widget.TextView textView16 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s3m);
                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.s5f;
                                                                                                                                                            android.widget.TextView textView17 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s5f);
                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.s5h;
                                                                                                                                                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7876 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s5h);
                                                                                                                                                                if (c1073x7e08a7876 != null) {
                                                                                                                                                                    this.X = new fg2.m1((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView, c22661xa3a2b3c0, a17, c1095x65355f89, textView, viewOnClickListenerC22631x1cc07cc8, frameLayout, textView2, textView3, textView4, c1073x7e08a787, textView5, textView6, c22699x3dcdb352, a18, c1073x7e08a7872, textView7, textView8, c22699x3dcdb3522, a19, a27, c1073x7e08a7873, textView9, textView10, c22699x3dcdb3523, c22699x3dcdb3524, c1073x7e08a7874, textView11, textView12, c22699x3dcdb3525, c22699x3dcdb3526, c1073x7e08a7875, textView13, textView14, textView15, c22699x3dcdb3527, linearLayout, textView16, textView17, c1073x7e08a7876);
                                                                                                                                                                    c1073x7e08a7872.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var = this.X;
                                                                                                                                                                    if (m1Var == null) {
                                                                                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var.f343678g.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var2 = this.X;
                                                                                                                                                                    if (m1Var2 == null) {
                                                                                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var2.f343687p.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var3 = this.X;
                                                                                                                                                                    if (m1Var3 == null) {
                                                                                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var3.f343685n.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var4 = this.X;
                                                                                                                                                                    if (m1Var4 == null) {
                                                                                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var4.f343689r.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var5 = this.X;
                                                                                                                                                                    if (m1Var5 == null) {
                                                                                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var5.f343673b.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var6 = this.X;
                                                                                                                                                                    if (m1Var6 == null) {
                                                                                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var6.f343677f.setOnClickListener(this);
                                                                                                                                                                    fg2.m1 m1Var7 = this.X;
                                                                                                                                                                    if (m1Var7 == null) {
                                                                                                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    m1Var7.f343676e.m81396xb3e0a10a(new pi2.f0(this));
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        super.U();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.g5) this.H.a(mm2.g5.class)).f410624h;
        if (c19786x6a1e2862 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = this.f199716e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        e0();
    }

    public final void e0() {
        fg2.m1 m1Var = this.X;
        if (m1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        boolean z17 = false;
        if (this.L != 0 && this.N.m75939xb282bd08(0) != 0 && this.S != 0) {
            z17 = true;
        }
        m1Var.f343673b.setEnabled(z17);
    }

    public final void f0(boolean z17, java.lang.String str) {
        this.Y = z17;
        this.Z = str;
        if (!z17) {
            fg2.m1 m1Var = this.X;
            if (m1Var != null) {
                m1Var.f343686o.setText("");
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        fg2.m1 m1Var2 = this.X;
        if (m1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        m1Var2.f343686o.setText(this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mle));
    }

    public final void g0(r45.jf5 jf5Var, java.lang.String str) {
        this.N = jf5Var;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f343679h.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void h0(int i17, java.lang.String str) {
        this.S = i17;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f343688q.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void i0(int i17, java.lang.String str) {
        this.V = i17;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f343690s.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void j0(int i17, java.lang.String str) {
        this.L = i17;
        fg2.m1 m1Var = this.X;
        if (m1Var != null) {
            m1Var.f343682k.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicSettingPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.m1 m1Var = this.X;
        if (m1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = m1Var.f343681j.getId();
        gk2.e eVar = this.H;
        if (valueOf != null && valueOf.intValue() == id6) {
            r45.p52 p52Var = ((mm2.g5) eVar.a(mm2.g5.class)).f410623g;
            java.util.LinkedList payDurationList = p52Var != null ? p52Var.m75941xfb821914(0) : null;
            if (payDurationList == null) {
                payDurationList = this.K;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            pi2.z zVar = (pi2.z) ((jz5.n) this.M).mo141623x754a37bb();
            int i17 = this.L;
            zVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payDurationList, "payDurationList");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(zVar, null, false, 0, 7, null);
            int indexOf = payDurationList.indexOf(java.lang.Integer.valueOf(i17));
            zVar.M = indexOf;
            if (indexOf == -1) {
                zVar.M = 0;
                java.lang.Object first = payDurationList.getFirst();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
                ((java.lang.Number) first).intValue();
            }
            java.util.LinkedList linkedList = zVar.L;
            linkedList.clear();
            linkedList.addAll(payDurationList);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = zVar.I;
            if (c22706xd568f79 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(payDurationList, 10));
            java.util.Iterator it = payDurationList.iterator();
            while (it.hasNext()) {
                arrayList2.add(zVar.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue())));
            }
            c22706xd568f79.m82070x203ffbdd((java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = zVar.I;
            if (c22706xd568f792 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                throw null;
            }
            c22706xd568f792.m82071x53d8522f(zVar.M);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f793 = zVar.I;
            if (c22706xd568f793 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                throw null;
            }
            c22706xd568f793.c(zVar.M);
        } else {
            fg2.m1 m1Var2 = this.X;
            if (m1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = m1Var2.f343678g.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                r45.p52 p52Var2 = ((mm2.g5) eVar.a(mm2.g5.class)).f410623g;
                java.util.LinkedList breakList = p52Var2 != null ? p52Var2.m75941xfb821914(1) : null;
                if (breakList == null) {
                    breakList = this.P;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                pi2.x xVar = (pi2.x) ((jz5.n) this.Q).mo141623x754a37bb();
                r45.jf5 defaultBreak = this.N;
                xVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(breakList, "breakList");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultBreak, "defaultBreak");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(xVar, null, false, 0, 7, null);
                java.util.Iterator it6 = breakList.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i18 = -1;
                        break;
                    } else {
                        if ((((r45.jf5) it6.next()).m75939xb282bd08(0) == defaultBreak.m75939xb282bd08(0)) == true) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                xVar.M = i18;
                if (i18 == -1) {
                    xVar.M = 0;
                }
                java.util.LinkedList linkedList2 = xVar.L;
                linkedList2.clear();
                linkedList2.addAll(breakList);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f794 = xVar.I;
                if (c22706xd568f794 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(breakList, 10));
                java.util.Iterator it7 = breakList.iterator();
                while (it7.hasNext()) {
                    java.lang.String m75945x2fec8307 = ((r45.jf5) it7.next()).m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    arrayList3.add(m75945x2fec8307);
                }
                c22706xd568f794.m82070x203ffbdd((java.lang.String[]) arrayList3.toArray(new java.lang.String[0]));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f795 = xVar.I;
                if (c22706xd568f795 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                    throw null;
                }
                c22706xd568f795.m82071x53d8522f(xVar.M);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f796 = xVar.I;
                if (c22706xd568f796 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                    throw null;
                }
                c22706xd568f796.c(xVar.M);
            } else {
                fg2.m1 m1Var3 = this.X;
                if (m1Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                int id8 = m1Var3.f343687p.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    r45.p52 p52Var3 = ((mm2.g5) eVar.a(mm2.g5.class)).f410623g;
                    java.util.LinkedList priceList = p52Var3 != null ? p52Var3.m75941xfb821914(2) : null;
                    if (priceList == null) {
                        priceList = this.R;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                    pi2.e0 e0Var = (pi2.e0) ((jz5.n) this.T).mo141623x754a37bb();
                    int i19 = this.S;
                    e0Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceList, "priceList");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(e0Var, null, false, 0, 7, null);
                    int indexOf2 = priceList.indexOf(java.lang.Integer.valueOf(i19));
                    e0Var.M = indexOf2;
                    if (indexOf2 == -1) {
                        e0Var.M = 0;
                        java.lang.Object first2 = priceList.getFirst();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first2, "getFirst(...)");
                        ((java.lang.Number) first2).intValue();
                    }
                    java.util.LinkedList linkedList3 = e0Var.L;
                    linkedList3.clear();
                    linkedList3.addAll(priceList);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f797 = e0Var.I;
                    if (c22706xd568f797 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(priceList, 10));
                    java.util.Iterator it8 = priceList.iterator();
                    while (it8.hasNext()) {
                        arrayList4.add(java.lang.String.valueOf(((java.lang.Number) it8.next()).intValue()));
                    }
                    c22706xd568f797.m82070x203ffbdd((java.lang.String[]) arrayList4.toArray(new java.lang.String[0]));
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f798 = e0Var.I;
                    if (c22706xd568f798 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                        throw null;
                    }
                    c22706xd568f798.m82071x53d8522f(e0Var.M);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f799 = e0Var.I;
                    if (c22706xd568f799 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                        throw null;
                    }
                    c22706xd568f799.c(e0Var.M);
                } else {
                    fg2.m1 m1Var4 = this.X;
                    if (m1Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = m1Var4.f343685n.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        pi2.b0 b0Var = (pi2.b0) ((jz5.n) this.f436337p0).mo141623x754a37bb();
                        boolean z17 = this.Y;
                        java.lang.String focusId = this.Z;
                        b0Var.getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusId, "focusId");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(b0Var, null, false, 0, 7, null);
                        zh2.c cVar = b0Var.H;
                        xh2.c cVar2 = (xh2.c) ((mm2.o4) cVar.g().a(mm2.o4.class)).A.mo3195x754a37bb();
                        if (cVar2 == null) {
                            java.util.LinkedList linkedList4 = new java.util.LinkedList();
                            linkedList4.add(new xh2.a(((mm2.o4) cVar.g().a(mm2.o4.class)).a7(), new xh2.i(0.0f, 0.0f, 1.0f, 1.0f, 0, 0, 0, false, 0, 0, 0L, 2032, null)));
                            cVar2 = new xh2.c(linkedList4, new android.graphics.Rect(), 0, 0, 0, 0, 0.5625f, false, new java.util.LinkedList());
                        }
                        xh2.c a17 = cVar2.a();
                        if (z17) {
                            a17.f536066c = 1;
                        } else {
                            a17.f536066c = 0;
                        }
                        r45.il4 il4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).U;
                        if (il4Var != null) {
                            pi2.c0 c0Var = b0Var.f436298J;
                            if (c0Var == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micModeWidget");
                                throw null;
                            }
                            java.util.LinkedList linkedList5 = a17.f536064a;
                            android.graphics.Rect rect = a17.f536065b;
                            int i27 = a17.f536066c;
                            c0Var.j(il4Var, new xh2.c(linkedList5, rect, (i27 == 1 || i27 == 3) ? 1 : 0, a17.f536067d, a17.f536068e, a17.f536069f, a17.f536070g, a17.f536071h, a17.f536072i), (int) ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458662d);
                        }
                    } else {
                        fg2.m1 m1Var5 = this.X;
                        if (m1Var5 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = m1Var5.f343689r.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            r45.p52 p52Var4 = ((mm2.g5) eVar.a(mm2.g5.class)).f410623g;
                            java.util.LinkedList addPriceList = p52Var4 != null ? p52Var4.m75941xfb821914(3) : null;
                            if (addPriceList == null) {
                                addPriceList = this.U;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                            pi2.v vVar = (pi2.v) ((jz5.n) this.W).mo141623x754a37bb();
                            int i28 = this.V;
                            vVar.getClass();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addPriceList, "addPriceList");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(vVar, null, false, 0, 7, null);
                            int indexOf3 = addPriceList.indexOf(java.lang.Integer.valueOf(i28));
                            vVar.M = indexOf3;
                            if (indexOf3 == -1) {
                                vVar.M = 0;
                                java.lang.Object first3 = addPriceList.getFirst();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first3, "getFirst(...)");
                                ((java.lang.Number) first3).intValue();
                            }
                            java.util.LinkedList linkedList6 = vVar.L;
                            linkedList6.clear();
                            linkedList6.addAll(addPriceList);
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f7910 = vVar.I;
                            if (c22706xd568f7910 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                                throw null;
                            }
                            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(addPriceList, 10));
                            java.util.Iterator it9 = addPriceList.iterator();
                            while (it9.hasNext()) {
                                arrayList5.add(java.lang.String.valueOf(((java.lang.Number) it9.next()).intValue()));
                            }
                            c22706xd568f7910.m82070x203ffbdd((java.lang.String[]) arrayList5.toArray(new java.lang.String[0]));
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f7911 = vVar.I;
                            if (c22706xd568f7911 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                                throw null;
                            }
                            c22706xd568f7911.m82071x53d8522f(vVar.M);
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f7912 = vVar.I;
                            if (c22706xd568f7912 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pickView");
                                throw null;
                            }
                            c22706xd568f7912.c(vVar.M);
                        } else {
                            fg2.m1 m1Var6 = this.X;
                            if (m1Var6 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = m1Var6.f343673b.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                                r45.kf5 kf5Var = new r45.kf5();
                                kf5Var.f460189d = this.L;
                                kf5Var.f460190e = this.N.m75939xb282bd08(0);
                                kf5Var.f460191f = this.S;
                                fg2.m1 m1Var7 = this.X;
                                if (m1Var7 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                    throw null;
                                }
                                kf5Var.f460192g = m1Var7.f343676e.f292896x;
                                kf5Var.f460193h = this.V;
                                kf5Var.f460195m = this.Y;
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("element", ((mm2.c1) eVar.a(mm2.c1.class)).a8() ? 12 : 9);
                                jSONObject.put("sub_element", 2);
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("lianmai_mode", 2);
                                jSONObject2.put("pay_lianmai_duration", kf5Var.f460189d);
                                jSONObject2.put("pay_lianmai_close_type", kf5Var.f460190e);
                                jSONObject2.put("pay_lianmai_price", kf5Var.f460191f);
                                jSONObject2.put("pay_lianmai_is_allow_markup", kf5Var.f460192g ? 1 : 0);
                                jSONObject2.put("pay_lianmai_markup_price", kf5Var.f460193h);
                                jSONObject2.put("pay_lianmai_is_prominent", kf5Var.f460195m ? 1 : 0);
                                jSONObject.put("extra", jSONObject2.toString());
                                if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
                                    i95.m c17 = i95.n0.c(ml2.j0.class);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                    zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
                                } else {
                                    i95.m c18 = i95.n0.c(ml2.j0.class);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                                    zy2.zb zbVar = (zy2.zb) c18;
                                    ml2.c1 c1Var = ml2.c1.f408858e;
                                    zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
                                }
                                this.f436336J.mo149xb9724478(kf5Var, this.Z);
                            } else {
                                fg2.m1 m1Var8 = this.X;
                                if (m1Var8 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                    throw null;
                                }
                                int id12 = m1Var8.f343677f.getId();
                                if (valueOf != null && valueOf.intValue() == id12 && (c19786x6a1e2862 = ((mm2.g5) eVar.a(mm2.g5.class)).f410625i) != null) {
                                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                    android.content.Context context = this.f199716e;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                                    xc2.y2 y2Var = xc2.y2.f534876a;
                                    xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                                    p0Var.f534785n = 0;
                                    xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
                                }
                            }
                        }
                    }
                }
            }
        }
        e0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicSettingPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        android.widget.TextView textView = new android.widget.TextView(this.f199716e);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkb));
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        com.p314xaae8f345.mm.ui.fk.a(textView);
        textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejp));
        return textView;
    }
}
