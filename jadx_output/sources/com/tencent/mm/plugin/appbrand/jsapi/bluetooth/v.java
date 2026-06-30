package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class v extends ib1.t {
    public static final int CTRL_INDEX = 1094;
    public static final java.lang.String NAME = "openBluetoothAdapterBackground";

    @Override // ib1.t
    public ob1.m E(com.tencent.mm.plugin.appbrand.jsapi.l component, ob1.m result) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e b17;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenBluetoothAdapterBackground", "overrideResultIfNeed, result: " + result);
        if ((kotlin.jvm.internal.o.b(jc1.f.f298912a, result.f344040c) || kotlin.jvm.internal.o.b(jc1.c.f298878b, result.f344040c)) && (b17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b.b(component.getAppId())) != null) {
            b17.f80057e = true;
        }
        return result;
    }
}
