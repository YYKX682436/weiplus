package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f80970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.k f80971d;

    public j(com.tencent.mm.plugin.appbrand.jsapi.fakenative.k kVar, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f80971d = kVar;
        this.f80968a = str;
        this.f80969b = str2;
        this.f80970c = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram success");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram fail, reason=%s", str);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.k kVar = this.f80971d;
        kVar.f80979h.D(kVar.f80972a, kVar.f80973b, -1, "fail system error");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        boolean z17 = !((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) appBrandInitConfig;
        boolean z18 = appBrandInitConfigLU.N.D;
        boolean f17 = com.tencent.mm.plugin.appbrand.ui.e4.f();
        java.lang.String str = this.f80968a;
        java.lang.String str2 = this.f80969b;
        boolean z19 = this.f80970c;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram-onBeforeNavigate, target appId:%s, path:%s, transparent(svr?:%b, compatibility?:%b, app?:%b, app.debug_switch?:%b)", str, str2, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(f17));
        if (z19 && z17) {
            if (z18 || f17) {
                com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = new com.tencent.luggage.sdk.config.AppBrandInitWindowConfig();
                appBrandInitWindowConfig.f47288f = k91.z3.TRANSPARENT;
                k91.y3 y3Var = k91.y3.DISABLED;
                appBrandInitWindowConfig.f47291i = y3Var;
                appBrandInitWindowConfig.f47292m = y3Var;
                appBrandInitConfigLU.B1 = appBrandInitWindowConfig;
            }
        }
    }
}
