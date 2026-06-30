package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f164573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.u f164574e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.u uVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        this.f164574e = uVar;
        this.f164573d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f164573d.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.sensor.JsApiEnableDeviceOrientation$1$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroyed */
            public void m51262x7495d2fa() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.r.this.f164574e;
                if (uVar.f164578g) {
                    uVar.f164579h.disable();
                    uVar.f164579h = null;
                    uVar.f164578g = false;
                }
            }
        });
    }
}
