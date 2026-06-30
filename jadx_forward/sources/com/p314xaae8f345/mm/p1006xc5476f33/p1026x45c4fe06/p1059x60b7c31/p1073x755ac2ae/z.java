package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33965x366c91de = 1089;

    /* renamed from: NAME */
    public static final java.lang.String f33966x24728b = "operateGlobalMonitoredBluetoothDevice";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        k91.z0 E0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        boolean z17;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(yVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, may not open ble");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:not init" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1500101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (!b17.f161590e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, may not open ble background");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:not init" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1500101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            yVar.a(i17, u(str2, jSONObject3));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, data: " + jSONObject);
        if (jSONObject == null) {
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, u(str2, jSONObject4));
            return;
        }
        java.lang.String optString = jSONObject.optString("type");
        if (optString != null) {
            int hashCode = optString.hashCode();
            str = "fail:jsapi invalid request data";
            if (hashCode == -1335458389) {
                if (optString.equals("delete")) {
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                    if (optJSONObject == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, innerData is null");
                        java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? str : null;
                        str2 = str7 != null ? str7 : "";
                        java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        try {
                            jSONObject5.put("errno", 101);
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                        }
                        yVar.a(i17, u(str2, jSONObject5));
                        return;
                    }
                    java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
                    if (mo48798x74292566 == null || mo48798x74292566.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doDelete, appId is empty");
                        java.lang.String str9 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                        str2 = str9 != null ? str9 : "";
                        java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                        try {
                            jSONObject6.put("errno", 4);
                        } catch (java.lang.Exception e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                        }
                        yVar.a(i17, u(str2, jSONObject6));
                        return;
                    }
                    java.lang.String optString2 = optJSONObject.optString("deviceId");
                    if (optString2 == null || optString2.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doDelete, wechatToken is empty");
                        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                        try {
                            jSONObject7.put("errno", 101);
                        } catch (java.lang.Exception e29) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                        }
                        yVar.a(i17, u(str2, jSONObject7));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo48798x74292566);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    uVar.a(mo48798x74292566, optString2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.w(yVar, i17, this));
                    return;
                }
                return;
            }
            if (hashCode == -1249367445) {
                if (optString.equals("getAll")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.x(this, yVar, i17));
                    return;
                }
                return;
            }
            if (hashCode == 113762 && optString.equals("set")) {
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (optJSONObject2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, innerData is null");
                    java.lang.String str12 = android.text.TextUtils.isEmpty(null) ? str : null;
                    str2 = str12 != null ? str12 : "";
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                    try {
                        jSONObject8.put("errno", 101);
                    } catch (java.lang.Exception e37) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
                    }
                    yVar.a(i17, u(str2, jSONObject8));
                    return;
                }
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("monitoredDeviceInfo");
                if (optJSONObject3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, deviceInfoJsonObj is null");
                    java.lang.String str14 = android.text.TextUtils.isEmpty(null) ? str : null;
                    str2 = str14 != null ? str14 : "";
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                    try {
                        jSONObject9.put("errno", 101);
                    } catch (java.lang.Exception e38) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
                    }
                    yVar.a(i17, u(str2, jSONObject9));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59 c11858x835ced59 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11858x835ced59();
                try {
                    c11858x835ced59.f65990x28d45f97 = optJSONObject3.getString("appid");
                    c11858x835ced59.f65991x19e082da = optJSONObject3.getString("bluetoothDeviceId");
                    c11858x835ced59.f65996x62fb9eae = optJSONObject3.getString("deviceId");
                    c11858x835ced59.f65995x94d24c6d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(optJSONObject3.optString("envVersion"), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE).f163727d;
                    c11858x835ced59.f65992x13d36e99 = optJSONObject3.optString("entryPackage");
                } catch (java.lang.Exception e39) {
                    t91.a.f498100a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfo", "fromJson fail since " + e39);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
                if (t37 == null || (E0 = t37.E0()) == null || (c11667xc7e59dd6 = E0.f387385r) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, curVersionType is null");
                    java.lang.String str16 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str16 != null ? str16 : "";
                    java.lang.String str17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                    try {
                        jSONObject10.put("errno", 4);
                    } catch (java.lang.Exception e47) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
                    }
                    yVar.a(i17, u(str2, jSONObject10));
                    return;
                }
                int i18 = c11667xc7e59dd6.f156932d;
                if (1 == i18 || 2 == i18) {
                    z17 = false;
                } else {
                    z17 = false;
                    c11858x835ced59.f65995x94d24c6d = 0;
                }
                java.lang.String mo48798x742925662 = yVar.mo48798x74292566();
                if ((mo48798x742925662 == null || mo48798x742925662.length() == 0) ? true : z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, appId is empty");
                    java.lang.String str18 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str18 != null ? str18 : "";
                    java.lang.String str19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                    try {
                        jSONObject11.put("errno", 4);
                    } catch (java.lang.Exception e48) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e48);
                    }
                    yVar.a(i17, u(str2, jSONObject11));
                    return;
                }
                c11858x835ced59.f65990x28d45f97 = mo48798x742925662;
                if (c11858x835ced59.m50225x7b953cf2()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u.f159492a.c(c11858x835ced59, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.y(yVar, i17, this));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, deviceInfo is invalid");
                java.lang.String str20 = android.text.TextUtils.isEmpty(null) ? str : null;
                str2 = str20 != null ? str20 : "";
                java.lang.String str21 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject12 = new org.json.JSONObject();
                try {
                    jSONObject12.put("errno", 101);
                } catch (java.lang.Exception e49) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e49);
                }
                yVar.a(i17, u(str2, jSONObject12));
            }
        }
    }
}
