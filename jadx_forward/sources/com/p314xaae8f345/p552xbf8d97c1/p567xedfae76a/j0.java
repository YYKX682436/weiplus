package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes12.dex */
public final class j0 extends java.util.concurrent.ThreadPoolExecutor {
    public j0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.n0 n0Var, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h0 h0Var, int i17, int i18, long j17, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue blockingQueue, java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler) {
        super(i17, i18, j17, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p0 p0Var;
        if (runnable != null) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p pVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134313a;
            p0Var = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p0(runnable);
        } else {
            p0Var = null;
        }
        super.execute(p0Var);
    }
}
