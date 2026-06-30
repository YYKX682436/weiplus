package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzgy implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdz zzane;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzanf;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzeu zzank;

    public zzgy(com.google.android.gms.internal.measurement.zzgn zzgnVar, com.google.android.gms.internal.measurement.zzeu zzeuVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        this.zzanf = zzgnVar;
        this.zzank = zzeuVar;
        this.zzane = zzdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        com.google.android.gms.internal.measurement.zzjr zzjrVar2;
        zzjrVar = this.zzanf.zzajp;
        zzjrVar.zzkx();
        zzjrVar2 = this.zzanf.zzajp;
        zzjrVar2.zzb(this.zzank, this.zzane);
    }
}
