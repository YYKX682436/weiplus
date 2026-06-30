package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class e0 extends com.tencent.mm.plugin.appbrand.jsapi.lbs.b {
    public static final int CTRL_INDEX = 37;
    public static final java.lang.String NAME = "getLocation";

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
        boolean optBoolean = jSONObject.optBoolean("altitude", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetLocation", "getLocation data:%s", jSONObject);
        if (!"wgs84".equals(trim) && !"gcj02".equals(trim)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLocation", "doGeoLocation fail, unsupported type = %s", trim);
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", -1);
            lVar.a(i17, p("fail:invalid data", hashMap));
            return;
        }
        if (!C(lVar)) {
            java.util.HashMap hashMap2 = new java.util.HashMap(1);
            hashMap2.put("errCode", -2);
            lVar.a(i17, p("fail:system permission denied", hashMap2));
        } else {
            F(lVar);
            android.os.Bundle H = H(lVar, jSONObject);
            lk1.c cVar = (lk1.c) lVar.q(lk1.c.class);
            if (cVar != null) {
                cVar.Pg(trim, G(lVar, new com.tencent.mm.plugin.appbrand.jsapi.lbs.d0(this, lVar, trim, optBoolean, i17)), H);
            }
        }
    }

    public void E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, lk1.a aVar) {
    }

    public void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
    }

    public lk1.b G(com.tencent.mm.plugin.appbrand.jsapi.l lVar, lk1.b bVar) {
        return bVar;
    }

    public android.os.Bundle H(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean optBoolean = jSONObject.optBoolean("isHighAccuracy", false);
        int optInt = jSONObject.optInt("highAccuracyExpireTime", 3000);
        bundle.putBoolean("isHighAccuracy", optBoolean);
        bundle.putInt("highAccuracyExpireTime", optInt);
        bundle.putBoolean("useCache", lVar.getAppState() != u81.b.FOREGROUND);
        return bundle;
    }
}
