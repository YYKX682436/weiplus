package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f85125a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle f85126b;

    public rc(com.tencent.mm.plugin.appbrand.o6 runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f85125a = runtime;
    }

    public final com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle a() {
        com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle weAppExportLaunchInfoBundle = new com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle(0, false, false, null, null, 0, "", l81.y0.f317082d);
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(this.f85125a);
        if (a17 != null) {
            weAppExportLaunchInfoBundle.f74974d = (int) a17.a();
        }
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f85125a.f74805p.f77281g)) {
            weAppExportLaunchInfoBundle.f74979i = this.f85125a.u0().L;
            java.lang.String str = this.f85125a.u0().N.f77445e;
            if (str == null) {
                str = "";
            }
            weAppExportLaunchInfoBundle.f74980m = str;
        }
        return weAppExportLaunchInfoBundle;
    }

    public final void b(com.tencent.mm.plugin.appbrand.page.wd wdVar, long j17) {
        com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle weAppExportLaunchInfoBundle;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = this.f85125a.u0();
        com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = u07 != null ? u07.f77313z2 : null;
        if (weAppOpenUICallbackIPCProxy == null || (weAppExportLaunchInfoBundle = this.f85126b) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("WeAppExportLaunchInfoHelper", "publishWarmLaunchInfoIfNeed appId:" + this.f85125a.f74803n + ", type:" + wdVar + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        l81.a1 a1Var = l81.a1.f317006d;
        com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle weAppExportWarmLaunchInfoBundle = new com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle(0L, 0L, a1Var, 0L);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        weAppExportWarmLaunchInfoBundle.f74983e = java.lang.System.currentTimeMillis();
        if (wdVar != null) {
            int ordinal = wdVar.ordinal();
            if (ordinal == 1) {
                a1Var = l81.a1.f317008f;
            } else if (ordinal == 6) {
                a1Var = l81.a1.f317007e;
            }
            weAppExportWarmLaunchInfoBundle.f74984f = a1Var;
            weAppExportWarmLaunchInfoBundle.f74985g = j17;
        }
        weAppExportLaunchInfoBundle.f74978h = weAppExportWarmLaunchInfoBundle;
        com.tencent.mm.plugin.appbrand.page.n7 N2 = this.f85125a.N2();
        weAppExportLaunchInfoBundle.f74981n = N2 != null ? N2 instanceof pa1.o ? l81.y0.f317085g : N2.p2() ? l81.y0.f317084f : l81.y0.f317083e : l81.y0.f317082d;
        com.tencent.luggage.sdk.launching.h hVar = weAppOpenUICallbackIPCProxy.f84479g;
        if (hVar != null) {
            hVar.a(weAppExportLaunchInfoBundle);
        }
        this.f85126b = null;
    }
}
