package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes5.dex */
public final class u4 implements com.tencent.mm.plugin.appbrand.utils.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f90578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.p4 f90579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90580c;

    public u4(long j17, com.tencent.mm.plugin.appbrand.utils.p4 p4Var, java.lang.String str) {
        this.f90578a = j17;
        this.f90579b = p4Var;
        this.f90580c = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p4
    public void a(yz5.a onEnd) {
        kotlin.jvm.internal.o.g(onEnd, "onEnd");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.appbrand.utils.t4 t4Var = new com.tencent.mm.plugin.appbrand.utils.t4(atomicBoolean, h0Var, this.f90580c, onEnd);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.appbrand.utils.r4 r4Var = new com.tencent.mm.plugin.appbrand.utils.r4(t4Var);
        long j17 = this.f90578a;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        h0Var.f310123d = t0Var.w(r4Var, j17, null);
        this.f90579b.a(new com.tencent.mm.plugin.appbrand.utils.s4(t4Var));
    }
}
