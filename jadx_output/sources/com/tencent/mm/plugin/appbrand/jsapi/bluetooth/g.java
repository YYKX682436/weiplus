package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g f80069a = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g();

    /* renamed from: b, reason: collision with root package name */
    public static final ik1.x f80070b = new ik1.x();

    public final void a(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothAuthorizeStateQuickAccess", "addListener, appId: " + str);
        if (str == null || oVar == null) {
            return;
        }
        f80070b.e(str, oVar);
    }

    public final void b(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothAuthorizeStateQuickAccess", "removeListener, appId: " + str);
        if (str == null || oVar == null) {
            return;
        }
        f80070b.f(str, oVar);
    }
}
