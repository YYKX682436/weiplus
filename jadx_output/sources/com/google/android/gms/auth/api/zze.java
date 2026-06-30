package com.google.android.gms.auth.api;

/* loaded from: classes13.dex */
final class zze extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.auth.api.signin.internal.zzh, com.google.android.gms.auth.api.signin.GoogleSignInOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zzh buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.auth.api.signin.internal.zzh(context, looper, clientSettings, googleSignInOptions, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final /* synthetic */ java.util.List getImpliedScopes(java.lang.Object obj) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
        return googleSignInOptions == null ? java.util.Collections.emptyList() : googleSignInOptions.getScopes();
    }
}
