package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzdw implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String zzadi;
    private final /* synthetic */ long zzadj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzadk;

    public zzdw(com.google.android.gms.internal.measurement.zzdu zzduVar, java.lang.String str, long j17) {
        this.zzadk = zzduVar;
        this.zzadi = str;
        this.zzadj = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzadk.zzb(this.zzadi, this.zzadj);
    }
}
