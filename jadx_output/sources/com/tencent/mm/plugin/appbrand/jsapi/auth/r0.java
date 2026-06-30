package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class r0 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n0 {
    private static final int CTRL_INDEX = 54;
    private static final java.lang.String NAME = "authorize";

    /* renamed from: g, reason: collision with root package name */
    public final bm5.x0 f79701g = new bm5.x0(new com.tencent.mm.plugin.appbrand.jsapi.auth.r0$$a());

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0
    public void C(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) ffVar.f81013b;
        org.json.JSONObject jSONObject = ffVar.f81014c;
        int i17 = ffVar.f81016e;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
        if (runtime instanceof com.tencent.mm.plugin.appbrand.o6 ? ((com.tencent.mm.plugin.appbrand.o6) runtime).Y1.f86101d : false) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.o1) this.f79701g.b()).C(ffVar, oVar);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask();
        jsApiAuthorize$AuthorizeTask.f79337p = yVar.getAppId();
        if (ffVar.f81015d != null) {
            r45.me7 me7Var = new r45.me7();
            jsApiAuthorize$AuthorizeTask.f79338q = me7Var;
            me7Var.f380432d = ffVar.f81015d.optString("appId");
            ne.e eVar = (ne.e) yVar.getRuntime().p0(ne.e.class, false);
            if (eVar != null) {
                r45.me7 me7Var2 = jsApiAuthorize$AuthorizeTask.f79338q;
                me7Var2.f380434f = eVar.a(me7Var2.f380432d);
            }
        }
        jsApiAuthorize$AuthorizeTask.f79336o = "authorize";
        k91.z0 E0 = yVar.getRuntime().E0();
        if (E0 != null) {
            jsApiAuthorize$AuthorizeTask.f79340s = E0.f305852r.f75399d;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject d17 = com.tencent.mm.plugin.appbrand.l.d(yVar.getAppId());
        if (d17 != null) {
            jsApiAuthorize$AuthorizeTask.I = d17.f87790f;
        }
        jsApiAuthorize$AuthorizeTask.Q = G(jSONObject.optJSONArray("scope"), yVar.getRuntime());
        java.lang.String jSONObject2 = jSONObject.toString();
        jsApiAuthorize$AuthorizeTask.f79330f = this;
        jsApiAuthorize$AuthorizeTask.f79331g = yVar;
        jsApiAuthorize$AuthorizeTask.f79334m = jSONObject2;
        jsApiAuthorize$AuthorizeTask.f79333i = i17;
        jsApiAuthorize$AuthorizeTask.f79332h = new com.tencent.mm.plugin.appbrand.jsapi.auth.s0(jsApiAuthorize$AuthorizeTask, oVar);
        jsApiAuthorize$AuthorizeTask.F = new android.os.Bundle();
        if (yVar instanceof com.tencent.mm.plugin.appbrand.e9) {
            jsApiAuthorize$AuthorizeTask.f79329J = 1;
        } else if (yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            jsApiAuthorize$AuthorizeTask.f79329J = 2;
        }
        yVar.getRuntime().keep(new com.tencent.mm.plugin.appbrand.jsapi.auth.t0(jsApiAuthorize$AuthorizeTask));
        jsApiAuthorize$AuthorizeTask.d();
    }
}
