package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc {
    public final int zza;
    public final android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i17, android.os.Bundle bundle) {
        super(baseGmsClient, java.lang.Boolean.TRUE);
        this.zzc = baseGmsClient;
        this.zza = i17;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        if (this.zza != 0) {
            this.zzc.zzp(1, null);
            android.os.Bundle bundle = this.zzb;
            zzb(new com.google.android.gms.common.ConnectionResult(this.zza, bundle != null ? (android.app.PendingIntent) bundle.getParcelable(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else {
            if (zzd()) {
                return;
            }
            this.zzc.zzp(1, null);
            zzb(new com.google.android.gms.common.ConnectionResult(8, null));
        }
    }

    public abstract void zzb(com.google.android.gms.common.ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
    }

    public abstract boolean zzd();
}
