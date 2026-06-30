package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f183719a;

    public g2(int i17) {
        this.f183719a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(i17);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g2 g2Var, long j17, java.lang.String taskID, yz5.a taskBlock, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h2 mode, oz5.l coroutineContext, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            taskID = "FinderDebouncedTask";
        }
        if ((i17 & 8) != 0) {
            mode = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h2.f183748d;
        }
        if ((i17 & 16) != 0) {
            coroutineContext = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        }
        g2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskBlock, "taskBlock");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineContext, "coroutineContext");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = g2Var.f183719a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e2) r2Var.get(taskID);
        if (e2Var == null) {
            e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e2(j17, mode, coroutineContext);
            r2Var.put(taskID, e2Var);
        }
        e2Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f2(taskID, taskBlock));
    }
}
