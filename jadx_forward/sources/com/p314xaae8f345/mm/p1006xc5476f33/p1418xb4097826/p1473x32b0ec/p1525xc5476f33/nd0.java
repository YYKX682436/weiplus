package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nd0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements android.view.View.OnClickListener {
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 A;
    public final android.widget.FrameLayout B;
    public final android.view.View C;
    public final jz5.g D;
    public final jz5.g E;
    public java.lang.String F;
    public java.lang.String G;
    public p3325xe03a0797.p3326xc267989b.r2 H;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14271x23d6de1d I;

    /* renamed from: J, reason: collision with root package name */
    public int f195147J;
    public final int K;
    public final int L;
    public final int M;
    public final long N;
    public final jz5.g P;
    public com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 Q;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 R;
    public int S;
    public zy2.gc T;
    public final jz5.g V1;
    public final jz5.g W1;
    public final jz5.g X1;
    public int Y1;
    public final jz5.g Z1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195148p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f195149q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f195150r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f195151s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f195152t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f195153u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f195154v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f195155w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f195156x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ImageView f195157y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f195158z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveTitlePlugin$followListener$1] */
    public nd0(android.view.ViewGroup root, qo0.c statusMonitor, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195148p = statusMonitor;
        this.f195149q = "PORTRAIT_ACTION_GOTO_PROFILE_TITLE";
        android.content.Context context = root.getContext();
        this.f195150r = context;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ifw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f195151s = imageView;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.ifv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f195152t = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.m6o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f195153u = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.m6p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f195154v = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.ify);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f195155w = textView;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.ifz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f195156x = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.f564991ax2);
        ((android.widget.ImageView) findViewById7).setOnClickListener(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "apply(...)");
        this.f195157y = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.i_e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById8;
        this.f195158z = textView2;
        android.view.View findViewById9 = root.findViewById(com.p314xaae8f345.mm.R.id.i_g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.A = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.p314xaae8f345.mm.R.id.i_h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.B = (android.widget.FrameLayout) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.i_f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.C = findViewById11;
        this.D = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kc0(root));
        this.E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ic0(root));
        this.V1 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.np0(root));
        this.W1 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mp0(root));
        this.X1 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lp0(root));
        this.Z1 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kp0(this));
        com.p314xaae8f345.mm.ui.bl.c(root.getContext());
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.I = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveTitlePlugin$followListener$1
            {
                this.f39173x3fe91575 = 398763182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be event = c5560x6f070be;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc0(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.this));
                return false;
            }
        };
        this.f195147J = 8;
        this.K = 1;
        this.L = 2;
        this.M = 3;
        this.N = 500L;
        this.P = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sc0(this));
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ec0(this));
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fc0(this));
        imageView.setImageDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bhp));
        d92.f fVar = d92.f.f309003a;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView, 15.0f, 0.0f, 8, null);
        android.content.Context context3 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        d92.f.a(fVar, context3, textView2, 10.0f, 0.0f, 8, null);
        if (x0()) {
            android.view.ViewGroup viewGroup = this.f446856d;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(zl2.r4.f555483a.y0(this) - ((int) viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8)));
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (!r4Var.x1()) {
            r4Var.d(this);
        }
        P1(this, null, false, 1, null);
        E1(imageView, "finder_live_room_avatar", 8);
        E1(textView, "finder_live_room_name", 8);
        E1(textView2, "finder_live_room_follow", 40);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(textView2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gc0(this));
        this.S = 8;
    }

    public static void B1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var, boolean z17, int i17, java.lang.Object obj) {
        dk2.gf gfVar;
        nd0Var.getClass();
        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) nd0Var.P0(mm2.c1.class)).f410385o);
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        boolean C1 = nd0Var.C1();
        dk2.Cif cif = dk2.Cif.f315159a;
        long m75942xfb822ef2 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        kk.l lVar = dk2.Cif.f315160b;
        boolean k17 = lVar.k(java.lang.Long.valueOf(m75942xfb822ef2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveShowFollowBtnLogic", "hadTriggerShow " + k17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", w07 + "  followStatus = " + C1 + ", hadTriggerShow:" + k17);
        if (C1) {
            nd0Var.z1().mo50303x856b99f0(nd0Var.K);
            nd0Var.I1(8);
            return;
        }
        if (!k17) {
            nd0Var.I1(8);
            nd0Var.z1().mo50307xb9e94560(nd0Var.M, nd0Var.N);
            return;
        }
        long m75942xfb822ef22 = ((mm2.e1) nd0Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        if (lVar.k(java.lang.Long.valueOf(m75942xfb822ef22)) && (gfVar = (dk2.gf) lVar.get(java.lang.Long.valueOf(m75942xfb822ef22))) != null) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.u1 u1Var = ml2.u1.f409576f;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("follow_icon_expose_condition", java.lang.String.valueOf(gfVar.f315061a.ordinal()));
            linkedHashMap.put("follow_icon_expose_condition_sessionid", gfVar.f315062b);
            zy2.zb.I8((zy2.zb) c17, u1Var, linkedHashMap, null, null, null, null, false, 124, null);
        }
        nd0Var.G1(false, "#1", java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
    }

    public static final void H1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] in " + z18);
        if (nd0Var.Q == null) {
            android.content.Context context = nd0Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            nd0Var.Q = new com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653(context, null, 0, 6, null);
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = nd0Var.Q;
            if (c22787x6853c653 != null) {
                c22787x6853c653.o(ae2.in.f85221a.a(ym5.f6.C));
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6532 = nd0Var.Q;
        if (c22787x6853c6532 != null) {
            android.widget.FrameLayout frameLayout = nd0Var.B;
            if (!z18) {
                if (frameLayout.indexOfChild(c22787x6853c6532) != -1) {
                    c22787x6853c6532.n();
                    frameLayout.removeView(c22787x6853c6532);
                    return;
                }
                return;
            }
            if (frameLayout.indexOfChild(c22787x6853c6532) == -1) {
                android.view.View view = nd0Var.C;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
                layoutParams.gravity = 17;
                com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6533 = nd0Var.Q;
                if (c22787x6853c6533 != null) {
                    c22787x6853c6533.setLayoutParams(layoutParams);
                }
                frameLayout.addView(nd0Var.Q);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6534 = nd0Var.Q;
            if (c22787x6853c6534 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(nd0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hd0(c22787x6853c6534, null), 3, null);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6535 = nd0Var.Q;
            if (c22787x6853c6535 != null) {
                c22787x6853c6535.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.id0(nd0Var, z17));
            }
        }
    }

    public static void P1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = nd0Var.V0().f390662d.f150075m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str == null) {
                str = ((mm2.c1) nd0Var.P0(mm2.c1.class)).f410385o;
            }
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        nd0Var.N1(str, z17);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var) {
        r45.a84 a84Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = ((mm2.n0) nd0Var.P0(mm2.n0.class)).f410804p;
        if (f3Var != null && (a84Var = (r45.a84) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb()) != null) {
            java.util.LinkedList m75941xfb821914 = a84Var.m75941xfb821914(1);
            if (!(m75941xfb821914 == null || m75941xfb821914.isEmpty())) {
                java.lang.String str = ((mm2.c1) nd0Var.P0(mm2.c1.class)).f410385o;
                if (str == null) {
                    str = "";
                }
                ya2.b2 b17 = str.length() > 0 ? ya2.h.f542017a.b(str) : null;
                android.content.Context context = nd0Var.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.lang.String w07 = b17 != null ? b17.w0() : null;
                if (w07 == null) {
                    w07 = "";
                }
                java.lang.String m176700xe5e0d2a0 = b17 != null ? b17.m176700xe5e0d2a0() : null;
                r3 = qe2.l.d(context, a84Var, str, w07, m176700xe5e0d2a0 != null ? m176700xe5e0d2a0 : "");
            }
        }
        if (r3) {
            return;
        }
        if (zl2.r4.f555483a.w1()) {
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85376p4).mo141623x754a37bb()).r()).booleanValue()) {
                qo0.c.a(nd0Var.f195148p, qo0.b.f446967x3, null, 2, null);
                return;
            }
            return;
        }
        boolean x07 = nd0Var.x0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "goToAnchorFinderProfile isLandscape:" + x07);
        if (x07) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(nd0Var, nd0Var.f195149q, null, 0, 6, null);
        } else {
            nd0Var.A1();
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.Z = true;
        ml2.r0.hj(r0Var, ml2.b4.f408788p, null, 0L, null, null, null, null, null, 252, null);
        r0Var.D++;
    }

    public final void A1() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        java.lang.Object mo3195x754a37bb = ((mm2.c1) P0(mm2.c1.class)).P5.mo3195x754a37bb();
        android.view.ViewGroup viewGroup = this.f446856d;
        if (mo3195x754a37bb == null) {
            if (D1()) {
                zl2.q4 q4Var = zl2.q4.f555466a;
                java.lang.String x17 = x1();
                java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).f410385o;
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                q4Var.G(x17, str, context, ((mm2.c1) P0(mm2.c1.class)).f410394p2, java.lang.String.valueOf(((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)), 2);
                return;
            }
            dk2.q4 q4Var2 = dk2.q4.f315471a;
            android.content.Context context2 = this.f195150r;
            gk2.e S0 = S0();
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f410385o;
            android.content.Context context3 = this.f195150r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "context");
            pf5.z zVar = pf5.z.f435481a;
            boolean z17 = context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3;
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a(activityC0065xcd7aa112).c(zy2.ra.class))).V6();
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.v9 v9Var = (zy2.v9) zVar.a(activityC0065xcd7aa112).c(zy2.v9.class);
            long m75942xfb822ef2 = ((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa aaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) v9Var;
            r45.md5 md5Var = aaVar.f198440e;
            if (md5Var != null && md5Var.m75942xfb822ef2(1) == m75942xfb822ef2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa.f198438h.a(intent, aaVar.f198439d, aaVar.f198440e);
            }
            dk2.q4.j(q4Var2, context2, S0, true, str2, V6, false, intent, 32, null);
            return;
        }
        if (this.R == null) {
            android.content.Context context4 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3(context4, this);
            this.R = h3Var;
            r45.bw1 bw1Var = (r45.bw1) ((mm2.c1) P0(mm2.c1.class)).P5.mo3195x754a37bb();
            if (bw1Var != null) {
                h3Var.b(bw1Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var2 = this.R;
        if (h3Var2 != null) {
            r45.cw1 cw1Var = new r45.cw1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h3Var2.f200046b;
            ya2.b2 b17 = ((mm2.c1) lVar.P0(mm2.c1.class)).Y4 ? ya2.h.f542017a.b(((mm2.c1) lVar.P0(mm2.c1.class)).f410385o) : ya2.h.f542017a.b(lVar.V0().f390662d.f150075m);
            if (((mm2.d) lVar.P0(mm2.d.class)).f410475f || lVar.V0().f390662d.f150085v == 4) {
                java.lang.String str3 = lVar.V0().f390662d.f150087x;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.length() == 0) {
                    str3 = ((mm2.d) lVar.P0(mm2.d.class)).f410477h;
                }
                cw1Var.set(1, str3);
                java.lang.String str4 = lVar.V0().f390662d.f150086w;
                java.lang.String str5 = str4 != null ? str4 : "";
                if (str5.length() == 0) {
                    str5 = ((mm2.d) lVar.P0(mm2.d.class)).f410476g;
                }
                cw1Var.set(0, str5);
                cw1Var.set(5, 2);
            } else {
                cw1Var.set(1, b17 != null ? b17.w0() : null);
                cw1Var.set(0, b17 != null ? b17.D0() : null);
                cw1Var.set(5, 1);
            }
            cw1Var.set(4, java.lang.Boolean.valueOf(((mm2.d) lVar.P0(mm2.d.class)).N6()));
            cw1Var.set(3, b17 != null ? b17.y0() : null);
            r45.dr2 dr2Var = new r45.dr2();
            if (b17 != null && (c19780xceb4c4dc = b17.f69300x731cac1b) != null) {
                dr2Var.set(1, java.lang.Integer.valueOf(c19780xceb4c4dc.m76027x1cbb0791()));
                dr2Var.set(2, c19780xceb4c4dc.m76028x11716638());
                dr2Var.set(0, c19780xceb4c4dc.m76029xad9975ba());
            }
            cw1Var.set(2, dr2Var);
            h3Var2.f200048d = cw1Var;
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g3(h3Var2.f200052h, h3Var2, cw1Var));
            r45.cw1 cw1Var2 = h3Var2.f200048d;
            if (cw1Var2 != null) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f408866e, cw1Var2.m75939xb282bd08(5), cw1Var2.m75945x2fec8307(0));
                ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f408868g, cw1Var2.m75939xb282bd08(5), cw1Var2.m75945x2fec8307(0));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorInfo, nickname: ");
                sb6.append(cw1Var2.m75945x2fec8307(1));
                sb6.append(", isFollow: ");
                sb6.append(cw1Var2.m75933x41a8a7f2(4));
                sb6.append(", type: ");
                sb6.append(cw1Var2.m75939xb282bd08(5));
                sb6.append(", authDesc: ");
                r45.dr2 dr2Var2 = (r45.dr2) cw1Var2.m75936x14adae67(2);
                sb6.append(dr2Var2 != null ? dr2Var2.m75945x2fec8307(0) : null);
                sb6.append(", authType: ");
                r45.dr2 dr2Var3 = (r45.dr2) cw1Var2.m75936x14adae67(2);
                sb6.append(dr2Var3 != null ? java.lang.Integer.valueOf(dr2Var3.m75939xb282bd08(1)) : null);
                sb6.append(", authUrl: ");
                r45.dr2 dr2Var4 = (r45.dr2) cw1Var2.m75936x14adae67(2);
                sb6.append(dr2Var4 != null ? dr2Var4.m75945x2fec8307(2) : null);
                sb6.append(" avatarUrl: ");
                sb6.append(cw1Var2.m75945x2fec8307(3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h3Var2.f200047c, sb6.toString());
            }
            h3Var2.f200055k.mo48813x58998cd();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(h3Var2.f200046b, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c3(h3Var2, null), 2, null);
            h3Var2.f200051g.i();
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((ml2.r0) c17).pj(ml2.c4.f408865d, 0, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", this.f195149q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bd0 bd0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bd0(this, j17);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(bd0Var, j17);
        }
    }

    public final boolean C1() {
        return ((mm2.d) P0(mm2.d.class)).N6();
    }

    public final boolean D1() {
        return ((mm2.d) P0(mm2.d.class)).f410475f || V0().f390662d.f150085v == 4;
    }

    public final void E1(android.view.View view, java.lang.String str, int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        if (this.f195148p.mo11219xd0598cf8() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view, kz5.b1.e(new jz5.l("is_biz_live", java.lang.Integer.valueOf(D1() ? 1 : 0))));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, i17, 25561);
        }
    }

    public final void F1(int i17) {
        this.S = i17;
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
            i17 = 8;
        }
        y1().setVisibility(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    public final void G1(boolean z17, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "[setFollowBtnState] source:" + str + ", isFollow:" + z17);
        I1(0);
        android.widget.TextView textView = this.f195158z;
        textView.setVisibility(0);
        if (this.f195148p.mo11219xd0598cf8() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Pj(ml2.a2.f408731e, D1());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] call false");
        H1(this, z17, false);
        android.view.ViewGroup viewGroup = this.f446856d;
        android.content.Context context = this.f195150r;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.A;
        android.widget.FrameLayout frameLayout = this.B;
        if (!z17) {
            z1().mo50303x856b99f0(this.L);
            c22699x3dcdb352.setVisibility(0);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
            textView.setPadding(0, 0, viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561431ib), 0);
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfd));
            K1(D1());
            textView.setTextSize(0, viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561992yj));
            zl2.r4.c3(zl2.r4.f555483a, this.f195158z, 0, 0, 6, null);
            frameLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dd0(this));
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ed0(this));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "#1")) {
                return;
            }
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200L);
            frameLayout.startAnimation(alphaAnimation);
            return;
        }
        boolean z18 = c22699x3dcdb352.getVisibility() == 0;
        c22699x3dcdb352.setVisibility(4);
        textView.setOnClickListener(null);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) && z18) {
            I1(0);
            textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fd0(this, z17));
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = this.Q;
        if (c22787x6853c653 != null && frameLayout.indexOfChild(c22787x6853c653) != -1) {
            c22787x6853c653.n();
            frameLayout.removeView(c22787x6853c653);
        }
        if (frameLayout.getWidth() > 0) {
            frameLayout.getLayoutParams().width = frameLayout.getWidth();
        }
        c22699x3dcdb352.setVisibility(8);
        this.C.setBackground(viewGroup.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563251a34));
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573807fw4));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560783u2));
        textView.setTextSize(0, viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561993yk));
        textView.setPadding(0, 0, 0, 0);
        textView.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gd0.f194217d);
    }

    public final void I1(int i17) {
        boolean booleanValue = ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.c1) P0(mm2.c1.class)).f410455y5).mo144003x754a37bb()).booleanValue();
        boolean F1 = zl2.r4.F1(S0());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" setFollowLayoutVisible ");
        sb6.append(i17);
        sb6.append(" inSideBarStatus: ");
        android.view.ViewGroup viewGroup = this.f446856d;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sb6.append(((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f);
        sb6.append(", canShowFollowBtn:");
        sb6.append(booleanValue);
        sb6.append(", isCoLive:");
        sb6.append(F1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", sb6.toString());
        this.f195147J = i17;
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(pl2.x.class)).f438216f || !booleanValue || F1) {
            i17 = 8;
        }
        this.B.setVisibility(i17);
    }

    @Override // qo0.a
    public void J0() {
        android.view.ViewGroup viewGroup = this.f446856d;
        if (com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext()) == 0) {
            com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 16);
        }
        this.f195158z.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cd0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(boolean r7, java.lang.String r8) {
        /*
            r6 = this;
            zl2.r4 r0 = zl2.r4.f555483a
            boolean r1 = r0.w1()
            if (r7 == r1) goto L9
            return
        L9:
            gk2.e r1 = r6.S0()
            boolean r0 = r0.q1(r1)
            r1 = 0
            if (r0 == 0) goto L5b
            java.lang.Class<mm2.n2> r0 = mm2.n2.class
            androidx.lifecycle.c1 r2 = r6.P0(r0)
            mm2.n2 r2 = (mm2.n2) r2
            r45.eq1 r2 = r2.f410812g
            r3 = 1
            if (r2 == 0) goto L2a
            r4 = 4
            boolean r2 = r2.m75933x41a8a7f2(r4)
            if (r2 != r3) goto L2a
            r2 = r3
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 == 0) goto L5b
            androidx.lifecycle.c1 r2 = r6.P0(r0)
            mm2.n2 r2 = (mm2.n2) r2
            r45.eq1 r2 = r2.f410812g
            if (r2 == 0) goto L3f
            boolean r2 = r2.m75933x41a8a7f2(r3)
            if (r2 != r3) goto L3f
            r2 = r3
            goto L40
        L3f:
            r2 = r1
        L40:
            if (r2 == 0) goto L5b
            androidx.lifecycle.c1 r0 = r6.P0(r0)
            mm2.n2 r0 = (mm2.n2) r0
            boolean r0 = r0.f410811f
            if (r0 == 0) goto L5b
            java.lang.Class<uh4.c0> r0 = uh4.c0.class
            i95.m r0 = i95.n0.c(r0)
            uh4.c0 r0 = (uh4.c0) r0
            boolean r0 = r0.mo168058x74219ae7()
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r3 = r1
        L5c:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.y1()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L97
            r6.F1(r1)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.y1()
            r0.a(r7, r8, r3)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r8 = r6.y1()
            com.tencent.mm.plugin.finder.live.plugin.jd0 r0 = new com.tencent.mm.plugin.finder.live.plugin.jd0
            r0.<init>(r6)
            r8.m57897xa2b9091a(r0)
            if (r7 != 0) goto L9e
            java.lang.Class<ml2.r0> r7 = ml2.r0.class
            i95.m r7 = i95.n0.c(r7)
            java.lang.String r8 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)
            r0 = r7
            ml2.r0 r0 = (ml2.r0) r0
            ml2.j4 r1 = ml2.j4.f409145e
            r2 = 0
            com.tencent.mm.plugin.finder.live.plugin.eh0 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193952i
            r4 = 2
            r5 = 0
            ml2.r0.Lj(r0, r1, r2, r3, r4, r5)
            goto L9e
        L97:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget r0 = r6.y1()
            r0.a(r7, r8, r3)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.J1(boolean, java.lang.String):void");
    }

    public final void K1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "#switchUiStyle isBizMode=" + z17 + " isAnchorFollowed: " + C1());
        android.widget.TextView textView = this.f195158z;
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.content.Context context = this.f195150r;
        this.A.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        M1(false);
        boolean C1 = C1();
        android.view.ViewGroup viewGroup = this.f446856d;
        android.view.View view = this.C;
        if (C1 || textView.getTextColors().getDefaultColor() != context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz)) {
            view.setBackground(viewGroup.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563251a34));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560783u2));
        } else {
            view.setBackground(viewGroup.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563250a33));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
        }
    }

    public final void L1(r45.g84 g84Var) {
        fy2.d dVar = (fy2.d) P0(fy2.d.class);
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = g84Var != null ? g84Var.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f195152t;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "updateAvatarDecoration url is null or empty.");
            dVar.f348772f = g84Var;
            c22789xd23e9a9b.n();
            c22789xd23e9a9b.setVisibility(4);
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(dVar.N6(g84Var))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "updateAvatarDecoration local decorations exist.");
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.D));
            c22789xd23e9a9b.mo82567x3e3ac3e8(dVar.N6(g84Var));
            c22789xd23e9a9b.m82583xcde73672(-1);
            c22789xd23e9a9b.g();
            dVar.f348772f = g84Var;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "updateAvatarDecoration download decorations.");
            dVar.O6(g84Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ld0(g84Var, this, dVar));
        }
        c22789xd23e9a9b.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            int i17 = this.K;
            if (ordinal == 39) {
                z1().mo50303x856b99f0(i17);
                if (!(bundle != null && bundle.getBoolean("PARAM_FINDER_LIVE_SHAKE_VIEW", false))) {
                    z1().mo50307xb9e94560(i17, 0L);
                    return;
                } else {
                    if (this.B.getVisibility() != 0) {
                        z1().mo50307xb9e94560(i17, 0L);
                        return;
                    }
                    return;
                }
            }
            if (ordinal == 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "#statusChange START_LIVE");
                if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW") : false) {
                    L1(((fy2.d) P0(fy2.d.class)).f348772f);
                    return;
                } else {
                    B1(this, false, 1, null);
                    return;
                }
            }
            if (ordinal == 8) {
                z1().mo50303x856b99f0(i17);
                return;
            } else if (ordinal != 27 && ordinal != 28) {
                return;
            }
        }
        K0(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void M1(boolean z17) {
        boolean z18 = true;
        if (!z17) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.H;
            if ((r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) != false) {
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.md0 md0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.md0.f195022d;
        android.widget.TextView textView = this.f195153u;
        textView.setOnClickListener(md0Var);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(textView);
        r45.bw1 bw1Var = (r45.bw1) ((mm2.c1) P0(mm2.c1.class)).P5.mo3195x754a37bb();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = ((mm2.c1) P0(mm2.c1.class)).f410392p0;
        android.content.Context context = this.f195150r;
        jz5.f0 f0Var = null;
        if (bw1Var != null) {
            java.lang.String m75945x2fec8307 = ((r45.cw1) bw1Var.m75941xfb821914(0).getFirst()).m75945x2fec8307(1);
            if (m75945x2fec8307 != null) {
                java.lang.String m75945x2fec83072 = bw1Var.m75945x2fec8307(1);
                if ((m75945x2fec83072 == null || m75945x2fec83072.length() == 0) == true) {
                    textView.setText(this.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2d, m75945x2fec8307));
                } else {
                    textView.setText(bw1Var.m75945x2fec8307(1));
                }
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77678x8113c22e));
                textView.setVisibility(0);
                textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oc0(this));
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                textView.setVisibility(8);
                android.view.View view = this.f195154v;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToAdMode", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToAdMode", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGuideFollowAdInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (c19786x6a1e2862 == null || c19786x6a1e2862.m76503x92bc3c07() != 6) {
            if (D1()) {
                w1();
                return;
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) ((mm2.c1) P0(mm2.c1.class)).R2.mo3195x754a37bb();
            if (charSequence != null && charSequence.length() != 0) {
                z18 = false;
            }
            if (!z18) {
                java.lang.String str = (java.lang.String) ((mm2.c1) P0(mm2.c1.class)).R2.mo3195x754a37bb();
                textView.setText(str != null ? str : "");
                textView.setTextColor(android.graphics.Color.parseColor("#CCFFE285"));
                textView.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
            android.view.View view2 = this.f195154v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "updateExpandDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "updateExpandDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        java.lang.String m76517xcb1f2fa3 = c19786x6a1e2862.m76517xcb1f2fa3();
        if (m76517xcb1f2fa3 != null) {
            java.lang.String str2 = (m76517xcb1f2fa3.length() > 0) == true ? m76517xcb1f2fa3 : null;
            if (str2 != null) {
                try {
                    java.lang.String optString = new org.json.JSONObject(str2).optString("qualificat_id");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                    h0Var.f391656d = optString;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView.getText(), c19786x6a1e2862.m76523x98b23862())) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).fk(1, (java.lang.String) h0Var.f391656d);
        }
        textView.setText(c19786x6a1e2862.m76523x98b23862());
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77694xd4624f5d));
        textView.setVisibility(0);
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qc0(this, c19786x6a1e2862, h0Var));
        android.view.View view3 = this.f195154v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToEligibilityMode", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToEligibilityMode", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01fc, code lost:
    
        if ((r14.length() > 0) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if ((r12.length() > 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03ed, code lost:
    
        if (zl2.r4.F1(S0()) != false) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v40, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v10, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N1(java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.N1(java.lang.String, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        z1().mo50303x856b99f0(this.M);
        z1().mo50303x856b99f0(this.K);
        z1().mo50302x6b17ad39(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.c1) P0(mm2.c1.class)).P5;
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        c14227x4262fb44.m7809x1ff8439((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
        android.widget.TextView textView = this.f195155w;
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), 0, textView.getPaddingBottom());
        this.f195157y.setVisibility(8);
        this.f195156x.setVisibility(8);
        this.f195153u.setVisibility(8);
        I1(8);
        K1(false);
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void c1(boolean z17) {
        if (!z17) {
            I1(this.f195147J);
            F1(this.S);
            return;
        }
        this.f194861m = 65535;
        K0(0);
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout.getVisibility() != 8) {
            frameLayout.setVisibility(4);
        }
        if (y1().getVisibility() != 8) {
            y1().setVisibility(4);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void h1(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        u1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.i92 i92Var;
        r45.k74 k74Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f564991ax2 && (i92Var = (r45.i92) ((mm2.e1) P0(mm2.e1.class)).f410521r.m75936x14adae67(55)) != null && (k74Var = (r45.k74) i92Var.m75936x14adae67(2)) != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = this.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            c19786x6a1e2862.m76551x3af0573b(k74Var);
            c19786x6a1e2862.m76550x2592a27b(6);
            ac4Var.set(1, c19786x6a1e2862);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ac4Var.set(2, bool);
            ac4Var.set(3, bool);
            ac4Var.set(4, 1);
            c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        if (r8.B.getVisibility() != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0.u1():void");
    }

    public final void v1(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "[doBlockOpLog] ");
        this.T = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc0();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.b(ya2.r.f542058a, username, false, null, null, this.T, 12, null);
    }

    public final void w1() {
        boolean D1 = D1();
        android.widget.TextView textView = this.f195153u;
        if (D1) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pc0(this));
            E1(textView, "finder_live_room_bizname", 8);
            textView.setTextColor(this.f195150r.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77678x8113c22e));
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.e2_);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        android.view.View view = this.f195154v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToBizMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin", "forceUpdateExpandToBizMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String x1() {
        java.lang.String str = V0().f390662d.f150086w;
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? ((mm2.d) P0(mm2.d.class)).f410476g : str;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14397xacff3a56 y1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14397xacff3a56) this.D.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = ((mm2.c1) P0(mm2.c1.class)).P5;
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        c14227x4262fb44.mo7806x9d92d11c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tc0(this));
        mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vc0(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad0(this, null), 3, null);
        B1(this, false, 1, null);
        M1(false);
        android.view.View view = (android.view.View) ((jz5.n) this.V1).mo141623x754a37bb();
        if (view != null) {
            view.addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.op0(this));
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 z1() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.P).mo141623x754a37bb();
    }
}
