package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class et extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public static final long H1;
    public static final long I1;
    public static final int J1;
    public static final float K1;
    public final android.widget.ImageView A;
    public int A1;
    public final android.widget.TextView B;
    public boolean B1;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C;
    public boolean C1;
    public final android.widget.ImageView D;
    public java.lang.CharSequence D1;
    public final android.view.View E;
    public final jz5.g E1;
    public final android.view.View F;
    public boolean F1;
    public final android.view.View G;
    public boolean G1;
    public final android.view.View H;
    public final android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.g8 f193979J;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 K;
    public bm2.m3 L;
    public ol2.b M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg N;
    public final com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 P;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a Q;
    public final android.content.Context R;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt S;
    public boolean T;
    public int U;
    public java.lang.String V;
    public r45.xn1 W;
    public long X;
    public int Y;
    public boolean Z;

    /* renamed from: l1, reason: collision with root package name */
    public r45.ze2 f193980l1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193981p;

    /* renamed from: p0, reason: collision with root package name */
    public long f193982p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f193983p1;

    /* renamed from: q, reason: collision with root package name */
    public final int f193984q;

    /* renamed from: r, reason: collision with root package name */
    public final int f193985r;

    /* renamed from: s, reason: collision with root package name */
    public final int f193986s;

    /* renamed from: t, reason: collision with root package name */
    public int f193987t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14326x7028a9e2 f193988u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.LinearLayout f193989v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.LinearLayout f193990w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f193991x;

    /* renamed from: x0, reason: collision with root package name */
    public int f193992x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.util.ArrayList f193993x1;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f193994y;

    /* renamed from: y0, reason: collision with root package name */
    public long f193995y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f193996y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f193997z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f193998z1;

    static {
        ae2.in inVar = ae2.in.f85221a;
        long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85395r3).mo141623x754a37bb()).r()).longValue();
        H1 = longValue;
        I1 = longValue;
        J1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de;
        K1 = j65.f.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        bm2.m3 m3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193981p = statusMonitor;
        this.f193984q = 1;
        this.f193985r = 2;
        this.f193986s = 3;
        this.f193987t = 120;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14326x7028a9e2 c14326x7028a9e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14326x7028a9e2) root.findViewById(com.p314xaae8f345.mm.R.id.ruk);
        this.f193988u = c14326x7028a9e2;
        this.f193989v = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.i9x);
        this.f193990w = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.ubr);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f567134ia5);
        findViewById.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xr.f196659d);
        this.f193991x = findViewById;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) root.findViewById(com.p314xaae8f345.mm.R.id.ia7);
        this.f193994y = c22621x7603e017;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.iel);
        this.f193997z = textView;
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.i_z);
        this.A = imageView;
        this.B = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f567133ia4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.ubq);
        this.C = c22699x3dcdb352;
        this.D = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.rul);
        this.E = root.findViewById(com.p314xaae8f345.mm.R.id.rum);
        this.F = root.findViewById(com.p314xaae8f345.mm.R.id.rn7);
        this.G = root.findViewById(com.p314xaae8f345.mm.R.id.f566335rn5);
        this.H = root.findViewById(com.p314xaae8f345.mm.R.id.rn6);
        this.I = root.findViewById(com.p314xaae8f345.mm.R.id.ia8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.iaa);
        this.K = c1163xf1deaba4;
        this.P = qk.w9.c(root.getContext(), true);
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a(context, null);
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        this.R = context2;
        this.V = "";
        this.U = 0;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kq(this));
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6 x6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x6.class);
        android.content.res.Configuration configuration = new android.content.res.Configuration(context2.getResources().getConfiguration());
        configuration.uiMode = (configuration.uiMode & (-49)) | 32;
        android.content.Context createConfigurationContext = context2.createConfigurationContext(configuration);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createConfigurationContext, "createConfigurationContext(...)");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.cb) x6Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra(createConfigurationContext, null, null, null);
        this.f193979J = raVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kr krVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kr(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.at(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zs zsVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zs.f196909a;
        raVar.f272148f = imageView;
        raVar.f272149g = krVar;
        raVar.f272150h = zsVar;
        raVar.f272166x = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d8.kLive;
        raVar.f272161s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ys(this);
        bm2.m3 m3Var2 = new bm2.m3(context2, bm2.h3.f103471d);
        this.L = m3Var2;
        c1163xf1deaba4.mo7960x6cab2c8d(m3Var2);
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31 c1626x16b77f31 = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31(context2);
        c1626x16b77f31.F(1);
        c1626x16b77f31.E(0);
        c1626x16b77f31.D(4);
        if (c1626x16b77f31.f125734f != 0) {
            c1626x16b77f31.f125734f = 0;
            c1626x16b77f31.m8087x46ac7299();
        }
        c1163xf1deaba4.mo7967x900dcbe1(c1626x16b77f31);
        c1163xf1deaba4.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c1163xf1deaba4, "finder_live_room_fast_comment");
        bm2.m3 m3Var3 = this.L;
        if (m3Var3 != null) {
            m3Var3.f103631g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rr(m3Var3, this);
            m3Var3.m8146xced61ae5();
        }
        if (!c01.e2.a0() && (m3Var = this.L) != null) {
            java.util.ArrayList arrayList = m3Var.f103630f;
            java.lang.String string = m3Var.f103628d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.deu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList.add(new bm2.j3(string, 0, 0L, 0, null, 20, null));
            m3Var.m8146xced61ae5();
        }
        a2(((mm2.u0) S0().a(mm2.u0.class)).f410981n);
        int i17 = (int) (J1 * K1);
        int i18 = com.p314xaae8f345.mm.ui.bl.b(this.f446856d.getContext()).y / 2;
        this.f193992x0 = i17 > i18 ? i18 : i17;
        W1(this.f193987t);
        c22621x7603e017.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lq(this));
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nq(this));
        c22621x7603e017.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oq(this));
        if (x0()) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.p314xaae8f345.mm.ui.bl.c(root.getContext()));
            com.p314xaae8f345.mm.ui.a4.f278650a.m(findViewById, new com.p314xaae8f345.mm.ui.t3(false, findViewById), null);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(textView, "finder_live_room_reply_btn");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(textView, 8, 25561);
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pq(this));
        c14326x7028a9e2.m57355xf90c7ee5(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qq(this));
        c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sq(this));
        zl2.r4.o3(zl2.r4.f555483a, root, "Finder.LiveInputPlugin", true, false, 8, null);
        J1();
        this.D1 = "";
        this.E1 = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pr.f195461d);
    }

    public static final void A1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emoji, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uq uqVar) {
        r45.ch1 b17;
        int i17;
        dk2.zf a8Var;
        jz5.f0 f0Var;
        km2.r rVar;
        km2.r rVar2;
        if (etVar.L1()) {
            int i18 = 0;
            if (etVar.W != null) {
                ke2.p0 p0Var = ke2.q0.f388514w;
                gk2.e liveData = etVar.S0();
                r45.xn1 xn1Var = etVar.W;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xn1Var);
                long j17 = etVar.X;
                int i19 = etVar.Y;
                kn0.e a17 = hn0.v.f363973a.a();
                java.lang.String str = a17 != null ? a17.B : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoji, "emojiInfo");
                b17 = new r45.ch1();
                b17.set(0, xn1Var);
                r45.xn1 xn1Var2 = new r45.xn1();
                zl2.r4 r4Var = zl2.r4.f555483a;
                xn1Var2.set(0, r4Var.m0(liveData));
                xn1Var2.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f410345h);
                xn1Var2.set(7, java.lang.Integer.valueOf(r4Var.g0()));
                b17.set(13, xn1Var2);
                r45.xj1 xj1Var = new r45.xj1();
                r45.up2 up2Var = new r45.up2();
                up2Var.set(0, str);
                xj1Var.set(1, up2Var);
                xj1Var.set(6, emoji.mo42933xb5885648());
                xj1Var.set(7, ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class))).Ai(emoji));
                xj1Var.set(5, 1);
                xj1Var.set(8, java.lang.Integer.valueOf(i19));
                b17.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(xj1Var.mo14344x5f01b1f6()));
                b17.set(1, 20002);
                b17.set(2, zl2.q4.f555466a.m());
                b17.set(3, java.lang.Long.valueOf(j17));
            } else {
                b17 = ke2.q0.f388514w.b(etVar.S0(), emoji, false);
            }
            r45.qt2 qt2Var = new r45.qt2();
            km2.n nVar = dk2.ef.H;
            qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f390684c) == null) ? 0 : rVar2.f390739k));
            km2.n nVar2 = dk2.ef.H;
            if (nVar2 != null && (rVar = nVar2.f390684c) != null) {
                i18 = rVar.f390739k;
            }
            qt2Var.set(5, java.lang.Integer.valueOf(i18));
            new ke2.q0(b17, etVar.S0(), qt2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.os(etVar)).l();
            etVar.f193994y.setText((java.lang.CharSequence) null);
            zl2.r4 r4Var2 = zl2.r4.f555483a;
            gk2.e liveData2 = etVar.S0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoji, "emoji");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData2, "liveData");
            if (b17.m75939xb282bd08(1) == 20124) {
                r45.ch1 b18 = ke2.q0.f388514w.b(liveData2, emoji, true);
                i17 = 2;
                b18.set(2, b17.m75945x2fec8307(2));
                a8Var = new dk2.v5(b18);
            } else {
                i17 = 2;
                a8Var = new dk2.a8(b17);
            }
            r4Var2.a(b17.m75945x2fec8307(i17), etVar.S0());
            r4Var2.k3(a8Var, etVar.S0());
            qo0.c.a(etVar.f193981p, qo0.b.N, null, i17, null);
            r45.xn1 xn1Var3 = etVar.W;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d0.f197006a;
            if (xn1Var3 != null) {
                gk2.e S0 = etVar.S0();
                java.lang.String j18 = a8Var.j();
                if (j18 == null) {
                    j18 = "";
                }
                dk2.zf zfVar = ((mm2.x4) etVar.P0(mm2.x4.class)).f411068p;
                java.util.HashMap hashMap = new java.util.HashMap();
                if (uqVar != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uq.f196144e) {
                    hashMap.put("recommend_source", java.lang.String.valueOf(uqVar.f196148d));
                }
                d0Var.d(S0, j18, zfVar, hashMap);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                gk2.e S02 = etVar.S0();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                if (uqVar != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uq.f196144e) {
                    hashMap2.put("recommend_source", java.lang.String.valueOf(uqVar.f196148d));
                }
                d0Var.c(S02, a8Var, hashMap2);
            }
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.P7).mo141623x754a37bb()).r()).booleanValue()) {
                pm0.v.V(5000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ps(etVar, b17));
            }
        }
        etVar.F1();
    }

    public static final void B1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, float f17, float f18) {
        etVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "getPoiCityInfo: longitude:" + f17 + ", latitude:" + f18);
        r45.d64 d64Var = new r45.d64();
        d64Var.f453707d = f17;
        d64Var.f453708e = f18;
        d64Var.f453712i = 0;
        d64Var.f453709f = 1;
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ts(etVar, f17, f18));
    }

    public static void G1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, int i17, int i18, java.lang.String content, java.lang.String str, yz5.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            aVar = null;
        }
        etVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mr(i17, i18, etVar, content, str, aVar));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.String, still in use, count: 2, list:
          (r3v4 java.lang.String) from 0x0150: IF  (r3v4 java.lang.String) == (null java.lang.String)  -> B:65:0x0152 A[HIDDEN]
          (r3v4 java.lang.String) from 0x0056: PHI (r3v17 java.lang.String) = 
          (r3v4 java.lang.String)
          (r3v5 java.lang.String)
          (r3v10 java.lang.String)
          (r3v11 java.lang.String)
          (r3v16 java.lang.String)
          (r3v28 java.lang.String)
          (r3v32 java.lang.String)
          (r3v34 java.lang.String)
          (r3v36 java.lang.String)
          (r3v37 java.lang.String)
         binds: [B:77:0x0150, B:75:0x013c, B:72:0x012c, B:65:0x0152, B:64:0x0101, B:52:0x00ad, B:38:0x008d, B:46:0x00a1, B:28:0x006d, B:22:0x004f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:26:0x0059, B:28:0x006d, B:29:0x007a, B:31:0x007e, B:35:0x0088, B:39:0x008f, B:42:0x009a, B:46:0x00a1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String I1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et r3, java.lang.Boolean r4, int r5, java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.I1(com.tencent.mm.plugin.finder.live.plugin.et, java.lang.Boolean, int, java.lang.Object):java.lang.String");
    }

    public static final jz5.l t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        df2.ih ihVar = (df2.ih) etVar.U0(df2.ih.class);
        boolean z17 = ihVar != null && ihVar.f311934r;
        android.content.Context context = etVar.R;
        if (!z17) {
            return new jz5.l(java.lang.Boolean.FALSE, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.npe));
        }
        df2.ih ihVar2 = (df2.ih) etVar.U0(df2.ih.class);
        if (!(ihVar2 != null && ihVar2.f311933q)) {
            return new jz5.l(java.lang.Boolean.FALSE, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.npf));
        }
        if (!etVar.L1()) {
            return new jz5.l(java.lang.Boolean.FALSE, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.npg));
        }
        df2.d4 d4Var = (df2.d4) etVar.U0(df2.d4.class);
        return d4Var != null && d4Var.d7() ? new jz5.l(java.lang.Boolean.FALSE, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nph)) : new jz5.l(java.lang.Boolean.TRUE, "");
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, r45.ze2 ze2Var) {
        java.lang.String str;
        java.lang.String l17;
        km2.r rVar;
        km2.r rVar2;
        java.lang.String str2;
        java.lang.String str3;
        if (!etVar.f193983p1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "doSendLocationMsg: mounted = false");
            return;
        }
        if (ze2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "doSendLocationMsg: finderLocation is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "doSendLocationMsg: longitude:" + ze2Var.m75938x746dc8a6(0) + ", latitude:" + ze2Var.m75938x746dc8a6(1) + ", city:" + ze2Var.m75945x2fec8307(2));
        if (etVar.M1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "shop box can not send loc");
            return;
        }
        bm2.m3 m3Var = etVar.L;
        if (m3Var != null) {
            m3Var.y(ze2Var);
        }
        bm2.m3 m3Var2 = etVar.L;
        java.lang.String t17 = (m3Var2 == null || (str2 = m3Var2.f103633i) == null || (str3 = m3Var2.f103632h) == null) ? null : r26.i0.t(str3, "<%@>", str2, false);
        boolean L1 = etVar.L1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d0.f197006a;
        if (!L1) {
            if (etVar.K1()) {
                mm2.e0 e0Var = (mm2.e0) etVar.P0(mm2.e0.class);
                r45.qm1 qm1Var = (r45.qm1) e0Var.f410503m.mo3195x754a37bb();
                if (qm1Var == null || (str = qm1Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                r45.qm1 qm1Var2 = new r45.qm1();
                int i17 = qs5.v.f448005a;
                qm1Var2.set(0, 1);
                qm1Var2.set(1, str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(etVar.S0(), "liveData");
                r45.ch1 ch1Var = new r45.ch1();
                r45.gj1 gj1Var = new r45.gj1();
                gj1Var.set(0, ze2Var);
                gj1Var.set(1, t17);
                ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(gj1Var.mo14344x5f01b1f6()));
                ch1Var.set(1, 20035);
                ch1Var.set(2, zl2.q4.f555466a.m());
                qm1Var2.m75945x2fec8307(1);
                r45.xn1 xn1Var = new r45.xn1();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                c19782x23db1cfa.m76240x66bc2758(c01.z1.r());
                gk2.e eVar = gk2.e.f354004n;
                if (eVar == null || (l17 = ((mm2.c1) eVar.a(mm2.c1.class)).B7()) == null) {
                    l17 = c01.z1.l();
                }
                c19782x23db1cfa.m76227x7ac946f0(l17);
                c19782x23db1cfa.m76218xe0a5bcad("");
                xn1Var.set(0, c19782x23db1cfa);
                ch1Var.set(13, xn1Var);
                ch1Var.set(8, qm1Var2);
                e0Var.S6(str, ch1Var);
                gk2.e S0 = etVar.S0();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("recommend_comment_type", "3");
                d0Var.b(S0, 20035, t17, hashMap);
                return;
            }
            return;
        }
        ke2.p0 p0Var = ke2.q0.f388514w;
        gk2.e liveData = etVar.S0();
        int S6 = ((mm2.j2) etVar.P0(mm2.j2.class)).S6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        r45.ch1 ch1Var2 = new r45.ch1();
        r45.gj1 gj1Var2 = new r45.gj1();
        gj1Var2.set(0, ze2Var);
        gj1Var2.set(1, t17);
        ch1Var2.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(gj1Var2.mo14344x5f01b1f6()));
        ch1Var2.set(10, java.lang.Integer.valueOf(S6));
        ch1Var2.set(9, java.lang.Integer.valueOf(S6 > 0 ? 1 : 0));
        ch1Var2.set(1, 20035);
        ch1Var2.set(2, zl2.q4.f555466a.m());
        r45.xn1 xn1Var2 = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var2.set(0, r4Var.m0(liveData));
        xn1Var2.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f410345h);
        xn1Var2.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var2.set(13, xn1Var2);
        r45.qt2 qt2Var = new r45.qt2();
        km2.n nVar = dk2.ef.H;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f390684c) == null) ? 0 : rVar2.f390739k));
        km2.n nVar2 = dk2.ef.H;
        qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f390684c) == null) ? 0 : rVar.f390739k));
        new ke2.q0(ch1Var2, etVar.S0(), qt2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.or(etVar)).l();
        etVar.F1 = false;
        dk2.ab abVar = new dk2.ab(ch1Var2);
        r4Var.a(ch1Var2.m75945x2fec8307(2), etVar.S0());
        r4Var.k3(abVar, etVar.S0());
        qo0.c.a(etVar.f193981p, qo0.b.N, null, 2, null);
        gk2.e S02 = etVar.S0();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("recommend_comment_type", "3");
        d0Var.c(S02, abVar, hashMap2);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.String m75945x2fec8307 = ze2Var.m75945x2fec8307(5);
        java.lang.String m75945x2fec83072 = ze2Var.m75945x2fec8307(3);
        java.lang.String m75945x2fec83073 = ze2Var.m75945x2fec8307(2);
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        jSONObject.put("poi_id", m75945x2fec8307);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        jSONObject.put("poi_name", m75945x2fec83072);
        jSONObject.put("city_name", m75945x2fec83073 != null ? m75945x2fec83073 : "");
        ml2.r0.hj(r0Var, ml2.b4.f408784n3, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public static final void v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, float f17, float f18) {
        etVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "getPoiCityInfo: longitude:" + f17 + ", latitude:" + f18);
        r45.d64 d64Var = new r45.d64();
        d64Var.f453707d = f17;
        d64Var.f453708e = f18;
        d64Var.f453712i = 0;
        d64Var.f453709f = 1;
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qr(etVar, f17, f18));
    }

    public static final void w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        etVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "getPoiInfoError");
        android.content.Context context = etVar.R;
        db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dle));
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.getClass();
        ml2.r0.hj(r0Var, ml2.b4.f408787o3, null, 0L, null, null, null, null, null, 252, null);
    }

    public static final void x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        etVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "handlePoiNoPermission");
        ya2.o1 o1Var = (ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class);
        android.content.Context context = etVar.R;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ya2.o1.F2(o1Var, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, false, 2, null);
        etVar.F1 = true;
    }

    public static final void y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, boolean z17, long j17, java.lang.String str) {
        etVar.getClass();
        if (z17) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bs(j17, str, etVar));
            etVar.Z = false;
        }
    }

    public static final void z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = etVar.f193994y;
        java.lang.String obj = c22621x7603e017.getText().toString();
        int selectionEnd = c22621x7603e017.getSelectionEnd();
        int length = obj.length();
        if (selectionEnd > length) {
            selectionEnd = length;
        }
        int i17 = selectionEnd - 1;
        if (i17 < 0) {
            i17 = 0;
        }
        java.lang.String str3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj.subSequence(i17, selectionEnd).toString(), "@") ? "" : "@";
        if (selectionEnd > obj.length()) {
            selectionEnd = obj.length();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = obj.substring(0, selectionEnd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(str3);
        sb6.append(str2);
        sb6.append((char) 8197);
        java.lang.String substring2 = obj.substring(selectionEnd, obj.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        java.lang.String sb7 = sb6.toString();
        int length2 = str3.length() + str2.length() + selectionEnd + 1;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(etVar.R, sb7));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "[inputEt.setText-v3] " + ((java.lang.Object) c22621x7603e017.getText()));
        c22621x7603e017.mo81549xf579a34a(length2);
        if (etVar.f193993x1 == null) {
            etVar.f193993x1 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = etVar.f193993x1;
        if (arrayList != null) {
            r45.xn1 xn1Var = new r45.xn1();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.m76240x66bc2758(str);
            c19782x23db1cfa.m76227x7ac946f0(str2);
            xn1Var.set(0, c19782x23db1cfa);
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tq(xn1Var, selectionEnd, length2));
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        if (this.U == this.f193985r) {
            this.P.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0));
            this.U = 0;
            N1(0);
        } else {
            D1(true);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if ((r0.w0() == 0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.C1():void");
    }

    public final void D1(boolean z17) {
        if2.d0 d0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "changeToPreviewMode: notify=" + z17);
        this.U = 0;
        K0(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rt rtVar = this.S;
        if (rtVar != null) {
            if (rtVar.f195723i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg c17 = rtVar.c();
                if (c17 != null) {
                    c17.K0(0);
                }
                rtVar.f195723i = false;
            }
            df2.ug ugVar = (df2.ug) rtVar.f195718d.U0(df2.ug.class);
            if (ugVar != null && (d0Var = ugVar.f313058p) != null) {
                d0Var.d(0);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f193994y;
        c22621x7603e017.clearFocus();
        android.view.ViewGroup viewGroup = this.f446856d;
        java.lang.Object systemService = viewGroup.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(c22621x7603e017.getWindowToken(), 0);
        H1(false);
        if (z17) {
            viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.br(this));
        }
        this.f193998z1 = false;
        this.A1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.ui.widget.MMEditText, android.widget.TextView] */
    public final void E1() {
        ?? r07;
        mm2.u0 u0Var = (mm2.u0) P0(mm2.u0.class);
        if (u0Var.f410977g) {
            r45.i60 i60Var = u0Var.f410976f;
            if (i60Var != null) {
                r07 = i60Var.m75945x2fec8307(1);
            }
            r07 = 0;
        } else {
            r45.i60 i60Var2 = u0Var.f410976f;
            if (i60Var2 != null) {
                r07 = i60Var2.m75945x2fec8307(0);
            }
            r07 = 0;
        }
        if (r07 == 0 || r07.length() == 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String concat = I1(this, null, 1, null).concat(":");
            ((ke0.e) xVar).getClass();
            r07 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.R, concat);
        }
        ?? r17 = this.f193994y;
        r17.setHint(r07);
        r17.setText(null);
    }

    public final void F1() {
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "inBox, keep show keyboard");
            E1();
            return;
        }
        P1();
        R1();
        android.content.Context context = this.R;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        D1(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void G0(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.G0(i17, permissions, grantResults);
        if (i17 == 80) {
            if (!(!(grantResults.length == 0)) || grantResults[0] == 0) {
                return;
            }
            android.content.Context context = this.R;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (z2.h.b((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, "android.permission.RECORD_AUDIO")) {
                return;
            }
            android.view.ViewGroup viewGroup = this.f446856d;
            db5.e1.C(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ds(this), null);
        }
    }

    public final void H1(boolean z17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = z17;
        qo0.b bVar = qo0.b.Z2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        this.f193981p.mo46557x60d69242(bVar, bundle);
    }

    public final void J1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.Q;
        c15489x5c3b8a7a.c();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 inputEt = this.f193994y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputEt, "inputEt");
        c15489x5c3b8a7a.m63313x3ab7c9dc(inputEt);
        c15489x5c3b8a7a.m63310xaaa7669a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ur(this));
        c15489x5c3b8a7a.m63309x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wr(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        android.view.ViewGroup viewGroup = this.f446856d;
        if (i17 == 0 && viewGroup.getVisibility() != 0) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            int i18 = this.A1;
            r0Var.ak(1, 1, i18 != 0 ? kz5.b1.e(new jz5.l(ya.b.f77502x92235c1b, java.lang.String.valueOf(i18))) : null);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 2, kz5.b1.e(new jz5.l(ya.b.f77502x92235c1b, "0")));
            ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 6, kz5.b1.e(new jz5.l(ya.b.f77502x92235c1b, "0")));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(1, 11, null);
            Z1();
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            viewGroup.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveInputPlugin", "setVisible return for isTeenMode");
            return;
        }
        android.view.ViewParent parent = viewGroup.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            android.content.Context context = this.R;
            viewGroup2.setBackgroundColor(i17 == 0 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77912xe61cad93) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        super.K0(i17);
    }

    public final boolean K1() {
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f410503m.mo3195x754a37bb();
        if (qm1Var == null) {
            return false;
        }
        int m75939xb282bd08 = qm1Var.m75939xb282bd08(0);
        int i17 = qs5.v.f448005a;
        return m75939xb282bd08 == 1;
    }

    public final boolean L1() {
        return (K1() || M1()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0375, code lost:
    
        if (r3 == null) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06bf  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r41, android.os.Bundle r42) {
        /*
            Method dump skipped, instructions count: 2715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.M0(qo0.b, android.os.Bundle):void");
    }

    public final boolean M1() {
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if (xwVar != null) {
            return xwVar.f313348s;
        }
        return false;
    }

    public final void N1(int i17) {
        android.content.Context context = this.R;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "[layoutInputView] isLandscape=" + x0() + " height=" + i17 + " navBarHeight=" + com.p314xaae8f345.mm.ui.bl.c(context));
        if (this.f446856d.getContext() instanceof android.app.Activity) {
            android.view.View view = this.f193991x;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) k0Var : null;
            boolean isPresentedInTimeLineUI = c14353xe7c1f419 != null ? c14353xe7c1f419.getIsPresentedInTimeLineUI() : false;
            if (x0()) {
                layoutParams2.bottomMargin = i17;
            } else {
                layoutParams2.bottomMargin = !isPresentedInTimeLineUI ? com.p314xaae8f345.mm.ui.bl.c(context) + i17 : i17;
            }
            view.setLayoutParams(layoutParams);
            C1();
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, i17);
            if (x0()) {
                layoutParams3.setMarginEnd(com.p314xaae8f345.mm.ui.bl.c(context));
            } else {
                layoutParams3.bottomMargin = isPresentedInTimeLineUI ? 0 : com.p314xaae8f345.mm.ui.bl.c(context);
            }
            com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 abstractC4989x9e6071f3 = this.P;
            abstractC4989x9e6071f3.setLayoutParams(layoutParams3);
            if (abstractC4989x9e6071f3.getParent() == null) {
                this.f193989v.addView(abstractC4989x9e6071f3, layoutParams3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.Q;
            c15489x5c3b8a7a.setLayoutParams(layoutParams3);
            if (c15489x5c3b8a7a.getParent() == null) {
                this.f193990w.addView(c15489x5c3b8a7a, layoutParams3);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        super.O0();
        this.P.mo75339x5e04422d(null);
        android.view.ViewParent viewParent = this.P;
        p012xc85e97e9.p093xedfae76a.v vVar = viewParent instanceof p012xc85e97e9.p093xedfae76a.v ? (p012xc85e97e9.p093xedfae76a.v) viewParent : null;
        if (vVar != null) {
            android.content.Context context = this.R;
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context : null;
            if (activityC1102x9ee2d9f != null && (mo273xed6858b4 = activityC1102x9ee2d9f.mo273xed6858b4()) != null) {
                mo273xed6858b4.c(vVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "removeObserver");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.Q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15489x5c3b8a7a.f218296d, "destroy");
        c15489x5c3b8a7a.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = c15489x5c3b8a7a.f218297e;
        if (c15487x24678974 != null) {
            c15487x24678974.m63305xc1b94687(null);
        }
        c15489x5c3b8a7a.f218297e = null;
        if (c15489x5c3b8a7a.f218315z != null && c15489x5c3b8a7a.mPhoneStateListener != null) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).Di(c15489x5c3b8a7a.mPhoneStateListener);
            iy2.t tVar = c15489x5c3b8a7a.mPhoneStateListener;
            if (tVar != null) {
                tVar.f377441a = null;
            }
            c15489x5c3b8a7a.mPhoneStateListener = null;
        }
        c15489x5c3b8a7a.f218315z = null;
        java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(c15489x5c3b8a7a.C, c15489x5c3b8a7a.A);
        if (num != null) {
            int intValue = num.intValue();
            iy2.c cVar = c15489x5c3b8a7a.f218314y;
            if (cVar != null) {
                synchronized (cVar) {
                    iy2.c.f377416j = intValue;
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINOF_FINDER_LIVE_VOICE_INPUT_DEF_LANG_HISTORY_INT_SYNC, java.lang.Integer.valueOf(iy2.c.f377416j));
                }
            }
        }
        android.view.View findViewById = c15489x5c3b8a7a.findViewById(com.p314xaae8f345.mm.R.id.p5x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4) findViewById;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15489x5c3b8a7a.f218296d, "voiceInputLayout do stop!");
        c15488x2a0085b4.b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 mmHandler = c15488x2a0085b4.getMmHandler();
        if (mmHandler != null) {
            mmHandler.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 callUiHandler = c15488x2a0085b4.getCallUiHandler();
        if (callUiHandler != null) {
            callUiHandler.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 amplitudeTimer = c15488x2a0085b4.getAmplitudeTimer();
        if (amplitudeTimer != null) {
            amplitudeTimer.d();
        }
        this.f193983p1 = false;
    }

    public final void P1() {
        Q1(this.P);
        android.graphics.drawable.Drawable drawable = this.f446856d.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79915x64991f25);
        com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        this.A.setImageDrawable(drawable);
        this.U = 0;
    }

    public final void Q1(android.view.View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().alpha(0.0f).setDuration(220L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cs(view)).start();
    }

    public final void R1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.Q;
        Q1(c15489x5c3b8a7a);
        iy2.r rVar = c15489x5c3b8a7a.f218303n;
        java.lang.String str = c15489x5c3b8a7a.f218296d;
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "closePanel onClearBtnDown");
            if (c15489x5c3b8a7a.f218307r != 0) {
                c15489x5c3b8a7a.f218307r = 0L;
            }
        }
        android.widget.TextView textView = c15489x5c3b8a7a.f218301i;
        if (textView != null) {
            textView.setVisibility(c15489x5c3b8a7a.C.size() < 2 ? 8 : 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pause");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = c15489x5c3b8a7a.f218297e;
        if (c15487x24678974 != null) {
            c15487x24678974.a();
        }
        android.graphics.drawable.Drawable drawable = this.f446856d.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81326xa5be6564);
        com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        this.C.setImageDrawable(drawable);
        this.U = 0;
    }

    public final void T1(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().alpha(1.0f).setDuration(220L).setListener(null).start();
    }

    public final void U1() {
        if (c01.e2.a0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "ignore getLocation as wechat user");
            return;
        }
        if (this.C1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "preloadLocationForFastCommentItem");
        this.C1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hs hsVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hs(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ks ksVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ks(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ls lsVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ls(this);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            hsVar.mo152xb9724478();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            lsVar.mo152xb9724478();
        } else {
            ksVar.mo152xb9724478();
        }
    }

    public final void V1(bm2.j3 j3Var, int i17) {
        java.lang.String str;
        if (M1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "shop box can not send loc");
            return;
        }
        if (j3Var != null) {
            java.lang.String str2 = j3Var.f103538a;
            long a17 = c01.id.a();
            if (a17 - j3Var.f103540c <= I1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: too fast, currentTime:" + a17 + ", lastPoiSendTime:" + j3Var.f103540c);
                android.content.Context context = this.R;
                db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dld));
                return;
            }
            j3Var.f103540c = a17;
            boolean L1 = L1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d0.f197006a;
            int i18 = j3Var.f103541d;
            if (L1) {
                long j17 = this.f193982p0;
                boolean z17 = this.Z;
                java.lang.String m17 = zl2.q4.f555466a.m();
                dk2.q4.f315471a.e(this.R, S0(), ek2.r0.f335052y.a(str2, 1, i17), m17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qs(this, str2, z17, j17, m17));
                zl2.r4 r4Var = zl2.r4.f555483a;
                java.lang.String I12 = I1(this, null, 1, null);
                gk2.e liveData = S0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
                r45.t12 t12Var = new r45.t12();
                r45.xn1 xn1Var = new r45.xn1();
                xn1Var.set(0, r4Var.m0(liveData));
                xn1Var.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).e7());
                xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
                t12Var.set(8, xn1Var);
                t12Var.set(2, str2);
                t12Var.set(3, 1000066);
                t12Var.set(13, java.lang.Integer.valueOf(i17));
                t12Var.set(12, java.lang.Integer.valueOf(t12Var.m75939xb282bd08(13) > 0 ? 1 : 0));
                t12Var.set(6, t12Var.m75945x2fec8307(6));
                t12Var.set(0, I12);
                dk2.mf mfVar = new dk2.mf(t12Var);
                r4Var.k3(mfVar, S0());
                qo0.c.a(this.f193981p, qo0.b.N, null, 2, null);
                gk2.e S0 = S0();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("recommend_comment_type", java.lang.String.valueOf(j3Var.d()));
                hashMap.put("quick_comment_type", java.lang.String.valueOf(i18));
                d0Var.c(S0, mfVar, hashMap);
            } else if (K1()) {
                mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
                r45.qm1 qm1Var = (r45.qm1) e0Var.f410503m.mo3195x754a37bb();
                if (qm1Var == null || (str = qm1Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                r45.qm1 qm1Var2 = new r45.qm1();
                int i19 = qs5.v.f448005a;
                qm1Var2.set(0, 1);
                qm1Var2.set(1, str);
                e0Var.S6(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a.d(qm1Var2, str2));
                gk2.e S02 = S0();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("recommend_comment_type", java.lang.String.valueOf(j3Var.d()));
                hashMap2.put("quick_comment_type", java.lang.String.valueOf(i18));
                d0Var.b(S02, 1000066, str2, hashMap2);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_room_fastcomment_event", this.K, null, 25561);
    }

    public final void W1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "setInputEtFilter maxTextNum:" + i17);
        this.f193994y.mo81583x7e4f2d39(new android.text.InputFilter[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.us.f196150d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vs(i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2)});
    }

    public final void X1() {
        T1(this.P);
        R1();
        android.content.Context context = this.R;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        N1(this.f193992x0);
        android.graphics.drawable.Drawable drawable = this.f446856d.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79772xf1451aff);
        com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        this.A.setImageDrawable(drawable);
        this.U = this.f193986s;
    }

    public final void Y1(long j17, java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        pm0.v.V(j17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ct(this, scene));
    }

    public final void Z1() {
        java.util.ArrayList arrayList;
        ol2.b bVar = this.M;
        if (bVar == null || (arrayList = bVar.f427676a) == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (z17) {
                    arrayList.removeAll(kz5.n0.X0(arrayList2));
                } else {
                    bm2.m3 m3Var = this.L;
                    if (m3Var != null) {
                        m3Var.x(null);
                    }
                }
                bm2.m3 m3Var2 = this.L;
                if (m3Var2 != null) {
                    ol2.b bVar2 = this.M;
                    m3Var2.z(arrayList, bVar2 != null ? bVar2.f427677b : null);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.K;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dt(this));
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ol2.c cVar = (ol2.c) next;
            java.lang.String str = cVar.f427678a;
            if ((str != null ? r26.n0.B(str, "<%@>", false) : false) && i17 == arrayList.size() - 1) {
                bm2.m3 m3Var3 = this.L;
                if (m3Var3 != null) {
                    m3Var3.x(cVar.f427678a);
                }
                arrayList2.add(cVar);
                z17 = true;
            }
            i17 = i18;
        }
    }

    public final void a2(r45.o92 o92Var) {
        java.util.ArrayList arrayList;
        ol2.b a17 = ol2.b.f427675c.a(o92Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quickReplyInfo pre models:");
        ol2.b bVar = this.M;
        sb6.append((bVar == null || (arrayList = bVar.f427676a) == null) ? null : java.lang.Integer.valueOf(arrayList.size()));
        sb6.append(", new models:");
        java.util.ArrayList arrayList2 = a17.f427676a;
        sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", sb6.toString());
        this.M = a17;
        if (w0() == 0) {
            Z1();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    @Override // qo0.a
    public void y0(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "show:" + z17 + ", height:" + i17 + ", curMode:" + this.U);
        if (i17 > 0 && i17 != this.f193992x0) {
            this.f193992x0 = i17;
        }
        int i18 = this.f193984q;
        if (z17) {
            R1();
            P1();
            N1(i17);
            this.U = i18;
            return;
        }
        int i19 = this.U;
        if (i19 == i18 || i19 == 0) {
            this.U = 0;
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
            this.P.setLayoutParams(layoutParams);
            this.Q.setLayoutParams(layoutParams);
            N1(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        super.z0();
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 abstractC4989x9e6071f3 = this.P;
        abstractC4989x9e6071f3.mo75339x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sr(this));
        p012xc85e97e9.p093xedfae76a.v vVar = abstractC4989x9e6071f3 instanceof p012xc85e97e9.p093xedfae76a.v ? (p012xc85e97e9.p093xedfae76a.v) abstractC4989x9e6071f3 : null;
        android.content.Context context = this.R;
        if (vVar != null) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context : null;
            if (activityC1102x9ee2d9f != null && (mo273xed6858b4 = activityC1102x9ee2d9f.mo273xed6858b4()) != null) {
                mo273xed6858b4.a(vVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "addObserver");
            }
        }
        this.f193983p1 = true;
        android.widget.TextView textView = this.f193997z;
        android.text.Layout.getDesiredWidth(textView.getText(), textView.getPaint());
        com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        textView.getPaddingStart();
        textView.getPaddingEnd();
        df2.d4 d4Var = (df2.d4) U0(df2.d4.class);
        if (d4Var != null && (j0Var = d4Var.f311474p) != null) {
            j0Var.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yr(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.u0) P0(mm2.u0.class)).f410979i;
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zr(this));
        J1();
    }
}
