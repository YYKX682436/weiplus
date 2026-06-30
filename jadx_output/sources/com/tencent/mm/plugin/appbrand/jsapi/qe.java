package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class qe extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 215;
    public static final java.lang.String NAME = "updatePerfData";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f82879g;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f82879g = hashMap;
        hashMap.put("firstRenderTime", 301);
        hashMap.put("reRenderTime", 302);
        hashMap.put("webview2AppServiceTotalTime", 402);
        hashMap.put("webview2AppServiceDataSize", 403);
        hashMap.put("webview2AppServiceNativeTime", 404);
        hashMap.put("appService2WebviewTotalTime", 405);
        hashMap.put("appService2WebviewDataSize", 406);
        hashMap.put("appService2WebviewNativeTime", 407);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("dataArray");
        if (!com.tencent.mm.plugin.appbrand.performance.h.f((ze.n) yVar.getRuntime()) || optJSONArray == null) {
            yVar.a(i17, o("fail"));
            return;
        }
        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("key");
                java.lang.String optString2 = optJSONObject.optString("value");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    java.lang.Integer num = (java.lang.Integer) f82879g.get(optString);
                    if (num != null) {
                        com.tencent.mm.plugin.appbrand.performance.h.e((ze.n) yVar.getRuntime(), num.intValue(), optString2);
                    } else {
                        ze.n nVar = (ze.n) yVar.getRuntime();
                        java.lang.String str = nVar.f74803n;
                        com.tencent.mm.plugin.appbrand.ui.ga gaVar = nVar.V1;
                        if (gaVar == null) {
                            c01.n2.d().c(str + "performance_custom_data", true).i(optString, optString2);
                        } else {
                            ik1.h0.b(new com.tencent.mm.plugin.appbrand.ui.da(gaVar, optString, optString2));
                        }
                    }
                }
            }
        }
        yVar.a(i17, o("ok"));
    }
}
