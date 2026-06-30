package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzbb extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.Channel.GetInputStreamResult> {
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzay zzcm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(com.google.android.gms.wearable.internal.zzay zzayVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzcm = zzayVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzbg(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        java.lang.String str;
        str = this.zzcm.zzce;
        com.google.android.gms.wearable.internal.zzbr zzbrVar = new com.google.android.gms.wearable.internal.zzbr();
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzgs(this, zzbrVar), zzbrVar, str);
    }
}
