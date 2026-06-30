package com.tencent.mm.ipcinvoker;

/* loaded from: classes12.dex */
public class o0 extends java.util.concurrent.ScheduledThreadPoolExecutor {
    public o0(com.tencent.mm.ipcinvoker.q0 q0Var, int i17, java.util.concurrent.ThreadFactory threadFactory) {
        super(i17, threadFactory);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        super.execute(new com.tencent.mm.ipcinvoker.n0(this, runnable));
    }
}
