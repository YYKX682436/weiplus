package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class m9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 643;
    public static final java.lang.String NAME = "openWCCertHomePage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.getRuntime().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
        } else {
            j45.l.j(r07, "card", ".ui.v2.CardTicketListUI", new android.content.Intent(), null);
            d0Var.a(i17, o("ok"));
        }
    }
}
