package od1;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f73042x366c91de = 1407;

    /* renamed from: NAME */
    private static final java.lang.String f73043x24728b = "listenNewPerformanceMetric";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.tencent.mm.plugin.appbrand.jsapi.k0, od1.f] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        ?? r37;
        java.lang.String str;
        org.json.JSONArray optJSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNewPerformanceMetric", "listenNewPerformanceMetric be used");
        if (e9Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = e9Var.x();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(x17 != null ? x17.qe("supportListenNewPerformanceMetric") : null, false)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi not supported" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 100);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("names")) == null) {
            r37 = kz5.p0.f395529d;
        } else {
            int length = optJSONArray.length();
            r37 = new java.util.ArrayList(length);
            for (int i18 = 0; i18 < length; i18++) {
                r37.add(optJSONArray.optString(i18));
            }
        }
        if (e9Var.k(od1.i.class) == null) {
            synchronized (e9Var) {
                if (e9Var.k(od1.i.class) == null) {
                    e9Var.l(new od1.i());
                }
            }
        }
        od1.i iVar = (od1.i) e9Var.k(od1.i.class);
        if (iVar == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str, jSONObject3));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNewPerformanceMetric", "can not find instantiated object of NewPerformanceMetricStateManager from the provided AppBrandService instance.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "setListenName:" + r37);
        java.util.HashSet hashSet = new java.util.HashSet();
        iVar.f426139d = hashSet;
        hashSet.addAll(r37);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cachePerformanceMetric", new org.json.JSONArray((java.util.Collection) iVar.f426140e));
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        java.lang.String t17 = t("ok", hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNewPerformanceMetric", "callback ok, content:" + t17);
        e9Var.a(i17, t17);
        iVar.f426140e.clear();
    }
}
