package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "preloadLiteApp";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("invalid_data"));
            return;
        }
        try {
            if (!jSONObject.has("appId")) {
                lVar.a(i17, o("invalid_appId"));
                return;
            }
            java.lang.String string = jSONObject.getString("appId");
            java.lang.String string2 = jSONObject.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE) ? jSONObject.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE) : "";
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jSONObject.optBoolean("onlyUpdate", false));
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(jSONObject.optBoolean("onlyDownload", false));
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(jSONObject.optBoolean("onlyPreLoadBaseLib", false));
            if (!valueOf.booleanValue() && !valueOf2.booleanValue()) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(lVar.getF147807d(), string, string2, valueOf3.booleanValue() ? "updateBaseLibPath" : NAME);
                return;
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(string, null);
            lVar.a(i17, o("ok"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiPreloadLiteApp", e17, "", new java.lang.Object[0]);
            lVar.a(i17, o("fail"));
        }
    }
}
