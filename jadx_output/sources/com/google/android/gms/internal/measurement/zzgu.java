package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzgu implements java.util.concurrent.Callable<java.util.List<com.google.android.gms.internal.measurement.zzjz>> {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzanf;
    private final /* synthetic */ java.lang.String zzanh;
    private final /* synthetic */ java.lang.String zzani;
    private final /* synthetic */ java.lang.String zzanj;

    public zzgu(com.google.android.gms.internal.measurement.zzgn zzgnVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzanf = zzgnVar;
        this.zzanj = str;
        this.zzanh = str2;
        this.zzani = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.util.List<com.google.android.gms.internal.measurement.zzjz> call() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        com.google.android.gms.internal.measurement.zzjr zzjrVar2;
        zzjrVar = this.zzanf.zzajp;
        zzjrVar.zzkx();
        zzjrVar2 = this.zzanf.zzajp;
        return zzjrVar2.zzix().zzb(this.zzanj, this.zzanh, this.zzani);
    }
}
