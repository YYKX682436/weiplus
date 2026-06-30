package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.p219xa7ffe5b7;

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
