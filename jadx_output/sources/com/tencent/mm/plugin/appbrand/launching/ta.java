package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ta implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f85166d = new java.util.LinkedList();

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        wu5.c k17;
        kotlin.jvm.internal.o.d(runnable);
        com.tencent.mm.plugin.appbrand.utils.l5 l5Var = runnable instanceof com.tencent.mm.plugin.appbrand.utils.l5 ? (com.tencent.mm.plugin.appbrand.utils.l5) runnable : null;
        java.lang.String str = l5Var != null ? ((com.tencent.mm.plugin.appbrand.utils.m) l5Var).f90507e : null;
        if (str == null || str.length() == 0) {
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
            t0Var.getClass();
            k17 = t0Var.k(runnable, 0L);
        } else {
            ku5.t0 t0Var2 = (ku5.t0) ku5.t0.f312615d;
            t0Var2.getClass();
            k17 = t0Var2.l(runnable, 0L, str);
        }
        this.f85166d.add(k17);
    }
}
