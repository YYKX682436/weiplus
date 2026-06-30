package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes9.dex */
public final class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1514;
    private static final java.lang.String NAME = "chooseBizPoi";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        double d17;
        if (jSONObject == null || lVar == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("biz");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("gpsInfo");
        double optDouble = optJSONObject != null ? optJSONObject.optDouble("latitude") : 0.0d;
        double optDouble2 = optJSONObject != null ? optJSONObject.optDouble("longitude") : 0.0d;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("gpsList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i19 = 0;
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        while (i19 < length) {
            org.json.JSONObject jSONObject2 = optJSONArray != null ? optJSONArray.getJSONObject(i19) : null;
            double optDouble3 = jSONObject2 != null ? jSONObject2.optDouble("latitude") : 0.0d;
            if (jSONObject2 != null) {
                i18 = length;
                d17 = jSONObject2.optDouble("longitude");
            } else {
                i18 = length;
                d17 = 0.0d;
            }
            arrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo(optDouble3, d17));
            i19++;
            length = i18;
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest(optString, new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo(optDouble, optDouble2), arrayList), com.tencent.mm.plugin.appbrand.jsapi.biz.i.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.j(lVar, i17, this));
    }
}
