package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class o2 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n0 {
    public static final int CTRL_INDEX = 52;
    public static final java.lang.String NAME = "login";

    public o2() {
        new com.tencent.mm.plugin.appbrand.jsapi.auth.w2();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0
    public void C(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar, com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = ffVar.f81013b;
        org.json.JSONObject jSONObject = ffVar.f81014c;
        int i17 = ffVar.f81016e;
        final com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask();
        jsApiLogin$LoginTask.f79363p = lVar.getAppId();
        jsApiLogin$LoginTask.f79362o = "login";
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var != null) {
            jsApiLogin$LoginTask.f79367t = z0Var.f305852r.f75399d;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject d17 = com.tencent.mm.plugin.appbrand.l.d(lVar.getAppId());
        if (d17 != null) {
            jsApiLogin$LoginTask.A = d17.f87790f;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        jsApiLogin$LoginTask.f79356f = this;
        jsApiLogin$LoginTask.f79357g = lVar;
        jsApiLogin$LoginTask.f79360m = jSONObject2;
        jsApiLogin$LoginTask.f79359i = i17;
        jsApiLogin$LoginTask.f79358h = new com.tencent.mm.plugin.appbrand.jsapi.auth.g2(jsApiLogin$LoginTask, oVar);
        jsApiLogin$LoginTask.f79373z = new android.os.Bundle();
        if (lVar instanceof com.tencent.mm.plugin.appbrand.e9) {
            jsApiLogin$LoginTask.B = 1;
        } else if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            jsApiLogin$LoginTask.B = 2;
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.y) {
            ((com.tencent.mm.plugin.appbrand.y) lVar).getRuntime().keep(new im5.a() { // from class: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$$a
                @Override // im5.a
                public final void dead() {
                    com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask.this.x();
                }
            });
        }
        jsApiLogin$LoginTask.d();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n0, com.tencent.mm.plugin.appbrand.jsapi.g
    public void h(com.tencent.mm.plugin.appbrand.jsapi.ff ffVar) {
        org.json.JSONObject jSONObject = ffVar.f81014c;
        try {
            if (!jSONObject.has("requestInQueue")) {
                jSONObject.put("requestInQueue", false);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "invoke put KEY_IN_QUEUE e=%s", e17.getMessage());
        }
        super.h(ffVar);
    }
}
