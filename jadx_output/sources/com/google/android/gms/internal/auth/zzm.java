package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzm extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult, com.google.android.gms.internal.auth.zzu> {
    private final /* synthetic */ java.lang.String zzt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(com.google.android.gms.internal.auth.zzk zzkVar, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super((com.google.android.gms.common.api.Api<?>) api, googleApiClient);
        this.zzt = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzr(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzu zzuVar) {
        ((com.google.android.gms.auth.account.zzf) zzuVar.getService()).zzd(new com.google.android.gms.internal.auth.zzn(this), this.zzt);
    }
}
