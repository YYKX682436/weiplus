package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class i implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f77892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77894f;

    public i(yz5.l lVar, java.lang.String str, java.lang.String str2) {
        this.f77892d = lVar;
        this.f77893e = str;
        this.f77894f = str2;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "DeleteMonitoredBluetoothDeviceInfo#" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object m521constructorimpl;
        if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.d(this.f77893e, this.f77894f)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j1(null, 1, null)));
        }
        this.f77892d.invoke(kotlin.Result.m520boximpl(m521constructorimpl));
    }
}
