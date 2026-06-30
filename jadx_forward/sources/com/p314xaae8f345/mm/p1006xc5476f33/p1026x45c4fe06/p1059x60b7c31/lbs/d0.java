package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class d0 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f162934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f162935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0 f162936h;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, boolean z17, int i17) {
        this.f162936h = e0Var;
        this.f162932d = lVar;
        this.f162933e = str;
        this.f162934f = z17;
        this.f162935g = i17;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLocation", "errCode:%d, errStr:%s, location:%s", java.lang.Integer.valueOf(i17), str, aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0 e0Var = this.f162936h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162932d;
        e0Var.E(lVar, i17, str, aVar);
        int i18 = this.f162935g;
        if (i17 != 0) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", java.lang.Integer.valueOf(i17));
            lVar.a(i18, e0Var.p("fail:" + str, hashMap));
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap(4);
        hashMap2.put("type", this.f162933e);
        hashMap2.put("latitude", java.lang.Double.valueOf(aVar.f400529a));
        hashMap2.put("longitude", java.lang.Double.valueOf(aVar.f400530b));
        hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, java.lang.Double.valueOf(aVar.f400532d));
        hashMap2.put("accuracy", java.lang.Double.valueOf(aVar.f400533e));
        if (this.f162934f) {
            hashMap2.put("altitude", java.lang.Double.valueOf(aVar.f400534f));
        }
        hashMap2.put("provider", aVar.f400531c);
        hashMap2.put("verticalAccuracy", 0);
        hashMap2.put("horizontalAccuracy", java.lang.Double.valueOf(aVar.f400533e));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f400535g)) {
            hashMap2.put("buildingId", aVar.f400535g);
            hashMap2.put("floorName", aVar.f400536h);
        }
        hashMap2.put("indoorLocationType", java.lang.Integer.valueOf(aVar.f400537i));
        hashMap2.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, java.lang.Float.valueOf(aVar.f400538j));
        hashMap2.put("steps", java.lang.Double.valueOf(aVar.f400539k));
        lVar.a(i18, e0Var.p("ok", hashMap2));
    }
}
