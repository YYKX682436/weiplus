package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class e1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1453;
    private static final java.lang.String NAME = "shareTextMessage";

    /* renamed from: g, reason: collision with root package name */
    public final int f83129g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiShareTextToGroup", "shareTextMessage data: " + jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiShareTextToGroup", "shareTextMessage fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiShareTextToGroup", "shareTextMessage fail, data is null");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str4, jSONObject2));
            return;
        }
        android.content.Context f147807d = e9Var.getF147807d();
        if (f147807d == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiShareTextToGroup", "shareTextMessage fail, context is null");
            java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str4 = str6 != null ? str6 : "";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str4, jSONObject3));
            return;
        }
        j91.d dVar = (j91.d) e9Var.getRuntime().K1(j91.d.class);
        java.lang.String optString = jSONObject.optString("chatToolMode", "");
        boolean optBoolean = jSONObject.optBoolean("useForChatTool", false);
        if (dVar != null) {
            kotlin.jvm.internal.o.d(optString);
            if (!j91.c.a(optString)) {
                str2 = optBoolean ? ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).d() : "";
                str = optBoolean ? ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).c() : "";
            } else {
                if (kotlin.jvm.internal.o.b(optString, "allPage") && !((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).o(jSONObject)) {
                    str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                    str4 = str3 != null ? str3 : "";
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 101);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    e9Var.a(i17, u(str4, jSONObject4));
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
                str2 = tVar.d();
                str = tVar.c();
                optBoolean = true;
            }
        } else {
            str = "";
            str2 = str;
        }
        java.lang.String optString2 = jSONObject.optString("content", "");
        boolean optBoolean2 = jSONObject.optBoolean("needShowEntrance", true);
        java.lang.String optString3 = jSONObject.optString("entrancePath", "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("scene_from", 22);
        intent.putExtra("Select_Conv_User", str2);
        intent.putExtra("kWeAppSourceUsername", str);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("KSendWording", f147807d.getString(com.tencent.mm.R.string.a4x));
        intent.putExtra("custom_send_text", optString2);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (optBoolean2) {
            p15.x xVar = new p15.x();
            xVar.p(e9Var.getAppId());
            xVar.q(optString3);
            xVar.w(1);
            xVar.t(cf.c.a(e9Var).f77280f);
            xVar.u(cf.c.a(e9Var).f77279e);
            xVar.x(cf.c.a(e9Var).f77281g);
            hashMap.put("wxaInfo", xVar.toXml());
        }
        hashMap.put("useForChatTool", java.lang.Boolean.valueOf(optBoolean));
        hashMap.put("needShowEntrance", java.lang.Boolean.valueOf(optBoolean2));
        if (e9Var.getRuntime().u0() instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = e9Var.getRuntime().u0();
            kotlin.jvm.internal.o.e(u07, "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU");
            hashMap.put("srcUsername", ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) u07).f47278x);
        }
        intent.putExtra("appbrand_params", hashMap);
        intent.putExtra("Retr_Msg_Type", 4);
        nf.g.a(f147807d).f(new com.tencent.mm.plugin.appbrand.jsapi.share.d1(this, f147807d, e9Var, i17));
        j45.l.v(f147807d, ".ui.transmit.SelectConversationDirectSelectUI", intent, this.f83129g);
    }
}
