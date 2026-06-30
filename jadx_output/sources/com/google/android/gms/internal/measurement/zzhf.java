package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzhf implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzanf;
    private final /* synthetic */ java.lang.String zzanj;
    private final /* synthetic */ java.lang.String zzanm;
    private final /* synthetic */ java.lang.String zzann;
    private final /* synthetic */ long zzano;

    public zzhf(com.google.android.gms.internal.measurement.zzgn zzgnVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        this.zzanf = zzgnVar;
        this.zzanm = str;
        this.zzanj = str2;
        this.zzann = str3;
        this.zzano = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        com.google.android.gms.internal.measurement.zzjr zzjrVar2;
        java.lang.String str = this.zzanm;
        if (str == null) {
            zzjrVar2 = this.zzanf.zzajp;
            zzjrVar2.zzla().zzfy().zza(this.zzanj, (com.google.android.gms.internal.measurement.zzie) null);
        } else {
            com.google.android.gms.internal.measurement.zzie zzieVar = new com.google.android.gms.internal.measurement.zzie(this.zzann, str, this.zzano);
            zzjrVar = this.zzanf.zzajp;
            zzjrVar.zzla().zzfy().zza(this.zzanj, zzieVar);
        }
    }
}
