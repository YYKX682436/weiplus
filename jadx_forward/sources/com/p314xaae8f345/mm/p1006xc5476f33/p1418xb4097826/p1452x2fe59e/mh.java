package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class mh implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20, in5.x, in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f188909d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f188910e;

    /* renamed from: f, reason: collision with root package name */
    public yw2.n f188911f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f188912g;

    /* renamed from: h, reason: collision with root package name */
    public int f188913h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f188914i;

    /* renamed from: m, reason: collision with root package name */
    public final so2.m6 f188915m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f188916n;

    public mh(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f188909d = context;
        this.f188910e = new java.util.ArrayList();
        this.f188915m = new so2.m6();
        this.f188916n = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderLiveLikeDrawerPresenter$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mh.this.f188914i;
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yl((c14994x9b99c079 == null || (feedObject = c14994x9b99c079.getFeedObject()) == null) ? 0L : feedObject.m76784x5db1b11());
            }
        }, this.f188910e, true);
        c22848x6ddd90cf.mo8164xbbdced85(false);
        c22848x6ddd90cf.f374638o = this;
        c22848x6ddd90cf.f374637n = this;
        return c22848x6ddd90cf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lh();
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void e(android.content.Context context, android.widget.FrameLayout headerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        android.view.View findViewById = headerLayout.findViewById(com.p314xaae8f345.mm.R.id.d4y);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLiveLikeDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLiveLikeDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        headerLayout.findViewById(com.p314xaae8f345.mm.R.id.d4y).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kh(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public int f() {
        return this.f188910e.size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void g(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    /* renamed from: getScene */
    public int mo56041x7520bed6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        return 4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void h(yw2.n builder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f188911f = builder;
        this.f188914i = c14994x9b99c079;
        if (c14994x9b99c079 != null) {
            nv2.h1 h1Var = nv2.n1.f422083g;
            nv2.n1 n1Var = nv2.n1.f422084h;
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> h17 = n1Var.h(c14994x9b99c079.getFeedObject());
            this.f188913h = n1Var.g(c14994x9b99c079.getFeedObject());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLikeDrawerPresenter", "onAttach " + c14994x9b99c079.m59251x5db1b11());
            java.util.ArrayList arrayList = this.f188910e;
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(h17, 10));
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : h17) {
                r45.h60 h60Var = new r45.h60();
                h60Var.set(0, c19781xd1c47b87.m76102x6c03c64c());
                so2.h0 h0Var = new so2.h0(h60Var);
                h0Var.f491908e = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188916n, h0Var.f491907d.m75945x2fec8307(0));
                arrayList2.add(h0Var);
            }
            arrayList.addAll(arrayList2);
        }
        yw2.n nVar = this.f188911f;
        if (nVar != null) {
            android.widget.TextView h18 = nVar.h();
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.l6 l6Var = new zy2.l6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = this.f188914i;
            l6Var.f558984b = c14994x9b99c0792 != null ? c14994x9b99c0792.getFeedObject() : null;
            l6Var.f558985c = this.f188913h;
            l6Var.f558987e = this.f188915m;
            l6Var.f558986d = false;
            cu2.f0 f0Var = cu2.f0.f303924a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = this.f188914i;
            l6Var.f558983a = f0Var.e((c14994x9b99c0793 == null || (feedObject = c14994x9b99c0793.getFeedObject()) == null) ? 0 : feedObject.m76805x2dd7a70f());
            ((ht2.y0) s6Var).Ni(h18, l6Var);
        }
        builder.g(false);
        yw2.n nVar2 = this.f188911f;
        if (nVar2 != null) {
            nVar2.k().l(true);
        }
        builder.o().m82555x4905e9fa().mo7966xf161ffec(false);
        yw2.n nVar3 = this.f188911f;
        if (nVar3 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(nVar3.o(), null, 1, null);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = builder.o().m82555x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        this.f188912g = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    /* renamed from: onDetach */
    public void mo56042x3f5eee52() {
        if (!this.f188912g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLikeDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f188912g = false;
        yw2.n nVar = this.f188911f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = nVar != null ? nVar.o().m82555x4905e9fa() : null;
        if (m82555x4905e9fa != null) {
            m82555x4905e9fa.mo7966xf161ffec(true);
        }
        this.f188911f = null;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f188910e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.h0 h0Var = (so2.h0) obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Nickname", ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h0Var.f491907d.m75945x2fec8307(0), true).P0());
        intent.putExtra("showInteraction", true);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.sl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, this.f188909d, h0Var.f491907d.m75945x2fec8307(0), intent, 0, null, 16, null);
    }
}
