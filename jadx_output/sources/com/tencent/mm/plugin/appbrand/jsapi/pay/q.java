package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class q extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1465;
    public static final java.lang.String NAME = "getAccessibilitySecureRiskInfo";

    public q() {
        cf.b.a(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        rk0.c.c("MicroMsg.JsApiGetAccessibilitySecureRiskInfoWC", "start JsApiGetAccessibilitySecureRiskInfoWC", new java.lang.Object[0]);
        if (c0Var == null || jSONObject == null) {
            return;
        }
        uk0.a.b(null, new com.tencent.mm.plugin.appbrand.jsapi.pay.o(), new com.tencent.mm.plugin.appbrand.jsapi.pay.p(c0Var, i17, this));
    }
}
