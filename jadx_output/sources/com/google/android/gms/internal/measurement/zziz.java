package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zziz implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zziw zzapn;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzey zzapo;

    public zziz(com.google.android.gms.internal.measurement.zziw zziwVar, com.google.android.gms.internal.measurement.zzey zzeyVar) {
        this.zzapn = zziwVar;
        this.zzapo = zzeyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzapn) {
            com.google.android.gms.internal.measurement.zziw.zza(this.zzapn, false);
            if (!this.zzapn.zzape.isConnected()) {
                this.zzapn.zzape.zzge().zzis().log("Connected to remote service");
                this.zzapn.zzape.zza(this.zzapo);
            }
        }
    }
}
