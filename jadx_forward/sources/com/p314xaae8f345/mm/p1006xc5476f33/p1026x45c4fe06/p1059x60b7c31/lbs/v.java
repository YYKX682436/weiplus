package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class v implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f163021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w f163022g;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17) {
        this.f163022g = wVar;
        this.f163019d = lVar;
        this.f163020e = str;
        this.f163021f = i17;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetFuzzyLocation", "errCode:%d, errStr:%s, location:%s", java.lang.Integer.valueOf(i17), str, aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w wVar = this.f163022g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163019d;
        wVar.F(lVar, i17, str, aVar);
        int i18 = this.f163021f;
        if (i17 != 0) {
            java.util.HashMap hashMap2 = new java.util.HashMap(1);
            hashMap2.put("errCode", java.lang.Integer.valueOf(i17));
            java.lang.String str2 = "fail:" + str;
            wVar.getClass();
            if (str2 == null) {
                str2 = "fail:unknown location error";
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1200000);
            lVar.a(i18, wVar.t(str2, hashMap2));
            return;
        }
        java.util.HashMap hashMap3 = new java.util.HashMap(4);
        hashMap3.put("type", this.f163020e);
        double d17 = aVar.f400529a;
        wVar.getClass();
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(d17 + "");
        java.security.SecureRandom secureRandom = wVar.f163041h;
        java.math.BigDecimal add = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.f163040n.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.f163039m.multiply(new java.math.BigDecimal(secureRandom.nextInt(100))).divide(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.f163038i));
        double doubleValue = secureRandom.nextBoolean() ? bigDecimal.add(add).doubleValue() : bigDecimal.subtract(add).doubleValue();
        hashMap3.put("latitude", java.lang.Double.valueOf(doubleValue));
        double E = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.E(wVar, aVar.f400530b);
        hashMap3.put("longitude", java.lang.Double.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.E(wVar, aVar.f400530b)));
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            double d18 = aVar.f400529a;
            double d19 = aVar.f400530b;
            double J2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.J(d18);
            double J3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.J(doubleValue);
            hashMap = hashMap3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetFuzzyLocation", "distance:%f", java.lang.Double.valueOf((java.lang.Math.round(((java.lang.Math.asin(java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.sin((J2 - J3) / 2.0d), 2.0d) + ((java.lang.Math.cos(J2) * java.lang.Math.cos(J3)) * java.lang.Math.pow(java.lang.Math.sin((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.J(d19) - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w.J(E)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d) / 10000.0d) * 1000.0d));
        } else {
            hashMap = hashMap3;
        }
        wVar.getClass();
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.util.HashMap hashMap4 = hashMap;
        hashMap4.put("errno", 0);
        lVar.a(i18, wVar.t("ok", hashMap4));
    }
}
