package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f102111a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.h2 f102112b;

    /* renamed from: c, reason: collision with root package name */
    public final oz5.l f102113c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f102114d;

    /* renamed from: e, reason: collision with root package name */
    public long f102115e;

    public e2(long j17, com.tencent.mm.plugin.finder.assist.h2 mode, oz5.l coroutineContext) {
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(coroutineContext, "coroutineContext");
        this.f102111a = j17;
        this.f102112b = mode;
        this.f102113c = coroutineContext;
    }

    public final void a(yz5.a taskBlock) {
        kotlin.jvm.internal.o.g(taskBlock, "taskBlock");
        int ordinal = this.f102112b.ordinal();
        if (ordinal == 0) {
            kotlinx.coroutines.r2 r2Var = this.f102114d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f102114d = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(this.f102113c), null, null, new com.tencent.mm.plugin.finder.assist.d2(this, taskBlock, null), 3, null);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f102115e >= this.f102111a) {
            this.f102115e = currentTimeMillis;
            taskBlock.invoke();
        }
    }

    public e2(long j17, com.tencent.mm.plugin.finder.assist.h2 h2Var, oz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? com.tencent.mm.plugin.finder.assist.h2.f102215d : h2Var, (i17 & 4) != 0 ? kotlinx.coroutines.q1.f310568a : lVar);
    }
}
