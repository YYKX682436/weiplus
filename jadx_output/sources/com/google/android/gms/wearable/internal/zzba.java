package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzba extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzay zzcm;
    private final /* synthetic */ int zzcn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(com.google.android.gms.wearable.internal.zzay zzayVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i17) {
        super(googleApiClient);
        this.zzcm = zzayVar;
        this.zzcn = i17;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        java.lang.String str;
        str = this.zzcm.zzce;
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zzb(new com.google.android.gms.wearable.internal.zzgo(this), str, this.zzcn);
    }
}
