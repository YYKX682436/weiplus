package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public final class m0 implements com.tencent.mm.plugin.appbrand.debugger.e {
    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(dm.i4.COL_USERNAME);
        java.lang.String stringExtra2 = intent.getStringExtra("appId");
        java.lang.String stringExtra3 = intent.getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        int P = com.tencent.mm.sdk.platformtools.t8.P(intent.getStringExtra("versionType"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(intent.getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), mc1.c.CTRL_INDEX);
        java.lang.String stringExtra4 = intent.getStringExtra("sceneNote");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = P2;
        appBrandStatObject.f87791g = stringExtra4;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, stringExtra, stringExtra2, P, 0, stringExtra3, appBrandStatObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public java.lang.String name() {
        return "LaunchApp";
    }
}
