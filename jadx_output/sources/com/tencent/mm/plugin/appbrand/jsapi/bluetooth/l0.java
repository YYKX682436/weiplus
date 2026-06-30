package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes6.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l0 f80085d = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l0();

    public l0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "initializer#backgroundRunningManagerService, service is null");
        }
        return v0Var;
    }
}
