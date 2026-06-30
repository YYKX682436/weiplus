package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.n f76713d = new com.tencent.mm.plugin.appbrand.av_device_usage.n();

    public n() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageDatas", "observePhoneInUse, state: " + intValue);
        androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76716b;
        com.tencent.mm.plugin.appbrand.av_device_usage.o oVar = com.tencent.mm.plugin.appbrand.av_device_usage.o.f76715a;
        j0Var.postValue(java.lang.Boolean.valueOf(2 == intValue));
        return jz5.f0.f302826a;
    }
}
