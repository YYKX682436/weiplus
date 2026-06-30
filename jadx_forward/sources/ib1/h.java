package ib1;

/* loaded from: classes7.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69889x366c91de = 777;

    /* renamed from: NAME */
    public static final java.lang.String f69890x24728b = "getBLEDeviceRSSI";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "env is null", new java.lang.Object[0]);
            return;
        }
        if (jSONObject == null || !jSONObject.has("deviceId")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "data is null or do not have key: deviceId", new java.lang.Object[0]);
            java.util.Map l17 = kz5.c1.l(new jz5.l("errCode", 10013));
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            l17.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", l17));
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "appId: " + mo48798x74292566 + ", data: " + jSONObject, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(mo48798x74292566);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "bleWorker is null", new java.lang.Object[0]);
            java.util.Map l18 = kz5.c1.l(new jz5.l("errCode", 10000));
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            l18.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", l18));
            return;
        }
        java.lang.String optString = jSONObject.optString("deviceId");
        if (optString != null) {
            b17.h(optString, new mb1.f(), new ib1.g(mo48798x74292566, this, i17, lVar));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "deviceId is null", new java.lang.Object[0]);
        java.util.Map l19 = kz5.c1.l(new jz5.l("errCode", 10013));
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        l19.put("errno", 101);
        lVar.a(i17, t("fail:invalid data", l19));
    }
}
