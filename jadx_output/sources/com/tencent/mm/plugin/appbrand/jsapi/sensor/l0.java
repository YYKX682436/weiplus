package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public abstract class l0 extends com.tencent.mm.plugin.appbrand.v0 implements android.hardware.SensorEventListener {
    public l0(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        int ordinal = w0Var.ordinal();
        if ((ordinal == 0 || ordinal == 1 || ordinal == 4 || ordinal == 6 || ordinal == 7) && com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.Pe()) {
            h(true);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        if (com.tencent.mm.plugin.appbrand.jsapi.sensor.f0.f83003e.Pe()) {
            h(false);
        }
    }

    public abstract void h(boolean z17);
}
