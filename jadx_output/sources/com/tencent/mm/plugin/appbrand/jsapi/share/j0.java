package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class j0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1454;
    private static final java.lang.String NAME = "shareEmojiMessage";

    /* renamed from: g, reason: collision with root package name */
    public final int f83164g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.modelmulti.WxaInfo wxaInfo;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage data: " + jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage fail, data is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        java.lang.String optString = jSONObject.optString("imagePath", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage fail, imagePath is fail");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str2, jSONObject3));
            return;
        }
        j91.d dVar = (j91.d) e9Var.getRuntime().K1(j91.d.class);
        java.lang.String optString2 = jSONObject.optString("chatToolMode", "");
        boolean optBoolean = jSONObject.optBoolean("useForChatTool", false);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = "";
        if (dVar != null) {
            kotlin.jvm.internal.o.d(optString2);
            if (!j91.c.a(optString2)) {
                h0Var.f310123d = optBoolean ? ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).d() : "";
                h0Var2.f310123d = optBoolean ? ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).c() : "";
            } else {
                if (kotlin.jvm.internal.o.b(optString2, "allPage") && !((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).o(jSONObject)) {
                    str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 101);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    e9Var.a(i17, u(str2, jSONObject4));
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
                h0Var.f310123d = tVar.d();
                h0Var2.f310123d = tVar.c();
            }
        }
        boolean optBoolean2 = jSONObject.optBoolean("needShowEntrance", true);
        java.lang.String optString3 = jSONObject.optString("entrancePath", "");
        if (optBoolean2) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = e9Var.getRuntime();
            kotlin.jvm.internal.o.f(runtime, "getRuntime(...)");
            kotlin.jvm.internal.o.d(optString3);
            wxaInfo = com.tencent.mm.plugin.appbrand.jsapi.share.o2.a(runtime, optString3);
        } else {
            wxaInfo = null;
        }
        kotlin.jvm.internal.o.d(optString);
        com.tencent.mm.plugin.appbrand.utils.o5.b(e9Var, optString, null, new com.tencent.mm.plugin.appbrand.jsapi.share.i0(e9Var, i17, this, wxaInfo, h0Var2, h0Var));
    }
}
