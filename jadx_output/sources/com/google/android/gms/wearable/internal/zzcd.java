package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzcd extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.DataApi.GetFdForAssetResult> {
    private final /* synthetic */ com.google.android.gms.wearable.DataItemAsset zzde;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcd(com.google.android.gms.wearable.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataItemAsset dataItemAsset) {
        super(googleApiClient);
        this.zzde = dataItemAsset;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzci(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        zzhgVar.zza(this, com.google.android.gms.wearable.Asset.createFromRef(this.zzde.getId()));
    }
}
