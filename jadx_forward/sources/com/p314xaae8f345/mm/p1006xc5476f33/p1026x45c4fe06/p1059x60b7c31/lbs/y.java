package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34426x366c91de = 1342;

    /* renamed from: NAME */
    private static final java.lang.String f34427x24728b = "getLastLocationCache";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        lk1.a b17 = ((lf.e) ((lk1.c) lVar.q(lk1.c.class))).b("wgs84", 600000);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        if (b17 != null) {
            hashMap.put("latitude", java.lang.Double.valueOf(b17.f400529a));
            hashMap.put("longitude", java.lang.Double.valueOf(b17.f400530b));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetLastLocationCache", "latitude:%f, longitude:%f", java.lang.Double.valueOf(b17.f400529a), java.lang.Double.valueOf(b17.f400530b));
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            lVar.a(i17, t("ok", hashMap));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetLastLocationCache", "getLocationCache fail");
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 107);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str2, jSONObject2));
    }
}
