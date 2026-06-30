package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class p extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "removeSplashScreenshot";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            return;
        }
        if (!(gk1.g.f272463f.a() && c0Var.t3().u0().f77292e2)) {
            c0Var.a(i17, o("fail:not supported"));
            return;
        }
        java.lang.String appId = c0Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        uk0.a.c(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams(appId, c0Var.t3().f74805p.f77281g), com.tencent.mm.plugin.appbrand.jsapi.fakenative.o.f80985d, null, 4, null);
        c0Var.a(i17, o("ok"));
    }
}
