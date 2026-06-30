package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f90696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        super(1);
        this.f90694d = iCommLibReader;
        this.f90695e = str;
        this.f90696f = atomicInteger;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 it = (com.tencent.mm.plugin.appbrand.v8_snapshot.l3) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.v8_snapshot.f3 f3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d;
        java.lang.String str = this.f90695e;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f90694d;
        f3Var.f(iCommLibReader, str, it, k2Var.f(iCommLibReader, it), new com.tencent.mm.plugin.appbrand.v8_snapshot.c3(this.f90696f, iCommLibReader));
        return jz5.f0.f302826a;
    }
}
