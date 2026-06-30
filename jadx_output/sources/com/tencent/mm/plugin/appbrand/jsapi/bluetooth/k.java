package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public abstract class k implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d, ob1.k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f80080a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f80081b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f80082c;

    public k(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f80080a = runtime;
        this.f80081b = "MicroMsg.AppBrand.BluetoothConnectStateChangeListener#" + com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.d(runtime);
    }

    @Override // ob1.k
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f80081b, "onBleConnectionStateChange, deviceId: " + str + ", connected: " + z17);
        if (str == null) {
            return;
        }
        b(str, z17);
    }

    public abstract void b(java.lang.String str, boolean z17);
}
