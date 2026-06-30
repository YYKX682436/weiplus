package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.a f84941d;

    public b(com.tencent.mm.plugin.appbrand.launching.precondition.a aVar) {
        this.f84941d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finishUiEnv InUiEnv");
        if (this.f84941d.getBaseContext() instanceof com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) {
            ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) this.f84941d.getBaseContext()).finish();
        }
        this.f84941d.setBaseContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f84941d.f84934d = true;
    }
}
