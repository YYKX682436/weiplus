package com.tencent.mm.feature.performance;

/* loaded from: classes7.dex */
public class h2 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Runnable f67582b = new com.tencent.mm.feature.performance.h2$$a();

    public h2(com.tencent.mm.feature.performance.c2 c2Var) {
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        ((ku5.t0) ku5.t0.f312615d).A("ThreadWatchDog.BgDump");
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = this.f67582b;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        java.util.Objects.requireNonNull(runnable);
        t0Var.t(runnable, 30000L, "ThreadWatchDog.BgDump");
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        ((ku5.t0) ku5.t0.f312615d).A("ThreadWatchDog.BgDump");
    }
}
