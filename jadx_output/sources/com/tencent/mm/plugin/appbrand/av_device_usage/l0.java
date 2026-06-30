package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.p0 f76711d;

    public l0(com.tencent.mm.plugin.appbrand.av_device_usage.p0 p0Var) {
        this.f76711d = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.av_device_usage.p0 p0Var = this.f76711d;
        p0Var.f76728b.set(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "run PhoneInUseObservable.enable");
        p0Var.getClass();
        try {
            ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi((com.tencent.mm.plugin.appbrand.av_device_usage.n0) ((jz5.n) p0Var.f76730d).getValue());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AVDeviceUsageDatas", e17, "doListen, events: 32", new java.lang.Object[0]);
        }
    }
}
