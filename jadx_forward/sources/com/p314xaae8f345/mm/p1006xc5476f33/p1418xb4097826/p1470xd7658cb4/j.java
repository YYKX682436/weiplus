package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f192969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 f192970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f192971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.i f192972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f192973h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f192974i;

    public j(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e13, android.widget.FrameLayout.LayoutParams layoutParams, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.i iVar, android.content.Context context, yz5.a aVar) {
        this.f192969d = view;
        this.f192970e = c14161x3a122e13;
        this.f192971f = layoutParams;
        this.f192972g = iVar;
        this.f192973h = context;
        this.f192974i = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f192969d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.C14161x3a122e13 c14161x3a122e13 = this.f192970e;
        frameLayout.addView(c14161x3a122e13, this.f192971f);
        android.widget.FrameLayout headerLayout = c14161x3a122e13.m82795xcb847e8d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.l) this.f192972g;
        lVar.getClass();
        android.content.Context context = this.f192973h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7l, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.u2k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        lVar.f192978f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u2j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        lVar.f192979g = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u2h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        lVar.f192981i = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.u2i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        lVar.f192980h = findViewById4;
        android.widget.TextView textView = lVar.f192978f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572946nn3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.widget.TextView textView2 = lVar.f192978f;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
            throw null;
        }
        textView2.setText(string);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c14161x3a122e13.m82792x510df255();
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        lVar.f192982m = rlLayout;
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
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p pVar = lVar.f192976d;
        pVar.getClass();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawerPresenter$getAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d.class.getName().hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.p.this));
                }
                hc2.l.a("Finder.FinderLiveHighlightDrawerPresenter", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, pVar.f192989c, true);
        pVar.f192991e = c22848x6ddd90cf;
        c22848x6ddd90cf.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.o(pVar);
        m82555x4905e9fa.mo7960x6cab2c8d(c22848x6ddd90cf);
        rlLayout.m82688x390c1d00(false);
        rlLayout.m82690xd3a27e96(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.k(lVar);
        lVar.f192983n = kVar;
        m82555x4905e9fa.i(kVar);
        android.widget.FrameLayout footerLayout = c14161x3a122e13.m82794x2d5b4f1b();
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerLayout, "footerLayout");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 g17 = lVar.g();
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        g17.m82697xe136b7d8(inflate2);
        lVar.g().H(null);
        yz5.a aVar = this.f192974i;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveHighlightDrawer", "attach to window finished");
    }
}
