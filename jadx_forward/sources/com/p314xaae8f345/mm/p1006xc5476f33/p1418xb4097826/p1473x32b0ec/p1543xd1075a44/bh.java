package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class bh extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 implements android.view.View.OnClickListener {
    public static final /* synthetic */ int U = 0;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 A;
    public final android.view.View B;
    public final android.view.View C;
    public final android.view.View D;
    public final android.view.View E;
    public final android.view.View F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 f199412J;
    public int K;
    public int L;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri N;
    public p3325xe03a0797.p3326xc267989b.r2 P;
    public final bm2.v2 Q;
    public r45.js1 R;
    public boolean S;
    public boolean T;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f199413h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f199414i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f199415m;

    /* renamed from: n, reason: collision with root package name */
    public final int f199416n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f199417o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f199418p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f199419q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f199420r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f199421s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f199422t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f199423u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f199424v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f199425w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f199426x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f199427y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f199428z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(android.content.Context context) {
        super(context);
        float m58105x1a7dbbfd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199415m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qg(this));
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        if (z17) {
            float m58105x1a7dbbfd2 = m58105x1a7dbbfd();
            float m58107x754ccc10 = m58107x754ccc10();
            m58105x1a7dbbfd = (m58105x1a7dbbfd2 > m58107x754ccc10 ? m58107x754ccc10 : m58105x1a7dbbfd2) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        } else {
            m58105x1a7dbbfd = m58105x1a7dbbfd() * (ae2.in.f85221a.h0() / 100.0f);
        }
        int i17 = (int) m58105x1a7dbbfd;
        this.f199416n = i17;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqh, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199417o = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.drq);
        this.f199418p = findViewById;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) inflate.findViewById(com.p314xaae8f345.mm.R.id.drr);
        this.f199419q = c22613xe7040d9c;
        this.f199420r = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565835ds0);
        this.f199421s = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.drv);
        android.view.View findViewById2 = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dru);
        this.f199422t = findViewById2;
        this.f199423u = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565836ds1);
        this.f199424v = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qix);
        this.f199425w = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qpx);
        android.widget.TextView textView = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.drx);
        this.f199426x = textView;
        this.f199427y = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dry);
        this.f199428z = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.drt);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.drs);
        this.A = c1163xf1deaba4;
        android.view.View findViewById3 = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qie);
        this.B = findViewById3;
        this.C = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qre);
        this.D = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.fcz);
        this.E = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565925qj0);
        this.F = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qpl);
        this.G = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565926qj1);
        this.H = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qpm);
        this.I = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qiz);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.qpt);
        float a17 = com.p314xaae8f345.mm.ui.zk.a(context, 12);
        c22645x24069159.c(a17, a17, 0.0f, 0.0f);
        this.f199412J = c22645x24069159;
        this.K = 1;
        this.L = 1;
        bm2.v2 v2Var = new bm2.v2();
        v2Var.f103912h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lg.f200467d;
        this.Q = v2Var;
        c22613xe7040d9c.getLayoutParams().height = i17;
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mg(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(inflate.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(v2Var);
        c1163xf1deaba4.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ng(this));
        findViewById.setOnClickListener(this);
        c22613xe7040d9c.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansListWidget", "init isLand:" + z17 + ", DEFAULT_PANEL_HEIGHT:" + i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r1 != null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh r29, r45.js1 r30) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh.e(com.tencent.mm.plugin.finder.live.widget.bh, r45.js1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAllFansCntDesc */
    public final java.lang.String m57972xa23efc4f() {
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.js1 js1Var = this.R;
        objArr[0] = java.lang.String.valueOf(js1Var != null ? js1Var.m75939xb282bd08(3) : 0);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573054lu0, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    /* renamed from: getListBottomPage */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hg m57973xadb0f8e() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hg) ((jz5.n) this.f199415m).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSuperFansCntDesc */
    public final java.lang.String m57974xa5e154b5() {
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.js1 js1Var = this.R;
        objArr[0] = java.lang.String.valueOf(js1Var != null ? js1Var.m75939xb282bd08(7) : 0);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573063lu3, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setResp */
    public final void m57975x764f8b52(r45.js1 js1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansListWidget", java.lang.String.valueOf(pm0.b0.g(js1Var == null ? "" : js1Var)));
        this.R = js1Var;
    }

    /* renamed from: setShowModify */
    private final void m57976x40885419(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansListWidget", "showModify:" + z17);
        this.S = z17;
    }

    public final void f() {
        if (this.f199414i == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f199413h;
            if (y1Var != null) {
                y1Var.q();
            }
            this.f199413h = null;
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = m57973xadb0f8e().f293331d;
            if (y1Var2 != null) {
                y1Var2.q();
            }
            this.f199414i = null;
        }
        this.f199419q.setTranslationY(0.0f);
    }

    public final void g(boolean z17, yz5.l lVar) {
        int i17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        r45.nw1 nw1Var;
        if (zl2.r4.f555483a.w1()) {
            i17 = 1;
        } else {
            mm2.n0 n0Var = (mm2.n0) dk2.ef.f314905a.i(mm2.n0.class);
            i17 = n0Var != null && n0Var.f410806r ? 16 : 2;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(e1Var != null ? e1Var.f410518o : null);
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        long m75942xfb822ef2 = (e1Var2 == null || (nw1Var = e1Var2.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = e1Var3 != null ? e1Var3.f410516m : 0L;
        if (z17) {
            m57975x764f8b52(null);
        } else {
            r45.js1 js1Var = this.R;
            if (js1Var != null) {
                m75934xbce7f2f = js1Var.m75934xbce7f2f(1);
                ke2.q qVar = new ke2.q(b17, m75942xfb822ef2, j17, m75934xbce7f2f, i17, null, this.K, this.L);
                android.content.Context context = this.f199417o.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                qVar.t(context, this.f199417o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 1000L);
                qVar.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rg(lVar));
            }
        }
        m75934xbce7f2f = null;
        ke2.q qVar2 = new ke2.q(b17, m75942xfb822ef2, j17, m75934xbce7f2f, i17, null, this.K, this.L);
        android.content.Context context2 = this.f199417o.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        qVar2.t(context2, this.f199417o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 1000L);
        qVar2.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rg(lVar));
    }

    public final void h(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, boolean z17) {
        int i17;
        java.util.List list;
        m57976x40885419(z17);
        this.f199414i = y1Var;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.P;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        boolean z18 = this.S;
        android.widget.TextView textView = this.f199426x;
        if (z18) {
            textView.setVisibility(0);
            android.view.View view = this.f199421s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f199424v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText("");
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var != null && (list = n2Var.f410816n) != null) {
                ((java.util.ArrayList) list).clear();
            }
            mm2.n2 n2Var2 = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var2 != null) {
                n2Var2.f410817o = null;
            }
            this.P = p3325xe03a0797.p3326xc267989b.l.d(m58106x7520e49e(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kg(this, null), 3, null);
        } else {
            textView.setVisibility(8);
            android.view.View view3 = this.f199421s;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f199424v;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "adjustShowModifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f199420r.getLayoutParams();
        int dimensionPixelOffset = layoutParams != null ? layoutParams.height : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        android.view.View view5 = this.f199417o;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(view5.getContext());
        android.view.View view6 = this.f199421s;
        if (view6.getVisibility() == 0) {
            android.view.ViewGroup.LayoutParams layoutParams2 = view6.getLayoutParams();
            i17 = layoutParams2 != null ? layoutParams2.height : ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 150.0f);
        } else {
            i17 = 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.A;
        c1163xf1deaba4.getLayoutParams().height = ((this.f199416n - c17) - dimensionPixelOffset) - i17;
        android.view.ViewGroup.LayoutParams layoutParams3 = c1163xf1deaba4.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin += c17;
        j();
        if (y1Var == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(view5.getContext());
            zl2.r4 r4Var = zl2.r4.f555483a;
            r4Var.Q2(view5);
            y1Var2.l(view5, new android.widget.FrameLayout.LayoutParams(-1, -1));
            y1Var2.a();
            android.content.Context context = view5.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (r4Var.Y1(context)) {
                y1Var2.m(java.lang.Boolean.TRUE);
                y1Var2.G = true;
            }
            y1Var2.s();
            this.f199413h = y1Var2;
        } else {
            zl2.r4.f555483a.Q2(this);
            y1Var.h(m57973xadb0f8e());
        }
        if (zl2.r4.f555483a.w1()) {
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            if (c1Var != null && c1Var.a8()) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).yj(ml2.z4.Q, "4", null);
                return;
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.c1 c1Var2 = ml2.c1.f408858e;
            j0Var.hj(27L, "4", null);
        }
    }

    public void i() {
        this.f200701f = null;
        f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar = this.M;
        if (eiVar != null) {
            eiVar.f200701f = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar = this.N;
        if (riVar != null) {
            riVar.f200701f = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar2 = riVar.f201177o;
            if (eiVar2 != null) {
                eiVar2.f200701f = null;
            }
        }
        this.f199419q.m81307xf9cef5a7(null);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.P;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    public final void j() {
        g(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ah(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f199414i;
        android.view.View view = this.f199422t;
        if (y1Var == null) {
            view.setRotation(90.0f);
        } else {
            view.setRotation(180.0f);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        r45.eq1 eq1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jz5.f0 f0Var = null;
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.drq) {
            f();
        } else if (valueOf == null || valueOf.intValue() != com.p314xaae8f345.mm.R.id.dru) {
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.drx) {
                dk2.ef efVar = dk2.ef.f314905a;
                mm2.n2 n2Var = (mm2.n2) efVar.i(mm2.n2.class);
                java.util.List list = n2Var != null ? n2Var.f410816n : null;
                boolean z17 = list == null || list.isEmpty();
                jz5.f0 f0Var2 = jz5.f0.f384359a;
                if (z17) {
                    if (this.M == null) {
                        android.content.Context context = getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei(context);
                        eiVar3.m58027x31c61473(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sg(this));
                        this.M = eiVar3;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = m58104xb7f4f95a();
                    if (m58104xb7f4f95a == null || (eiVar2 = this.M) == null) {
                        f0Var2 = null;
                    } else {
                        eiVar2.a(m58104xb7f4f95a);
                    }
                    if (f0Var2 == null && (eiVar = this.M) != null) {
                        eiVar.m58109x53aeff12(m58106x7520e49e());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar4 = this.M;
                    if (eiVar4 != null) {
                        eiVar4.c(this.f199413h);
                    }
                    mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                    if (c1Var != null && c1Var.a8()) {
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).yj(ml2.z4.Q, "5", null);
                    } else {
                        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                        ml2.c1 c1Var2 = ml2.c1.f408858e;
                        j0Var.hj(27L, "5", null);
                    }
                } else {
                    if (this.N == null) {
                        android.content.Context context2 = getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri(context2);
                        riVar3.m58144x31c61473(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tg(this));
                        this.N = riVar3;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a2 = m58104xb7f4f95a();
                    if (m58104xb7f4f95a2 != null && (riVar2 = this.N) != null) {
                        riVar2.a(m58104xb7f4f95a2);
                        f0Var = f0Var2;
                    }
                    if (f0Var == null && (riVar = this.N) != null) {
                        riVar.m58109x53aeff12(m58106x7520e49e());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar4 = this.N;
                    if (riVar4 != null) {
                        riVar4.c(this.f199413h);
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.qie) {
                mm2.n2 n2Var2 = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
                if (n2Var2 == null || (eq1Var = n2Var2.f410812g) == null || (str = eq1Var.m75945x2fec8307(12)) == null) {
                    str = "";
                }
                java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(getContext());
                android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("finder_username", Ui);
                java.lang.String uri = buildUpon.build().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", uri);
                intent.putExtra("convertActivityFromTranslucent", true);
                j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        } else if (this.f199414i == null) {
            f();
        } else {
            m57973xadb0f8e().h();
            this.f199414i = null;
            this.f199419q.setTranslationY(0.0f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
