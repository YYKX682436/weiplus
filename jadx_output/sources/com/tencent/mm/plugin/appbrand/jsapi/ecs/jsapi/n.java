package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class n extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 1526;
    public static final java.lang.String NAME = "handleEcsActionSync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String b17;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.JsApiHandleEcsAction", "JsApiHandleEcsAction env null", null);
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str2, jSONObject2);
            kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        this.f81338e = false;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k kVar = com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.f80805a;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsActionHandlerDispatcher", "dispatchSync data null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str2, jSONObject3);
            kotlin.jvm.internal.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        c00.r3 r3Var = (c00.r3) i95.n0.c(c00.r3.class);
        android.app.Activity Z0 = c0Var.Z0();
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i iVar = new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.i(this);
        b00.m2 m2Var = (b00.m2) r3Var;
        m2Var.getClass();
        java.lang.String optString = jSONObject.optString("action");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEcsHandleEcsActionService", "handleEcsActionSync action:" + optString + " inScene:1");
        kotlin.jvm.internal.o.d(optString);
        java.util.Map map = (java.util.Map) m2Var.f16720e.get(1);
        t00.s0 s0Var = map == null ? null : (t00.s0) map.get(optString);
        if (s0Var != null && (b17 = s0Var.b(1, Z0, jSONObject, iVar)) != null) {
            return b17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMEcsHandleEcsActionService", "handleEcsActionSync not support action: ".concat(optString));
        return iVar.a(null);
    }
}
