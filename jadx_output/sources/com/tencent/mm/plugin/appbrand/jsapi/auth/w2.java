package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class w2 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.w {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 52;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "login";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0
    public void C(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) invokeContext.f81013b;
        int i17 = invokeContext.f81016e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.r rVar = com.tencent.mm.plugin.appbrand.jsapi.auth.r.f79700a;
        r45.k24 k24Var = new r45.k24();
        k24Var.f378325d = yVar.getAppId();
        k24Var.f378330i = yVar.t3().f74805p.f77281g;
        r45.nd7 nd7Var = new r45.nd7();
        c(nd7Var, yVar);
        k24Var.f378331m = nd7Var;
        ((km5.q) rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-login", k24Var, r45.l24.class).q(new com.tencent.mm.plugin.appbrand.jsapi.auth.s2(yVar, i17, this)).h(new com.tencent.mm.plugin.appbrand.jsapi.auth.t2(yVar, i17, this)).a(new com.tencent.mm.plugin.appbrand.jsapi.auth.u2(oVar))).s(new com.tencent.mm.plugin.appbrand.jsapi.auth.v2(oVar, yVar, i17, this));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0, com.tencent.mm.plugin.appbrand.jsapi.g
    public void h(com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        org.json.JSONObject jSONObject = invokeContext.f81014c;
        try {
            if (!jSONObject.has("requestInQueue")) {
                jSONObject.put("requestInQueue", false);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.JsApiLoginLU", "invoke put KEY_IN_QUEUE e=" + e17.getMessage());
        }
        super.h(invokeContext);
    }
}
