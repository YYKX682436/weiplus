package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class u4 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 286;
    public static final java.lang.String NAME = "chooseInvoiceTitle";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("req_scene", 0);
        intent.putExtra("launch_from_appbrand", true);
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            e9Var.a(i17, o("fail"));
        } else {
            nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.t4(this, e9Var, i17));
            j45.l.o(Z0, "address", ".ui.InvoiceListUI", intent, hashCode() & 65535, false);
        }
    }
}
