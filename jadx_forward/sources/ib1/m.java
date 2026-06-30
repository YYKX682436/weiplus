package ib1;

/* loaded from: classes7.dex */
public class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69901x366c91de = 179;

    /* renamed from: NAME */
    private static final java.lang.String f69902x24728b = "getConnectedBluetoothDevices";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.ArrayList arrayList;
        java.util.List<ob1.f> list;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(191);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "getConnectedBluetoothDevices!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "appId:%s getConnectedBluetoothDevices data %s", lVar.mo48798x74292566(), jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(lVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(193, 195);
            return;
        }
        if (!qb1.b.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "adapter is null or not enabled!");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10001);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1500102);
            lVar.a(i17, t("fail:not available", hashMap2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(193, 197);
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm.a_);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new java.util.ArrayList(length);
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString = optJSONArray.optString(i18);
                if (optString != null) {
                    arrayList.add(optString);
                }
            }
        } else {
            arrayList = null;
        }
        boolean optBoolean = jSONObject.optBoolean("useOldImpl", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "useOldImpl: " + optBoolean);
        kb1.c i19 = b17.i();
        if (i19 != null) {
            lb1.i iVar = i19.f387755a;
            if (optBoolean) {
                list = iVar.b(arrayList);
            } else {
                if (arrayList != null) {
                    iVar.getClass();
                    if (!arrayList.isEmpty()) {
                        list = iVar.b(arrayList);
                    }
                }
                list = iVar.c(lb1.h.f399239a);
            }
        } else {
            list = null;
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetoothDevices is null!");
            java.lang.String str3 = android.text.TextUtils.isEmpty("fail:internal error") ? "fail:unknown Bluetooth error" : "fail:internal error";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1510000);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str3, jSONObject2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(193, nd1.d1.f72919x366c91de);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (ob1.f fVar : list) {
            java.lang.String str5 = fVar.f425541b;
            java.lang.String str6 = fVar.f425540a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("deviceId", str5);
                jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str6);
                jSONArray.put(jSONObject3);
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetConnectedBluetoothDevices", "put JSON data error : %s", e18);
            }
        }
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("devices", jSONArray);
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetConnectedBluetoothDevices", e19, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetConnectedBluetoothDevices", "retJson %s", jSONObject4.toString());
        java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str8 = str7 != null ? str7 : "";
        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        try {
            jSONObject4.put("errno", 0);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        lVar.a(i17, u(str8, jSONObject4));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(192);
    }
}
