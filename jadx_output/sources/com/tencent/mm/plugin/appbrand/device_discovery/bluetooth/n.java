package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class n implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f77928d;

    public n(yz5.l lVar) {
        this.f77928d = lVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "GetAllMonitoredBluetoothDeviceInfo#" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f77928d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.f())));
    }
}
