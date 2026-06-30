package ib1;

/* loaded from: classes7.dex */
public final class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69885x366c91de = 738;

    /* renamed from: NAME */
    private static final java.lang.String f69886x24728b = "setBLEMTU";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l service, org.json.JSONObject jSONObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (jSONObject == null || !jSONObject.has("deviceId") || !jSONObject.has("mtu")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetBLEMtu", "setBLEMTU data is null, err");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 101);
            service.a(i17, t("fail:invalid data", hashMap));
            return;
        }
        java.lang.String mo48798x74292566 = service.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetBLEMtu", "appId:%s setBLEMTU data %s", mo48798x74292566, jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(service.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetBLEMtu", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1500101);
            service.a(i17, t("fail:not init", hashMap2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(27, 30);
            return;
        }
        if (qb1.b.b()) {
            java.lang.String optString = jSONObject.optString("deviceId");
            b17.h(optString, new mb1.l(java.lang.Integer.valueOf(jSONObject.optInt("mtu")), optString), new ib1.e0(mo48798x74292566, this, i17, service));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetBLEMtu", "bleWorker is disable, may not open ble");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", 10001);
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap3.put("errno", 1500102);
        service.a(i17, t("fail:not available", hashMap3));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(27, 32);
    }
}
