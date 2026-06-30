package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.m implements yz5.a {
    public l(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.plugin.appbrand.av_device_usage.o.class, "checkIsAppBrandVOIPInUse", "checkIsAppBrandVOIPInUse()Z", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        ((com.tencent.mm.plugin.appbrand.av_device_usage.o) this.receiver).getClass();
        com.tencent.mm.plugin.appbrand.backgroundrunning.x0 x0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class);
        if (x0Var != null) {
            java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) x0Var).Bi()).iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next()).f76923f, 16)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "checkIsAppBrandVOIPInUse, " + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
