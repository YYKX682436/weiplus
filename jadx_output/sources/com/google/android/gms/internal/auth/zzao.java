package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzao implements com.google.android.gms.auth.api.credentials.CredentialsApi {
    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> delete(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzas(this, googleApiClient, credential));
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableAutoSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzat(this, googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final android.app.PendingIntent getHintPickerIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.HintRequest hintRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hintRequest, "request must not be null");
        return com.google.android.gms.internal.auth.zzaw.zzd(googleApiClient.getContext(), ((com.google.android.gms.internal.auth.zzax) googleApiClient.getClient(com.google.android.gms.auth.api.Auth.zzaj)).zzk(), hintRequest);
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.credentials.CredentialRequestResult> request(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialRequest, "request must not be null");
        return googleApiClient.enqueue(new com.google.android.gms.internal.auth.zzap(this, googleApiClient, credentialRequest));
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> save(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzar(this, googleApiClient, credential));
    }
}
