package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ty extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public final android.content.res.Resources A;
    public final android.view.View B;
    public final android.widget.TextView C;
    public final android.widget.TextView D;
    public final android.widget.TextView E;
    public final android.view.View F;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 G;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c H;
    public final android.widget.ProgressBar I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View f196016J;
    public final android.view.View K;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14325xe0883bfd L;
    public final android.widget.TextView M;
    public final android.widget.TextView N;
    public final android.view.View P;
    public final android.view.View Q;
    public final bm2.n5 R;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 S;
    public final android.widget.ImageView T;
    public final android.widget.TextView U;
    public r45.xn1 V;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 W;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 X;
    public java.util.ArrayList Y;
    public int Z;

    /* renamed from: l1, reason: collision with root package name */
    public final int f196017l1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196018p;

    /* renamed from: p0, reason: collision with root package name */
    public final db5.t4 f196019p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14338xe5c15371 f196020p1;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f196021q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f196022r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f196023s;

    /* renamed from: t, reason: collision with root package name */
    public final int f196024t;

    /* renamed from: u, reason: collision with root package name */
    public final int f196025u;

    /* renamed from: v, reason: collision with root package name */
    public final int f196026v;

    /* renamed from: w, reason: collision with root package name */
    public final int f196027w;

    /* renamed from: x, reason: collision with root package name */
    public final int f196028x;

    /* renamed from: x0, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f196029x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.Map f196030x1;

    /* renamed from: y, reason: collision with root package name */
    public final int f196031y;

    /* renamed from: y0, reason: collision with root package name */
    public final int f196032y0;

    /* renamed from: z, reason: collision with root package name */
    public int f196033z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(android.view.ViewGroup root, zl2.u4 uiMode, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196018p = statusMonitor;
        this.f196021q = "Finder.FinderLiveMemberListPlugin";
        this.f196022r = "PORTRAIT_ACTION_GOTO_PROFILE_MEMBERLIST";
        this.f196023s = "PORTRAIT_ACTION_KEY_FINDER_USERNAME";
        this.f196024t = 1;
        this.f196025u = 10;
        this.f196026v = 11;
        this.f196027w = 12;
        this.f196028x = 13;
        this.f196031y = 14;
        int h07 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * (ae2.in.f85221a.h0() / 100.0f));
        android.content.res.Resources resources = root.getContext().getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.A = resources;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f9p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.B = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f9w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.C = textView;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f9r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f9l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.f9k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.E = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.f9m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.F = findViewById6;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.f9j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById7;
        this.G = c1163xf1deaba4;
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.f9h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) findViewById8;
        this.H = c22613xe7040d9c;
        android.view.View findViewById9 = root.findViewById(com.p314xaae8f345.mm.R.id.f9i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.p314xaae8f345.mm.R.id.f9q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.I = (android.widget.ProgressBar) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.f9g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f196016J = findViewById11;
        android.view.View findViewById12 = root.findViewById(com.p314xaae8f345.mm.R.id.f9n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.K = findViewById12;
        android.view.View findViewById13 = root.findViewById(com.p314xaae8f345.mm.R.id.f4r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.L = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14325xe0883bfd) findViewById13;
        android.view.View findViewById14 = root.findViewById(com.p314xaae8f345.mm.R.id.f9x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.M = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = root.findViewById(com.p314xaae8f345.mm.R.id.f9v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.N = (android.widget.TextView) findViewById15;
        android.view.View findViewById16 = root.findViewById(com.p314xaae8f345.mm.R.id.r6h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.P = findViewById16;
        android.view.View findViewById17 = root.findViewById(com.p314xaae8f345.mm.R.id.f9d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        this.Q = findViewById17;
        android.view.View findViewById18 = root.findViewById(com.p314xaae8f345.mm.R.id.agx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById18;
        android.content.Context context = R0().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.content.res.Resources resources2 = root.getContext().getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources2, "getResources(...)");
        bm2.n5 n5Var = new bm2.n5(uiMode, context, resources2, c1163xf1deaba4, findViewById17, c22613xe7040d9c, (mm2.c1) P0(mm2.c1.class), (mm2.f5) P0(mm2.f5.class), this);
        this.R = n5Var;
        android.view.View findViewById19 = root.findViewById(com.p314xaae8f345.mm.R.id.f9u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) findViewById19;
        this.S = c22645x24069159;
        android.view.View findViewById20 = root.findViewById(com.p314xaae8f345.mm.R.id.f9f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById20, "findViewById(...)");
        this.T = (android.widget.ImageView) findViewById20;
        android.view.View findViewById21 = root.findViewById(com.p314xaae8f345.mm.R.id.eqh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById21, "findViewById(...)");
        this.U = (android.widget.TextView) findViewById21;
        this.Y = new java.util.ArrayList();
        this.f196019p0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ay(this);
        this.f196029x0 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) root.findViewById(com.p314xaae8f345.mm.R.id.f9b);
        this.f196032y0 = i65.a.b(root.getContext(), 64);
        resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f196017l1 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
        android.view.View findViewById22 = root.findViewById(com.p314xaae8f345.mm.R.id.u2v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById22, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14338xe5c15371 c14338xe5c15371 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14338xe5c15371) findViewById22;
        this.f196020p1 = c14338xe5c15371;
        android.view.ViewGroup.LayoutParams layoutParams2 = c22645x24069159.getLayoutParams();
        int i18 = layoutParams2 != null ? layoutParams2.height : 0;
        this.f196033z = i18;
        if (i18 <= 0) {
            this.f196033z = resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMemberListPlugin", "initTitleGroupHeight:" + this.f196033z);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(n5Var);
        int i19 = this.f196033z;
        android.view.ViewGroup viewGroup = this.f446856d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
        if (x0()) {
            c22613xe7040d9c.getLayoutParams().width = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y;
            c22613xe7040d9c.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x);
            c22613xe7040d9c.m81302x795a7a7b(true);
            c22613xe7040d9c.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jx.f194704d);
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
        if (!x0() && (layoutParams = imageView.getLayoutParams()) != null) {
            com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i28 = a17.f278668a;
            if (!z17 && i28 > (i17 = a17.f278669b)) {
                i28 = i17;
            }
            layoutParams.height = (int) ((i28 * com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd) / 390.0f);
        }
        imageView.setImageDrawable(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb(30, 255, 195, 0), 0}));
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        c14338xe5c15371.setClipToOutline(true);
        c14338xe5c15371.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gx(this));
        this.f196030x1 = new java.util.LinkedHashMap();
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty tyVar, boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kickMember:");
        r45.xn1 xn1Var = tyVar.V;
        java.lang.String str = null;
        sb6.append((xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tyVar.f196021q, sb6.toString());
        dk2.xf W0 = tyVar.W0();
        if (W0 != null) {
            r45.xn1 xn1Var2 = tyVar.V;
            if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
                str = c19782x23db1cfa.m76197x6c03c64c();
            }
            ((dk2.r4) W0).w(str, z17, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qx(tyVar));
        }
    }

    public final void A1(int i17, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("element", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f555483a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.H2, jSONObject2, null, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", this.f196022r)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gy gyVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gy(this, bundle, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(gyVar, j17);
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        u1();
        if (this.f196018p.mo11219xd0598cf8() != 1) {
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

    public final void B1(int i17, java.lang.Integer num) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put(ya.b.f77502x92235c1b, 2);
        jSONObject.put("identity", num);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        int i18 = 0;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).R6()) {
            i18 = 1;
        }
        jSONObject.put("display_type", i18 ^ 1);
        jSONObject.put("sort_type", this.Z == 0 ? 1 : 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f555483a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409880d2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.F2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(java.lang.Long r31) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty.C1(java.lang.Long):void");
    }

    public final void D1(r45.x71 x71Var) {
        java.lang.String str;
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
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("heatlimit showTitle isAnchorOrAssistantOrInviteeAnchor ");
        sb7.append(w1());
        sb7.append(", svrHeatStr:");
        sb7.append(str2);
        sb7.append(", heatValue:");
        sb7.append(x71Var != null ? java.lang.Long.valueOf(x71Var.m75942xfb822ef2(12)) : null);
        sb7.append(", svrViewedMemberCountStr ");
        sb7.append(m75945x2fec8307);
        sb7.append(", svrOnlineCountStr ");
        sb7.append(m75945x2fec83072);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196021q, sb7.toString());
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
        if (v1() && m75945x2fec83072 != null) {
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
        java.lang.String str3 = (r26.n0.N(str2) ^ true) && (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "0") || v1()) ? str2 : null;
        if (str3 != null) {
            if (sb6.length() > 0) {
                sb6.append(" · ");
            }
            sb6.append(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573425ek4, str3));
        }
        this.C.setText(sb6.toString());
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
            this.R.y();
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
        this.L.getClass();
        bm2.n5 n5Var = this.R;
        n5Var.y();
        this.B.setOnClickListener(null);
        this.f196016J.setOnClickListener(null);
        this.E.setOnClickListener(null);
        this.K.setOnClickListener(null);
        this.H.m81307xf9cef5a7(null);
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
        boolean z17 = (((mm2.e1) P0(mm2.e1.class)).b7() && ((om2.l) P0(om2.l.class)).f427876h) ? false : true;
        int i19 = 16;
        if (!pm0.v.z(i18, 16) || !z17) {
            K0(8);
            return;
        }
        if (w0() != 0) {
            K0(0);
            nk2.l.f419554a.b(nk2.a.f419484d);
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_MEMBER_SKIP_LOADING") : false) {
                this.H.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jy(this));
                this.R.z();
                return;
            }
            this.I.setVisibility(0);
            this.D.setVisibility(8);
            android.view.View view = this.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.S.setVisibility(8);
            this.G.setVisibility(8);
            this.R.z();
            this.H.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ky(this));
            if (v1()) {
                i19 = 1;
            } else {
                if (!(((mm2.n0) P0(mm2.n0.class)).f410806r)) {
                    i19 = 2;
                }
            }
            int i27 = (this.Z == 1 && v1()) ? 3 : 0;
            this.R.L = this.Z == 1 && v1();
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).B(i19, i27, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.my(this));
            }
            if (!zl2.r4.f555483a.X1(S0()) || !((mm2.c1) P0(mm2.c1.class)).f410462z6) {
                this.L.setVisibility(8);
            } else {
                this.L.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ip0(this, null), 3, null);
            }
        }
    }

    public final void u1() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(this.H, null, 1, null);
    }

    public final boolean v1() {
        if (w1()) {
            return true;
        }
        return ((mm2.o4) P0(mm2.o4.class)).z7() && ((mm2.c1) P0(mm2.c1.class)).R4;
    }

    public final boolean w1() {
        if (zl2.r4.f555483a.w1() || ((mm2.c1) P0(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) P0(mm2.n0.class)).f410806r;
    }

    public final void x1() {
        this.D.setVisibility(0);
        this.I.setVisibility(8);
        this.S.setVisibility(8);
        this.G.setVisibility(8);
        android.view.View view = this.F;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196021q, "onGetLiveOnlineByRoomFail");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(r45.x71 r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ty.y1(r45.x71, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        this.B.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rx(this));
        this.f196016J.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sx(this));
        this.E.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tx(this));
        this.K.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ux(this));
        this.H.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vx(this));
        this.R.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wx(this);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = this.f196029x0;
        if (c2678xa407981c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hx hxVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hx(this);
            hxVar.a(c2678xa407981c, 0);
            c2678xa407981c.a(hxVar);
        }
    }

    public final void z1(int i17) {
        int i18 = this.Z == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("sort_type", i18);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f555483a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.G2, jSONObject2, null, 4, null);
        }
    }
}
