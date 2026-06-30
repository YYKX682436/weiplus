package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.mm.plugin.appbrand.jsapi.lbs.y {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.y, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        lk1.a b17 = ((lf.e) ((lk1.c) e9Var.q(lk1.c.class))).b("wgs84", 600000);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        if (b17 != null) {
            hashMap.put("latitude", java.lang.Double.valueOf(b17.f318996a));
            hashMap.put("longitude", java.lang.Double.valueOf(b17.f318997b));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetLastLocationCacheWC", "getLocationCache latitude:%f, longitude:%f", java.lang.Double.valueOf(b17.f318996a), java.lang.Double.valueOf(b17.f318997b));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData jsApiGetLastLocationCacheWC$LocationData = (com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.jsapi.lbs.a0.class);
            hashMap.put("latitude", java.lang.Double.valueOf(jsApiGetLastLocationCacheWC$LocationData.f81384d));
            hashMap.put("longitude", java.lang.Double.valueOf(jsApiGetLastLocationCacheWC$LocationData.f81385e));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetLastLocationCacheWC", "GetLastLocationCacheTask latitude:%f, longitude:%f", java.lang.Double.valueOf(jsApiGetLastLocationCacheWC$LocationData.f81384d), java.lang.Double.valueOf(jsApiGetLastLocationCacheWC$LocationData.f81385e));
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        e9Var.a(i17, t("ok", hashMap));
    }
}
