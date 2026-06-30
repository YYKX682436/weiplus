package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class j0 extends java.util.concurrent.ThreadPoolExecutor {
    public j0(com.tencent.matrix.lifecycle.n0 n0Var, com.tencent.matrix.lifecycle.h0 h0Var, int i17, int i18, long j17, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue blockingQueue, java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler) {
        super(i17, i18, j17, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        com.tencent.matrix.lifecycle.p0 p0Var;
        if (runnable != null) {
            com.tencent.matrix.lifecycle.p pVar = com.tencent.matrix.lifecycle.q0.f52780a;
            p0Var = new com.tencent.matrix.lifecycle.p0(runnable);
        } else {
            p0Var = null;
        }
        super.execute(p0Var);
    }
}
