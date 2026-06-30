package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class nc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "restart";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.o6 runtime;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        java.lang.String optString = jSONObject.optString("url");
        boolean optBoolean = jSONObject.optBoolean("force", false);
        if (android.text.TextUtils.isEmpty(optString)) {
            yVar.a(i17, o("fail: empty url"));
            return;
        }
        if (yVar instanceof com.tencent.mm.plugin.appbrand.service.c0) {
            runtime = ((com.tencent.mm.plugin.appbrand.service.c0) yVar).t3();
        } else {
            if (!(yVar instanceof com.tencent.mm.plugin.appbrand.page.n7)) {
                yVar.a(i17, o("fail:internal error"));
                return;
            }
            runtime = ((com.tencent.mm.plugin.appbrand.page.n7) yVar).getRuntime();
        }
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, runtime.g2());
        boolean equals = "halfPage".equals(jSONObject.optString("mode", "default"));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRestart", "jsapi restart: url[%s], newScene[%d] force[%b]", optString, java.lang.Integer.valueOf(optInt), java.lang.Boolean.valueOf(optBoolean));
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = runtime.u0();
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = u07.f47278x;
        b1Var.f317022f = optString;
        b1Var.f317016c = u07.f77281g;
        b1Var.f317018d = u07.L;
        b1Var.f317048z = equals ? 2 : 0;
        b1Var.f317032k = optInt;
        b1Var.f317034l = u07.f47276v;
        b1Var.N = optBoolean;
        java.lang.String optString2 = jSONObject.optString("privateExtraData");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            b1Var.f317041s = appBrandLaunchReferrer;
            appBrandLaunchReferrer.f77322d = 10;
            appBrandLaunchReferrer.f77325g = optString2;
        }
        if (k01.j.f303039a.b(u07.f47278x, u07.f77278d)) {
            b1Var.Y = u07.C1;
        }
        android.content.Context r07 = runtime.r0();
        if (equals) {
            com.tencent.mm.plugin.appbrand.config.l lVar2 = new com.tencent.mm.plugin.appbrand.config.l();
            lVar2.f77521a = true;
            lVar2.f77522b = (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 3) / 4;
            lVar2.f77532l = true;
            k91.s2 s2Var = k91.s2.f305760d;
            lVar2.f77526f = s2Var;
            lVar2.f77529i = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9), true, true, false, false);
            lVar2.f77527g = true;
            lVar2.f77531k = k91.t2.f305767e;
            lVar2.f77530j = true;
            lVar2.f77534n = true;
            lVar2.f77532l = true;
            lVar2.f77537q = true;
            lVar2.f77528h = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig(com.tencent.mm.sdk.platformtools.x2.f193072b + ".ui.LauncherUI", s2Var);
            lVar2.f77536p = k91.y2.f305827d;
            b1Var.G = lVar2.a();
            if (r07 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
                com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) r07;
                if (appBrandUI.F7() && appBrandUI.isTaskRoot()) {
                    r07 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
            }
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(r07, b1Var);
    }
}
