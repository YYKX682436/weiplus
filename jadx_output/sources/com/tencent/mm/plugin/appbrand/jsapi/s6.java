package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class s6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 988;
    public static final java.lang.String NAME = "jumpRedPacketEnvelopePreview";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.getRuntime().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new android.os.Bundle(), com.tencent.mm.plugin.appbrand.jsapi.r6.class);
        java.lang.String optString = jSONObject.optString("url");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpRedPacketEnvelopePreview", "preview red packet envelope: %s", optString);
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
