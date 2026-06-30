package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfl extends com.google.android.gms.wearable.NodeClient {
    private final com.google.android.gms.wearable.NodeApi zzem;

    public zzfl(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzem = new com.google.android.gms.wearable.internal.zzfg();
    }

    @Override // com.google.android.gms.wearable.NodeClient
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.wearable.Node>> getConnectedNodes() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzem.getConnectedNodes(asGoogleApiClient()), com.google.android.gms.wearable.internal.zzfn.zzbx);
    }

    @Override // com.google.android.gms.wearable.NodeClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.Node> getLocalNode() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzem.getLocalNode(asGoogleApiClient()), com.google.android.gms.wearable.internal.zzfm.zzbx);
    }

    public zzfl(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, settings);
        this.zzem = new com.google.android.gms.wearable.internal.zzfg();
    }
}
