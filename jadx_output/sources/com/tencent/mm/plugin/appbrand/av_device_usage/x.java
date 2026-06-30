package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class x extends lk0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f76745e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f76746d;

    public x(androidx.lifecycle.b0 lifecycleRegistry) {
        kotlin.jvm.internal.o.g(lifecycleRegistry, "lifecycleRegistry");
        this.f76746d = lifecycleRegistry;
    }

    @Override // lk0.f
    public void f(android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("lifecycleOnDestroy", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "LifecycleSendStub.onCallback, onDestroy");
            nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.w(this));
        }
    }
}
