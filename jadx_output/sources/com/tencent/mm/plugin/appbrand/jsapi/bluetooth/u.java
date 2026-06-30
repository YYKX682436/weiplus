package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class u extends ib1.e {
    @Override // ib1.e
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l env, java.lang.String deviceId, boolean z17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiCreateBLEConnectionWC", "onCreateConnectionDone, deviceId: " + deviceId + ", isSuccess: " + z17);
        if (z17) {
            java.lang.String appId = env.getAppId();
            if (appId == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiCreateBLEConnectionWC", "onCreateConnectionDone, appId is null");
            } else {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u.f77959a.d(appId, deviceId);
            }
        }
    }
}
