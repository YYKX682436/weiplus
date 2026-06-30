package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes.dex */
public final class f1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1275;
    public static final java.lang.String NAME = "showLiveToast";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShowFinderLiveToast", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShowFinderLiveToast", "invoke, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShowFinderLiveToast", "JsApiShowFinderLiveToast json:" + jSONObject);
        java.lang.String optString = jSONObject.optString("toastContent");
        jSONObject.optInt("duration");
        java.lang.String optString2 = jSONObject.optString("icon");
        if (e9Var.getF147807d() != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.finder.e1(optString2, e9Var, optString, jSONObject));
        }
    }
}
