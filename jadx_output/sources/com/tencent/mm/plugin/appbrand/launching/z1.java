package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f85449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(1);
        this.f85449d = o6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader it = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f85449d;
        if (o6Var.S2(false) != null) {
            throw new java.lang.IllegalStateException("Duplicated call!!");
        }
        o6Var.x1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class, it);
        return jz5.f0.f302826a;
    }
}
