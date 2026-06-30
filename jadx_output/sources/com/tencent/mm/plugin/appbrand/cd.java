package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class cd implements com.tencent.mm.plugin.appbrand.gc {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f77175a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f77176b;

    public cd(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC updatedConfig, com.tencent.mm.plugin.appbrand.o6 rt6) {
        kotlin.jvm.internal.o.g(updatedConfig, "updatedConfig");
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f77175a = updatedConfig;
        this.f77176b = rt6;
    }

    @Override // com.tencent.mm.plugin.appbrand.gc
    public void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        this.f77175a = newConfig;
    }

    @Override // com.tencent.mm.plugin.appbrand.gc
    public java.lang.Boolean b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.mm.plugin.appbrand.page.n7 N2 = this.f77176b.N2();
        java.lang.String L1 = N2 != null ? N2.L1() : null;
        java.lang.String str = newConfig.f77283i;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f77175a;
        int i17 = appBrandInitConfigWC.f47269b2.f87790f;
        int i18 = newConfig.f47269b2.f87790f;
        com.tencent.luggage.sdk.launching.p pVar = appBrandInitConfigWC.W1;
        if (pVar != com.tencent.luggage.sdk.launching.p.PRE_RENDER || pVar == newConfig.W1 || !kotlin.jvm.internal.o.b(L1, str) || i17 != i18) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreRenderAutoRelaunchLogicInterceptor", "shouldReLaunchOnConfigWillUpdate returns false, appId:" + this.f77176b.f74803n + ", currentOriginRouteUrl:" + L1 + ", newRouteUrl:" + str + ", oldScene:" + i17 + ", newScene:" + i18);
        return java.lang.Boolean.FALSE;
    }
}
