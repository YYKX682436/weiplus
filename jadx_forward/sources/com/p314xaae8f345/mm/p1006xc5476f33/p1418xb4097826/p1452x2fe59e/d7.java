package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class d7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20, in5.x, in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f188082d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f188083e;

    /* renamed from: f, reason: collision with root package name */
    public yw2.n f188084f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f188085g;

    public d7(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f188082d = context;
        this.f188083e = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderCommentRecommendDrawerPresenter$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y1();
            }
        }, this.f188083e, true);
        c22848x6ddd90cf.mo8164xbbdced85(false);
        c22848x6ddd90cf.f374638o = this;
        c22848x6ddd90cf.f374637n = this;
        return c22848x6ddd90cf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c7();
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
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentRecommendDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderCommentRecommendDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        headerLayout.findViewById(com.p314xaae8f345.mm.R.id.d4y).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b7(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public int f() {
        return this.f188083e.size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void g(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    /* renamed from: getScene */
    public int mo56041x7520bed6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void h(yw2.n builder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.LinkedList linkedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f188084f = builder;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentRecommendDrawerPresenter", sb6.toString());
        java.util.ArrayList arrayList = this.f188083e;
        arrayList.clear();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new so2.h0((r45.h60) it.next()));
            }
        }
        yw2.n nVar = this.f188084f;
        if (nVar != null) {
            android.widget.TextView h17 = nVar.h();
            int dimension = (int) h17.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            if (arrayList.size() == 0) {
                java.lang.String string = h17.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1r);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                android.content.Context context = h17.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                h17.setText(hc2.x0.k(string, context, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
            } else {
                java.lang.String string2 = h17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572958d20, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.h(arrayList.size()), 0)));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                android.content.Context context2 = h17.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                h17.setText(hc2.x0.k(string2, context2, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
            }
        }
        builder.g(false);
        yw2.n nVar2 = this.f188084f;
        if (nVar2 != null) {
            nVar2.k().l(true);
        }
        builder.o().m82555x4905e9fa().mo7966xf161ffec(false);
        yw2.n nVar3 = this.f188084f;
        if (nVar3 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(nVar3.o(), null, 1, null);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = builder.o().m82555x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        this.f188085g = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    /* renamed from: onDetach */
    public void mo56042x3f5eee52() {
        if (!this.f188085g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentRecommendDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f188085g = false;
        yw2.n nVar = this.f188084f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = nVar != null ? nVar.o().m82555x4905e9fa() : null;
        if (m82555x4905e9fa != null) {
            m82555x4905e9fa.mo7966xf161ffec(true);
        }
        this.f188084f = null;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f188083e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.h0 h0Var = (so2.h0) obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Nickname", ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h0Var.f491907d.m75945x2fec8307(0), true).P0());
        intent.putExtra("showInteraction", true);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.sl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, this.f188082d, h0Var.f491907d.m75945x2fec8307(0), intent, 0, null, 16, null);
    }
}
