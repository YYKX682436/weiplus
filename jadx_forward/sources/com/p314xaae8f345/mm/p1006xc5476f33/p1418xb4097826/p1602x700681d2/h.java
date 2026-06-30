package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f203845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 f203847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203848h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var) {
        super(0);
        this.f203844d = context;
        this.f203845e = layoutParams;
        this.f203846f = view;
        this.f203847g = c14604x9e435b69;
        this.f203848h = l0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f203844d;
        int g17 = com.p314xaae8f345.mm.ui.bl.g(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPlayListDrawer", "[initView] bottomMargin= " + g17);
        android.widget.FrameLayout.LayoutParams layoutParams = this.f203845e;
        layoutParams.bottomMargin = g17;
        android.view.View view = this.f203846f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 c14604x9e435b69 = this.f203847g;
        ((android.widget.FrameLayout) view).addView(c14604x9e435b69, layoutParams);
        android.widget.FrameLayout headerLayout = c14604x9e435b69.m82795xcb847e8d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203848h;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b4v, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        l0Var.f203873f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qek);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        l0Var.f203874g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        l0Var.f203875h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        l0Var.f203889y = findViewById4;
        l0Var.n().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.o(context));
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        l0Var.f203890z = findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        l0Var.f203880p = findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        l0Var.f203881q = findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        l0Var.f203882r = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        l0Var.B = (android.widget.Button) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        l0Var.A = (android.widget.Button) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        l0Var.C = findViewById11;
        android.widget.ImageView imageView = l0Var.f203882r;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerMoreIv");
            throw null;
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.p(l0Var));
        android.widget.ImageView imageView2 = l0Var.f203882r;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerMoreIv");
            throw null;
        }
        ym5.a1.h(imageView2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.q(l0Var));
        android.view.View findViewById12 = inflate.findViewById(com.p314xaae8f345.mm.R.id.jfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        l0Var.f203876i = (android.widget.TextView) findViewById12;
        android.widget.TextView textView = l0Var.f203873f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 q17 = l0Var.q();
        android.view.View findViewById13 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565667rj0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        q17.k(findViewById13);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 q18 = l0Var.q();
        android.view.View findViewById14 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        q18.k(findViewById14);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.C14604x9e435b69 q19 = l0Var.q();
        android.view.View findViewById15 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t5h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        q19.k(findViewById15);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c14604x9e435b69.m82792x510df255();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        l0Var.f203887w = rlLayout;
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b4z, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        rlLayout.m82697xe136b7d8(inflate2);
        rlLayout.m82696x5dd8f4d3(((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi)) - ((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu)));
        rlLayout.m82686x6e84640(1.85f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = rlLayout.m82555x4905e9fa();
        m82555x4905e9fa.m7963x830bc99d(true);
        m82555x4905e9fa.m7965x440a0e9(4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m82555x4905e9fa.m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        m82555x4905e9fa.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context));
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var = l0Var.f203871d;
        s1Var.getClass();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$getAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1.class.getName().hashCode()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1 s1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s1.this;
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1(false, s1Var2.f203962i, true, s1Var2.f203976w, 1, null);
                }
                hc2.l.a("Finder.FinderPlayListDrawerPresenter", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, s1Var.f203955b.f203829a, false);
        s1Var.f203959f = c22848x6ddd90cf;
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.v0(s1Var);
        m82555x4905e9fa.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570589di4, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
        com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5.c(rlLayout, inflate3, false, 2, null);
        l0Var.f203879o = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.qel);
        l0Var.f203878n = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) inflate3.findViewById(com.p314xaae8f345.mm.R.id.qem);
        l0Var.f203877m = inflate3;
        android.widget.FrameLayout loadingLayout = c14604x9e435b69.m82797xccb9a7d0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingLayout, "loadingLayout");
        l0Var.f203883s = loadingLayout;
        android.view.View inflate4 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570591b50, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById16 = inflate4.findViewById(com.p314xaae8f345.mm.R.id.kxq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        l0Var.f203884t = findViewById16;
        android.view.View findViewById17 = inflate4.findViewById(com.p314xaae8f345.mm.R.id.kcd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        l0Var.f203885u = findViewById17;
        android.view.View findViewById18 = inflate4.findViewById(com.p314xaae8f345.mm.R.id.m2f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        l0Var.f203886v = findViewById18;
        android.view.View view2 = l0Var.f203884t;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = l0Var.p();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View t17 = l0Var.t();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(t17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.FrameLayout footerLayout = c14604x9e435b69.m82794x2d5b4f1b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerLayout, "footerLayout");
        android.view.View findViewById19 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570585di1, (android.view.ViewGroup) footerLayout, true).findViewById(com.p314xaae8f345.mm.R.id.kqj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        l0Var.f203888x = findViewById19;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a0(context, l0Var, new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m());
        l0Var.E = a0Var;
        a0Var.q();
        return jz5.f0.f384359a;
    }
}
