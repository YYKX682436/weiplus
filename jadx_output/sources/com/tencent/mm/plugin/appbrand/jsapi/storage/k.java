package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 522;
    public static final java.lang.String NAME = "getBackgroundFetchData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:component is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:data is null");
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("fetchType");
        boolean optBoolean = jSONObject.optBoolean("cleanCache", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBackgroundFetchData", "data:%s", jSONObject);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:fetchType is null");
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String appId = yVar.getAppId();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = runtime == null ? null : (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) runtime.u0();
        java.lang.String str = appBrandInitConfigLU == null ? null : appBrandInitConfigLU.f47278x;
        if (com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:appid is null");
            yVar.a(i17, o("fail:appID is empty"));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "fail:username is null");
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        boolean equals = optString.equals("periodic");
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:IAppBrandBackgroundFetchDataStorage is null");
            yVar.a(i17, o("fail:internal error"));
            return;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataParcel E4 = ((com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class)).E4(str, equals ? 1 : 0);
        if (E4 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:record is null");
            yVar.a(i17, o("fail:record is null"));
            return;
        }
        if (E4.f76781h == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetBackgroundFetchData", "worker fail:fetched data is null");
            yVar.a(i17, o("fail:fetched data is null"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fetchedData", E4.f76781h);
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, E4.f76779f);
        hashMap.put("query", E4.f76780g);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(E4.f76782i));
        hashMap.put("timeStamp", java.lang.Long.valueOf(E4.f76783m));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBackgroundFetchData", "JsApiGetBackgroundFetchData, app(%s_%d), timeStamp:%d", appId, java.lang.Integer.valueOf(equals ? 1 : 0), java.lang.Long.valueOf(E4.f76783m));
        yVar.a(i17, p("ok", hashMap));
        if (optBoolean) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBackgroundFetchData", "delete data , appId:%s, userName:%s, type:%d, delRet:%b", appId, str, java.lang.Integer.valueOf(equals ? 1 : 0), java.lang.Boolean.valueOf(((com.tencent.mm.plugin.appbrand.backgroundfetch.s1) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundfetch.s1.class)).z6(str, equals ? 1 : 0)));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
