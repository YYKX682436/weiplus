package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class m implements cl.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j f88716b;

    public m(com.tencent.mm.plugin.appbrand.service.j jVar, java.lang.String str) {
        this.f88716b = jVar;
        this.f88715a = str;
    }

    @Override // cl.o
    public void a() {
        java.lang.String str = this.f88715a;
        com.tencent.mm.plugin.appbrand.service.j jVar = this.f88716b;
        if (str != null) {
            jVar.getClass();
            jVar.P0(new com.tencent.mm.plugin.appbrand.service.j$$d(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.p(jVar.L, jVar.M);
    }

    @Override // cl.o
    public void b(long j17, long j18) {
        java.lang.String str = this.f88715a;
        com.tencent.mm.plugin.appbrand.service.j jVar = this.f88716b;
        if (str != null) {
            jVar.P0(new com.tencent.mm.plugin.appbrand.service.j$$c(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.o(jVar.L, jVar.M, j17, j18, false, (com.tencent.luggage.sdk.jsapi.component.service.y) jVar.F());
    }
}
