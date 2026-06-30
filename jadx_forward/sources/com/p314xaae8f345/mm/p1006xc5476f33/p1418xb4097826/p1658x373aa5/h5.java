package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class h5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f213739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a f213741f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f213742g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g5 f213743h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f213744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a, android.widget.FrameLayout.LayoutParams layoutParams, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g5 g5Var, boolean z17) {
        super(0);
        this.f213739d = activityC21401x6ce6f73f;
        this.f213740e = view;
        this.f213741f = c15268x6a41bd8a;
        this.f213742g = layoutParams;
        this.f213743h = g5Var;
        this.f213744i = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f213739d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentDrawer", "[initView] bottomMargin= " + com.p314xaae8f345.mm.ui.bl.g(activityC21401x6ce6f73f));
        android.view.View view = this.f213740e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout.LayoutParams layoutParams = this.f213742g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = this.f213741f;
        ((android.widget.FrameLayout) view).addView(c15268x6a41bd8a, layoutParams);
        android.widget.FrameLayout m82795xcb847e8d = c15268x6a41bd8a.m82795xcb847e8d();
        boolean z17 = this.f213744i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g5 g5Var = this.f213743h;
        g5Var.g(activityC21401x6ce6f73f, m82795xcb847e8d, z17);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c15268x6a41bd8a.m82792x510df255();
        yw2.a0 a0Var = (yw2.a0) g5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        a0Var.f548142e = true;
        a0Var.f548148n = rlLayout;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById != null) {
            findViewById.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), 0);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById != null ? findViewById.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = (int) activityC21401x6ce6f73f.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp);
        }
        if (inflate != null) {
            rlLayout.m82697xe136b7d8(inflate);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = rlLayout.m82555x4905e9fa();
        m82555x4905e9fa.m7963x830bc99d(true);
        m82555x4905e9fa.m7965x440a0e9(4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m82555x4905e9fa.m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(activityC21401x6ce6f73f);
        c15415x74224fd8.f214174z = -1;
        c15415x74224fd8.m8091xc21abdf5(true);
        m82555x4905e9fa.mo7967x900dcbe1(c15415x74224fd8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = a0Var.f548141d;
        m82555x4905e9fa.mo7960x6cab2c8d(nPresenter.a(activityC21401x6ce6f73f));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            m82555x4905e9fa.m7971xa810ec34(((ey2.o1) pf5.z.f435481a.a(activityC21401x6ce6f73f).a(ey2.o1.class)).f338993i);
        } else {
            m82555x4905e9fa.m7971xa810ec34(((ey2.o1) pf5.z.f435481a.a(activityC21401x6ce6f73f).a(ey2.o1.class)).f338992h);
        }
        m82555x4905e9fa.i(new yw2.q(activityC21401x6ce6f73f, a0Var));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 b17 = nPresenter.b(activityC21401x6ce6f73f);
        if (b17 != null) {
            m82555x4905e9fa.N(b17);
        }
        java.lang.Object parent = rlLayout.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        a0Var.k().m82794x2d5b4f1b().addOnLayoutChangeListener(new yw2.r(a0Var, (android.view.View) parent));
        android.widget.FrameLayout footerLayout = c15268x6a41bd8a.m82794x2d5b4f1b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerLayout, "footerLayout");
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570193zs, footerLayout);
        footerLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        android.view.View findViewById2 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.eat);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        a0Var.f548149o = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34) findViewById2;
        a0Var.n().m61955xe955eca(new yw2.s(a0Var));
        a0Var.n().m61903xbd14632b(a0Var.k().getBanSwitch());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineDrawerBuilder", "drawerFooter.scene " + a0Var.n().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String());
        a0Var.n().z(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.v(a0Var.n(), false, false, 2, null);
        a0Var.k().m82807x92bd23e6(a0Var.n());
        a0Var.k().m61823xcab0c9d(a0Var.n());
        android.widget.FrameLayout loadingLayout = c15268x6a41bd8a.m82797xccb9a7d0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingLayout, "loadingLayout");
        a0Var.f548152r = loadingLayout;
        android.view.View inflate3 = android.view.LayoutInflater.from(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.afd, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById3 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.c7i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        a0Var.f548153s = findViewById3;
        android.view.View findViewById4 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.f567674kc0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        a0Var.f548154t = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.m2a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        a0Var.f548155u = findViewById5;
        android.view.View view2 = a0Var.f548153s;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a0Var.q().setVisibility(8);
        android.view.View r17 = a0Var.r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
