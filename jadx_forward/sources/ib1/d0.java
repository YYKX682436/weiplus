package ib1;

/* loaded from: classes7.dex */
public class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69879x366c91de = 185;

    /* renamed from: NAME */
    private static final java.lang.String f69880x24728b = "readBLECharacteristicValue";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.Integer valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(41);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReadBLECharacteristicValue", "JsApiReadBLECharacteristicValue data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(43, 44);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReadBLECharacteristicValue", "appId:%s readBLECharacteristicValue data %s", lVar.mo48798x74292566(), jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(lVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReadBLECharacteristicValue", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(43, 46);
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReadBLECharacteristicValue", "adapter is null or not enabled!");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("errCode", 10001);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap3));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(43, 48);
            return;
        }
        java.lang.String optString = jSONObject.optString("deviceId");
        java.lang.String optString2 = jSONObject.optString("serviceId");
        java.lang.String optString3 = jSONObject.optString("characteristicId");
        if (jSONObject.has("handle")) {
            try {
                valueOf = java.lang.Integer.valueOf(jSONObject.getInt("handle"));
            } catch (java.lang.Exception unused) {
            }
            boolean optBoolean = jSONObject.optBoolean("debug", false);
            boolean optBoolean2 = jSONObject.optBoolean("mainThread", false);
            mb1.k kVar = new mb1.k(optString2, optString3, valueOf);
            kVar.f425524f = optBoolean;
            kVar.f425525g = optBoolean2;
            b17.h(optString, kVar, new ib1.c0(this, lVar, i17));
        }
        valueOf = null;
        boolean optBoolean3 = jSONObject.optBoolean("debug", false);
        boolean optBoolean22 = jSONObject.optBoolean("mainThread", false);
        mb1.k kVar2 = new mb1.k(optString2, optString3, valueOf);
        kVar2.f425524f = optBoolean3;
        kVar2.f425525g = optBoolean22;
        b17.h(optString, kVar2, new ib1.c0(this, lVar, i17));
    }
}
