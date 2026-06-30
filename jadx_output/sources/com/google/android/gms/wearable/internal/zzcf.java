package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzcf extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.wearable.DataApi.DataListener zzdf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(com.google.android.gms.wearable.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener) {
        super(googleApiClient);
        this.zzdf = dataListener;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        zzhgVar.zza(this, this.zzdf);
    }
}
