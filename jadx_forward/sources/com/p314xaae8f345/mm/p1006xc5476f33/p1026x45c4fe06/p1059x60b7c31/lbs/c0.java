package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.y {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        lk1.a b17 = ((lf.e) ((lk1.c) e9Var.q(lk1.c.class))).b("wgs84", 600000);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        if (b17 != null) {
            hashMap.put("latitude", java.lang.Double.valueOf(b17.f400529a));
            hashMap.put("longitude", java.lang.Double.valueOf(b17.f400530b));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLastLocationCacheWC", "getLocationCache latitude:%f, longitude:%f", java.lang.Double.valueOf(b17.f400529a), java.lang.Double.valueOf(b17.f400530b));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.C12144x8fa3af05 c12144x8fa3af05 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.C12144x8fa3af05) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.a0.class);
            hashMap.put("latitude", java.lang.Double.valueOf(c12144x8fa3af05.f162917d));
            hashMap.put("longitude", java.lang.Double.valueOf(c12144x8fa3af05.f162918e));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLastLocationCacheWC", "GetLastLocationCacheTask latitude:%f, longitude:%f", java.lang.Double.valueOf(c12144x8fa3af05.f162917d), java.lang.Double.valueOf(c12144x8fa3af05.f162918e));
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        e9Var.a(i17, t("ok", hashMap));
    }
}
