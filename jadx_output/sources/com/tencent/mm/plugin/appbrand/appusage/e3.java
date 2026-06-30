package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.f3 f76428a;

    public e3(com.tencent.mm.plugin.appbrand.appusage.f3 f3Var, com.tencent.mm.plugin.appbrand.appusage.b3 b3Var) {
        this.f76428a = f3Var;
    }

    public java.util.ArrayList a(long j17, int i17) {
        l75.k0 k0Var = this.f76428a.f76434e;
        java.util.Locale locale = java.util.Locale.US;
        return com.tencent.mm.plugin.appbrand.appusage.f3.L0(k0Var.D("AppBrandLauncherLayoutItem", null, java.lang.String.format(locale, "%s=? and %s<? ", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, dm.i4.COL_UPDATETIME), new java.lang.String[]{java.lang.String.valueOf(2), java.lang.String.valueOf(j17)}, null, null, java.lang.String.format(locale, "%s desc limit %d offset 0 ", dm.i4.COL_UPDATETIME, java.lang.Integer.valueOf(i17)), 2));
    }
}
