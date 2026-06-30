package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b {

    /* renamed from: CTRL_INDEX */
    public static final int f34422x366c91de = 1138;

    /* renamed from: NAME */
    public static final java.lang.String f34423x24728b = "getFuzzyLocation";

    /* renamed from: i, reason: collision with root package name */
    public static final java.math.BigDecimal f163038i = new java.math.BigDecimal(100);

    /* renamed from: m, reason: collision with root package name */
    public static final java.math.BigDecimal f163039m = new java.math.BigDecimal("0.01");

    /* renamed from: n, reason: collision with root package name */
    public static final java.math.BigDecimal f163040n = new java.math.BigDecimal("0.01");

    /* renamed from: h, reason: collision with root package name */
    public final java.security.SecureRandom f163041h = new java.security.SecureRandom();

    public static double E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w wVar, double d17) {
        wVar.getClass();
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(d17 + "");
        java.security.SecureRandom secureRandom = wVar.f163041h;
        java.math.BigDecimal add = f163040n.add(f163039m.multiply(new java.math.BigDecimal(secureRandom.nextInt(100))).divide(f163038i));
        return secureRandom.nextBoolean() ? bigDecimal.add(add).doubleValue() : bigDecimal.subtract(add).doubleValue();
    }

    public static double J(double d17) {
        return (d17 * 3.141592653589793d) / 180.0d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b
    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("type", "wgs84");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (optString == null) {
            optString = "";
        }
        java.lang.String trim = optString.trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            trim = "wgs84";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetFuzzyLocation", "getFuzzyLocation data:%s", jSONObject);
        if (!"wgs84".equals(trim) && !"gcj02".equals(trim)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetFuzzyLocation", "doGeoLocation fail, unsupported type = %s", trim);
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", -1);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            return;
        }
        if (!C(lVar)) {
            java.util.HashMap hashMap2 = new java.util.HashMap(1);
            hashMap2.put("errCode", -2);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 3);
            lVar.a(i17, t("fail:system permission denied", hashMap2));
            return;
        }
        G(lVar);
        android.os.Bundle I = I(lVar, jSONObject);
        lk1.c cVar = (lk1.c) lVar.q(lk1.c.class);
        if (cVar != null) {
            cVar.Pg(trim, H(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v(this, lVar, trim, i17)), I);
        }
    }

    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, lk1.a aVar) {
    }

    public void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
    }

    public lk1.b H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, lk1.b bVar) {
        return bVar;
    }

    public android.os.Bundle I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("useCache", lVar.mo48799xc0ccc466() != u81.b.FOREGROUND);
        return bundle;
    }
}
