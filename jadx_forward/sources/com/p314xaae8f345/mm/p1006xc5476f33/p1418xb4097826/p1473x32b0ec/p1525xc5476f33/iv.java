package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class iv extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public int A;
    public final db5.t4 A1;
    public final android.content.res.Resources B;
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c B1;
    public final android.app.Activity C;
    public final int C1;
    public final android.view.View D;
    public final int D1;
    public final android.widget.ImageView E;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14338xe5c15371 E1;
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff F;
    public final java.util.Map F1;
    public final android.view.View G;
    public final android.widget.TextView H;
    public final android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.TextView f194543J;
    public final android.widget.TextView K;
    public final android.view.View L;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 M;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c N;
    public final android.widget.ProgressBar P;
    public final android.view.View Q;
    public final android.view.View R;
    public final android.widget.TextView S;
    public final android.widget.TextView T;
    public final android.view.View U;
    public final android.view.View V;
    public final bm2.n5 W;
    public final jz5.g X;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 Y;
    public final android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f194544l1;

    /* renamed from: p, reason: collision with root package name */
    public final zl2.u4 f194545p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.widget.ImageView f194546p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f194547p1;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f194548q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f194549r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f194550s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f194551t;

    /* renamed from: u, reason: collision with root package name */
    public final int f194552u;

    /* renamed from: v, reason: collision with root package name */
    public final int f194553v;

    /* renamed from: w, reason: collision with root package name */
    public final int f194554w;

    /* renamed from: x, reason: collision with root package name */
    public final int f194555x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.widget.TextView f194556x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.util.ArrayList f194557x1;

    /* renamed from: y, reason: collision with root package name */
    public final int f194558y;

    /* renamed from: y0, reason: collision with root package name */
    public r45.xn1 f194559y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f194560y1;

    /* renamed from: z, reason: collision with root package name */
    public final int f194561z;

    /* renamed from: z1, reason: collision with root package name */
    public r45.x71 f194562z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(android.view.ViewGroup root, zl2.u4 uiMode, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        android.view.View inflate;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194545p = uiMode;
        this.f194548q = statusMonitor;
        this.f194549r = "Finder.FinderLiveMemberListPlugin";
        this.f194550s = "PORTRAIT_ACTION_GOTO_PROFILE_MEMBERLIST";
        this.f194551t = "PORTRAIT_ACTION_KEY_FINDER_USERNAME";
        this.f194552u = 1;
        this.f194553v = 10;
        this.f194554w = 11;
        this.f194555x = 12;
        this.f194558y = 13;
        this.f194561z = 14;
        int h07 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * (ae2.in.f85221a.h0() / 100.0f));
        android.content.res.Resources resources = root.getContext().getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.B = resources;
        android.content.Context context = R0().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        this.C = activity;
        if (android.os.Build.VERSION.SDK_INT > 25) {
            zl2.w4 w4Var = zl2.w4.f555550a;
            android.view.LayoutInflater layoutInflater = activity.getLayoutInflater();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutInflater, "getLayoutInflater(...)");
            inflate = (android.view.ViewGroup) w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_z, root, false, uiMode, activity, layoutInflater);
        } else {
            inflate = android.view.LayoutInflater.from(root.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_z, root, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        }
        android.view.View view = inflate;
        this.D = view;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.agx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.E = imageView;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.nv8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById2;
        this.F = c2718xca2902ff;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.s_m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f9p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.G = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.f9w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.H = textView;
        android.view.View findViewById6 = view.findViewById(com.p314xaae8f345.mm.R.id.f9r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.p314xaae8f345.mm.R.id.f9l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f194543J = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.p314xaae8f345.mm.R.id.f9k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = view.findViewById(com.p314xaae8f345.mm.R.id.f9m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.L = findViewById9;
        android.view.View findViewById10 = view.findViewById(com.p314xaae8f345.mm.R.id.f9j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById10;
        this.M = c1163xf1deaba4;
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.f9h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) findViewById11;
        this.N = c22613xe7040d9c;
        android.view.View findViewById12 = view.findViewById(com.p314xaae8f345.mm.R.id.f9i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById12;
        android.view.View findViewById13 = view.findViewById(com.p314xaae8f345.mm.R.id.f9q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.P = (android.widget.ProgressBar) findViewById13;
        android.view.View findViewById14 = root.findViewById(com.p314xaae8f345.mm.R.id.f9g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.Q = findViewById14;
        android.view.View findViewById15 = root.findViewById(com.p314xaae8f345.mm.R.id.f9n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.R = findViewById15;
        android.view.View findViewById16 = root.findViewById(com.p314xaae8f345.mm.R.id.f9x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = root.findViewById(com.p314xaae8f345.mm.R.id.f9v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        this.T = (android.widget.TextView) findViewById17;
        android.view.View findViewById18 = root.findViewById(com.p314xaae8f345.mm.R.id.r6h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        this.U = findViewById18;
        android.view.View findViewById19 = root.findViewById(com.p314xaae8f345.mm.R.id.f9d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        this.V = findViewById19;
        android.content.Context context2 = R0().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        android.content.res.Resources resources2 = root.getContext().getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources2, "getResources(...)");
        bm2.n5 n5Var = new bm2.n5(uiMode, context2, resources2, c1163xf1deaba4, findViewById19, c22613xe7040d9c, (mm2.c1) P0(mm2.c1.class), (mm2.f5) P0(mm2.f5.class), this);
        this.W = n5Var;
        jz5.g b17 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gv(this));
        this.X = b17;
        android.view.View findViewById20 = root.findViewById(com.p314xaae8f345.mm.R.id.f9u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById20, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById20;
        this.Y = c22645x24069159;
        android.view.View findViewById21 = root.findViewById(com.p314xaae8f345.mm.R.id.f9t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById21, "findViewById(...)");
        this.Z = findViewById21;
        android.view.View findViewById22 = root.findViewById(com.p314xaae8f345.mm.R.id.f9f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById22, "findViewById(...)");
        this.f194546p0 = (android.widget.ImageView) findViewById22;
        android.view.View findViewById23 = root.findViewById(com.p314xaae8f345.mm.R.id.eqh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById23, "findViewById(...)");
        this.f194556x0 = (android.widget.TextView) findViewById23;
        this.f194557x1 = new java.util.ArrayList();
        this.A1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tu(this);
        this.B1 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) root.findViewById(com.p314xaae8f345.mm.R.id.f9b);
        this.C1 = i65.a.b(root.getContext(), 64);
        resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.D1 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
        android.view.View findViewById24 = root.findViewById(com.p314xaae8f345.mm.R.id.u2v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById24, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14338xe5c15371 c14338xe5c15371 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14338xe5c15371) findViewById24;
        this.E1 = c14338xe5c15371;
        android.view.ViewGroup.LayoutParams layoutParams2 = c22645x24069159.getLayoutParams();
        int i18 = layoutParams2 != null ? layoutParams2.height : 0;
        this.A = i18;
        if (i18 <= 0) {
            this.A = resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMemberListPlugin", "initTitleGroupHeight:" + this.A);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(n5Var);
        int i19 = this.A;
        android.view.ViewGroup viewGroup = this.f446856d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
        if (x0()) {
            c22613xe7040d9c.getLayoutParams().width = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y;
            c22613xe7040d9c.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x);
            c22613xe7040d9c.m81302x795a7a7b(true);
            c22613xe7040d9c.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wt.f196526d);
            relativeLayout.getLayoutParams().height = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y - i19;
            c1163xf1deaba4.getLayoutParams().height = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y - i19;
        } else {
            c22613xe7040d9c.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y);
            c22613xe7040d9c.getLayoutParams().height = h07;
            android.view.ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin += c17;
            int i27 = (h07 - i19) - c17;
            relativeLayout.getLayoutParams().height = i27;
            c1163xf1deaba4.getLayoutParams().height = i27;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.util.List i28 = kz5.c0.i(view, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wv) ((jz5.n) b17).mo141623x754a37bb()).f201771c);
        android.view.ViewGroup viewGroup2 = this.f446856d;
        java.util.List i29 = kz5.c0.i(viewGroup2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrw), viewGroup2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrx));
        c2718xca2902ff.m20376x95e7e540(android.content.res.ColorStateList.valueOf(0));
        c2718xca2902ff.setVisibility(0);
        c1190x18d3c3fe.m8293xf6d5dd34();
        c1190x18d3c3fe.m8289xa5a25773(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pu(this));
        android.content.Context context3 = viewGroup2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        c1190x18d3c3fe.m8315x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fp0(context3, i28, i29));
        c2718xca2902ff.t(viewGroup2.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), viewGroup2.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ak7));
        c2718xca2902ff.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ut(this));
        c2718xca2902ff.m20382x3da43a7b(c1190x18d3c3fe);
        if (!x0() && (layoutParams = imageView.getLayoutParams()) != null) {
            com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i37 = a17.f278668a;
            if (!z17 && i37 > (i17 = a17.f278669b)) {
                i37 = i17;
            }
            layoutParams.height = (int) ((i37 * com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd) / 390.0f);
        }
        c14338xe5c15371.setClipToOutline(true);
        c14338xe5c15371.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.st(this));
        this.F1 = new java.util.LinkedHashMap();
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kickMember:");
        r45.xn1 xn1Var = ivVar.f194559y0;
        java.lang.String str = null;
        sb6.append((xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ivVar.f194549r, sb6.toString());
        dk2.xf W0 = ivVar.W0();
        if (W0 != null) {
            r45.xn1 xn1Var2 = ivVar.f194559y0;
            if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
                str = c19782x23db1cfa.m76197x6c03c64c();
            }
            ((dk2.r4) W0).w(str, z17, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eu(ivVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv.u1(com.tencent.mm.plugin.finder.live.plugin.iv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, int i17) {
        if (ivVar.f194544l1 == null) {
            ivVar.f194544l1 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(ivVar.R0().getContext(), 1, false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = ivVar.f194544l1;
        if (k0Var != null) {
            k0Var.t(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = ivVar.f194544l1;
        if (k0Var2 != null) {
            k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dv(ivVar, i17);
        }
        if (k0Var2 != null) {
            k0Var2.f293414s = ivVar.A1;
        }
        if (k0Var2 != null) {
            k0Var2.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ev(ivVar));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = ivVar.f194544l1;
        if (k0Var3 != null) {
            k0Var3.v();
        }
        if (i17 == 3) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f409069t, "", 0);
        }
    }

    public static final void w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, java.lang.String str) {
        ivVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", str);
        bundle.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
        bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 1);
        qo0.b bVar = qo0.b.f446909l1;
        qo0.c cVar = ivVar.f194548q;
        cVar.mo46557x60d69242(bVar, bundle);
        ivVar.y1();
        if (cVar.mo11219xd0598cf8() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Xj(ml2.r3.f409434f);
        }
    }

    public final boolean A1() {
        return ((mm2.n0) P0(mm2.n0.class)).f410806r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", this.f194550s)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yu yuVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yu(this, bundle, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(yuVar, j17);
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        y1();
        if (this.f194548q.mo11219xd0598cf8() != 1) {
            return true;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.A;
        ml2.r3 r3Var = ml2.r3.f409433e;
        zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(3), null, 4, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(r45.x71 r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv.B1(r45.x71, boolean):void");
    }

    public final void C1(int i17) {
        bm2.n5 n5Var = this.W;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xu(this, null), 3, null);
            android.view.View view = n5Var.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.view.View view2 = n5Var.F;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onPageSelect", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.E.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d3v);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.N2, "", 0L, null, null, null, null, null, 252, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(java.lang.Long r38) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv.D1(java.lang.Long):void");
    }

    public final void E1() {
        java.lang.String str;
        r45.x71 x71Var = this.f194562z1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (x71Var == null || (str = x71Var.m75945x2fec8307(15)) == null) {
            str = null;
        } else {
            if (str.length() == 0) {
                str = zl2.r4.S(zl2.r4.f555483a, x71Var.m75942xfb822ef2(12), 0, 2, null);
            }
        }
        java.lang.String str2 = str != null ? str : "";
        java.lang.String m75945x2fec8307 = x71Var != null ? x71Var.m75945x2fec8307(17) : null;
        java.lang.String m75945x2fec83072 = x71Var != null ? x71Var.m75945x2fec8307(18) : null;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("heatlimit showTitle isAnchorOrAssistant ");
        sb7.append(z1() || A1());
        sb7.append(", svrHeatStr:");
        sb7.append(str2);
        sb7.append(", heatValue:");
        sb7.append(x71Var != null ? java.lang.Long.valueOf(x71Var.m75942xfb822ef2(12)) : null);
        sb7.append(", svrViewedMemberCountStr ");
        sb7.append(m75945x2fec8307);
        sb7.append(", svrOnlineCountStr ");
        sb7.append(m75945x2fec83072);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194549r, sb7.toString());
        if (w0() == 0 && ((mm2.e1) P0(mm2.e1.class)).t7()) {
            if (m75945x2fec83072 != null) {
                mm2.e1 e1Var = (mm2.e1) P0(mm2.e1.class);
                e1Var.D = m75945x2fec83072;
                e1Var.s7();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh.class);
            if (khVar != null) {
                khVar.A1(kz5.b0.c(new jz5.l(3, null)), false, false);
            }
        }
        if ((z1() || A1()) && m75945x2fec83072 != null) {
            if (!(m75945x2fec83072.length() > 0)) {
                m75945x2fec83072 = null;
            }
            if (m75945x2fec83072 != null) {
                sb6.append(m75945x2fec83072);
            }
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        if (m75945x2fec8307 != null) {
            if (!(m75945x2fec8307.length() > 0)) {
                m75945x2fec8307 = null;
            }
            if (m75945x2fec8307 != null) {
                if (sb6.length() > 0) {
                    sb6.append(" · ");
                }
                sb6.append(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9k, m75945x2fec8307));
            }
        }
        java.lang.String str3 = (r26.n0.N(str2) ^ true) && (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "0") || z1() || A1()) ? str2 : null;
        if (str3 != null) {
            if (sb6.length() > 0) {
                sb6.append(" · ");
            }
            sb6.append(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573425ek4, str3));
        }
        if (this.f194560y1 > 0) {
            if (sb6.length() > 0) {
                sb6.append(" · ");
            }
            sb6.append(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p1z, java.lang.String.valueOf(this.f194560y1)));
        }
        this.H.setText(sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 != 0) {
            ((mm2.e1) P0(mm2.e1.class)).D = "";
            this.W.y();
        } else {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((ml2.r0) c17).yk(3, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        bm2.n5 n5Var = this.W;
        n5Var.y();
        this.G.setOnClickListener(null);
        this.Q.setOnClickListener(null);
        this.K.setOnClickListener(null);
        this.R.setOnClickListener(null);
        this.N.m81307xf9cef5a7(null);
        n5Var.C = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    @Override // qo0.a
    public void s0(int i17, int i18, android.os.Bundle bundle) {
        int i19 = 16;
        if (!pm0.v.z(i18, 16) || !((mm2.e1) P0(mm2.e1.class)).b7() || !((om2.l) P0(om2.l.class)).f427876h) {
            K0(8);
            return;
        }
        if (w0() != 0) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.M2;
            cl0.g gVar = new cl0.g();
            gVar.h("type", "2");
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
            K0(0);
            nk2.l.f419554a.b(nk2.a.f419484d);
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_MEMBER_SKIP_LOADING") : false) {
                this.N.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zu(this));
                this.W.z();
                x1();
                C1(this.F.m20352xe06bcb0d());
                return;
            }
            this.P.setVisibility(0);
            this.I.setVisibility(8);
            android.view.View view = this.L;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.Y.setVisibility(8);
            this.M.setVisibility(8);
            this.W.z();
            this.N.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.av(this));
            if (z1()) {
                i19 = 1;
            } else {
                if (!(((mm2.n0) P0(mm2.n0.class)).f410806r)) {
                    i19 = 2;
                }
            }
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).B(i19, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cv(this));
            }
            if (zl2.r4.f555483a.X1(S0()) && ((mm2.c1) P0(mm2.c1.class)).f410462z6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hp0(this, null), 3, null);
            } else {
                bm2.n5 n5Var = this.W;
                n5Var.R = null;
                n5Var.B();
                n5Var.m8146xced61ae5();
            }
            if (fn0.g.f345728a.g()) {
                x1();
            }
        }
    }

    public final void x1() {
        if (((mm2.e1) P0(mm2.e1.class)).b7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bu(this, null), 3, null);
        }
    }

    public final void y1() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(this.N, null, 1, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.M2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        this.G.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iu(this));
        this.Q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ju(this));
        this.K.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ku(this));
        this.R.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lu(this));
        this.N.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mu(this));
        this.W.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nu(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wv wvVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wv) ((jz5.n) this.X).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ou ouVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ou(this);
        wvVar.getClass();
        wvVar.f201770b.f200358g = ouVar;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = this.B1;
        if (c2678xa407981c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tt ttVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tt(this);
            ttVar.a(c2678xa407981c, 0);
            c2678xa407981c.a(ttVar);
        }
    }

    public final boolean z1() {
        return zl2.r4.f555483a.w1() || ((mm2.c1) P0(mm2.c1.class)).T;
    }
}
