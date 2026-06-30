package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzdx implements java.lang.Runnable {
    private final /* synthetic */ long zzadj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzadk;

    public zzdx(com.google.android.gms.internal.measurement.zzdu zzduVar, long j17) {
        this.zzadk = zzduVar;
        this.zzadj = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzadk.zzl(this.zzadj);
    }
}
