package com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15;

/* loaded from: classes12.dex */
final class zza extends java.lang.Thread {
    public zza(java.lang.ThreadGroup threadGroup, java.lang.String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
