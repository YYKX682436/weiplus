package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f211762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 f211764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f211765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d2 f211766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f211767i;

    public e2(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 c15148xe5368540, android.widget.FrameLayout.LayoutParams layoutParams, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d2 d2Var, boolean z17) {
        this.f211762d = activityC21401x6ce6f73f;
        this.f211763e = view;
        this.f211764f = c15148xe5368540;
        this.f211765g = layoutParams;
        this.f211766h = d2Var;
        this.f211767i = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f211762d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.CommentDrawer", "[initView] bottomMargin= " + com.p314xaae8f345.mm.ui.bl.g(activityC21401x6ce6f73f));
        android.view.View view = this.f211763e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 c15148xe5368540 = this.f211764f;
        ((android.widget.FrameLayout) view).addView(c15148xe5368540, this.f211765g);
        android.widget.FrameLayout headerLayout = c15148xe5368540.m82795xcb847e8d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5) this.f211766h;
        a5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        a5Var.f211726i = headerLayout;
        boolean z17 = this.f211767i;
        android.view.View inflate = z17 ? com.p314xaae8f345.mm.ui.id.b(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2m, headerLayout) : com.p314xaae8f345.mm.ui.id.b(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2l, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        a5Var.f211722e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ear);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        a5Var.f211732r = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.eap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.ui.bk.r0(a5Var.o().getPaint(), 0.8f);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c15148xe5368540.m82792x510df255();
        a5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        a5Var.f211723f = rlLayout;
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2r, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        rlLayout.m82697xe136b7d8(inflate2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = rlLayout.m82555x4905e9fa();
        m82555x4905e9fa.m7963x830bc99d(true);
        m82555x4905e9fa.m7965x440a0e9(4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m82555x4905e9fa.m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activityC21401x6ce6f73f));
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) a5Var.f211721d;
        q3Var.getClass();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$getAdapter$adapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 1) {
                    return new gv2.n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.this, false);
                }
                if (type == 2) {
                    return new gv2.c1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.this);
                }
                hc2.l.a("MicroMsg.MusicUni.DrawerPresenter", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, q3Var.f211902f.f211893a, false);
        c22848x6ddd90cf.mo8164xbbdced85(false);
        c22848x6ddd90cf.f374638o = q3Var;
        c22848x6ddd90cf.f374637n = q3Var;
        m82555x4905e9fa.mo7960x6cab2c8d(c22848x6ddd90cf);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            m82555x4905e9fa.m7971xa810ec34(((ey2.o1) pf5.z.f435481a.a(activityC21401x6ce6f73f).a(ey2.o1.class)).f338993i);
        } else {
            m82555x4905e9fa.m7971xa810ec34(((ey2.o1) pf5.z.f435481a.a(activityC21401x6ce6f73f).a(ey2.o1.class)).f338992h);
        }
        m82555x4905e9fa.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.v4(a5Var));
        int[] iArr = new int[4];
        iArr[0] = (int) activityC21401x6ce6f73f.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        m82555x4905e9fa.N(new dx2.a(new android.graphics.drawable.ColorDrawable(activityC21401x6ce6f73f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741)), (int) activityC21401x6ce6f73f.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561947x9), iArr, (int) activityC21401x6ce6f73f.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.x_)));
        java.lang.Object parent = rlLayout.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        a5Var.h().m82794x2d5b4f1b().addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.w4(a5Var, (android.view.View) parent));
        android.widget.FrameLayout footerLayout = c15148xe5368540.m82794x2d5b4f1b();
        a5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerLayout, "footerLayout");
        android.view.View findViewById4 = com.p314xaae8f345.mm.ui.id.b(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2k, footerLayout).findViewById(com.p314xaae8f345.mm.R.id.eat);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        a5Var.f211724g = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea) findViewById4;
        a5Var.l().m61141x31c61473(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.x4(z17, a5Var));
        a5Var.l().m61163xe955eca(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.y4(a5Var));
        a5Var.l().m61158xf54f7efb(a5Var.h().isSelfProfile);
        a5Var.l().m61157x53aed94a(a5Var.h().getSceneForReply());
        a5Var.l().m61142xbd14632b(a5Var.h().getBanSwitch());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.TimelineDrawerBuilder", "drawerFooter.scene " + a5Var.l().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String());
        a5Var.l().l(false);
        a5Var.l().k(false);
        a5Var.h().m82807x92bd23e6(a5Var.l());
        a5Var.h().m61095xcab0c9d(a5Var.l());
        android.widget.FrameLayout loadingLayout = c15148xe5368540.m82797xccb9a7d0();
        a5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingLayout, "loadingLayout");
        a5Var.f211727m = loadingLayout;
        android.view.View inflate3 = android.view.LayoutInflater.from(activityC21401x6ce6f73f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2q, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById5 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.c7i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        a5Var.f211728n = findViewById5;
        android.view.View findViewById6 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.f567674kc0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        a5Var.f211729o = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.m2a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        a5Var.f211730p = findViewById7;
        android.view.View findViewById8 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.c7v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.c7w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.view.View view2 = a5Var.f211728n;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a5Var.q().setVisibility(8);
        android.view.View r17 = a5Var.r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
