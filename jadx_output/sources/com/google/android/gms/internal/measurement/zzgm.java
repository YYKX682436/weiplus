package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzgm implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhj zzana;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgl zzanb;

    public zzgm(com.google.android.gms.internal.measurement.zzgl zzglVar, com.google.android.gms.internal.measurement.zzhj zzhjVar) {
        this.zzanb = zzglVar;
        this.zzana = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzanb.zza(this.zzana);
        this.zzanb.start();
    }
}
