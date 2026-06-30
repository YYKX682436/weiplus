package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j0 f80079d = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j0();

    public j0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp app = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp) obj;
        kotlin.jvm.internal.o.g(app, "app");
        return java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().c(app.f80044d, app.f80045e) == null);
    }
}
