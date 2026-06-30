package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class qe extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34717x366c91de = 215;

    /* renamed from: NAME */
    public static final java.lang.String f34718x24728b = "updatePerfData";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f164412g;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f164412g = hashMap;
        hashMap.put("firstRenderTime", 301);
        hashMap.put("reRenderTime", 302);
        hashMap.put("webview2AppServiceTotalTime", 402);
        hashMap.put("webview2AppServiceDataSize", 403);
        hashMap.put("webview2AppServiceNativeTime", 404);
        hashMap.put("appService2WebviewTotalTime", 405);
        hashMap.put("appService2WebviewDataSize", 406);
        hashMap.put("appService2WebviewNativeTime", 407);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("dataArray");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.f((ze.n) yVar.mo32091x9a3f0ba2()) || optJSONArray == null) {
            yVar.a(i17, o("fail"));
            return;
        }
        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("key");
                java.lang.String optString2 = optJSONObject.optString("value");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    java.lang.Integer num = (java.lang.Integer) f164412g.get(optString);
                    if (num != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e((ze.n) yVar.mo32091x9a3f0ba2(), num.intValue(), optString2);
                    } else {
                        ze.n nVar = (ze.n) yVar.mo32091x9a3f0ba2();
                        java.lang.String str = nVar.f156336n;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar = nVar.V1;
                        if (gaVar == null) {
                            c01.n2.d().c(str + "performance_custom_data", true).i(optString, optString2);
                        } else {
                            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.da(gaVar, optString, optString2));
                        }
                    }
                }
            }
        }
        yVar.a(i17, o("ok"));
    }
}
