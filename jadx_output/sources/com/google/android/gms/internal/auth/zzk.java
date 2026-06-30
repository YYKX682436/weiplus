package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzk implements com.google.android.gms.auth.account.WorkAccountApi {
    private static final com.google.android.gms.common.api.Status zzaf = new com.google.android.gms.common.api.Status(13);

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult> addWorkAccount(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzm(this, com.google.android.gms.auth.account.WorkAccount.API, googleApiClient, str));
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> removeWorkAccount(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.accounts.Account account) {
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzo(this, com.google.android.gms.auth.account.WorkAccount.API, googleApiClient, account));
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final void setWorkAuthenticatorEnabled(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z17) {
        setWorkAuthenticatorEnabledWithResult(googleApiClient, z17);
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Result> setWorkAuthenticatorEnabledWithResult(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z17) {
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzl(this, com.google.android.gms.auth.account.WorkAccount.API, googleApiClient, z17));
    }
}
