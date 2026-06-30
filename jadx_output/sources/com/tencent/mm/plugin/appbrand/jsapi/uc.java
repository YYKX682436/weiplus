package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class uc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1155;
    public static final java.lang.String NAME = "rtosWatchQuickReply";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        java.util.Objects.toString(jSONObject);
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("action")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "save quick reply.");
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject != null ? jSONObject.toString() : null), com.tencent.mm.plugin.appbrand.jsapi.tc.class);
            if (iPCString == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke save fail.");
                if (d0Var != null) {
                    android.text.TextUtils.isEmpty("fail");
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", -1);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    d0Var.a(i17, u("fail", jSONObject2));
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke save ok.");
            if (d0Var != null) {
                java.lang.String iPCString2 = iPCString.toString();
                java.lang.String str2 = iPCString.f68406d;
                if (android.text.TextUtils.isEmpty(iPCString2)) {
                    iPCString2 = str2;
                }
                if (iPCString2 == null) {
                    iPCString2 = "";
                }
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                d0Var.a(i17, u(iPCString2, jSONObject3));
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRtosWatchQuickReply", "unknown_action.");
            if (d0Var != null) {
                android.text.TextUtils.isEmpty("fail");
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", -1);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                d0Var.a(i17, u("fail", jSONObject4));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "get quick reply.");
        com.tencent.mm.ipcinvoker.type.IPCString iPCString3 = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.jsapi.sc.class);
        if (iPCString3 == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString3.f68406d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke get replyList fail");
            if (d0Var != null) {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                android.text.TextUtils.isEmpty("fail");
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    jSONObject5.put("errno", -1);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                d0Var.a(i17, u("fail", jSONObject5));
                return;
            }
            return;
        }
        try {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("replyList", new org.json.JSONArray(iPCString3.toString()));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRtosWatchQuickReply", "invoke get replyList ok.");
            if (d0Var != null) {
                android.text.TextUtils.isEmpty("ok");
                java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    jSONObject6.put("errno", 0);
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                }
                d0Var.a(i17, u("ok", jSONObject6));
            }
        } catch (java.lang.Exception e29) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiRtosWatchQuickReply", e29, "invoke get replyList fail.", new java.lang.Object[0]);
            if (d0Var != null) {
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                java.lang.String str7 = android.text.TextUtils.isEmpty("fail") ? "decode json fail" : "fail";
                java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    jSONObject7.put("errno", -1);
                } catch (java.lang.Exception e37) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
                }
                d0Var.a(i17, u(str7, jSONObject7));
            }
        }
    }
}
