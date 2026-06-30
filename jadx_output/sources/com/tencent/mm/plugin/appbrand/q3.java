package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f87728a;

    public q3(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f87728a = j3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f87728a;
        km5.u.a(j3Var.i("ensureXWebPreLoaded").q(new com.tencent.mm.plugin.appbrand.u3(j3Var)));
        return java.lang.Boolean.FALSE;
    }
}
