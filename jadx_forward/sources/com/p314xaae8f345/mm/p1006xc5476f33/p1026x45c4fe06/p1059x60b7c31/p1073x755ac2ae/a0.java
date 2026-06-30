package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public final class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33956x366c91de = 1064;

    /* renamed from: NAME */
    private static final java.lang.String f33957x24728b = "setBluetoothBackgroundMode";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, service is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.b.b(yVar.mo48798x74292566());
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, may not open ble");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, may not open ble background");
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
        if (jSONObject == null || !jSONObject.has("enable")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, data is illegal, data: " + jSONObject);
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
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
        try {
            boolean z17 = jSONObject.getBoolean("enable");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, enable: " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2();
            if (mo32091x9a3f0ba2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, runtime is null");
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                str2 = str != null ? str : "";
                java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                try {
                    jSONObject5.put("errno", 4);
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                yVar.a(i17, u(str2, jSONObject5));
                return;
            }
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s c17 = hVar.c(mo32091x9a3f0ba2);
                if (c17 != null) {
                    c17.Fd(true);
                }
                hVar.b(mo32091x9a3f0ba2);
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                try {
                    jSONObject6.put("errno", 0);
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                }
                yVar.a(i17, u(str2, jSONObject6));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.a(mo32091x9a3f0ba2);
            try {
                a17.v4();
                try {
                    a17.y();
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                    try {
                        jSONObject7.put("errno", 0);
                    } catch (java.lang.Exception e29) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                    }
                    yVar.a(i17, u(str2, jSONObject7));
                } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.j e37) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, enable fail since " + e37);
                    yVar.a(i17, r(e37.f161611e, e37.f161610d, null));
                }
            } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.j e38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, checkCanIEnable fail since " + e38);
                yVar.a(i17, r(e38.f161611e, e38.f161610d, null));
            }
        } catch (org.json.JSONException e39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, parse data fail since " + e39);
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            try {
                jSONObject8.put("errno", 101);
            } catch (java.lang.Exception e47) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
            }
            yVar.a(i17, u(str2, jSONObject8));
        }
    }
}
