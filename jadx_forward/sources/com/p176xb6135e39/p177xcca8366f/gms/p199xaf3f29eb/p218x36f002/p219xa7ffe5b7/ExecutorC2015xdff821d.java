package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.p219xa7ffe5b7;

/* renamed from: com.google.android.gms.common.util.concurrent.HandlerExecutor */
/* loaded from: classes13.dex */
public class ExecutorC2015xdff821d implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public ExecutorC2015xdff821d(android.os.Looper looper) {
        this.zza = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
