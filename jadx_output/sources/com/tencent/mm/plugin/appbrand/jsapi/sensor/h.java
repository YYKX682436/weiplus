package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.sensor.k {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83008n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 f83009o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.jsapi.sensor.l lVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar2, com.tencent.mm.plugin.appbrand.jsapi.l lVar3, com.tencent.mm.plugin.appbrand.jsapi.sensor.m0 m0Var) {
        super(lVar2);
        this.f83008n = lVar3;
        this.f83009o = m0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        this.f83015d = true;
        com.tencent.mm.plugin.appbrand.x0.e(this.f83008n.getAppId(), this);
        this.f83009o.b(this);
    }
}
