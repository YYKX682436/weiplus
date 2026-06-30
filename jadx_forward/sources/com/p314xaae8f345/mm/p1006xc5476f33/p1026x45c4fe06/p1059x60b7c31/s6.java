package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class s6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34739x366c91de = 988;

    /* renamed from: NAME */
    public static final java.lang.String f34740x24728b = "jumpRedPacketEnvelopePreview";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        android.app.Activity r07 = d0Var.mo32091x9a3f0ba2().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new android.os.Bundle(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r6.class);
        java.lang.String optString = jSONObject.optString("url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiJumpRedPacketEnvelopePreview", "preview red packet envelope: %s", optString);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "1@fackuser");
        intent.putExtra("finish_direct", true);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("key_red_packet_preview_url", optString);
        hashMap.put("key_red_packet_preview_scene", "0");
        intent.putExtra("key_red_packet_preview_extraInfo", hashMap);
        j45.l.u(r07, ".ui.chatting.ChattingUI", intent, null);
        d0Var.a(i17, o("ok"));
    }
}
