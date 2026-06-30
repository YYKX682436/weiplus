package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes12.dex */
public class o0 extends java.util.concurrent.ScheduledThreadPoolExecutor {
    public o0(com.p314xaae8f345.mm.p794xb0fa9b5e.q0 q0Var, int i17, java.util.concurrent.ThreadFactory threadFactory) {
        super(i17, threadFactory);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        super.execute(new com.p314xaae8f345.mm.p794xb0fa9b5e.n0(this, runnable));
    }
}
