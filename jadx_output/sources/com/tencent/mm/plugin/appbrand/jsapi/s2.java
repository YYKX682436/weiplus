package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class s2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 924;
    private static final java.lang.String NAME = "addImageToFavorites";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("url");
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, url is empty");
            lVar.a(i17, o("fail:url is empty"));
        } else {
            kotlin.jvm.internal.o.d(optString);
            com.tencent.mm.plugin.appbrand.utils.o5.b(lVar, optString, null, new com.tencent.mm.plugin.appbrand.jsapi.r2(lVar, i17, this));
        }
    }
}
