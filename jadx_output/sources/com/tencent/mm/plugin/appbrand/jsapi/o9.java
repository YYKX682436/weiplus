package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class o9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 0;
    public static final java.lang.String NAME = "openLink";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            v5Var.a(i17, o("fail"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.q1 q1Var = new com.tencent.mm.plugin.appbrand.jsapi.q1();
        q1Var.f82850c = v5Var;
        ((com.tencent.mm.plugin.appbrand.jsapi.r1) v5Var.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).N(v5Var.getF147807d(), optString, "", q1Var);
        v5Var.a(i17, o("ok"));
    }
}
