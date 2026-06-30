package com.tencent.mm.ipcinvoker;

/* loaded from: classes12.dex */
public class p0 implements java.util.concurrent.RejectedExecutionHandler {
    public p0(com.tencent.mm.ipcinvoker.q0 q0Var) {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        rk0.c.d("IPC.ExecutorServiceCreatorImpl", "on rejectedExecution(r : %s)", runnable);
    }
}
