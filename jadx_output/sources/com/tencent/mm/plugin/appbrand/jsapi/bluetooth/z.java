package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class z extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1089;
    public static final java.lang.String NAME = "operateGlobalMonitoredBluetoothDevice";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        k91.z0 E0;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        boolean z17;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(yVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, may not open ble");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:not init" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1500101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (!b17.f80057e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, may not open ble background");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:not init" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1500101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            yVar.a(i17, u(str2, jSONObject3));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, data: " + jSONObject);
        if (jSONObject == null) {
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
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
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    if (optJSONObject == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, innerData is null");
                        java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? str : null;
                        str2 = str7 != null ? str7 : "";
                        java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        try {
                            jSONObject5.put("errno", 101);
                        } catch (java.lang.Exception e27) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                        }
                        yVar.a(i17, u(str2, jSONObject5));
                        return;
                    }
                    java.lang.String appId = yVar.getAppId();
                    if (appId == null || appId.length() == 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doDelete, appId is empty");
                        java.lang.String str9 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                        str2 = str9 != null ? str9 : "";
                        java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                        try {
                            jSONObject6.put("errno", 4);
                        } catch (java.lang.Exception e28) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                        }
                        yVar.a(i17, u(str2, jSONObject6));
                        return;
                    }
                    java.lang.String optString2 = optJSONObject.optString("deviceId");
                    if (optString2 == null || optString2.length() == 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doDelete, wechatToken is empty");
                        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                        try {
                            jSONObject7.put("errno", 101);
                        } catch (java.lang.Exception e29) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                        }
                        yVar.a(i17, u(str2, jSONObject7));
                    }
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u uVar = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a;
                    kotlin.jvm.internal.o.d(appId);
                    kotlin.jvm.internal.o.d(optString2);
                    uVar.a(appId, optString2, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w(yVar, i17, this));
                    return;
                }
                return;
            }
            if (hashCode == -1249367445) {
                if (optString.equals("getAll")) {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.x(this, yVar, i17));
                    return;
                }
                return;
            }
            if (hashCode == 113762 && optString.equals("set")) {
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (optJSONObject2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, innerData is null");
                    java.lang.String str12 = android.text.TextUtils.isEmpty(null) ? str : null;
                    str2 = str12 != null ? str12 : "";
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                    try {
                        jSONObject8.put("errno", 101);
                    } catch (java.lang.Exception e37) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
                    }
                    yVar.a(i17, u(str2, jSONObject8));
                    return;
                }
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("monitoredDeviceInfo");
                if (optJSONObject3 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, deviceInfoJsonObj is null");
                    java.lang.String str14 = android.text.TextUtils.isEmpty(null) ? str : null;
                    str2 = str14 != null ? str14 : "";
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                    try {
                        jSONObject9.put("errno", 101);
                    } catch (java.lang.Exception e38) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
                    }
                    yVar.a(i17, u(str2, jSONObject9));
                    return;
                }
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
                try {
                    monitoredBluetoothDeviceInfo.field_appId = optJSONObject3.getString("appid");
                    monitoredBluetoothDeviceInfo.field_bluetoothDeviceId = optJSONObject3.getString("bluetoothDeviceId");
                    monitoredBluetoothDeviceInfo.field_wechatToken = optJSONObject3.getString("deviceId");
                    monitoredBluetoothDeviceInfo.field_versionType = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(optJSONObject3.optString("envVersion"), com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE).f82194d;
                    monitoredBluetoothDeviceInfo.field_entryPackage = optJSONObject3.optString("entryPackage");
                } catch (java.lang.Exception e39) {
                    t91.a.f416567a.b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfo", "fromJson fail since " + e39);
                }
                com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
                if (t37 == null || (E0 = t37.E0()) == null || (wxaPkgWrappingInfo = E0.f305852r) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, curVersionType is null");
                    java.lang.String str16 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str16 != null ? str16 : "";
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                    try {
                        jSONObject10.put("errno", 4);
                    } catch (java.lang.Exception e47) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
                    }
                    yVar.a(i17, u(str2, jSONObject10));
                    return;
                }
                int i18 = wxaPkgWrappingInfo.f75399d;
                if (1 == i18 || 2 == i18) {
                    z17 = false;
                } else {
                    z17 = false;
                    monitoredBluetoothDeviceInfo.field_versionType = 0;
                }
                java.lang.String appId2 = yVar.getAppId();
                if ((appId2 == null || appId2.length() == 0) ? true : z17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, appId is empty");
                    java.lang.String str18 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str18 != null ? str18 : "";
                    java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                    try {
                        jSONObject11.put("errno", 4);
                    } catch (java.lang.Exception e48) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e48);
                    }
                    yVar.a(i17, u(str2, jSONObject11));
                    return;
                }
                monitoredBluetoothDeviceInfo.field_appId = appId2;
                if (monitoredBluetoothDeviceInfo.isValid()) {
                    com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a.c(monitoredBluetoothDeviceInfo, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.y(yVar, i17, this));
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, deviceInfo is invalid");
                java.lang.String str20 = android.text.TextUtils.isEmpty(null) ? str : null;
                str2 = str20 != null ? str20 : "";
                java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject12 = new org.json.JSONObject();
                try {
                    jSONObject12.put("errno", 101);
                } catch (java.lang.Exception e49) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e49);
                }
                yVar.a(i17, u(str2, jSONObject12));
            }
        }
    }
}
