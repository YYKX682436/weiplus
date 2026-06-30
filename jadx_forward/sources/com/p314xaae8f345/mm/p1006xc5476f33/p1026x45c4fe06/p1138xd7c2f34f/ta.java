package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class ta implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f166699d = new java.util.LinkedList();

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        wu5.c k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l5 l5Var = runnable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l5) runnable : null;
        java.lang.String str = l5Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m) l5Var).f172040e : null;
        if (str == null || str.length() == 0) {
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
            t0Var.getClass();
            k17 = t0Var.k(runnable, 0L);
        } else {
            ku5.t0 t0Var2 = (ku5.t0) ku5.t0.f394148d;
            t0Var2.getClass();
            k17 = t0Var2.l(runnable, 0L, str);
        }
        this.f166699d.add(k17);
    }
}
