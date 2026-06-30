package ib1;

/* loaded from: classes7.dex */
public class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69897x366c91de = 177;

    /* renamed from: NAME */
    private static final java.lang.String f69898x24728b = "stopBluetoothDevicesDiscovery";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(101);
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = mo48798x74292566;
        java.lang.Object obj = jSONObject;
        if (jSONObject == null) {
            obj = "";
        }
        objArr[1] = obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "appId:%s stopBluetoothDevicesDiscovery data:%s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(mo48798x74292566);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(103, 106);
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "adapter is null or not enabled!");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10001);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(103, 108);
            return;
        }
        kb1.c i18 = b17.i();
        ob1.m d17 = i18 != null ? i18.f387756b.d() : ob1.m.f425552f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "stopBleScan result:%s", d17);
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (d17.f425571a != 0) {
            hashMap3.put("isDiscovering", java.lang.Boolean.FALSE);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 1510000);
            lVar.a(i17, t("fail", hashMap3));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(103);
            return;
        }
        hashMap3.put("isDiscovering", java.lang.Boolean.FALSE);
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap3.put("errno", 0);
        lVar.a(i17, t("ok", hashMap3));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(102);
        ib1.b0.u(lVar, true, false);
    }
}
