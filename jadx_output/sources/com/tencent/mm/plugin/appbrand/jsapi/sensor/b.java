package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.sensor.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 f82981h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.appbrand.jsapi.sensor.g gVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 m0Var) {
        super(lVar);
        this.f82981h = m0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        this.f83000e = true;
        com.tencent.mm.plugin.appbrand.x0.e(this.f83002g.getAppId(), this);
        this.f82981h.b(this);
    }
}
