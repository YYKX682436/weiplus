package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.l3 f90848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var) {
        super(1);
        this.f90848d = l3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String wxaPkgPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i17 = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d.i();
        return java.lang.Boolean.valueOf((i17 != null ? i17.D0(wxaPkgPath, this.f90848d) : null) != null);
    }
}
