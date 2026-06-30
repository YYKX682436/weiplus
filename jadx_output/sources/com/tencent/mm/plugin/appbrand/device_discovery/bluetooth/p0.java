package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class p0 implements com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f77947a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 f77948b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f77949c;

    public p0(java.lang.String deviceId, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 gattConnectListener) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(gattConnectListener, "gattConnectListener");
        this.f77947a = deviceId;
        this.f77948b = gattConnectListener;
        this.f77949c = "MicroMsg.AppBrand.AutoConnectGattSimpleStrategy#" + hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public boolean a() {
        t91.a.f416567a.a(this.f77949c, "connect");
        return com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.a(this.f77947a, this.f77948b);
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public void b() {
        t91.a.f416567a.a(this.f77949c, "pauseConnect");
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public void c(boolean z17) {
        t91.a.f416567a.a(this.f77949c, "resumeConnect, canReset: " + z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b1
    public boolean disconnect() {
        t91.a.f416567a.a(this.f77949c, "disconnect");
        return com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.b(this.f77947a);
    }
}
