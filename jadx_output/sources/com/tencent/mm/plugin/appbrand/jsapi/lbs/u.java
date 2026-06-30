package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class u extends com.tencent.mm.plugin.appbrand.jsapi.lbs.l {
    private static final int CTRL_INDEX = 340;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.l
    public android.os.Bundle E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("smallAppKey", jSONObject.optString("subKey", "") + "#" + e9Var.getAppId() + ";");
        bundle.putBoolean("enableIndoor", jSONObject.optBoolean("enableIndoor", false));
        if (e9Var.t3() != null && e9Var.t3().E0() != null) {
            bundle.putString("openId", ((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) e9Var.t3().E0()).f47298x0);
        }
        return bundle;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.l
    public com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 F(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        return new com.tencent.mm.plugin.appbrand.jsapi.lbs.k1((com.tencent.mm.plugin.appbrand.e9) lVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.l, com.tencent.mm.plugin.appbrand.jsapi.lbs.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void D(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        super.D(e9Var, jSONObject, i17);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81451h;
        if (!(j1Var instanceof com.tencent.mm.plugin.appbrand.jsapi.lbs.k1)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEnableLocationUpdateWxa", "state manager not RuntimeLocationUpdateStateManagerWxa");
            e9Var.a(i17, o("fail:system error"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) j1Var;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = k1Var.f81449v;
        if (c1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitleImmediately");
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.jsapi.lbs.b1(c1Var));
        }
        if (c1Var == null || k1Var.f81441q) {
            c1Var = new com.tencent.mm.plugin.appbrand.jsapi.lbs.c1();
        }
        k1Var.f81449v = c1Var;
        c1Var.a(e9Var.t3());
        k1Var.f81442r = new com.tencent.mm.plugin.appbrand.jsapi.lbs.s(this, k1Var, e9Var);
        u81.f fVar = k1Var.f81450w;
        if (fVar != null) {
            e9Var.t3().N.c(fVar);
        }
        if (fVar == null || k1Var.f81441q) {
            fVar = new com.tencent.mm.plugin.appbrand.jsapi.lbs.t(this, k1Var);
        }
        e9Var.t3().N.a(fVar);
        k1Var.f81450w = fVar;
        k1Var.f81441q = false;
    }
}
