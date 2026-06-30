package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f84955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.a f84957f;

    public e(com.tencent.mm.plugin.appbrand.launching.precondition.a aVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, java.lang.String str) {
        this.f84957f = aVar;
        this.f84955d = launchParcel;
        this.f84956e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f84955d;
        new com.tencent.mm.plugin.appbrand.launching.w0(launchParcel, this.f84956e, false, new com.tencent.mm.plugin.appbrand.launching.precondition.f(this, elapsedRealtime, currentTimeMillis), new com.tencent.mm.plugin.appbrand.launching.b1() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e$$a
            @Override // com.tencent.mm.plugin.appbrand.launching.b1
            public final void a() {
                final com.tencent.mm.plugin.appbrand.launching.precondition.e eVar = com.tencent.mm.plugin.appbrand.launching.precondition.e.this;
                eVar.getClass();
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel2 = launchParcel;
                java.lang.String str = launchParcel2.f84901d;
                java.lang.String str2 = launchParcel2.f84902e;
                com.tencent.mm.plugin.appbrand.launching.precondition.a aVar = eVar.f84957f;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "AppBrandPreLaunchProcessWC showPrompt, username[%s] appId[%s] currentInUiEnv[%b]", str, str2, java.lang.Boolean.valueOf(aVar.c()));
                aVar.j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.launching.precondition.a aVar2 = com.tencent.mm.plugin.appbrand.launching.precondition.e.this.f84957f;
                        if (aVar2.getBaseContext() instanceof com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) {
                            ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) aVar2.getBaseContext()).d7();
                        }
                    }
                }, true);
            }
        }).run();
    }
}
