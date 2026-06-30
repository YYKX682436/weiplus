package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfk implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult {
    private final com.google.android.gms.wearable.Node zzel;
    private final com.google.android.gms.common.api.Status zzp;

    public zzfk(com.google.android.gms.common.api.Status status, com.google.android.gms.wearable.Node node) {
        this.zzp = status;
        this.zzel = node;
    }

    @Override // com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    public final com.google.android.gms.wearable.Node getNode() {
        return this.zzel;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}
