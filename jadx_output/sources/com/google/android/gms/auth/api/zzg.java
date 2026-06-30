package com.google.android.gms.auth.api;

/* loaded from: classes13.dex */
final class zzg extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzbh, com.google.android.gms.auth.api.zzh> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.internal.auth.zzbh buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.zzh zzhVar, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.auth.zzbh(context, looper, clientSettings, zzhVar, connectionCallbacks, onConnectionFailedListener);
    }
}
