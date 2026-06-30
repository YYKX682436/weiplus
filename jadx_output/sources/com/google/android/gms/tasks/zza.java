package com.google.android.gms.tasks;

/* loaded from: classes13.dex */
final class zza implements com.google.android.gms.tasks.OnSuccessListener {
    final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zza;

    public zza(com.google.android.gms.tasks.zzb zzbVar, com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object obj) {
        this.zza.onCanceled();
    }
}
