package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes3.dex */
public final class h implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f77885e;

    public h(java.lang.String str, int i17) {
        this.f77884d = str;
        this.f77885e = i17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "DeleteMonitoredBluetoothDeviceInfoFor" + this.f77884d + '#' + this.f77885e + '#' + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.c(this.f77884d, this.f77885e);
    }
}
