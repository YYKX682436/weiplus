package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class lb extends com.tencent.mm.plugin.appbrand.launching.hb {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f84765h;

    /* renamed from: i, reason: collision with root package name */
    public final int f84766i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f84767m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.z5 f84768n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f84769o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f84770p = false;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f84771q = com.tencent.mm.plugin.appbrand.debugger.a.a();

    /* renamed from: r, reason: collision with root package name */
    public final boolean f84772r = com.tencent.mm.plugin.appbrand.jsruntime.h1.a(true);

    public lb(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo, int i19, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.luggage.sdk.launching.p pVar, boolean z17, boolean z18) {
        this.f84765h = str;
        this.f84766i = i17;
        this.f84769o = qualitySession;
        this.f84767m = wxaAttributes$WxaVersionInfo;
        r45.y50 y50Var = new r45.y50();
        y50Var.f390797d = i18;
        pVar.a(y50Var);
        if (z18) {
            y50Var.f390799f = 1;
        } else {
            y50Var.f390799f = z17 ? 102 : 101;
        }
        this.f84768n = new com.tencent.mm.plugin.appbrand.launching.mb(this, str, i17, i19, str2, str3, wxaAttributes$WxaVersionInfo, qualitySession, y50Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb
    public java.lang.String f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper";
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb
    public final void g(boolean z17) {
        this.f84650g = z17;
        java.util.concurrent.Callable callable = this.f84768n;
        if (callable instanceof com.tencent.mm.plugin.appbrand.launching.y5) {
            ((com.tencent.mm.plugin.appbrand.launching.r8) ((com.tencent.mm.plugin.appbrand.launching.y5) callable)).f85114o = z17;
        } else if (callable instanceof com.tencent.mm.plugin.appbrand.launching.hb) {
            ((com.tencent.mm.plugin.appbrand.launching.hb) callable).g(z17);
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo call() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f84766i)) {
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.f84767m;
            if (wxaAttributes$WxaVersionInfo.B >= 0 && wxaAttributes$WxaVersionInfo.f77444d > 0) {
                ((com.tencent.mm.plugin.appbrand.appcache.ec) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.ec.class)).z0(this.f84765h, wxaAttributes$WxaVersionInfo.f77444d, wxaAttributes$WxaVersionInfo.B);
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) ((com.tencent.mm.plugin.appbrand.launching.r8) this.f84768n).call();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (wxaPkgWrappingInfo != null) {
            if (this.f84770p) {
                com.tencent.mm.plugin.appbrand.keylogger.w.f(this.f84765h, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_Download, "", currentTimeMillis, currentTimeMillis2);
            } else {
                com.tencent.mm.plugin.appbrand.keylogger.w.f(this.f84765h, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_DB, "", currentTimeMillis, currentTimeMillis2);
            }
        } else if (this.f84770p) {
            com.tencent.mm.plugin.appbrand.keylogger.w.d(this.f84765h, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_Download, "", "", currentTimeMillis, currentTimeMillis2);
        } else {
            com.tencent.mm.plugin.appbrand.keylogger.w.d(this.f84765h, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_DB, "", "", currentTimeMillis, currentTimeMillis2);
        }
        try {
            com.tencent.mm.plugin.appbrand.launching.d9.a(this.f84769o.f88134d, wxaPkgWrappingInfo != null, currentTimeMillis2 - currentTimeMillis);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "call() reportUpdateResultAfterVersionFallbackIfNeed get exception %s", th6);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "call() for appId:%s, WEAKNET_MOCK:%b, hasDownload:%b", this.f84765h, java.lang.Boolean.valueOf(this.f84771q), java.lang.Boolean.valueOf(this.f84770p));
        if (this.f84771q && this.f84770p) {
            java.lang.Thread.sleep(60000L);
        } else if (this.f84772r && this.f84770p && wxaPkgWrappingInfo != null) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.tencent.mm.plugin.appbrand.service.i.a(this.f84765h, wxaPkgWrappingInfo, com.tencent.mm.plugin.appbrand.utils.e3.f90415a, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.lb$$a
                @Override // java.lang.Runnable
                public final void run() {
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(1L, java.util.concurrent.TimeUnit.MINUTES);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return wxaPkgWrappingInfo;
    }

    public void j(int i17) {
    }

    public void k() {
        this.f84770p = true;
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f84766i)) {
            com.tencent.mm.plugin.appbrand.appcache.x5.b();
        }
    }
}
