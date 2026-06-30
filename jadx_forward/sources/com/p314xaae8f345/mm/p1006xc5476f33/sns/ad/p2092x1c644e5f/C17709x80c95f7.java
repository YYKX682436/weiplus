package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppMarketHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppHalfScreenHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper */
/* loaded from: classes4.dex */
public final class C17709x80c95f7 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17708x80c6381b {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f244193r;

    /* renamed from: s, reason: collision with root package name */
    public k44.a f244194s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f244195t;

    public C17709x80c95f7(android.content.Context context) {
        super(context);
        this.f244193r = "AdFinderOpenAppMarketHalfScreenHelper";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17708x80c6381b, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        return this.f244193r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        android.widget.Button h17 = h();
        if (h17 != null) {
            h17.setOnClickListener(new g44.o(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public void m(h44.c adOpenAppParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adOpenAppParams, "adOpenAppParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        this.f244219m = adOpenAppParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        h44.c d17 = d();
        i64.p0 d18 = d17 != null ? d17.d() : null;
        if (d18 != null) {
            d18.f370813j = 106;
        }
        i64.p0 d19 = adOpenAppParams.d();
        java.lang.String str = d19 != null ? d19.f370805b : null;
        i64.p0 d27 = adOpenAppParams.d();
        java.lang.String str2 = d27 != null ? d27.f370806c : null;
        i64.p0 d28 = adOpenAppParams.d();
        java.lang.String str3 = d28 != null ? d28.f370810g : null;
        i64.p0 d29 = adOpenAppParams.d();
        java.lang.String str4 = d29 != null ? d29.f370811h : null;
        i64.p0 d37 = adOpenAppParams.d();
        ca4.d dVar = new ca4.d(str, str2, str3, str4, d37 != null ? d37.f370812i : null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        this.f244220n = dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        ca4.d b17 = b();
        if (b17 != null) {
            b17.c(106);
        }
        l44.z.g(b(), 1);
        l44.z.d(b());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public void n() {
        android.widget.Button h17;
        k44.i c17;
        k44.i c18;
        k44.i c19;
        k44.i c27;
        k44.i c28;
        k44.i c29;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        h44.c d17 = d();
        java.lang.String str = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((d17 == null || (c29 = d17.c()) == null) ? null : c29.a())) {
            h44.c d18 = d();
            a84.z.c((d18 == null || (c28 = d18.c()) == null) ? null : c28.a(), e());
        }
        h44.c d19 = d();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((d19 == null || (c27 = d19.c()) == null) ? null : c27.b())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
            android.widget.TextView textView = this.f244216g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
            if (textView != null) {
                h44.c d27 = d();
                textView.setText((d27 == null || (c19 = d27.c()) == null) ? null : c19.b());
            }
        }
        h44.c d28 = d();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((d28 == null || (c18 = d28.c()) == null) ? null : c18.c()) && (h17 = h()) != null) {
            h44.c d29 = d();
            if (d29 != null && (c17 = d29.c()) != null) {
                str = c17.c();
            }
            h17.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17708x80c6381b
    public void q(ya2.n1 halfScreenListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenListener, "halfScreenListener");
        ((xc2.s1) halfScreenListener).b(new g44.p(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
    }
}
