package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes12.dex */
public class p0 implements java.util.concurrent.RejectedExecutionHandler {
    public p0(com.p314xaae8f345.mm.p794xb0fa9b5e.q0 q0Var) {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        rk0.c.d("IPC.ExecutorServiceCreatorImpl", "on rejectedExecution(r : %s)", runnable);
    }
}
