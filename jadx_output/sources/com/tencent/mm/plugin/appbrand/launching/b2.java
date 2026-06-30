package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.w1 f84510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.appbrand.launching.w1 w1Var, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(1);
        this.f84510d = w1Var;
        this.f84511e = o6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        lifecycle.b(new com.tencent.mm.plugin.appbrand.launching.a2(this.f84510d, this.f84511e));
        return jz5.f0.f302826a;
    }
}
