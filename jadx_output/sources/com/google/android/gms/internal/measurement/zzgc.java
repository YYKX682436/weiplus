package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzgc implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgl zzalb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzalc;

    public zzgc(com.google.android.gms.internal.measurement.zzgb zzgbVar, com.google.android.gms.internal.measurement.zzgl zzglVar, com.google.android.gms.internal.measurement.zzfg zzfgVar) {
        this.zzalb = zzglVar;
        this.zzalc = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzalb.zzjp() == null) {
            this.zzalc.zzim().log("Install Referrer Reporter is null");
        } else {
            this.zzalb.zzjp().zzjh();
        }
    }
}
