package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class x extends com.tencent.mm.plugin.appbrand.jsapi.lbs.w {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 f81512o = new com.tencent.mm.plugin.appbrand.jsapi.lbs.c1();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.w
    public void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, lk1.a aVar) {
        this.f81512o.b(((com.tencent.mm.plugin.appbrand.e9) lVar).getRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.w
    public void G(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f81512o.a(((com.tencent.mm.plugin.appbrand.e9) lVar).getRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.w
    public lk1.b H(com.tencent.mm.plugin.appbrand.jsapi.l lVar, lk1.b listener) {
        com.tencent.mm.plugin.appbrand.e9 env = (com.tencent.mm.plugin.appbrand.e9) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = env.getRuntime();
        kotlin.jvm.internal.o.f(runtime, "getRuntime(...)");
        return new com.tencent.mm.plugin.appbrand.jsapi.lbs.d1(runtime, listener);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.w
    public android.os.Bundle I(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        android.os.Bundle I = super.I(e9Var, jSONObject);
        I.putString("smallAppKey", jSONObject.optString("subKey", "") + "#" + e9Var.getAppId() + ";");
        if (e9Var.getRuntime() != null && e9Var.getRuntime().E0() != null) {
            I.putString("openId", ((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) e9Var.getRuntime().E0()).f47298x0);
        }
        return I;
    }
}
