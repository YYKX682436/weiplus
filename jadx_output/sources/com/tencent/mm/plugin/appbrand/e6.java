package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f77993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(boolean z17) {
        super(0);
        this.f77993d = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean e17 = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent().e();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent", "callback handled:" + e17);
        if (!e17 && com.tencent.mm.plugin.appbrand.l.c() == 0 && this.f77993d) {
            com.tencent.mm.plugin.appbrand.app.r0.c(com.tencent.mm.plugin.appbrand.app.v0.NO_RUNTIMES_LEFT);
        }
        return jz5.f0.f302826a;
    }
}
