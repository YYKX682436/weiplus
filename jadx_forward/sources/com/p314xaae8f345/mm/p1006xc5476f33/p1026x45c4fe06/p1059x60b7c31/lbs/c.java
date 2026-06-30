package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 implements lk1.b {

    /* renamed from: CTRL_INDEX */
    private static final int f34393x366c91de = 341;

    /* renamed from: NAME */
    private static final java.lang.String f34394x24728b = "onLocationChange";

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162926i;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f162926i = lVar;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.EventOnLocationChange", "errCode:%d, errStr:%s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(7);
        hashMap.put("longitude", java.lang.Double.valueOf(aVar.f400530b));
        hashMap.put("latitude", java.lang.Double.valueOf(aVar.f400529a));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, java.lang.Double.valueOf(aVar.f400532d));
        hashMap.put("accuracy", java.lang.Double.valueOf(aVar.f400533e));
        hashMap.put("altitude", java.lang.Double.valueOf(aVar.f400534f));
        hashMap.put("verticalAccuracy", java.lang.Float.valueOf(0.0f));
        hashMap.put("horizontalAccuracy", java.lang.Double.valueOf(aVar.f400533e));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f400535g)) {
            hashMap.put("buildingId", aVar.f400535g);
            hashMap.put("floorName", aVar.f400536h);
        }
        hashMap.put("provider", aVar.f400531c);
        hashMap.put("indoorLocationType", java.lang.Integer.valueOf(aVar.f400537i));
        hashMap.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, java.lang.Float.valueOf(aVar.f400538j));
        hashMap.put("steps", java.lang.Double.valueOf(aVar.f400539k));
        hashMap.put("type", aVar.f400540l);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        this.f162926i.mo48798x74292566();
        synchronized (this) {
            p(this.f162926i);
            r(jSONObject);
            m();
        }
    }
}
