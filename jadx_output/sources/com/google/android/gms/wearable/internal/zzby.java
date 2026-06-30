package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzby extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.DataApi.DataItemResult> {
    private final /* synthetic */ android.net.Uri zzco;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(com.google.android.gms.wearable.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri) {
        super(googleApiClient);
        this.zzco = uri;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzcg(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzgv(this), this.zzco);
    }
}
