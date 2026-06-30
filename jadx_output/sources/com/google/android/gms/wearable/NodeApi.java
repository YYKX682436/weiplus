package com.google.android.gms.wearable;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public interface NodeApi {

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface GetConnectedNodesResult extends com.google.android.gms.common.api.Result {
        java.util.List<com.google.android.gms.wearable.Node> getNodes();
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface GetLocalNodeResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.wearable.Node getNode();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult> getConnectedNodes(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.NodeApi.GetLocalNodeResult> getLocalNode(com.google.android.gms.common.api.GoogleApiClient googleApiClient);
}
