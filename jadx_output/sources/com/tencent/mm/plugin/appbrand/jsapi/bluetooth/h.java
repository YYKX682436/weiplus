package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p {
    public h(kotlin.jvm.internal.i iVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p
    public com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "requireClient, runtime: " + d(runtime));
        return com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80075c.a(runtime);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p
    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "destroyClientIfNeed, runtime: " + d(runtime));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80075c.b(runtime);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p
    public com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "getClient, runtime: " + d(runtime));
        return com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80075c.c(runtime);
    }

    public final java.lang.String d(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = runtime.u0();
        if (u07 == null) {
            return java.lang.String.valueOf(runtime.hashCode());
        }
        return u07.f77278d + '#' + u07.f77281g;
    }

    public final boolean e(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        u81.h hVar = runtime.N;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "isRuntimeInBackground, runningStateController is null");
            return false;
        }
        u81.b b17 = hVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothBackgroundSupportAccessible", "isRuntimeInBackground, currentState: " + b17);
        return u81.b.BACKGROUND == b17;
    }
}
