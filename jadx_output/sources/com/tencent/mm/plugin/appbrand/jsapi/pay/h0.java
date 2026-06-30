package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class h0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 680;
    public static final java.lang.String NAME = "openWCPayOverseaPaymentReceive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWCPayOverseaPaymentReceive", "invoke JsApiOpenWCPayOverseaPaymentReceive!");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayOverseaPaymentReceive", "fail:component is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayOverseaPaymentReceive", "fail:context is null");
            lVar.a(i17, o("fail"));
        } else {
            ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
            h45.a0.k(context, 7);
            lVar.a(i17, o("ok"));
        }
    }
}
