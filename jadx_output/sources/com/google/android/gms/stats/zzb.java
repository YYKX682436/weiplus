package com.google.android.gms.stats;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzb implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.stats.WakeLock zzaei;

    public zzb(com.google.android.gms.stats.WakeLock wakeLock) {
        this.zzaei = wakeLock;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaei.zzn(0);
    }
}
