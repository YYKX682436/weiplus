package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
class a0 implements com.tencent.mm.ipcinvoker.k0 {
    private a0() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData jsApiGetLastLocationCacheWC$LocationData = new com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLastLocationCacheWC$LocationData();
        if (i95.n0.h(u60.g.class)) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h e17 = i11.h.e();
            if (e17 == null || !e17.h()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLastLocationCacheWC", "isGetWgs84LocationIn10Minutes false");
            } else {
                e17.f(new com.tencent.mm.plugin.appbrand.jsapi.lbs.z(this, jsApiGetLastLocationCacheWC$LocationData));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetLastLocationCacheWC", "getWgs84FromCache latitude:%f, longitude:%f", java.lang.Double.valueOf(jsApiGetLastLocationCacheWC$LocationData.f81384d), java.lang.Double.valueOf(jsApiGetLastLocationCacheWC$LocationData.f81385e));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLastLocationCacheWC", "isFeatureServiceRegistered false for ILocationGeoService");
        }
        return jsApiGetLastLocationCacheWC$LocationData;
    }
}
