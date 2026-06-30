package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.sensor.p {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83026m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 f83027n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.appbrand.jsapi.sensor.q qVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar2, com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 m0Var) {
        super(lVar);
        this.f83026m = lVar2;
        this.f83027n = m0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        this.f83034d = true;
        com.tencent.mm.plugin.appbrand.x0.e(this.f83026m.getAppId(), this);
        this.f83027n.b(this);
    }
}
