package ib1;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69895x366c91de = 175;

    /* renamed from: NAME */
    private static final java.lang.String f69896x24728b = "getBluetoothAdapterState";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(126);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBluetoothAdapterState", "appId:%s getBluetoothAdapterState", lVar.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(lVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBluetoothAdapterState", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(128, 130);
            return;
        }
        boolean b18 = qb1.b.b();
        kb1.c i18 = b17.i();
        boolean z17 = i18 != null ? i18.f387756b.f434677e.get() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBluetoothAdapterState", "availableState : " + b18 + ",discoveringState : " + z17);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("available", java.lang.Boolean.valueOf(b18));
        hashMap2.put("discovering", java.lang.Boolean.valueOf(z17));
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap2.put("errno", 0);
        lVar.a(i17, t("ok", hashMap2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(127);
    }
}
