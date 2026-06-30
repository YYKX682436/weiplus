package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzjf implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Runnable zzabt;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjr zzapt;

    public zzjf(com.google.android.gms.internal.measurement.zzjc zzjcVar, com.google.android.gms.internal.measurement.zzjr zzjrVar, java.lang.Runnable runnable) {
        this.zzapt = zzjrVar;
        this.zzabt = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzapt.zzkx();
        this.zzapt.zzg(this.zzabt);
        this.zzapt.zzks();
    }
}
