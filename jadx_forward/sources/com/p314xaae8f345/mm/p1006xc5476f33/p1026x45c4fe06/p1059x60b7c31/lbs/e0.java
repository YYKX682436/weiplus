package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.b {

    /* renamed from: CTRL_INDEX */
    public static final int f34397x366c91de = 37;

    /* renamed from: NAME */
    public static final java.lang.String f34398x24728b = "getLocation";

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
        boolean optBoolean = jSONObject.optBoolean("altitude", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLocation", "getLocation data:%s", jSONObject);
        if (!"wgs84".equals(trim) && !"gcj02".equals(trim)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetLocation", "doGeoLocation fail, unsupported type = %s", trim);
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
                cVar.Pg(trim, G(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.d0(this, lVar, trim, optBoolean, i17)), H);
            }
        }
    }

    public void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, lk1.a aVar) {
    }

    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
    }

    public lk1.b G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, lk1.b bVar) {
        return bVar;
    }

    public android.os.Bundle H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean optBoolean = jSONObject.optBoolean("isHighAccuracy", false);
        int optInt = jSONObject.optInt("highAccuracyExpireTime", 3000);
        bundle.putBoolean("isHighAccuracy", optBoolean);
        bundle.putInt("highAccuracyExpireTime", optInt);
        bundle.putBoolean("useCache", lVar.mo48799xc0ccc466() != u81.b.FOREGROUND);
        return bundle;
    }
}
