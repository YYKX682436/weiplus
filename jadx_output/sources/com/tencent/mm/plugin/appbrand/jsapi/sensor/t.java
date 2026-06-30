package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.plugin.appbrand.utils.g4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f83044a;

    public t(java.lang.String str) {
        this.f83044a = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.g4
    public void a(com.tencent.mm.plugin.appbrand.utils.f4 f4Var, com.tencent.mm.plugin.appbrand.utils.f4 f4Var2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnableDeviceOrientation", "OrientationListener lastOrientation:" + f4Var.name() + "; newOrientation:" + f4Var2.name());
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.appbrand.jsapi.sensor.s(this, f4Var2), 500L);
    }
}
