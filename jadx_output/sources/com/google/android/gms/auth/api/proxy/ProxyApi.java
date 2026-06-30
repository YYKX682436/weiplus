package com.google.android.gms.auth.api.proxy;

/* loaded from: classes13.dex */
public interface ProxyApi {

    /* loaded from: classes13.dex */
    public interface ProxyResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.auth.api.proxy.ProxyResponse getResponse();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult> performProxyRequest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest);
}
