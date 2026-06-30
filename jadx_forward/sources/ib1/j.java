package ib1;

/* loaded from: classes7.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69891x366c91de = 182;

    /* renamed from: NAME */
    private static final java.lang.String f69892x24728b = "getBLEDeviceServices";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(136);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "getBLEDeviceServices data is null");
            java.lang.String str = android.text.TextUtils.isEmpty("fail:invalid data") ? "fail:jsapi invalid request data" : "fail:invalid data";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(138, 139);
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "appId:%s getBLEDeviceServices data %s", mo48798x74292566, jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(lVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10000);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(138, 141);
            return;
        }
        if (qb1.b.b()) {
            java.lang.String optString = jSONObject.optString("deviceId");
            boolean optBoolean = jSONObject.optBoolean("doDiscover", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "deviceId: %s, doDiscover: %b", optString, java.lang.Boolean.valueOf(optBoolean));
            if (optBoolean) {
                b17.h(optString, new mb1.e(optString), new ib1.i(this, mo48798x74292566, b17, optString, lVar, i17));
                return;
            } else {
                C(lVar, i17, b17.j(optString, true));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "adapter is null or not enabled!");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", 10001);
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap2.put("errno", 1500102);
        lVar.a(i17, t("fail:not available", hashMap2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(138, 145);
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "not found services");
            hashMap.put("errCode", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261));
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 1500103);
            lVar.a(i17, t("fail:no service", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(138, 144);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ob1.g gVar = (ob1.g) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f425548a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "get uuid is null");
            } else {
                try {
                    if (gVar.f425550c == null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        gVar.f425550c = jSONObject;
                        jSONObject.put("uuid", gVar.f425548a);
                        gVar.f425550c.put("isPrimary", gVar.f425549b);
                    }
                    jSONArray.put(gVar.f425550c);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBLEDeviceServices", "JSONException %s", e17.getMessage());
                }
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm.a_, jSONArray);
            jSONObject2.put("errCode", 0);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetBLEDeviceServices", e18, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetBLEDeviceServices", "retJson %s", jSONObject2.toString());
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, u(str3, jSONObject2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(137);
    }
}
