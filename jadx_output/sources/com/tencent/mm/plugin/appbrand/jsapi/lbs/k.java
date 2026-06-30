package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.lbs.i {
    private static final int CTRL_INDEX = 587;
    private static final java.lang.String NAME = "disableLocationUpdate";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.i, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        super.A(e9Var, jSONObject, i17);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81423g;
        if (j1Var instanceof com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) {
            ((com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) j1Var).q(e9Var.t3());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiDisableLocationUpdateWxa", "state manager not RuntimeLocationUpdateStateManagerWxa");
            e9Var.a(i17, o("fail:system error"));
        }
    }
}
