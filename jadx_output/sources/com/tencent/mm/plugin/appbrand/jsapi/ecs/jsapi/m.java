package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class m extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1436;
    public static final java.lang.String NAME = "handleEcsAction";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.JsApiHandleEcsAction", "JsApiHandleEcsAction env null", null);
            return;
        }
        this.f81338e = false;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k kVar = com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.f80805a;
        try {
            kVar.c(c0Var, this, jSONObject, i17);
        } catch (java.lang.Exception e17) {
            java.lang.String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            kVar.e("safeDispatch", "appbrand", jSONObject2, e17);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.j(e17));
        }
    }
}
