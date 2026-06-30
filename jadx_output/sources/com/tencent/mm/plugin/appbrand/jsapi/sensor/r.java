package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f83040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.u f83041e;

    public r(com.tencent.mm.plugin.appbrand.jsapi.sensor.u uVar, androidx.lifecycle.y yVar) {
        this.f83041e = uVar;
        this.f83040d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f83040d.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.sensor.JsApiEnableDeviceOrientation$1$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public void onDestroyed() {
                com.tencent.mm.plugin.appbrand.jsapi.sensor.u uVar = com.tencent.mm.plugin.appbrand.jsapi.sensor.r.this.f83041e;
                if (uVar.f83045g) {
                    uVar.f83046h.disable();
                    uVar.f83046h = null;
                    uVar.f83045g = false;
                }
            }
        });
    }
}
