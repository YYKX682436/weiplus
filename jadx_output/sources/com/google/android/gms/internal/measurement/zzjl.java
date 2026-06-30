package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzjl implements java.lang.Runnable {
    private final /* synthetic */ long zzadj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzapx;

    public zzjl(com.google.android.gms.internal.measurement.zzjh zzjhVar, long j17) {
        this.zzapx = zzjhVar;
        this.zzadj = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzapx.zzag(this.zzadj);
    }
}
