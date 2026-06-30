package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzq extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult> {
    private final /* synthetic */ int zzbq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(com.google.android.gms.wearable.internal.zzo zzoVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i17) {
        super(googleApiClient);
        this.zzbq = i17;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzx(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzgq(this), this.zzbq);
    }
}
