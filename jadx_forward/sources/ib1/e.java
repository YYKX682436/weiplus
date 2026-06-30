package ib1;

/* loaded from: classes7.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69881x366c91de = 180;

    /* renamed from: NAME */
    private static final java.lang.String f69882x24728b = "createBLEConnection";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(25);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCreateBLEConnection", "createBLEConnection data is null, err");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateBLEConnection", "appId:%s createBLEConnection data %s", mo48798x74292566, jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(lVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCreateBLEConnection", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(27, 30);
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCreateBLEConnection", "bleWorker is disable, may not open ble");
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("errCode", 10001);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap3));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(27, 32);
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("debug", false);
        boolean optBoolean2 = jSONObject.optBoolean("mainThread", true);
        boolean optBoolean3 = jSONObject.optBoolean("autoConnect", false);
        java.lang.String optString = jSONObject.optString("transport", "LE");
        long optLong = jSONObject.optLong("discoverDelay", 0L);
        java.lang.String optString2 = jSONObject.optString("connectionPriority", null);
        java.lang.String optString3 = jSONObject.optString("deviceId");
        boolean optBoolean4 = jSONObject.optBoolean("doDiscover", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCreateBLEConnection", "deviceId: %s, doDiscover: %b", optString3, java.lang.Boolean.valueOf(optBoolean4));
        mb1.d dVar = new mb1.d(optString3);
        dVar.f425524f = optBoolean;
        dVar.f425525g = optBoolean2;
        dVar.f406833o = optBoolean3;
        dVar.f406834p = optString;
        dVar.f406835q = optLong;
        dVar.f406836r = optString2;
        dVar.f406837s = optBoolean4;
        b17.h(optString3, dVar, new ib1.d(this, mo48798x74292566, lVar, i17, optString3));
    }

    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, boolean z17) {
    }
}
