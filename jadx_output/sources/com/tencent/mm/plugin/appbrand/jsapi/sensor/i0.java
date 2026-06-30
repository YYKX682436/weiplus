package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes13.dex */
public class i0 implements com.tencent.mm.plugin.appbrand.utils.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.k0 f83011a;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.sensor.k0 k0Var) {
        this.f83011a = k0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.j2
    public boolean onAction(java.lang.Object... objArr) {
        synchronized (this.f83011a.f83023a) {
            if (this.f83011a.f83023a.isEmpty()) {
                return false;
            }
            ((com.tencent.mm.plugin.appbrand.jsapi.sensor.h0) this.f83011a.f83025c).run();
            return true;
        }
    }
}
