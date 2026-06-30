package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class c6 implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c6 f166077d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c6();

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l5 l5Var = runnable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l5) runnable : null;
        java.lang.String str = l5Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m) l5Var).f172040e : null;
        if (str == null || str.length() == 0) {
            ((ku5.t0) ku5.t0.f394148d).g(runnable);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(runnable, str);
        }
    }
}
