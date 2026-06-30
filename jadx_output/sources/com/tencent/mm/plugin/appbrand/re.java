package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class re implements com.tencent.mm.plugin.appbrand.launching.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f87767a;

    public re(com.tencent.mm.ipcinvoker.r rVar) {
        this.f87767a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.o0
    public final void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        com.tencent.mm.ipcinvoker.r rVar = this.f87767a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult(appBrandInitConfigWC != null, appBrandInitConfigWC, appBrandStatObject));
        }
    }
}
