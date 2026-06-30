package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class sb extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1556;
    private static final java.lang.String NAME = "privateOpenServiceNotifyChat";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "invoke ", data);
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "privateOpenServiceNotifyChat fail, env is null");
            return;
        }
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "privateOpenServiceNotifyChat fail, username is empty");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject));
            return;
        }
        if (!com.tencent.mm.storage.z3.z3(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "privateOpenServiceNotifyChat fail, is not AppBrandContact");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        android.content.Context f147807d = c0Var.getF147807d();
        kotlin.jvm.internal.o.f(f147807d, "getContext(...)");
        kotlin.jvm.internal.o.d(optString);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KOpenArticleSceneFromScene", com.tencent.mm.plugin.appbrand.jsapi.xe.CTRL_INDEX);
        intent.putExtra("specific_chat_from_scene", 17);
        intent.putExtra("Chat_User", "notifymessage");
        intent.putExtra("key_notify_message_real_username", optString);
        intent.putExtra("Chat_Mode", 1);
        intent.putExtra("container_enter_scene", 3);
        intent.putExtra("finish_direct", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, f147807d);
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var.a(i17, u(str, jSONObject3));
    }
}
