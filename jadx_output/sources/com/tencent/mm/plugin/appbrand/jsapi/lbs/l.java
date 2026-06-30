package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.appbrand.jsapi.lbs.b {
    private static final int CTRL_INDEX = 340;
    public static final java.lang.String NAME = "enableLocationUpdate";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 f81451h;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.b
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEnableLocationUpdate", "enableLocationUpdate:%s", jSONObject);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.j1) lVar.k(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1.class);
        this.f81451h = j1Var;
        if (j1Var == null) {
            com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 F = F(lVar);
            this.f81451h = F;
            F.n();
            lVar.l(this.f81451h);
        }
        this.f81451h.f81437m = E(lVar, jSONObject);
        java.lang.String optString = jSONObject.optString("type", "gcj02");
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var2 = this.f81451h;
        j1Var2.f81438n = optString;
        j1Var2.f81439o = false;
        j1Var2.l(1);
        lVar.a(i17, o("ok"));
    }

    public android.os.Bundle E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        return null;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 F(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        return new com.tencent.mm.plugin.appbrand.jsapi.lbs.j1(lVar);
    }
}
