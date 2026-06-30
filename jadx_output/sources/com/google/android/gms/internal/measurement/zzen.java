package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzen implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhi zzafk;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzem zzafl;

    public zzen(com.google.android.gms.internal.measurement.zzem zzemVar, com.google.android.gms.internal.measurement.zzhi zzhiVar) {
        this.zzafl = zzemVar;
        this.zzafk = zzhiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzafk.zzgd();
        if (com.google.android.gms.internal.measurement.zzgg.isMainThread()) {
            this.zzafk.zzgd().zzc(this);
            return;
        }
        boolean zzef = this.zzafl.zzef();
        com.google.android.gms.internal.measurement.zzem.zza(this.zzafl, 0L);
        if (zzef) {
            this.zzafl.run();
        }
    }
}
