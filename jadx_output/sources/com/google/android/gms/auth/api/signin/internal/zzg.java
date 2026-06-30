package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zzg implements com.google.android.gms.auth.api.signin.GoogleSignInApi {
    private static com.google.android.gms.auth.api.signin.GoogleSignInOptions zzd(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return ((com.google.android.gms.auth.api.signin.internal.zzh) googleApiClient.getClient(com.google.android.gms.auth.api.Auth.zzak)).zzn();
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzi.zzd(googleApiClient.getContext(), zzd(googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent intent) {
        return com.google.android.gms.auth.api.signin.internal.zzi.getSignInResultFromIntent(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> revokeAccess(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzi.zze(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzi.zzd(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> silentSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zzi.zzd(googleApiClient, googleApiClient.getContext(), zzd(googleApiClient), false);
    }
}
