package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class q6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 989;
    public static final java.lang.String NAME = "jumpRedPacketEnvelopeList";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.getRuntime().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("packetId", jSONObject.optString("packetId"));
        j45.l.n(r07, "luckymoney", ".ui.LuckyMoneyPickEnvelopeUI", intent, gd1.b0.CTRL_INDEX);
        d0Var.a(i17, o("ok"));
    }
}
