package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
class a0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private a0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.C12144x8fa3af05 c12144x8fa3af05 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.C12144x8fa3af05();
        if (i95.n0.h(u60.g.class)) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h e17 = i11.h.e();
            if (e17 == null || !e17.h()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetLastLocationCacheWC", "isGetWgs84LocationIn10Minutes false");
            } else {
                e17.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.z(this, c12144x8fa3af05));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLastLocationCacheWC", "getWgs84FromCache latitude:%f, longitude:%f", java.lang.Double.valueOf(c12144x8fa3af05.f162917d), java.lang.Double.valueOf(c12144x8fa3af05.f162918e));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetLastLocationCacheWC", "isFeatureServiceRegistered false for ILocationGeoService");
        }
        return c12144x8fa3af05;
    }
}
