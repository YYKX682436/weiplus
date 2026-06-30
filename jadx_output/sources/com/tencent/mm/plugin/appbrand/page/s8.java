package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class s8 extends com.tencent.mm.plugin.appbrand.page.w2 {
    public com.tencent.mm.plugin.appbrand.page.v5 W;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f87083p0;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f87084x0;

    public s8(android.content.Context context, com.tencent.mm.plugin.appbrand.page.i3 i3Var) {
        super(context, i3Var);
        this.f87084x0 = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void C(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        iz5.a.g(null, android.text.TextUtils.isEmpty(this.f87083p0) || u46.l.c(this.f87083p0, str));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSinglePage", "AppBrandPageProfile| loadUrl, appId:%s, url:%s", getAppId(), str);
        this.f87083p0 = str;
        if (this.f87084x0.getAndSet(true)) {
            return;
        }
        this.W.r2(j17, str, wdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void D() {
        this.W.getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void E() {
        getCurrentUrl();
        this.W.v2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void F() {
        getCurrentUrl();
        this.W.A2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void G() {
        getCurrentUrl();
        L();
        setVisibility(0);
        this.W.C2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public com.tencent.mm.plugin.appbrand.page.v5 J(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSinglePage", "recycleAppBrandPageView webviewId:%d mPageView:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.W.getComponentId()));
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.W;
        com.tencent.mm.plugin.appbrand.page.b7 b7Var = com.tencent.mm.plugin.appbrand.page.b7.f86429a;
        this.W = com.tencent.mm.plugin.appbrand.page.b7.f86432d;
        v5Var.S2();
        return v5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void M(long j17, java.lang.String str) {
        this.f87083p0 = str;
        this.f87084x0.set(true);
        this.W.r2(j17, str, com.tencent.mm.plugin.appbrand.page.wd.REWRITE_ROUTE);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public com.tencent.mm.plugin.appbrand.page.v5 getCurrentPageView() {
        return this.W;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public java.lang.String getCurrentUrl() {
        return this.f87083p0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public int getCurrentWindowId() {
        return this.W.b2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void k() {
        this.W.h();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public android.view.View p() {
        if (this.W == null) {
            com.tencent.mm.plugin.appbrand.page.v5 o17 = getContainer().o(nf.z.a(this.f87083p0));
            this.W = o17;
            o17.W = this;
            java.lang.String currentUrl = getCurrentUrl();
            o17.D = nf.z.a(currentUrl);
            o17.E = currentUrl;
        }
        return this.W.getContentView();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void r(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (z(iArr, this.W.getComponentId())) {
            this.W.g(str, str2);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void setInitialUrl(java.lang.String str) {
        this.f87083p0 = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public com.tencent.mm.plugin.appbrand.page.v5 u(int i17) {
        if (this.W.getComponentId() == i17) {
            return this.W;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public boolean x(java.lang.String str) {
        return nf.z.a(this.f87083p0).equals(nf.z.a(str));
    }
}
