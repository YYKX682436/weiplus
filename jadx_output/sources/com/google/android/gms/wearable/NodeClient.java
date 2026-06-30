package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public abstract class NodeClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.wearable.Wearable.WearableOptions> {
    public NodeClient(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }

    public abstract com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.wearable.Node>> getConnectedNodes();

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.Node> getLocalNode();

    public NodeClient(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }
}
