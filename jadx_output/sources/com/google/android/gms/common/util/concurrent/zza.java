package com.google.android.gms.common.util.concurrent;

/* loaded from: classes13.dex */
final class zza implements java.lang.Runnable {
    private final java.lang.Runnable zza;

    public zza(java.lang.Runnable runnable, int i17) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(0);
        this.zza.run();
    }
}
