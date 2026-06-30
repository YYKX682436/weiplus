package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class w extends com.tencent.mm.plugin.appbrand.jsapi.lbs.b {
    public static final int CTRL_INDEX = 1138;
    public static final java.lang.String NAME = "getFuzzyLocation";

    /* renamed from: i, reason: collision with root package name */
    public static final java.math.BigDecimal f81505i = new java.math.BigDecimal(100);

    /* renamed from: m, reason: collision with root package name */
    public static final java.math.BigDecimal f81506m = new java.math.BigDecimal("0.01");

    /* renamed from: n, reason: collision with root package name */
    public static final java.math.BigDecimal f81507n = new java.math.BigDecimal("0.01");

    /* renamed from: h, reason: collision with root package name */
    public final java.security.SecureRandom f81508h = new java.security.SecureRandom();

    public static double E(com.tencent.mm.plugin.appbrand.jsapi.lbs.w wVar, double d17) {
        wVar.getClass();
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(d17 + "");
        java.security.SecureRandom secureRandom = wVar.f81508h;
        java.math.BigDecimal add = f81507n.add(f81506m.multiply(new java.math.BigDecimal(secureRandom.nextInt(100))).divide(f81505i));
        return secureRandom.nextBoolean() ? bigDecimal.add(add).doubleValue() : bigDecimal.subtract(add).doubleValue();
    }

    public static double J(double d17) {
        return (d17 * 3.141592653589793d) / 180.0d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.b
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("type", "wgs84");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (optString == null) {
            optString = "";
        }
        java.lang.String trim = optString.trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            trim = "wgs84";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetFuzzyLocation", "getFuzzyLocation data:%s", jSONObject);
        if (!"wgs84".equals(trim) && !"gcj02".equals(trim)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetFuzzyLocation", "doGeoLocation fail, unsupported type = %s", trim);
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", -1);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            return;
        }
        if (!C(lVar)) {
            java.util.HashMap hashMap2 = new java.util.HashMap(1);
            hashMap2.put("errCode", -2);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 3);
            lVar.a(i17, t("fail:system permission denied", hashMap2));
            return;
        }
        G(lVar);
        android.os.Bundle I = I(lVar, jSONObject);
        lk1.c cVar = (lk1.c) lVar.q(lk1.c.class);
        if (cVar != null) {
            cVar.Pg(trim, H(lVar, new com.tencent.mm.plugin.appbrand.jsapi.lbs.v(this, lVar, trim, i17)), I);
        }
    }

    public void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, lk1.a aVar) {
    }

    public void G(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
    }

    public lk1.b H(com.tencent.mm.plugin.appbrand.jsapi.l lVar, lk1.b bVar) {
        return bVar;
    }

    public android.os.Bundle I(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("useCache", lVar.getAppState() != u81.b.FOREGROUND);
        return bundle;
    }
}
