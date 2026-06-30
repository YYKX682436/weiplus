package com.google.android.gms.internal.auth;

/* loaded from: classes13.dex */
final class zzbq implements com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult {
    private com.google.android.gms.common.api.Status mStatus;
    private com.google.android.gms.auth.api.proxy.ProxyResponse zzee;

    public zzbq(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) {
        this.zzee = proxyResponse;
        this.mStatus = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final com.google.android.gms.auth.api.proxy.ProxyResponse getResponse() {
        return this.zzee;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    public zzbq(com.google.android.gms.common.api.Status status) {
        this.mStatus = status;
    }
}
