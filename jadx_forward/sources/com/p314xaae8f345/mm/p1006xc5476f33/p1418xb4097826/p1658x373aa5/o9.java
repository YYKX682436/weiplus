package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f214306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f214307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 f214308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f214309h;

    public o9(android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, android.view.Window window, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 c15282xfe3c9a46, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f214305d = context;
        this.f214306e = layoutParams;
        this.f214307f = window;
        this.f214308g = c15282xfe3c9a46;
        this.f214309h = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f214305d;
        int g17 = com.p314xaae8f345.mm.ui.bl.g(context);
        android.widget.FrameLayout.LayoutParams layoutParams = this.f214306e;
        layoutParams.bottomMargin = g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFavDrawer", "[initView] bottomMargin= " + g17);
        android.view.Window window = this.f214307f;
        android.view.View decorView = window.getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 c15282xfe3c9a46 = this.f214308g;
        ((android.widget.FrameLayout) decorView).addView(c15282xfe3c9a46, layoutParams);
        android.view.View decorView2 = window.getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView2, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 c10860xa01d8e29 = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29(context, null);
        c10860xa01d8e29.setId(com.p314xaae8f345.mm.R.id.qyf);
        ((android.widget.FrameLayout) decorView2).addView(c10860xa01d8e29, layoutParams);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f214309h;
        yw2.f fVar = (yw2.f) h0Var.f391656d;
        android.widget.FrameLayout headerLayout = c15282xfe3c9a46.m82795xcb847e8d();
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpv, fVar.h().m82795xcb847e8d());
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        fVar.f548166e = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        fVar.f548167f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bzb);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.byz);
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4y);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            findViewById3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563366ad5);
        } else {
            findViewById3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ad6);
        }
        viewGroup.setOnClickListener(new yw2.b(fVar));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8) fVar.f548165d).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 h17 = fVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        h17.k(findViewById3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 h18 = fVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        h18.k(findViewById4);
        yw2.f fVar2 = (yw2.f) h0Var.f391656d;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c15282xfe3c9a46.m82792x510df255();
        fVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        fVar2.f548168g = rlLayout;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8) fVar2.f548165d;
        f8Var.getClass();
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        rlLayout.m82697xe136b7d8(inflate2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = rlLayout.m82555x4905e9fa();
        m82555x4905e9fa.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m82555x4905e9fa.m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
        m82555x4905e9fa.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p7());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderFavListDrawerPresenter$getItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l8(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8.this));
            }
        }, f8Var.f188252p, true);
        c22848x6ddd90cf.mo8164xbbdced85(false);
        c22848x6ddd90cf.f374638o = f8Var;
        c22848x6ddd90cf.f374637n = f8Var;
        m82555x4905e9fa.mo7960x6cab2c8d(c22848x6ddd90cf);
        yw2.f fVar3 = (yw2.f) h0Var.f391656d;
        android.widget.FrameLayout loadingLayout = c15282xfe3c9a46.m82797xccb9a7d0();
        fVar3.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingLayout, "loadingLayout");
        fVar3.f548170i = loadingLayout;
        android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ahv, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById5 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.i1w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        fVar3.f548171m = findViewById5;
        android.view.View findViewById6 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.kc7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        fVar3.f548172n = (android.widget.TextView) findViewById6;
        fVar3.k().setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuv));
        android.view.View findViewById7 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.m2e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        fVar3.f548173o = findViewById7;
        android.view.View view = fVar3.f548171m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fVar3.k().setVisibility(8);
        android.view.View l17 = fVar3.l();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(l17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(l17, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
