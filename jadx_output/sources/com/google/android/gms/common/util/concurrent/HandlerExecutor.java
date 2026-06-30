package com.google.android.gms.common.util.concurrent;

/* loaded from: classes13.dex */
public class HandlerExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public HandlerExecutor(android.os.Looper looper) {
        this.zza = new com.google.android.gms.internal.common.zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
