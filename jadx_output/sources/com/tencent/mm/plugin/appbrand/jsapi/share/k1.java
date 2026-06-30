package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class k1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 202;
    public static final java.lang.String NAME = "showShareMenuWithShareTicket";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowShareMenuWithShareTicket", "invoke");
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 == null) {
            e9Var.a(i17, o("ok"));
            return;
        }
        V0.n1(3, false);
        com.tencent.mm.plugin.appbrand.menu.u0 H1 = V0.H1(3);
        if (H1 == null) {
            e9Var.a(i17, o("fail:menu item do not exist"));
            return;
        }
        H1.f85996d.i("enable_share_with_share_ticket", java.lang.Boolean.TRUE);
        e9Var.a(i17, o("ok"));
    }
}
