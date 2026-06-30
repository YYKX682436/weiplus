package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class y extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1342;
    private static final java.lang.String NAME = "getLastLocationCache";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        lk1.a b17 = ((lf.e) ((lk1.c) lVar.q(lk1.c.class))).b("wgs84", 600000);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        if (b17 != null) {
            hashMap.put("latitude", java.lang.Double.valueOf(b17.f318996a));
            hashMap.put("longitude", java.lang.Double.valueOf(b17.f318997b));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetLastLocationCache", "latitude:%f, longitude:%f", java.lang.Double.valueOf(b17.f318996a), java.lang.Double.valueOf(b17.f318997b));
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i17, t("ok", hashMap));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetLastLocationCache", "getLocationCache fail");
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 107);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str2, jSONObject2));
    }
}
