package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class f7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j7 f88671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.tencent.mm.plugin.appbrand.service.j7 j7Var) {
        super(0);
        this.f88671d = j7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.service.j7 j7Var = this.f88671d;
        if (j7Var.f() == null || j7Var.g() == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.e9 e9Var = j7Var.f88700a;
        if ((e9Var != null ? e9Var.getRuntime() : null) == null) {
            return null;
        }
        qk.v6 f17 = j7Var.f();
        kotlin.jvm.internal.o.d(f17);
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni g17 = j7Var.g();
        kotlin.jvm.internal.o.d(g17);
        return new com.tencent.mm.plugin.appbrand.service.c7(f17, g17, new com.tencent.mm.plugin.appbrand.service.e7(j7Var), j7Var.f88701b, (com.tencent.mm.plugin.appbrand.jsruntime.t) ((b06.a) j7Var.f88702c).b(j7Var, com.tencent.mm.plugin.appbrand.service.j7.f88699g[0]));
    }
}
