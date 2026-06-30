package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzgv implements java.util.concurrent.Callable<java.util.List<com.google.android.gms.internal.measurement.zzed>> {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzanf;
    private final /* synthetic */ java.lang.String zzanh;
    private final /* synthetic */ java.lang.String zzani;

    public zzgv(com.google.android.gms.internal.measurement.zzgn zzgnVar, com.google.android.gms.internal.measurement.zzdz zzdzVar, java.lang.String str, java.lang.String str2) {
        this.zzanf = zzgnVar;
        this.zzane = zzdzVar;
        this.zzanh = str;
        this.zzani = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.util.List<com.google.android.gms.internal.measurement.zzed> call() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        com.google.android.gms.internal.measurement.zzjr zzjrVar2;
        zzjrVar = this.zzanf.zzajp;
        zzjrVar.zzkx();
        zzjrVar2 = this.zzanf.zzajp;
        return zzjrVar2.zzix().zzc(this.zzane.packageName, this.zzanh, this.zzani);
    }
}
