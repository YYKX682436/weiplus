package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzih implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzif zzaov;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzie zzaow;

    public zzih(com.google.android.gms.internal.measurement.zzif zzifVar, com.google.android.gms.internal.measurement.zzie zzieVar) {
        this.zzaov = zzifVar;
        this.zzaow = zzieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaov.zza(this.zzaow);
        com.google.android.gms.internal.measurement.zzif zzifVar = this.zzaov;
        zzifVar.zzaol = null;
        zzifVar.zzfx().zzb((com.google.android.gms.internal.measurement.zzie) null);
    }
}
