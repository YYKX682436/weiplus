package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfg implements com.google.android.gms.wearable.NodeApi {
    @Override // com.google.android.gms.wearable.NodeApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult> getConnectedNodes(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzfi(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.NodeApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.NodeApi.GetLocalNodeResult> getLocalNode(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzfh(this, googleApiClient));
    }
}
