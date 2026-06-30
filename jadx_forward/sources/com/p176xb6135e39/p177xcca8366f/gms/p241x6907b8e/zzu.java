package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* loaded from: classes13.dex */
final class zzu implements java.util.concurrent.Executor {
    private final android.os.Handler zza = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p231x6907b8e.zza(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
