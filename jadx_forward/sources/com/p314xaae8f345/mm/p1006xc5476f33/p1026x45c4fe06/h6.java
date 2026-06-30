package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class h6 {
    public h6(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(boolean z17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d6(z17));
            return;
        }
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c.f156392i;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c.f156391h) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c.f156392i = android.os.SystemClock.elapsedRealtime();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g6 g6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g6(z17);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            g6Var.mo152xb9724478();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable(g6Var) { // from class: com.tencent.mm.plugin.appbrand.i6

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f159867d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g6Var, "function");
                this.f159867d = g6Var;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f159867d.mo152xb9724478();
            }
        }, "AppBrandRuntimeSuspendingMMGuardCheckSuspendedEvent");
    }
}
