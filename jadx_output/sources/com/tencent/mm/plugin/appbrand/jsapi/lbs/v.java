package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class v implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.w f81489g;

    public v(com.tencent.mm.plugin.appbrand.jsapi.lbs.w wVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17) {
        this.f81489g = wVar;
        this.f81486d = lVar;
        this.f81487e = str;
        this.f81488f = i17;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        java.util.HashMap hashMap;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetFuzzyLocation", "errCode:%d, errStr:%s, location:%s", java.lang.Integer.valueOf(i17), str, aVar);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.w wVar = this.f81489g;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81486d;
        wVar.F(lVar, i17, str, aVar);
        int i18 = this.f81488f;
        if (i17 != 0) {
            java.util.HashMap hashMap2 = new java.util.HashMap(1);
            hashMap2.put("errCode", java.lang.Integer.valueOf(i17));
            java.lang.String str2 = "fail:" + str;
            wVar.getClass();
            if (str2 == null) {
                str2 = "fail:unknown location error";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 1200000);
            lVar.a(i18, wVar.t(str2, hashMap2));
            return;
        }
        java.util.HashMap hashMap3 = new java.util.HashMap(4);
        hashMap3.put("type", this.f81487e);
        double d17 = aVar.f318996a;
        wVar.getClass();
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(d17 + "");
        java.security.SecureRandom secureRandom = wVar.f81508h;
        java.math.BigDecimal add = com.tencent.mm.plugin.appbrand.jsapi.lbs.w.f81507n.add(com.tencent.mm.plugin.appbrand.jsapi.lbs.w.f81506m.multiply(new java.math.BigDecimal(secureRandom.nextInt(100))).divide(com.tencent.mm.plugin.appbrand.jsapi.lbs.w.f81505i));
        double doubleValue = secureRandom.nextBoolean() ? bigDecimal.add(add).doubleValue() : bigDecimal.subtract(add).doubleValue();
        hashMap3.put("latitude", java.lang.Double.valueOf(doubleValue));
        double E = com.tencent.mm.plugin.appbrand.jsapi.lbs.w.E(wVar, aVar.f318997b);
        hashMap3.put("longitude", java.lang.Double.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.w.E(wVar, aVar.f318997b)));
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            double d18 = aVar.f318996a;
            double d19 = aVar.f318997b;
            double J2 = com.tencent.mm.plugin.appbrand.jsapi.lbs.w.J(d18);
            double J3 = com.tencent.mm.plugin.appbrand.jsapi.lbs.w.J(doubleValue);
            hashMap = hashMap3;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetFuzzyLocation", "distance:%f", java.lang.Double.valueOf((java.lang.Math.round(((java.lang.Math.asin(java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.sin((J2 - J3) / 2.0d), 2.0d) + ((java.lang.Math.cos(J2) * java.lang.Math.cos(J3)) * java.lang.Math.pow(java.lang.Math.sin((com.tencent.mm.plugin.appbrand.jsapi.lbs.w.J(d19) - com.tencent.mm.plugin.appbrand.jsapi.lbs.w.J(E)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d) / 10000.0d) * 1000.0d));
        } else {
            hashMap = hashMap3;
        }
        wVar.getClass();
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.util.HashMap hashMap4 = hashMap;
        hashMap4.put("errno", 0);
        lVar.a(i18, wVar.t("ok", hashMap4));
    }
}
