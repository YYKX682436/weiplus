package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f78316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.y f78317e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.appbrand.headless.y yVar) {
        super(1);
        this.f78316d = c0Var;
        this.f78317e = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        lifecycle.b(new com.tencent.mm.plugin.appbrand.headless.w(this.f78316d, this.f78317e));
        return jz5.f0.f302826a;
    }
}
