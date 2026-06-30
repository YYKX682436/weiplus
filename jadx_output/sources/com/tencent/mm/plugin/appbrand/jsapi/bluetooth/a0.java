package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class a0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1064;
    private static final java.lang.String NAME = "setBluetoothBackgroundMode";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, service is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(yVar.getAppId());
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, may not open ble");
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
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, may not open ble background");
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
        if (jSONObject == null || !jSONObject.has("enable")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, data is illegal, data: " + jSONObject);
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
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
        try {
            boolean z17 = jSONObject.getBoolean("enable");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, enable: " + z17);
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
            if (runtime == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, runtime is null");
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                str2 = str != null ? str : "";
                java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                try {
                    jSONObject5.put("errno", 4);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                yVar.a(i17, u(str2, jSONObject5));
                return;
            }
            if (!z17) {
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h hVar = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b;
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = hVar.c(runtime);
                if (c17 != null) {
                    c17.Fd(true);
                }
                hVar.b(runtime);
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                try {
                    jSONObject6.put("errno", 0);
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                }
                yVar.a(i17, u(str2, jSONObject6));
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s a17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.a(runtime);
            try {
                a17.v4();
                try {
                    a17.y();
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                    try {
                        jSONObject7.put("errno", 0);
                    } catch (java.lang.Exception e29) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                    }
                    yVar.a(i17, u(str2, jSONObject7));
                } catch (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j e37) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, enable fail since " + e37);
                    yVar.a(i17, r(e37.f80078e, e37.f80077d, null));
                }
            } catch (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j e38) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, checkCanIEnable fail since " + e38);
                yVar.a(i17, r(e38.f80078e, e38.f80077d, null));
            }
        } catch (org.json.JSONException e39) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, parse data fail since " + e39);
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            try {
                jSONObject8.put("errno", 101);
            } catch (java.lang.Exception e47) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
            }
            yVar.a(i17, u(str2, jSONObject8));
        }
    }
}
