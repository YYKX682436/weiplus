package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ue implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89281e;

    public ue(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        this.f89280d = o6Var;
        this.f89281e = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult = (com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult) obj;
        java.lang.String str = this.f89281e;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89280d;
        if (runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult == null || !runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult.f74881d) {
            o6Var.K("MigrateRestartPreLaunch for " + str + " failed", new java.lang.Object[0]);
            o6Var.l0();
            return;
        }
        o6Var.K("MigrateRestartPreLaunch for " + str + " succeed, container:" + o6Var.f74796e, new java.lang.Object[0]);
        com.tencent.mm.plugin.appbrand.hc hcVar = o6Var.f74796e;
        if (hcVar == null) {
            o6Var.l0();
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult.f74882e;
        kotlin.jvm.internal.o.d(appBrandInitConfigWC);
        appBrandInitConfigWC.f47269b2 = runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult.f74883f;
        pm0.v.X(new com.tencent.mm.plugin.appbrand.te(hcVar, appBrandInitConfigWC, o6Var));
    }
}
