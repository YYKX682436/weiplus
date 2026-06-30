package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class m0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1531;
    public static final java.lang.String NAME = "openWCPaySpecificView";

    public static final void C(com.tencent.mm.plugin.appbrand.jsapi.pay.m0 m0Var, android.os.Bundle bundle, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        jz5.f0 f0Var;
        m0Var.getClass();
        if (c0Var == null) {
            return;
        }
        if (bundle != null) {
            java.lang.String string = bundle.getString("callbackSource");
            if (!com.tencent.mm.sdk.platformtools.t8.D0(string, "paySettingsUseCase") && !com.tencent.mm.sdk.platformtools.t8.D0(string, "paySecurity")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke kinda callback source is not valid");
            } else if (bundle.getBoolean("result")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke " + string + " callback ok");
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i17, m0Var.u(str, jSONObject));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke " + string + " callback fail");
                java.lang.String string2 = bundle.getString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
                if (string2 == null) {
                    string2 = "unknown error";
                }
                java.lang.String concat = "fail:".concat(string2);
                if (!android.text.TextUtils.isEmpty(null)) {
                    concat = null;
                }
                if (concat == null) {
                    concat = "";
                }
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", -1);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                c0Var.a(i17, m0Var.u(concat, jSONObject2));
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke kinda callback data is null");
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "fail:paySecurity callback is invalid" : null;
            java.lang.String str5 = str4 != null ? str4 : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", -1);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            c0Var.a(i17, m0Var.u(str5, jSONObject3));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        jz5.f0 f0Var;
        java.lang.String str2;
        jz5.f0 f0Var2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke: " + jSONObject);
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke data is null");
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject2));
            return;
        }
        java.lang.String optString = jSONObject.optString("openView");
        if (optString != null) {
            boolean contains = com.tencent.mm.plugin.appbrand.jsapi.pay.n0.f82636a.contains(optString);
            f0Var = jz5.f0.f302826a;
            if (contains) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke openView is: " + optString + ", start paySettingsUseCase");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("useCaseUrl", "paySettingsUseCase");
                bundle.putBoolean("startFromOpenSpecificView", true);
                bundle.putString("openView", optString);
                uk0.a.b(bundle, new com.tencent.mm.plugin.appbrand.jsapi.pay.j0(), new com.tencent.mm.plugin.appbrand.jsapi.pay.k0(this, c0Var, i17));
                str = "fail:jsapi invalid request data";
            } else {
                str = "fail:jsapi invalid request data";
                if (com.tencent.mm.plugin.appbrand.jsapi.pay.n0.f82637b.contains(optString)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke openView is: " + optString + ", start paySecurity");
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("useCaseUrl", "paySecurity");
                    bundle2.putInt("entryScene", 0);
                    bundle2.putBoolean("startFromOpenSpecificView", true);
                    bundle2.putString("openView", optString);
                    uk0.a.b(bundle2, new com.tencent.mm.plugin.appbrand.jsapi.pay.j0(), new com.tencent.mm.plugin.appbrand.jsapi.pay.l0(this, c0Var, i17));
                } else if (com.tencent.mm.sdk.platformtools.t8.D0(optString, "groupPayIntroView")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke openView is: " + optString + ", start payGroupPayIntro");
                    android.app.Activity Z0 = c0Var.Z0();
                    if (Z0 != null) {
                        j45.l.j(Z0, "aa", ".ui.AAEntranceUI", new android.content.Intent(), null);
                        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        java.lang.String str6 = str5 == null ? "" : str5;
                        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        try {
                            jSONObject3.put("errno", 0);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        c0Var.a(i17, u(str6, jSONObject3));
                        f0Var2 = f0Var;
                    } else {
                        f0Var2 = null;
                    }
                    if (f0Var2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "mmActivity is null, invoke fail!");
                        java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:activity is null" : null;
                        java.lang.String str9 = str8 == null ? "" : str8;
                        java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        try {
                            jSONObject4.put("errno", -1);
                        } catch (java.lang.Exception e19) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                        }
                        c0Var.a(i17, u(str9, jSONObject4));
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke openView is not valid");
                    java.lang.String str11 = android.text.TextUtils.isEmpty(null) ? str : null;
                    if (str11 == null) {
                        str11 = "";
                    }
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    try {
                        jSONObject5.put("errno", 101);
                    } catch (java.lang.Exception e27) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                    }
                    c0Var.a(i17, u(str11, jSONObject5));
                }
            }
        } else {
            str = "fail:jsapi invalid request data";
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "OpenWCPaySpecificView invoke openView is null");
            java.lang.String str13 = android.text.TextUtils.isEmpty(null) ? str : null;
            str2 = str13 != null ? str13 : "";
            java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("errno", 101);
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
            }
            c0Var.a(i17, u(str2, jSONObject6));
        }
    }
}
