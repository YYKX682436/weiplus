package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzix implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzey zzapm;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zziw zzapn;

    public zzix(com.google.android.gms.internal.measurement.zziw zziwVar, com.google.android.gms.internal.measurement.zzey zzeyVar) {
        this.zzapn = zziwVar;
        this.zzapm = zzeyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzapn) {
            com.google.android.gms.internal.measurement.zziw.zza(this.zzapn, false);
            if (!this.zzapn.zzape.isConnected()) {
                this.zzapn.zzape.zzge().zzit().log("Connected to service");
                this.zzapn.zzape.zza(this.zzapm);
            }
        }
    }
}
