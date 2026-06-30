package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
public final class zzbn implements com.google.android.gms.auth.api.proxy.ProxyApi {
    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult> performProxyRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(proxyRequest);
        return googleApiClient.execute(new com.google.android.gms.internal.auth.zzbo(this, googleApiClient, proxyRequest));
    }
}
