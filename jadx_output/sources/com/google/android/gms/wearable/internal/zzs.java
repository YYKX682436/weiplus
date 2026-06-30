package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzs extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult> {
    private final /* synthetic */ java.lang.String zzbp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(com.google.android.gms.wearable.internal.zzo zzoVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super(googleApiClient);
        this.zzbp = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzu(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zzb(new com.google.android.gms.wearable.internal.zzhd(this), this.zzbp);
    }
}
