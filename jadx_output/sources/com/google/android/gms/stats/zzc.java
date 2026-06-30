package com.google.android.gms.stats;

/* loaded from: classes13.dex */
final class zzc implements java.lang.Runnable {
    private final /* synthetic */ java.lang.ref.WeakReference zzaej;

    public zzc(java.lang.ref.WeakReference weakReference) {
        this.zzaej = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.stats.WakeLock.HeldLock heldLock = (com.google.android.gms.stats.WakeLock.HeldLock) this.zzaej.get();
        if (heldLock != null) {
            heldLock.release(0);
        }
    }
}
