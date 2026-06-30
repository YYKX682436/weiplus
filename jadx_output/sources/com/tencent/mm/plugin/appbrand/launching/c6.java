package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class c6 implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.c6 f84544d = new com.tencent.mm.plugin.appbrand.launching.c6();

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.d(runnable);
        com.tencent.mm.plugin.appbrand.utils.l5 l5Var = runnable instanceof com.tencent.mm.plugin.appbrand.utils.l5 ? (com.tencent.mm.plugin.appbrand.utils.l5) runnable : null;
        java.lang.String str = l5Var != null ? ((com.tencent.mm.plugin.appbrand.utils.m) l5Var).f90507e : null;
        if (str == null || str.length() == 0) {
            ((ku5.t0) ku5.t0.f312615d).g(runnable);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(runnable, str);
        }
    }
}
