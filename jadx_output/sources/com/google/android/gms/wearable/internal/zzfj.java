package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfj implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult {
    private final java.util.List<com.google.android.gms.wearable.Node> zzdx;
    private final com.google.android.gms.common.api.Status zzp;

    public zzfj(com.google.android.gms.common.api.Status status, java.util.List<com.google.android.gms.wearable.Node> list) {
        this.zzp = status;
        this.zzdx = list;
    }

    @Override // com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
    public final java.util.List<com.google.android.gms.wearable.Node> getNodes() {
        return this.zzdx;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}
