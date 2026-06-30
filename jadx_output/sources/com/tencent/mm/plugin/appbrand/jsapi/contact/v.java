package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes12.dex */
public final class v extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 195;
    public static final java.lang.String NAME = "chooseWeChatContact";

    /* renamed from: g, reason: collision with root package name */
    public final int f80615g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact context is null, appId is %s", e9Var.getAppId());
            e9Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact appId:%s", e9Var.getAppId());
        android.content.Intent intent = new android.content.Intent();
        java.lang.String string = Z0.getString(com.tencent.mm.R.string.a4o);
        int[] iArr = {131072, 131075};
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact data %s:", jSONObject);
        if (jSONObject != null && jSONObject.optJSONArray("contactMode") != null && jSONObject.optJSONArray("contactMode").length() > 0) {
            java.lang.String jSONArray = jSONObject.optJSONArray("contactMode").toString();
            if (jSONArray.contains("singleContact") && !jSONArray.contains("chatroom")) {
                string = Z0.getString(com.tencent.mm.R.string.a4n);
                iArr = new int[]{131072};
                i18 = 263;
            } else if (jSONArray.contains("chatroom") && !jSONArray.contains("singleContact")) {
                iArr = new int[]{131075};
                i18 = com.tencent.mars.cdn.CdnManager.kAppTypeTingImage;
            }
            intent.putExtra("Select_Conv_Type", i18);
            intent.putExtra("jsapi_select_mode", 1);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("scene_from", 9);
            intent.putExtra("Select_Conv_ui_title", string);
            intent.putExtra("search_range", iArr);
            intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
            com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask jsApiChooseWeChatContact$GetUserDataTask = new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask("");
            jsApiChooseWeChatContact$GetUserDataTask.s();
            intent.putExtra("Select_block_List", jsApiChooseWeChatContact$GetUserDataTask.f80489f);
            nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.contact.t(this, e9Var, i17));
            j45.l.v(Z0, ".ui.transmit.SelectConversationUI", intent, this.f80615g);
        }
        i18 = com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE;
        intent.putExtra("Select_Conv_Type", i18);
        intent.putExtra("jsapi_select_mode", 1);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 9);
        intent.putExtra("Select_Conv_ui_title", string);
        intent.putExtra("search_range", iArr);
        intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask jsApiChooseWeChatContact$GetUserDataTask2 = new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask("");
        jsApiChooseWeChatContact$GetUserDataTask2.s();
        intent.putExtra("Select_block_List", jsApiChooseWeChatContact$GetUserDataTask2.f80489f);
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.contact.t(this, e9Var, i17));
        j45.l.v(Z0, ".ui.transmit.SelectConversationUI", intent, this.f80615g);
    }
}
