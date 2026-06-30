package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class e0 extends com.tencent.mm.plugin.appbrand.jsapi.share.l {
    public static final int CTRL_INDEX = 589;
    public static final java.lang.String NAME = "shareAppMessageForFakeNative";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public com.tencent.mm.plugin.appbrand.jsapi.share.u C() {
        return new com.tencent.mm.plugin.appbrand.jsapi.share.d0();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public void D(android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageForFakeNative", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, forbid");
        intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public void E(android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        super.E(intent, (com.tencent.mm.plugin.appbrand.jsapi.share.d0) uVar);
        intent.putExtra("select_is_ret", false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public void G(com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        com.tencent.mm.plugin.appbrand.jsapi.share.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.share.d0) uVar;
        super.G(sendAppMessageTask, str, str2, z17, c0Var, d0Var);
        if (sendAppMessageTask.B == 1) {
            sendAppMessageTask.B = 2;
            sendAppMessageTask.C = d0Var.Q;
            sendAppMessageTask.A = d0Var.R;
        }
        sendAppMessageTask.D = d0Var.S;
        sendAppMessageTask.E = d0Var.T;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public java.util.Map H(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, java.lang.String str) {
        java.util.Map H = super.H((com.tencent.mm.plugin.appbrand.jsapi.share.d0) uVar, sendAppMessageTask, str);
        if (H == null) {
            H = new java.util.HashMap(1);
        }
        H.put("shareUsrs", com.tencent.mm.sdk.platformtools.t8.P1(str.split(",")));
        return H;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.jsapi.share.d0 F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.share.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.share.d0) super.F(c0Var, jSONObject);
        int optInt = jSONObject.optInt("bizType", 2);
        d0Var.Q = optInt;
        if (!ot0.o.b(optInt)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageForFakeNative", "share app message fail, biz is invalid.");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("biz is invalid");
        }
        java.lang.String optString = jSONObject.optString("defaultHintUrl");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = com.tencent.mm.plugin.appbrand.v9.b(c0Var.getAppId());
        }
        d0Var.A = optString;
        d0Var.R = jSONObject.optString("tailLang", "");
        d0Var.S = jSONObject.optString("bizSourceName", "");
        d0Var.T = jSONObject.optString("bizSourceIconUrl", "");
        d0Var.I.put("biz", java.lang.Integer.valueOf(d0Var.Q));
        d0Var.I.put("tail_lang", d0Var.R);
        d0Var.I.put("icon_url", d0Var.f83257c.f305843f);
        d0Var.I.put("nickname", d0Var.f83257c.f305841d);
        return d0Var;
    }
}
