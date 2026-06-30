package ib1;

/* loaded from: classes7.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69887x366c91de = 176;

    /* renamed from: NAME */
    private static final java.lang.String f69888x24728b = "startBluetoothDevicesDiscovery";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final org.json.JSONObject jSONObject, final int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(11);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "startBluetoothDevicesDiscovery data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 10013);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 101);
            lVar.a(i17, t("fail:invalid data", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(13, 14);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "appId:%s startBluetoothDevicesDiscovery data:%s", lVar.mo48798x74292566(), jSONObject);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(lVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 10000);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 1500101);
            lVar.a(i17, t("fail:not init", hashMap2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(13, 16);
            return;
        }
        if (qb1.b.b()) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y.b(lVar, "android.permission.BLUETOOTH_SCAN", 144, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3() { // from class: ib1.g0$$a
                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3
                    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4 i4Var) {
                        java.lang.String str3;
                        java.lang.String str4;
                        ib1.g0 g0Var = ib1.g0.this;
                        g0Var.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "onRequestPermissionResult, result: %s", i4Var);
                        int ordinal = i4Var.ordinal();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
                        int i18 = i17;
                        if (ordinal == 0) {
                            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                            str4 = str3 != null ? str3 : "";
                            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put("errno", 4);
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                            }
                            lVar2.a(i18, g0Var.u(str4, jSONObject2));
                            return;
                        }
                        if (ordinal == 1) {
                            g0Var.C(lVar2, jSONObject, i18, b17);
                            return;
                        }
                        if (ordinal != 2) {
                            return;
                        }
                        str3 = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
                        str4 = str3 != null ? str3 : "";
                        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put("errno", 3);
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        lVar2.a(i18, g0Var.u(str4, jSONObject3));
                    }
                });
                return;
            } else {
                C(lVar, jSONObject, i17, b17);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "adapter is null or not enabled!");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", 10001);
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap3.put("errno", 1500102);
        lVar.a(i17, t("fail:not available", hashMap3));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.b(13, 18);
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e eVar) {
        java.util.ArrayList arrayList;
        boolean optBoolean = jSONObject.optBoolean("allowDuplicatesKey");
        int optInt = jSONObject.optInt("interval");
        java.lang.String optString = jSONObject.optString("powerLevel", ya.b.f77490x87518375);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleConfig", "isDefaultRefreshCache, defaultRefreshCache: " + kb1.b.f387749g);
        boolean optBoolean2 = jSONObject.optBoolean("refreshCache", kb1.b.f387749g);
        boolean optBoolean3 = jSONObject.optBoolean("scanWorkaround", true);
        if (jSONObject.has(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm.a_)) {
            arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cm.a_));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12039x60dafc57(null, null, android.os.ParcelUuid.fromString(jSONArray.getString(i18).toUpperCase()), null, null, null, null, -1, null, null, null));
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "get uuid error!");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("isDiscovering", java.lang.Boolean.FALSE);
                hashMap.put("errCode", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261));
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap.put("errno", 101);
                lVar.a(i17, t("fail:no service", hashMap));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.l.a(13);
                return;
            }
        } else {
            arrayList = null;
        }
        kb1.a aVar = new kb1.a();
        aVar.f387743a = optInt;
        aVar.f387744b = optBoolean;
        aVar.f387745c = optString;
        aVar.f387746d = optBoolean2;
        aVar.f387747e = optBoolean3;
        kb1.b bVar = new kb1.b(aVar);
        if (eVar.i() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.BleManager", "initBleConfig:%s", bVar);
            synchronized (kb1.b.class) {
                kb1.b.f387748f = bVar;
            }
        }
        ib1.h0 h0Var = new ib1.h0(this, lVar, i17);
        ib1.i0 i0Var = new ib1.i0(this, lVar);
        kb1.c i19 = eVar.i();
        if (i19 != null) {
            pb1.i iVar = i19.f387756b;
            synchronized (iVar) {
                pb1.h hVar = new pb1.h(h0Var, arrayList, i0Var);
                iVar.f434683k = hVar;
                iVar.c(hVar);
            }
        }
        ib1.b0.u(lVar, true, true);
    }
}
