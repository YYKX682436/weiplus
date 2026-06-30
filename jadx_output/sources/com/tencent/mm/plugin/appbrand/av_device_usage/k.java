package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.m implements yz5.a {
    public k(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.plugin.appbrand.av_device_usage.o.class, "checkIsAppBrandLivePusherInUse", "checkIsAppBrandLivePusherInUse()Z", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        synchronized (((com.tencent.mm.plugin.appbrand.av_device_usage.o) this.receiver)) {
            z17 = ((java.util.HashSet) com.tencent.mm.plugin.appbrand.av_device_usage.o.f76724j.get(fb1.d.f260833h)) != null ? !r1.isEmpty() : false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "checkIsAppBrandLivePusherInUse, " + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
