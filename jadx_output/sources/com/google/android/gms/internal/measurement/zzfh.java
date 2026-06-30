package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzfh implements java.lang.Runnable {
    private final /* synthetic */ int zzaix;
    private final /* synthetic */ java.lang.String zzaiy;
    private final /* synthetic */ java.lang.Object zzaiz;
    private final /* synthetic */ java.lang.Object zzaja;
    private final /* synthetic */ java.lang.Object zzajb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzajc;

    public zzfh(com.google.android.gms.internal.measurement.zzfg zzfgVar, int i17, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zzajc = zzfgVar;
        this.zzaix = i17;
        this.zzaiy = str;
        this.zzaiz = obj;
        this.zzaja = obj2;
        this.zzajb = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c17;
        long j17;
        char c18;
        long j18;
        com.google.android.gms.internal.measurement.zzfg zzfgVar;
        char c19;
        com.google.android.gms.internal.measurement.zzfr zzgf = this.zzajc.zzacw.zzgf();
        if (!zzgf.isInitialized()) {
            this.zzajc.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c17 = this.zzajc.zzaim;
        if (c17 == 0) {
            if (this.zzajc.zzgg().zzds()) {
                zzfgVar = this.zzajc;
                c19 = 'C';
            } else {
                zzfgVar = this.zzajc;
                c19 = 'c';
            }
            zzfgVar.zzaim = c19;
        }
        j17 = this.zzajc.zzadu;
        if (j17 < 0) {
            com.google.android.gms.internal.measurement.zzfg.zza(this.zzajc, 12451L);
        }
        char charAt = "01VDIWEA?".charAt(this.zzaix);
        c18 = this.zzajc.zzaim;
        j18 = this.zzajc.zzadu;
        java.lang.String zza = com.google.android.gms.internal.measurement.zzfg.zza(true, this.zzaiy, this.zzaiz, this.zzaja, this.zzajb);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 24);
        sb6.append("2");
        sb6.append(charAt);
        sb6.append(c18);
        sb6.append(j18);
        sb6.append(":");
        sb6.append(zza);
        java.lang.String sb7 = sb6.toString();
        if (sb7.length() > 1024) {
            sb7 = this.zzaiy.substring(0, 1024);
        }
        zzgf.zzajt.zzc(sb7, 1L);
    }
}
