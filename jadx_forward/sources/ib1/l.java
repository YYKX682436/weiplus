package ib1;

/* loaded from: classes7.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69899x366c91de = 178;

    /* renamed from: NAME */
    private static final java.lang.String f69900x24728b = "getBluetoothDevices";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(166);
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = mo48798x74292566;
        objArr[1] = jSONObject == null ? "" : jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBluetoothDevices", "appId:%s getBluetoothDevices data:%s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(mo48798x74292566);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBluetoothDevices", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(be1.r0.f4232x366c91de, 170);
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBluetoothDevices", "adapter is null or not enabled!");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10001);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(be1.r0.f4232x366c91de, 172);
            return;
        }
        kb1.c i18 = b17.i();
        java.util.List list = null;
        if (i18 != null) {
            pb1.i iVar = i18.f387756b;
            synchronized (iVar) {
                arrayList = iVar.f434676d == null ? new java.util.ArrayList() : new java.util.ArrayList(((java.util.HashMap) iVar.f434676d).values());
            }
        } else {
            arrayList = null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (arrayList != null) {
            boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("useOldImpl", false) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBluetoothDevices", "useOldImpl: " + optBoolean);
            kb1.c i19 = b17.i();
            if (i19 != null) {
                lb1.i iVar2 = i19.f387755a;
                list = optBoolean ? iVar2.a() : iVar2.c(lb1.h.f399239a);
            }
            arrayList.addAll(list);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(((ob1.f) it.next()).a());
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetBluetoothDevices", e17, "", new java.lang.Object[0]);
                }
            }
        }
        try {
            jSONObject2.put("errMsg", k() + ":ok");
            jSONObject2.put("devices", jSONArray);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBluetoothDevices", "put json value error : %s", android.util.Log.getStackTraceString(e18));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBluetoothDevices", "retJson %s", jSONObject2);
        lVar.a(i17, jSONObject2.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727);
    }
}
