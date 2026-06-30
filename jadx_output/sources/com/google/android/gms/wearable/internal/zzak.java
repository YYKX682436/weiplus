package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzak extends com.google.android.gms.wearable.internal.zzn<com.google.android.gms.wearable.ChannelApi.OpenChannelResult> {
    private final /* synthetic */ java.lang.String zzcb;
    private final /* synthetic */ java.lang.String zzcc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(com.google.android.gms.wearable.internal.zzaj zzajVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2) {
        super(googleApiClient);
        this.zzcb = str;
        this.zzcc = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.wearable.internal.zzam(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.wearable.internal.zzhg zzhgVar) {
        ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzha(this), this.zzcb, this.zzcc);
    }
}
