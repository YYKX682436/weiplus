package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class d7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener {
    public final gk2.e H;
    public final te2.j0 I;

    /* renamed from: J, reason: collision with root package name */
    public final te2.k0 f199612J;
    public final java.lang.String K;
    public final int L;
    public android.view.View M;
    public android.view.View N;
    public android.view.View P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public android.view.View U;
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c V;
    public boolean W;
    public int X;
    public android.view.View Y;
    public android.widget.SeekBar Z;

    /* renamed from: l1, reason: collision with root package name */
    public final rl5.r f199613l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f199614p0;

    /* renamed from: p1, reason: collision with root package name */
    public final int[] f199615p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.ProgressBar f199616x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f199617y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(android.content.Context context, gk2.e liveData, te2.j0 j0Var, te2.k0 k0Var) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.H = liveData;
        this.I = j0Var;
        this.f199612J = k0Var;
        this.K = "FinderLiveAnchorMusicViewCallback";
        this.L = 1;
        this.f199613l1 = new rl5.r(context);
        this.f199615p1 = new int[2];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.amk;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.K, "initView");
        this.M = rootView.findViewById(com.p314xaae8f345.mm.R.id.elx);
        rootView.setOnClickListener(this);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.fcp);
        this.N = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.P = rootView.findViewById(com.p314xaae8f345.mm.R.id.jxw);
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.jg_);
        this.Q = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f569160p85);
        this.R = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f564219l9);
        this.S = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this);
        }
        this.T = rootView.findViewById(com.p314xaae8f345.mm.R.id.jyx);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.qg8)).getPaint(), 0.8f);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jyv);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.U = rootView.findViewById(com.p314xaae8f345.mm.R.id.jyd);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) rootView.findViewById(com.p314xaae8f345.mm.R.id.k0r);
        this.V = c2678xa407981c;
        if (c2678xa407981c != null) {
            c2678xa407981c.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w6(this, c2678xa407981c));
            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = new p012xc85e97e9.p073xee01125a.p074xd1075a44.c(-1, -2);
            android.content.Context context = c2678xa407981c.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            cVar.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14405xbf0e7bd7(context, null));
            c2678xa407981c.setLayoutParams(cVar);
        }
        this.Y = rootView.findViewById(com.p314xaae8f345.mm.R.id.k0s);
        this.Z = (android.widget.SeekBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.k0t);
        this.f199614p0 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.k0u);
        android.widget.SeekBar seekBar = this.Z;
        gk2.e eVar = this.H;
        if (seekBar != null) {
            seekBar.setProgress(((mm2.c1) eVar.a(mm2.c1.class)).F4 ? 5 : ((mm2.c1) eVar.a(mm2.c1.class)).E4);
        }
        te2.j0 j0Var = this.I;
        if (j0Var != null) {
            android.widget.SeekBar seekBar2 = this.Z;
            ((te2.p1) j0Var).q(seekBar2 != null ? seekBar2.getProgress() : ((mm2.c1) eVar.a(mm2.c1.class)).E4, false);
        }
        android.widget.SeekBar seekBar3 = this.Z;
        if (seekBar3 != null) {
            seekBar3.setOnSeekBarChangeListener(this);
        }
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.elr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7((android.view.ViewGroup) findViewById5, j0Var, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x6(this)).f201117e;
        this.f199617y0 = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.P(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y6(this));
        }
        this.f199616x0 = (android.widget.ProgressBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.jz9);
        android.view.View view = this.Y;
        android.widget.SeekBar seekBar4 = this.Z;
        if (view != null && seekBar4 != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            view.setOnTouchListener(new zl2.l3(seekBar4, ((java.lang.Number) ((jz5.n) zl2.r4.f555491i).mo141623x754a37bb()).intValue()));
        }
        if (!zl2.r4.f555483a.Y1(this.f199716e)) {
            rootView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z6(this, rootView));
        }
        bm2.m mVar = j0Var != null ? ((te2.p1) j0Var).f499824i : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f199617y0;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(mVar);
            c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d252.getContext()));
        }
        android.widget.SeekBar seekBar5 = this.Z;
        if (seekBar5 == null) {
            return;
        }
        seekBar5.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewj));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    public final void e0(boolean z17) {
        this.W = false;
        this.X = 2;
        android.view.View view = this.R;
        if (view != null) {
            view.setBackground(null);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = this.V;
        if (c2678xa407981c != null) {
            c2678xa407981c.d(false, z17, true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7 h7Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7 h7Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = false;
        te2.k0 k0Var = this.f199612J;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.ely) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            if (k0Var != null && (h7Var2 = ((te2.q1) k0Var).f499884m) != null) {
                h7Var2.g0(false, null);
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.fcp) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
        } else {
            if ((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jyv) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f564219l9)) {
                z17 = true;
            }
            te2.d4 d4Var = te2.d4.f499481a;
            gk2.e eVar = this.H;
            te2.j0 j0Var = this.I;
            if (z17) {
                if (j0Var != null) {
                    te2.p1 p1Var = (te2.p1) j0Var;
                    sf2.e0 e0Var = (sf2.e0) p1Var.f499822g.U0(sf2.e0.class);
                    if (e0Var != null) {
                        e0Var.f488648q = p1Var.f499830r;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var = e0Var.f488644m;
                        if (i8Var != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(i8Var, null, false, 0, 7, null);
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = i8Var.M;
                            if (c22849x81a93d25 != null && (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) != null) {
                                mo7946xf939df19.m8146xced61ae5();
                            }
                            if (i8Var.V) {
                                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = i8Var.Q;
                                if (c1190x18d3c3fe == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                                    throw null;
                                }
                                i8Var.i0(c1190x18d3c3fe.m8300xfda78ef6());
                            }
                        }
                    }
                }
                boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr = ml2.u2.f409642d;
                d4Var.a(a86, 1, "0", j0Var != null ? ((te2.p1) j0Var).f499830r : null);
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jg_) {
                if (k0Var != null && (h7Var = ((te2.q1) k0Var).f499884m) != null) {
                    h7Var.g0(true, this);
                }
                boolean a87 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr2 = ml2.u2.f409642d;
                d4Var.a(a87, 5, "0", j0Var != null ? ((te2.p1) j0Var).f499830r : null);
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f569160p85) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.K, "doVolumeAction appBarVisible:" + this.W + ", volumeState:" + this.X);
                if (this.W) {
                    e0(true);
                } else {
                    this.W = true;
                    this.X = 1;
                    com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = this.V;
                    if (c2678xa407981c != null) {
                        c2678xa407981c.d(true, true, true);
                    }
                    android.view.View view2 = this.R;
                    if (view2 != null) {
                        view2.setBackground(this.f199716e.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563308a80));
                    }
                    android.widget.TextView textView = this.f199614p0;
                    if (textView != null) {
                        android.widget.SeekBar seekBar = this.Z;
                        textView.setText(seekBar != null ? java.lang.Integer.valueOf(seekBar.getProgress()).toString() : null);
                    }
                }
                boolean a88 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr3 = ml2.u2.f409642d;
                d4Var.a(a88, 3, "0", j0Var != null ? ((te2.p1) j0Var).f499830r : null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.K, "onProgressChanged progress:" + i17 + ",fromUser:" + z17);
        te2.j0 j0Var = this.I;
        if (j0Var != null) {
            ((te2.p1) j0Var).q(i17, true);
        }
        android.widget.TextView textView = this.f199614p0;
        if (textView == null) {
            return;
        }
        textView.setText(java.lang.String.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStopTrackingTouch inMiniVolumeState:");
        gk2.e eVar = this.H;
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).F4);
        sb6.append(", recoveryVolume:");
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).E4);
        sb6.append(", progress:");
        sb6.append(seekBar != null ? java.lang.Integer.valueOf(seekBar.getProgress()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.K, sb6.toString());
        ((mm2.c1) eVar.a(mm2.c1.class)).F4 = false;
        mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
        if (seekBar != null) {
            c1Var.E4 = seekBar.getProgress();
        }
    }
}
