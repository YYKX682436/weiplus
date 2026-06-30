package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.app.wa f75303d;

    public ua(com.tencent.mm.plugin.appbrand.app.wa waVar) {
        this.f75303d = waVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "<init> %s", bm5.f1.a());
        nf.x.f336616b = com.tencent.mm.plugin.appbrand.utils.r3.f90544a;
        com.tencent.mm.plugin.appbrand.app.sa saVar = new com.tencent.mm.plugin.appbrand.app.sa(this);
        synchronized (com.tencent.mm.plugin.appbrand.media.record.d0.class) {
            com.tencent.mm.plugin.appbrand.media.record.d0.f85803a = saVar;
        }
        if (com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.plugin.appbrand.app.PluginAppBrand.isAppBrandProcess() || com.tencent.mm.plugin.appbrand.app.PluginAppBrand.isSupportProcess()) {
            this.f75303d.f75334b = new yg1.a();
        } else {
            this.f75303d.f75334b = new com.tencent.mm.plugin.appbrand.app.ta(this);
        }
    }
}
