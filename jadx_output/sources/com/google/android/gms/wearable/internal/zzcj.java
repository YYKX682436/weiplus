package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzcj extends com.google.android.gms.wearable.DataClient {
    private final com.google.android.gms.wearable.DataApi zzdi;

    public zzcj(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzdi = new com.google.android.gms.wearable.internal.zzbw();
    }

    private final com.google.android.gms.tasks.Task<java.lang.Void> zza(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener, android.content.IntentFilter[] intentFilterArr) {
        com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onDataChangedListener, getLooper(), "DataListener");
        com.google.android.gms.wearable.internal.zzct zzctVar = null;
        return doRegisterEventListener(new com.google.android.gms.wearable.internal.zzcv(onDataChangedListener, intentFilterArr, createListenerHolder), new com.google.android.gms.wearable.internal.zzcw(onDataChangedListener, createListenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener) {
        return zza(onDataChangedListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> deleteDataItems(android.net.Uri uri) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.deleteDataItems(asGoogleApiClient(), uri), com.google.android.gms.wearable.internal.zzcp.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItem> getDataItem(android.net.Uri uri) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.getDataItem(asGoogleApiClient(), uri), com.google.android.gms.wearable.internal.zzcl.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItemBuffer> getDataItems() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient()), com.google.android.gms.wearable.internal.zzcm.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataClient.GetFdForAssetResponse> getFdForAsset(com.google.android.gms.wearable.Asset asset) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.getFdForAsset(asGoogleApiClient(), asset), com.google.android.gms.wearable.internal.zzcr.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItem> putDataItem(com.google.android.gms.wearable.PutDataRequest putDataRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.putDataItem(asGoogleApiClient(), putDataRequest), com.google.android.gms.wearable.internal.zzck.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onDataChangedListener, getLooper(), "DataListener").getListenerKey());
    }

    public zzcj(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, settings);
        this.zzdi = new com.google.android.gms.wearable.internal.zzbw();
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener, android.net.Uri uri, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri, "uri must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(onDataChangedListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zza("com.google.android.gms.wearable.DATA_CHANGED", uri, i17)});
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> deleteDataItems(android.net.Uri uri, int i17) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.deleteDataItems(asGoogleApiClient(), uri, i17), com.google.android.gms.wearable.internal.zzcq.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItemBuffer> getDataItems(android.net.Uri uri) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient(), uri), com.google.android.gms.wearable.internal.zzcn.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataClient.GetFdForAssetResponse> getFdForAsset(com.google.android.gms.wearable.DataItemAsset dataItemAsset) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.getFdForAsset(asGoogleApiClient(), dataItemAsset), com.google.android.gms.wearable.internal.zzcs.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItemBuffer> getDataItems(android.net.Uri uri, int i17) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient(), uri, i17), com.google.android.gms.wearable.internal.zzco.zzbx);
    }
}
