package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzo extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.common.api.Result, com.google.android.gms.internal.auth.zzu> {
    private final /* synthetic */ android.accounts.Account zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(com.google.android.gms.internal.auth.zzk zzkVar, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.accounts.Account account) {
        super((com.google.android.gms.common.api.Api<?>) api, googleApiClient);
        this.zzr = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzt(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzu zzuVar) {
        ((com.google.android.gms.auth.account.zzf) zzuVar.getService()).zzd(new com.google.android.gms.internal.auth.zzp(this), this.zzr);
    }
}
