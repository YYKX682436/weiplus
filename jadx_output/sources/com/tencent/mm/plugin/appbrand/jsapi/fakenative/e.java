package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "hideSplashScreenshot";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var != null ? c0Var.t3() : null;
        if (t37 != null) {
            t37.m(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.d(t37, c0Var, i17, this));
        } else if (c0Var != null) {
            c0Var.a(i17, o("fail:internal error"));
        }
    }
}
