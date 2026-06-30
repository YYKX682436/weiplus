package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzbz extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.DataItemBuffer> {
    public zzbz(com.google.android.gms.wearable.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.DataItemBuffer(com.google.android.gms.common.data.DataHolder.empty(status.getStatusCode()));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzgw(this));
    }
}
