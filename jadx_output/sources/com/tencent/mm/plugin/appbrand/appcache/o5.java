package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class o5 implements com.tencent.mm.plugin.appbrand.appcache.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f75701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.p5 f75703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.e5 f75704d;

    public o5(com.tencent.mm.plugin.appbrand.appcache.e5 e5Var, boolean z17, int i17, com.tencent.mm.plugin.appbrand.appcache.p5 p5Var) {
        this.f75704d = e5Var;
        this.f75701a = z17;
        this.f75702b = i17;
        this.f75703c = p5Var;
    }

    @Override // m81.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // m81.d
    public void c(java.lang.String str, m81.c cVar, java.lang.Object obj) {
        final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader wxaCommLibRuntimeReader$PkgReader;
        com.tencent.mm.plugin.appbrand.appcache.wa waVar = (com.tencent.mm.plugin.appbrand.appcache.wa) obj;
        if (com.tencent.mm.plugin.appbrand.ui.e4.g() && com.tencent.mm.plugin.appbrand.ui.e4.b()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.PkgDownloadService", "ENABLE_COMM_LIB_DOWNLOAD_PKG_WEAKNET_MOCK");
            try {
                java.lang.Thread.sleep(60000L);
            } catch (java.lang.InterruptedException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        if (!this.f75701a) {
            this.f75704d.f75512h = null;
        }
        if (m81.c.OK != cVar) {
            com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.f(new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent(new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed()));
            if (!this.f75701a && !this.f75704d.f75510f) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.appcache.o5$$b());
            }
            com.tencent.mm.plugin.appbrand.appcache.p5 p5Var = this.f75703c;
            if (p5Var != null) {
                p5Var.a(false, 0);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.v7.a();
        try {
            java.lang.Object invoke = new com.tencent.mm.plugin.appbrand.appcache.c8().invoke(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "onPkgUpdateResult, IPC_ReadLib returns %s", invoke);
            if (invoke instanceof com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) {
                wxaCommLibRuntimeReader$PkgReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) invoke;
            } else {
                if (!(invoke instanceof com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo)) {
                    com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.f(new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent(new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed()));
                    com.tencent.mm.plugin.appbrand.appcache.p5 p5Var2 = this.f75703c;
                    if (p5Var2 != null) {
                        p5Var2.a(false, 0);
                        return;
                    }
                    return;
                }
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) invoke;
                wxaCommLibRuntimeReader$PkgReader = wxaPkgWrappingInfo.f75401f ? com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n : new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader(wxaPkgWrappingInfo);
            }
            java.util.Objects.requireNonNull(wxaCommLibRuntimeReader$PkgReader);
            com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.f(new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent(new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Succeed(wxaCommLibRuntimeReader$PkgReader)));
            if (!this.f75701a && !this.f75704d.f75510f) {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.o5$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.a0g, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.this.Y0()), 0).show();
                    }
                });
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgDownloadService", "onPkgUpdateResult download(version: %d) succeed, publish get exception %s", java.lang.Integer.valueOf(waVar.f76034b), e18);
        }
        com.tencent.mm.plugin.appbrand.appcache.p5 p5Var3 = this.f75703c;
        if (p5Var3 != null) {
            p5Var3.a(true, this.f75702b);
        }
    }
}
