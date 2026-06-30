package com.google.android.gms.auth.api;

/* loaded from: classes13.dex */
final class zzd extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzax, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.internal.auth.zzax buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.auth.zzax(context, looper, clientSettings, authCredentialsOptions, connectionCallbacks, onConnectionFailedListener);
    }
}
