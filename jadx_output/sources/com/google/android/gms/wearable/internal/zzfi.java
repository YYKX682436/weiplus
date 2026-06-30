package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzfi extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult> {
    public zzfi(com.google.android.gms.wearable.internal.zzfg zzfgVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzfj(status, new java.util.ArrayList());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zzc(new com.google.android.gms.wearable.internal.zzgu(this));
    }
}
