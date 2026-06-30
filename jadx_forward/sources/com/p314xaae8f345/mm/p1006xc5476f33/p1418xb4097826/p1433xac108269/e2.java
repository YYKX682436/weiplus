package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f183644a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h2 f183645b;

    /* renamed from: c, reason: collision with root package name */
    public final oz5.l f183646c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f183647d;

    /* renamed from: e, reason: collision with root package name */
    public long f183648e;

    public e2(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h2 mode, oz5.l coroutineContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineContext, "coroutineContext");
        this.f183644a = j17;
        this.f183645b = mode;
        this.f183646c = coroutineContext;
    }

    public final void a(yz5.a taskBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskBlock, "taskBlock");
        int ordinal = this.f183645b.ordinal();
        if (ordinal == 0) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f183647d;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f183647d = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(this.f183646c), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d2(this, taskBlock, null), 3, null);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f183648e >= this.f183644a) {
            this.f183648e = currentTimeMillis;
            taskBlock.mo152xb9724478();
        }
    }

    public e2(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h2 h2Var, oz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, (i17 & 2) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h2.f183748d : h2Var, (i17 & 4) != 0 ? p3325xe03a0797.p3326xc267989b.q1.f392101a : lVar);
    }
}
