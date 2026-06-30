package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class pe extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 283;
    public static final java.lang.String NAME = "traceEvent";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("events");
        if (!com.tencent.mm.plugin.appbrand.performance.h.f((ze.n) yVar.getRuntime()) || optJSONArray == null) {
            yVar.a(i17, o("fail"));
            return;
        }
        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("category");
                java.lang.String optString2 = optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                long optLong = optJSONObject.optLong("start");
                long optLong2 = optJSONObject.optLong("end");
                java.lang.String optString3 = optJSONObject.optString("phase");
                java.lang.String optString4 = optJSONObject.optString("args");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                    com.tencent.mm.plugin.appbrand.performance.m.e(yVar.getAppId(), optString, optString2, optString3, optLong, optLong2, optString4);
                }
            }
        }
        yVar.a(i17, o("ok"));
    }
}
