package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 587;
    private static final java.lang.String NAME = "disableLocationUpdate";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 f81423g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiDisableLocationUpdate", "disableLocationUpdate invoke");
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.j1) lVar.k(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1.class);
        this.f81423g = j1Var;
        if (j1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiDisableLocationUpdate", "fail:location update not enabled");
            lVar.a(i17, o("fail:location update not enabled"));
        } else {
            j1Var.f81439o = true;
            j1Var.l(2);
            lVar.a(i17, o("ok"));
        }
    }
}
