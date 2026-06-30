package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes7.dex */
public final class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 640;
    public static final java.lang.String NAME = "requestSubscribeMessage";

    static {
        new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.n(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        com.tencent.mars.xlog.Log.i("JsApiRequestSubscribeMessage", "JsApiRequestSubscribeMessage invoked");
        if (jSONObject == null) {
            kotlin.jvm.internal.o.d(yVar);
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("tmplIds");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray.length() == 0) {
            kotlin.jvm.internal.o.d(yVar);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("errCode", 10001);
            java.lang.String p17 = p("fail:TmplIds can't be empty", linkedHashMap);
            com.tencent.mars.xlog.Log.i("JsApiRequestSubscribeMessage", "[callbackJsApi] return json:" + p17);
            yVar.a(i17, p17);
            return;
        }
        try {
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.Object obj = jSONArray.get(i18);
                if (!(obj instanceof java.lang.String)) {
                    kotlin.jvm.internal.o.d(yVar);
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                    linkedHashMap2.put("errCode", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID));
                    java.lang.String p18 = p("fail:Invalid template id", linkedHashMap2);
                    com.tencent.mars.xlog.Log.i("JsApiRequestSubscribeMessage", "[callbackJsApi] return json:" + p18);
                    yVar.a(i17, p18);
                    return;
                }
                arrayList.add(obj);
            }
            kotlin.jvm.internal.o.d(yVar);
            java.lang.String username = yVar.t3().u0().f47278x;
            kotlin.jvm.internal.o.f(username, "username");
            java.lang.String appId = yVar.t3().u0().f77278d;
            kotlin.jvm.internal.o.f(appId, "appId");
            new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask(username, appId, yVar.t3().u0().f47284z, arrayList, 0, this, yVar, i17).b();
        } catch (org.json.JSONException unused) {
            kotlin.jvm.internal.o.d(yVar);
            yVar.a(i17, o("fail:invalid data"));
        }
    }
}
