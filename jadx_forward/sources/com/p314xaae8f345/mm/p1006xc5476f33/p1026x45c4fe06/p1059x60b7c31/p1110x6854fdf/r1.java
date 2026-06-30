package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class r1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34829x366c91de = 464;

    /* renamed from: NAME */
    public static final java.lang.String f34830x24728b = "updateShareMenuUpdatable";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 H1 = V0.H1(3);
        if (H1 == null) {
            e9Var.a(i17, o("fail:menu item do not exist"));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("updatable", false);
        java.lang.String optString = jSONObject.optString("templateId", "");
        boolean optBoolean2 = jSONObject.optBoolean("isPrivateMessage", false);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(optBoolean);
        c01.l2 l2Var = H1.f167529d;
        l2Var.i("enable_share_with_updateable_msg", valueOf);
        l2Var.i("enable_share_with_updateable_msg_template_id", optString);
        l2Var.i("enable_share_with_private_msg", java.lang.Boolean.valueOf(optBoolean2));
        boolean optBoolean3 = jSONObject.optBoolean("useForChatTool", false);
        java.lang.String optString2 = jSONObject.optString("participant", "");
        int optInt = jSONObject.optInt("chooseType", 1);
        l2Var.i("share_useForChatTool", java.lang.Boolean.valueOf(optBoolean3));
        l2Var.i("share_participant", optString2);
        l2Var.i("share_choose_type", java.lang.Integer.valueOf(optInt));
        e9Var.a(i17, o("ok"));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateShareMenuUpdatable", "updateShareMenuUpdatable %s", jSONObject);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateShareMenuUpdatable", "update share menu updatable(%s) isPrivateMessage(%s)", java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2));
    }
}
