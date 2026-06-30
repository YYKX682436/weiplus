package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g f82278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82280c;

    public x(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.w wVar, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar, com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject) {
        this.f82278a = gVar;
        this.f82279b = yVar;
        this.f82280c = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar = this.f82278a;
        if (gVar != null) {
            gVar.a(z17, str);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        java.lang.String str = appBrandInitConfig.f77278d;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar = this.f82278a;
        if (gVar != null) {
            gVar.b(appBrandInitConfig);
        }
        boolean z17 = ((ze.n) this.f82279b.getRuntime()).u0().f47284z == 7;
        boolean optBoolean = this.f82280c.optBoolean("useTransparentBackground", false);
        boolean Ni = true ^ ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) appBrandInitConfig;
        boolean z18 = appBrandInitConfigLU.N.D;
        boolean f17 = com.tencent.mm.plugin.appbrand.ui.e4.f();
        if (z17 && optBoolean && Ni && (z18 || f17)) {
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig appBrandInitWindowConfig = new com.tencent.luggage.sdk.config.AppBrandInitWindowConfig();
            appBrandInitWindowConfig.f47288f = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            appBrandInitWindowConfig.f47291i = y3Var;
            appBrandInitWindowConfig.f47292m = y3Var;
            appBrandInitConfigLU.B1 = appBrandInitWindowConfig;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = this.f82279b.getRuntime();
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) runtime;
        wa1.a aVar = wa1.b.f444100a;
        if (aVar.b(o6Var)) {
            com.tencent.mm.plugin.appbrand.o6 a17 = ((runtime instanceof com.tencent.mm.plugin.appbrand.o6) && aVar.b(o6Var)) ? aVar.a(o6Var) : null;
            if (a17 == null || !android.text.TextUtils.equals(str, a17.f74803n)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgramWC", "close embedded wxa runtime. REASON[embedded wxa's host will be brought to front].");
            runtime.S();
        }
    }
}
