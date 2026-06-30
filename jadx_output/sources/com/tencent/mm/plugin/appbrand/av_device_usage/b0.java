package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.c0 f76687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.appbrand.av_device_usage.c0 c0Var) {
        super(0);
        this.f76687d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.keep, observe lifecycle");
        final com.tencent.mm.plugin.appbrand.av_device_usage.c0 c0Var = this.f76687d;
        c0Var.f76691f.a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeProxy$Companion$keep$1$1
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                kotlin.jvm.internal.o.g(source, "source");
                kotlin.jvm.internal.o.g(event, "event");
                if (androidx.lifecycle.m.ON_DESTROY == event) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.keep, onDestroy");
                    java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = com.tencent.mm.plugin.appbrand.av_device_usage.c0.f76688g;
                    com.tencent.mm.plugin.appbrand.av_device_usage.c0 c0Var2 = com.tencent.mm.plugin.appbrand.av_device_usage.c0.this;
                    copyOnWriteArraySet.remove(c0Var2);
                    c0Var2.f76691f.c(this);
                }
            }
        });
        return jz5.f0.f302826a;
    }
}
