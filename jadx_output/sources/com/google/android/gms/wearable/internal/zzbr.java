package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzbr extends com.google.android.gms.wearable.internal.zzej {
    private final java.lang.Object lock = new java.lang.Object();
    private com.google.android.gms.wearable.internal.zzav zzcw;
    private com.google.android.gms.wearable.internal.zzbs zzda;

    @Override // com.google.android.gms.wearable.internal.zzei
    public final void zza(int i17, int i18) {
        com.google.android.gms.wearable.internal.zzbs zzbsVar;
        com.google.android.gms.wearable.internal.zzav zzavVar;
        synchronized (this.lock) {
            zzbsVar = this.zzda;
            zzavVar = new com.google.android.gms.wearable.internal.zzav(i17, i18);
            this.zzcw = zzavVar;
        }
        if (zzbsVar != null) {
            zzbsVar.zzb(zzavVar);
        }
    }

    public final void zza(com.google.android.gms.wearable.internal.zzbs zzbsVar) {
        com.google.android.gms.wearable.internal.zzav zzavVar;
        synchronized (this.lock) {
            this.zzda = (com.google.android.gms.wearable.internal.zzbs) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbsVar);
            zzavVar = this.zzcw;
        }
        if (zzavVar != null) {
            zzbsVar.zzb(zzavVar);
        }
    }
}
