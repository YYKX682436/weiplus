package ni2;

/* loaded from: classes3.dex */
public final class z1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final qo0.c I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f419053J;
    public fg2.p1 K;
    public r45.kf5 L;
    public int M;
    public boolean N;
    public final jz5.g P;
    public final jz5.g Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, false, null, 0.0f, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.H = buContext;
        this.I = statusMonitor;
        this.f419053J = basePlugin;
        this.M = 1;
        this.P = jz5.h.b(new ni2.y1(context, this));
        this.Q = jz5.h.b(new ni2.u1(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dsg;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.f564600rc0;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564600rc0);
        if (relativeLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.f564601rc1;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564601rc1);
            if (c22699x3dcdb352 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f564783rc4;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564783rc4);
                if (c22644xc8fbf3b2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.f564784rc5;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564784rc5);
                    if (textView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.a6v;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.a6v);
                        if (c22699x3dcdb3522 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f564822a71;
                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564822a71);
                            if (relativeLayout2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.rce;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rce);
                                if (c22699x3dcdb3523 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.rcf;
                                    android.view.View a17 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rcf);
                                    if (a17 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.a_n;
                                        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.a_n);
                                        if (imageView != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.ava;
                                            android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ava);
                                            if (relativeLayout3 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.rdv;
                                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rdv);
                                                if (textView2 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.che;
                                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.che);
                                                    if (linearLayout != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.f565683rj1;
                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f565683rj1);
                                                        if (c22645x24069159 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.d98;
                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.d98);
                                                            if (c22621x7603e017 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.rjj;
                                                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rjj);
                                                                if (textView3 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.rjv;
                                                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rjv);
                                                                    if (linearLayout2 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.f6a;
                                                                        android.view.View a18 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f6a);
                                                                        if (a18 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.f6c;
                                                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f6c);
                                                                            if (frameLayout != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.rtk;
                                                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rtk);
                                                                                if (textView4 != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.rxe;
                                                                                    android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxe);
                                                                                    if (textView5 != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.rxp;
                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b22 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rxp);
                                                                                        if (c22644xc8fbf3b22 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.ryp;
                                                                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ryp);
                                                                                            if (textView6 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.m3m;
                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.m3m);
                                                                                                if (c22699x3dcdb3524 != null) {
                                                                                                    i17 = com.p314xaae8f345.mm.R.id.mce;
                                                                                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mce);
                                                                                                    if (linearLayout3 != null) {
                                                                                                        i17 = com.p314xaae8f345.mm.R.id.s5e;
                                                                                                        android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s5e);
                                                                                                        if (textView7 != null) {
                                                                                                            i17 = com.p314xaae8f345.mm.R.id.s96;
                                                                                                            android.view.View a19 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s96);
                                                                                                            if (a19 != null) {
                                                                                                                i17 = com.p314xaae8f345.mm.R.id.f569089oz4;
                                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f569089oz4);
                                                                                                                if (c22699x3dcdb3525 != null) {
                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.oz_;
                                                                                                                    android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.oz_);
                                                                                                                    if (relativeLayout4 != null) {
                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.s_j;
                                                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s_j);
                                                                                                                        if (c22699x3dcdb3526 != null) {
                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.s_k;
                                                                                                                            android.view.View a27 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s_k);
                                                                                                                            if (a27 != null) {
                                                                                                                                this.K = new fg2.p1((android.widget.FrameLayout) rootView, relativeLayout, c22699x3dcdb352, c22644xc8fbf3b2, textView, c22699x3dcdb3522, relativeLayout2, c22699x3dcdb3523, a17, imageView, relativeLayout3, textView2, linearLayout, c22645x24069159, c22621x7603e017, textView3, linearLayout2, a18, frameLayout, textView4, textView5, c22644xc8fbf3b22, textView6, c22699x3dcdb3524, linearLayout3, textView7, a19, c22699x3dcdb3525, relativeLayout4, c22699x3dcdb3526, a27);
                                                                                                                                com.p314xaae8f345.mm.ui.fk.a(textView6);
                                                                                                                                fg2.p1 p1Var = this.K;
                                                                                                                                if (p1Var == null) {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var.f343766m.addTextChangedListener(new ni2.s1(this));
                                                                                                                                fg2.p1 p1Var2 = this.K;
                                                                                                                                if (p1Var2 == null) {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var2.f343770q.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var3 = this.K;
                                                                                                                                if (p1Var3 == null) {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var3.f343775v.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var4 = this.K;
                                                                                                                                if (p1Var4 == null) {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var4.f343768o.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var5 = this.K;
                                                                                                                                if (p1Var5 == null) {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var5.A.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var6 = this.K;
                                                                                                                                if (p1Var6 == null) {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var6.f343760g.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var7 = this.K;
                                                                                                                                if (p1Var7 == null) {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                p1Var7.f343755b.setOnClickListener(this);
                                                                                                                                fg2.p1 p1Var8 = this.K;
                                                                                                                                if (p1Var8 != null) {
                                                                                                                                    p1Var8.f343757d.setOnClickListener(this);
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                    throw null;
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
    public void S() {
        super.S();
        if (!this.N) {
            fg2.p1 p1Var = this.K;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var.f343766m.getText().clear();
        }
        g0();
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.Q).mo141623x754a37bb()).d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        super.U();
        this.I.mo46557x60d69242(qo0.b.f446893h3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        android.app.Dialog dialog;
        super.V(e0Var, z17, i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.B;
        if (y1Var == null || (dialog = y1Var.f293558d) == null) {
            return;
        }
        dialog.setOnKeyListener(new ni2.w1(this));
    }

    public final void e0() {
        r45.kf5 kf5Var;
        gk2.e eVar = this.H;
        if (!((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.o4) eVar.a(mm2.o4.class)).H).mo144003x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestPayMic", "skip apply mic, disable mic");
            android.content.Context context = this.f199716e;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkj), 0).show();
            return;
        }
        if (f0()) {
            int i17 = this.M != 2 ? 1 : 2;
            fg2.p1 p1Var = this.K;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            java.lang.String obj = p1Var.f343766m.getEditableText().toString();
            if (obj == null) {
                obj = "";
            }
            boolean z17 = this.M == 3;
            r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
            oi2.a aVar = new oi2.a(i17, obj, z17, (il4Var == null || (kf5Var = il4Var.f458665g) == null) ? 0 : kf5Var.f460191f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            pi2.n nVar = (pi2.n) ((jz5.n) this.P).mo141623x754a37bb();
            nVar.getClass();
            nVar.K = aVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(nVar, null, false, 0, 7, null);
        }
    }

    public final boolean f0() {
        fg2.p1 p1Var = this.K;
        if (p1Var != null) {
            return p1Var.f343766m.getEditableText().toString().length() <= 50;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
        throw null;
    }

    public final void g0() {
        fg2.p1 p1Var = this.K;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p1Var.f343766m.clearFocus();
        java.lang.Object systemService = this.f199716e.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        fg2.p1 p1Var2 = this.K;
        if (p1Var2 != null) {
            inputMethodManager.hideSoftInputFromWindow(p1Var2.f343766m.getWindowToken(), 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void h0() {
        fg2.p1 p1Var = this.K;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p1Var.B.setVisibility(8);
        fg2.p1 p1Var2 = this.K;
        if (p1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p1Var2.f343761h.setVisibility(0);
        fg2.p1 p1Var3 = this.K;
        if (p1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p1Var3.f343756c.setVisibility(8);
        this.M = 1;
    }

    public final void i0() {
        r45.kf5 kf5Var;
        gk2.e eVar = this.H;
        double d17 = ((mm2.g5) eVar.a(mm2.g5.class)).f410622f;
        if (d17 <= 0.0d) {
            fg2.p1 p1Var = this.K;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var.f343767n.setVisibility(0);
            fg2.p1 p1Var2 = this.K;
            if (p1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var2.f343768o.setVisibility(4);
        } else {
            fg2.p1 p1Var3 = this.K;
            if (p1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var3.f343767n.setVisibility(8);
            fg2.p1 p1Var4 = this.K;
            if (p1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var4.f343768o.setVisibility(0);
        }
        fg2.p1 p1Var5 = this.K;
        if (p1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        p1Var5.f343777x.setText(java.lang.String.valueOf(d17));
        r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
        if (il4Var != null && (kf5Var = il4Var.f458665g) != null) {
            fg2.p1 p1Var6 = this.K;
            if (p1Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var6.f343772s.setText(this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mlj, java.lang.Integer.valueOf(kf5Var.f460189d)));
            fg2.p1 p1Var7 = this.K;
            if (p1Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            p1Var7.f343758e.setText(java.lang.String.valueOf(kf5Var.f460191f));
        }
        r45.il4 il4Var2 = ((mm2.o4) eVar.a(mm2.o4.class)).U;
        this.L = il4Var2 != null ? il4Var2.f458665g : null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.p1 p1Var = this.K;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = p1Var.f343770q.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
        } else {
            fg2.p1 p1Var2 = this.K;
            if (p1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = p1Var2.f343775v.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                U();
            } else {
                fg2.p1 p1Var3 = this.K;
                if (p1Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                int id8 = p1Var3.A.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    fg2.p1 p1Var4 = this.K;
                    if (p1Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    p1Var4.B.setVisibility(0);
                    fg2.p1 p1Var5 = this.K;
                    if (p1Var5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    p1Var5.f343761h.setVisibility(8);
                    fg2.p1 p1Var6 = this.K;
                    if (p1Var6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    p1Var6.f343756c.setVisibility(8);
                    this.M = 2;
                } else {
                    fg2.p1 p1Var7 = this.K;
                    if (p1Var7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = p1Var7.f343760g.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        h0();
                    } else {
                        fg2.p1 p1Var8 = this.K;
                        if (p1Var8 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = p1Var8.f343755b.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            fg2.p1 p1Var9 = this.K;
                            if (p1Var9 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            p1Var9.B.setVisibility(8);
                            fg2.p1 p1Var10 = this.K;
                            if (p1Var10 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            p1Var10.f343761h.setVisibility(8);
                            fg2.p1 p1Var11 = this.K;
                            if (p1Var11 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            p1Var11.f343756c.setVisibility(0);
                            this.M = 3;
                        } else {
                            fg2.p1 p1Var12 = this.K;
                            if (p1Var12 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = p1Var12.f343768o.getId();
                            android.content.Context context = this.f199716e;
                            gk2.e eVar = this.H;
                            if (valueOf != null && valueOf.intValue() == id11) {
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.g5) eVar.a(mm2.g5.class)).f410625i;
                                if (c19786x6a1e2862 != null) {
                                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                                    xc2.y2 y2Var = xc2.y2.f534876a;
                                    xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                                    p0Var.f534785n = 0;
                                    xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
                                }
                            } else {
                                fg2.p1 p1Var13 = this.K;
                                if (p1Var13 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                    throw null;
                                }
                                int id12 = p1Var13.f343757d.getId();
                                if (valueOf != null && valueOf.intValue() == id12) {
                                    this.N = true;
                                    r45.kf5 kf5Var = this.L;
                                    r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                                    r45.kf5 kf5Var2 = il4Var != null ? il4Var.f458665g : null;
                                    if (kf5Var != null && kf5Var2 != null && ((mm2.o4) eVar.a(mm2.o4.class)).B7(kf5Var, kf5Var2)) {
                                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                        db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mki), 0).show();
                                        i0();
                                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                        return;
                                    }
                                    zl2.r4 r4Var = zl2.r4.f555483a;
                                    android.content.Context context3 = this.f199716e;
                                    gk2.e S0 = this.f419053J.S0();
                                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ec6);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                                    java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573358ec4);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                                    if (r4Var.B(context3, S0, string, string2, new ni2.v1(this))) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                        return;
                                    }
                                    e0();
                                }
                            }
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveRequestPayMicPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this.f199716e);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 24), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79303x9c11008);
        return c22699x3dcdb352;
    }
}
