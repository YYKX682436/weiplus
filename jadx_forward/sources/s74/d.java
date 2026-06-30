package s74;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f485769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f485770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s74.o0 o0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        super(0);
        this.f485768d = o0Var;
        this.f485769e = h0Var;
        this.f485770f = frameLayout;
        this.f485771g = c17933xe8d1b226;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup.MarginLayoutParams layoutParams;
        s74.g3 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        s74.f3 D = this.f485768d.D();
        if (D != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f485769e;
            s74.o0 o0Var = this.f485768d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f485771g;
            if (h0Var.f391656d != null && o0Var.H() == 0) {
                s74.a4 a17 = s74.a4.f485741e.a();
                java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
                if (m70367x7525eefd == null) {
                    m70367x7525eefd = "";
                }
                s74.r4 r4Var = new s74.r4((s74.j3) h0Var.f391656d, D, c17933xe8d1b226.m70354x74235b3e().xml);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cacheViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                synchronized (a17.f485743a) {
                    try {
                        if (a17.f485743a.m77804x35e001() >= 5) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicView.Preloader", "cacheViewById but size > 5! : ".concat(m70367x7525eefd));
                        } else if (a17.d()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Preloader", "context is finishing when cache");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Preloader", "cacheViewById: ".concat(m70367x7525eefd));
                            a17.f485743a.put(m70367x7525eefd, r4Var);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cacheViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                    } finally {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cacheViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                    }
                }
            }
        }
        java.lang.String j17 = this.f485768d.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add a view ");
        s74.j3 j3Var = (s74.j3) this.f485769e.f391656d;
        sb6.append(j3Var != null ? j3Var.c() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        android.widget.FrameLayout frameLayout = this.f485770f;
        s74.j3 j3Var2 = (s74.j3) this.f485769e.f391656d;
        android.view.View c17 = j3Var2 != null ? j3Var2.c() : null;
        s74.j3 j3Var3 = (s74.j3) this.f485769e.f391656d;
        if (j3Var3 == null || (b17 = j3Var3.b()) == null) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(this.f485768d.B(), -2);
        } else {
            layoutParams = b17.k();
            s74.o0 o0Var2 = this.f485768d;
            if (layoutParams.width == -2) {
                layoutParams.width = o0Var2.B();
            }
        }
        frameLayout.addView(c17, 0, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$1");
        return f0Var;
    }
}
