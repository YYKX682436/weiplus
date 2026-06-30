package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class n extends com.tencent.mm.plugin.appbrand.jsapi.lbs.q {
    private static final int CTRL_INDEX = 586;
    private static final java.lang.String NAME = "enableLocationUpdateBackground";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.lbs.q, com.tencent.mm.plugin.appbrand.jsapi.lbs.l, com.tencent.mm.plugin.appbrand.jsapi.lbs.b
    /* renamed from: G */
    public void D(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.j1) e9Var.k(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1.class);
        this.f81451h = j1Var;
        if (j1Var instanceof com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) {
            com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) j1Var;
            if (k1Var.f81440p && k1Var.f81441q) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnableLocationUpdateBackgroundWxImp", "already in location background mode");
                e9Var.a(i17, o("ok"));
                return;
            }
        }
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.jsapi.lbs.m.class);
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig b17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b();
        if (iPCInteger != null && iPCInteger.f68404d >= b17.f77208f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiEnableLocationUpdateBackgroundWxImp", "enableLocationBackground: fail reach max concurrent background count");
            e9Var.a(i17, o("fail reach max concurrent background count"));
            return;
        }
        super.D(e9Var, jSONObject, i17);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var2 = this.f81451h;
        if (!(j1Var2 instanceof com.tencent.mm.plugin.appbrand.jsapi.lbs.k1)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiEnableLocationUpdateBackgroundWxImp", "state manager not RuntimeLocationUpdateStateManagerWxa");
            e9Var.a(i17, o("fail:system error"));
        } else {
            if (j1Var2 == null || !j1Var2.f81441q) {
                return;
            }
            com.tencent.mm.plugin.appbrand.backgroundrunning.t.a(e9Var, 1, 2, false);
        }
    }
}
