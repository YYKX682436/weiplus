package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0 f80049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f80050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0 h0Var, yz5.l lVar) {
        super(1);
        this.f80049d = h0Var;
        this.f80050e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) obj;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "dispatchWhenReady, runtime is ready");
        com.tencent.mm.plugin.appbrand.e9 C0 = runtime.C0();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (C0 != null) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0 h0Var = this.f80049d;
            h0Var.p(C0);
            h0Var.m();
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(h0Var.f80073i, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77925n, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c0(C0));
            yz5.l lVar = this.f80050e;
            if (lVar != null) {
                lVar.invoke(C0);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "dispatchWhenReady, appService is null");
        }
        return f0Var2;
    }
}
