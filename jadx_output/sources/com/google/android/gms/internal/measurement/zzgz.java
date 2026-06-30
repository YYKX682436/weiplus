package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzgz implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzanf;
    private final /* synthetic */ java.lang.String zzanj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzeu zzank;

    public zzgz(com.google.android.gms.internal.measurement.zzgn zzgnVar, com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str) {
        this.zzanf = zzgnVar;
        this.zzank = zzeuVar;
        this.zzanj = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        com.google.android.gms.internal.measurement.zzjr zzjrVar2;
        zzjrVar = this.zzanf.zzajp;
        zzjrVar.zzkx();
        zzjrVar2 = this.zzanf.zzajp;
        zzjrVar2.zzc(this.zzank, this.zzanj);
    }
}
