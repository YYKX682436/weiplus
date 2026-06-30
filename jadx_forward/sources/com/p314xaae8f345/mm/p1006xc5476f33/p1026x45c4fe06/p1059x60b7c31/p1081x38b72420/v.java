package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes12.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34065x366c91de = 195;

    /* renamed from: NAME */
    public static final java.lang.String f34066x24728b = "chooseWeChatContact";

    /* renamed from: g, reason: collision with root package name */
    public final int f162148g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact context is null, appId is %s", e9Var.mo48798x74292566());
            e9Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact appId:%s", e9Var.mo48798x74292566());
        android.content.Intent intent = new android.content.Intent();
        java.lang.String string = Z0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4o);
        int[] iArr = {131072, 131075};
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact data %s:", jSONObject);
        if (jSONObject != null && jSONObject.optJSONArray("contactMode") != null && jSONObject.optJSONArray("contactMode").length() > 0) {
            java.lang.String jSONArray = jSONObject.optJSONArray("contactMode").toString();
            if (jSONArray.contains("singleContact") && !jSONArray.contains("chatroom")) {
                string = Z0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4n);
                iArr = new int[]{131072};
                i18 = 263;
            } else if (jSONArray.contains("chatroom") && !jSONArray.contains("singleContact")) {
                iArr = new int[]{131075};
                i18 = com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd;
            }
            intent.putExtra("Select_Conv_Type", i18);
            intent.putExtra("jsapi_select_mode", 1);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("scene_from", 9);
            intent.putExtra("Select_Conv_ui_title", string);
            intent.putExtra("search_range", iArr);
            intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12067x4933c05e c12067x4933c05e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12067x4933c05e("");
            c12067x4933c05e.s();
            intent.putExtra("Select_block_List", c12067x4933c05e.f162022f);
            nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.t(this, e9Var, i17));
            j45.l.v(Z0, ".ui.transmit.SelectConversationUI", intent, this.f162148g);
        }
        i18 = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4;
        intent.putExtra("Select_Conv_Type", i18);
        intent.putExtra("jsapi_select_mode", 1);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 9);
        intent.putExtra("Select_Conv_ui_title", string);
        intent.putExtra("search_range", iArr);
        intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12067x4933c05e c12067x4933c05e2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12067x4933c05e("");
        c12067x4933c05e2.s();
        intent.putExtra("Select_block_List", c12067x4933c05e2.f162022f);
        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.t(this, e9Var, i17));
        j45.l.v(Z0, ".ui.transmit.SelectConversationUI", intent, this.f162148g);
    }
}
