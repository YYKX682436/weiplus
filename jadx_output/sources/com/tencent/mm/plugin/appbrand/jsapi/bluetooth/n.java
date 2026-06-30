package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class n implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m f80086f = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f80087d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80088e;

    public n(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f80087d = runtime;
        this.f80088e = "DefaultBluetoothBackgroundSupportClient#" + com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.d(runtime);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void Fd(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public boolean H6() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public java.lang.String N6() {
        return this.f80088e;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void S6(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void j8(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void v4() {
        throw new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j(jc1.f.f298918g, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s
    public void y() {
    }
}
