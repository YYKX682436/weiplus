package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzcb extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.DataApi.DeleteDataItemsResult> {
    private final /* synthetic */ android.net.Uri zzco;
    private final /* synthetic */ int zzdc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcb(com.google.android.gms.wearable.internal.zzbw zzbwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, int i17) {
        super(googleApiClient);
        this.zzco = uri;
        this.zzdc = i17;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzch(status, 0);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zzb(new com.google.android.gms.wearable.internal.zzgp(this), this.zzco, this.zzdc);
    }
}
