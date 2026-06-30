package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class sb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34741x366c91de = 1556;

    /* renamed from: NAME */
    private static final java.lang.String f34742x24728b = "privateOpenServiceNotifyChat";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "invoke ", data);
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "privateOpenServiceNotifyChat fail, env is null");
            return;
        }
        java.lang.String optString = data.optString(dm.i4.f66875xa013b0d5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "privateOpenServiceNotifyChat fail, username is empty");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject));
            return;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPrivateOpenServiceNotifyChat", "privateOpenServiceNotifyChat fail, is not AppBrandContact");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        android.content.Context f229340d = c0Var.getF229340d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KOpenArticleSceneFromScene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de);
        intent.putExtra("specific_chat_from_scene", 17);
        intent.putExtra("Chat_User", "notifymessage");
        intent.putExtra("key_notify_message_real_username", optString);
        intent.putExtra("Chat_Mode", 1);
        intent.putExtra("container_enter_scene", 3);
        intent.putExtra("finish_direct", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, f229340d);
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var.a(i17, u(str, jSONObject3));
    }
}
