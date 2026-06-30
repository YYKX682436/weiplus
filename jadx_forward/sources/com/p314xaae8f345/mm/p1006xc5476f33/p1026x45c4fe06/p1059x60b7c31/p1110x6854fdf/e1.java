package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34793x366c91de = 1453;

    /* renamed from: NAME */
    private static final java.lang.String f34794x24728b = "shareTextMessage";

    /* renamed from: g, reason: collision with root package name */
    public final int f164662g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiShareTextToGroup", "shareTextMessage data: " + jSONObject);
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiShareTextToGroup", "shareTextMessage fail, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiShareTextToGroup", "shareTextMessage fail, data is null");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str4, jSONObject2));
            return;
        }
        android.content.Context f229340d = e9Var.getF229340d();
        if (f229340d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiShareTextToGroup", "shareTextMessage fail, context is null");
            java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str4 = str6 != null ? str6 : "";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str4, jSONObject3));
            return;
        }
        j91.d dVar = (j91.d) e9Var.mo32091x9a3f0ba2().K1(j91.d.class);
        java.lang.String optString = jSONObject.optString("chatToolMode", "");
        boolean optBoolean = jSONObject.optBoolean("useForChatTool", false);
        if (dVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!j91.c.a(optString)) {
                str2 = optBoolean ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).d() : "";
                str = optBoolean ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).c() : "";
            } else {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "allPage") && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar).o(jSONObject)) {
                    str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                    str4 = str3 != null ? str3 : "";
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 101);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    e9Var.a(i17, u(str4, jSONObject4));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
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
        intent.putExtra("KSendWording", f229340d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4x));
        intent.putExtra("custom_send_text", optString2);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (optBoolean2) {
            p15.x xVar = new p15.x();
            xVar.p(e9Var.mo48798x74292566());
            xVar.q(optString3);
            xVar.w(1);
            xVar.t(cf.c.a(e9Var).f158813f);
            xVar.u(cf.c.a(e9Var).f158812e);
            xVar.x(cf.c.a(e9Var).f158814g);
            hashMap.put("wxaInfo", xVar.m126747x696739c());
        }
        hashMap.put("useForChatTool", java.lang.Boolean.valueOf(optBoolean));
        hashMap.put("needShowEntrance", java.lang.Boolean.valueOf(optBoolean2));
        if (e9Var.mo32091x9a3f0ba2().u0() instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = e9Var.mo32091x9a3f0ba2().u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(u07, "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU");
            hashMap.put("srcUsername", ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) u07).f128811x);
        }
        intent.putExtra("appbrand_params", hashMap);
        intent.putExtra("Retr_Msg_Type", 4);
        nf.g.a(f229340d).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d1(this, f229340d, e9Var, i17));
        j45.l.v(f229340d, ".ui.transmit.SelectConversationDirectSelectUI", intent, this.f164662g);
    }
}
