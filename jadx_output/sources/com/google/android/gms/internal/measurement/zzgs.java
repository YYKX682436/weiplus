package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzgs implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzanf;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzed zzang;

    public zzgs(com.google.android.gms.internal.measurement.zzgn zzgnVar, com.google.android.gms.internal.measurement.zzed zzedVar) {
        this.zzanf = zzgnVar;
        this.zzang = zzedVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        com.google.android.gms.internal.measurement.zzjr zzjrVar2;
        zzjrVar = this.zzanf.zzajp;
        zzjrVar.zzkx();
        zzjrVar2 = this.zzanf.zzajp;
        com.google.android.gms.internal.measurement.zzed zzedVar = this.zzang;
        com.google.android.gms.internal.measurement.zzdz zzcb = zzjrVar2.zzcb(zzedVar.packageName);
        if (zzcb != null) {
            zzjrVar2.zzb(zzedVar, zzcb);
        }
    }
}
