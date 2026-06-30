package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l {

    /* renamed from: CTRL_INDEX */
    public static final int f34791x366c91de = 589;

    /* renamed from: NAME */
    public static final java.lang.String f34792x24728b = "shareAppMessageForFakeNative";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u C() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public void D(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageForFakeNative", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, forbid");
        intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public void E(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        super.E(intent, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0) uVar);
        intent.putExtra("select_is_ret", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0) uVar;
        super.G(c12236xd46e1713, str, str2, z17, c0Var, d0Var);
        if (c12236xd46e1713.B == 1) {
            c12236xd46e1713.B = 2;
            c12236xd46e1713.C = d0Var.Q;
            c12236xd46e1713.A = d0Var.R;
        }
        c12236xd46e1713.D = d0Var.S;
        c12236xd46e1713.E = d0Var.T;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public java.util.Map H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, java.lang.String str) {
        java.util.Map H = super.H((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0) uVar, c12236xd46e1713, str);
        if (H == null) {
            H = new java.util.HashMap(1);
        }
        H.put("shareUsrs", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(",")));
        return H;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0 F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0) super.F(c0Var, jSONObject);
        int optInt = jSONObject.optInt("bizType", 2);
        d0Var.Q = optInt;
        if (!ot0.o.b(optInt)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageForFakeNative", "share app message fail, biz is invalid.");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("biz is invalid");
        }
        java.lang.String optString = jSONObject.optString("defaultHintUrl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.b(c0Var.mo48798x74292566());
        }
        d0Var.A = optString;
        d0Var.R = jSONObject.optString("tailLang", "");
        d0Var.S = jSONObject.optString("bizSourceName", "");
        d0Var.T = jSONObject.optString("bizSourceIconUrl", "");
        d0Var.I.put("biz", java.lang.Integer.valueOf(d0Var.Q));
        d0Var.I.put("tail_lang", d0Var.R);
        d0Var.I.put("icon_url", d0Var.f164790c.f387376f);
        d0Var.I.put("nickname", d0Var.f164790c.f387374d);
        return d0Var;
    }
}
