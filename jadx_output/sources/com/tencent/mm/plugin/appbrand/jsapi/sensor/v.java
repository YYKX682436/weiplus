package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.plugin.appbrand.jsapi.sensor.y {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 f83048h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.appbrand.jsapi.sensor.z zVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar2, com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 m0Var) {
        super(lVar);
        this.f83047g = lVar2;
        this.f83048h = m0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        this.f83051d = true;
        com.tencent.mm.plugin.appbrand.x0.e(this.f83047g.getAppId(), this);
        this.f83048h.b(this);
    }
}
