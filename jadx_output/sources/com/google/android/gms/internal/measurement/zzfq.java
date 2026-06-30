package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzfq implements java.lang.Runnable {
    private final /* synthetic */ boolean zzajq;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfp zzajr;

    public zzfq(com.google.android.gms.internal.measurement.zzfp zzfpVar, boolean z17) {
        this.zzajr = zzfpVar;
        this.zzajq = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        zzjrVar = this.zzajr.zzajp;
        zzjrVar.zzm(this.zzajq);
    }
}
