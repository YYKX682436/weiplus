package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
final class zzha implements java.util.concurrent.Callable<byte[]> {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgn zzanf;
    private final /* synthetic */ java.lang.String zzanj;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzeu zzank;

    public zzha(com.google.android.gms.internal.measurement.zzgn zzgnVar, com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str) {
        this.zzanf = zzgnVar;
        this.zzank = zzeuVar;
        this.zzanj = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        com.google.android.gms.internal.measurement.zzjr zzjrVar;
        com.google.android.gms.internal.measurement.zzjr zzjrVar2;
        zzjrVar = this.zzanf.zzajp;
        zzjrVar.zzkx();
        zzjrVar2 = this.zzanf.zzajp;
        return zzjrVar2.zza(this.zzank, this.zzanj);
    }
}
