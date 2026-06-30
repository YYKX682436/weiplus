package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class a8 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 651;
    public static final java.lang.String NAME = "markScene";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String appId;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null || !c0Var.isRunning()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiMarkScene", "Service dead, miss");
            java.lang.String o17 = o("fail:service dead");
            kotlin.jvm.internal.o.f(o17, "makeReturnJson(...)");
            return o17;
        }
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b18 = com.tencent.mm.plugin.appbrand.report.quality.e.b(c0Var.getAppId(), true);
        if (b18 == null) {
            java.lang.String o18 = o("fail:session dead");
            kotlin.jvm.internal.o.f(o18, "makeReturnJson(...)");
            return o18;
        }
        int optInt = jSONObject != null ? jSONObject.optInt("sceneId", -1) : -1;
        if (optInt < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiMarkScene", "parameter fail " + optInt);
            java.lang.String o19 = o("fail:illegal argument");
            kotlin.jvm.internal.o.f(o19, "makeReturnJson(...)");
            return o19;
        }
        b18.B.set(optInt);
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d && optInt == 0 && (b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b((appId = c0Var.getAppId()), true)) != null) {
            com.tencent.mm.plugin.appbrand.performance.m.f(appId, "FirstRenderToGameInteractive", b17.f88149u, java.lang.System.currentTimeMillis(), null);
        }
        java.lang.String o27 = o("ok");
        kotlin.jvm.internal.o.f(o27, "makeReturnJson(...)");
        return o27;
    }
}
