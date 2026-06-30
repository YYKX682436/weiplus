package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public class o2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 218;
    public static final java.lang.String NAME = "sendBizRedPacket";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        ce.g gVar;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        try {
            jSONObject.put("appId", c0Var.getAppId());
            com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var.V0();
            if (V0 != null && (gVar = (ce.g) V0.B1(ce.g.class)) != null) {
                ((ce.o) gVar).V(true, true, null);
            }
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE.sendBizRedPacket(Z0, c0Var.t3().l2(), jSONObject, new com.tencent.mm.plugin.appbrand.jsapi.pay.n2(this, c0Var, i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendBizRedPacket", e17.getMessage());
            c0Var.a(i17, o("fail"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
