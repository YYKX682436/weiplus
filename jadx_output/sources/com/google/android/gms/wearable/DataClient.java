package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public abstract class DataClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.wearable.Wearable.WearableOptions> {
    public static final java.lang.String ACTION_DATA_CHANGED = "com.google.android.gms.wearable.DATA_CHANGED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    /* loaded from: classes13.dex */
    public static abstract class GetFdForAssetResponse implements com.google.android.gms.common.api.Releasable {
        public abstract android.os.ParcelFileDescriptor getFdForAsset();

        public abstract java.io.InputStream getInputStream();
    }

    /* loaded from: classes13.dex */
    public interface OnDataChangedListener extends com.google.android.gms.wearable.DataApi.DataListener {
        @Override // com.google.android.gms.wearable.DataApi.DataListener
        void onDataChanged(com.google.android.gms.wearable.DataEventBuffer dataEventBuffer);
    }

    public DataClient(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener, android.net.Uri uri, int i17);

    public abstract com.google.android.gms.tasks.Task<java.lang.Integer> deleteDataItems(android.net.Uri uri);

    public abstract com.google.android.gms.tasks.Task<java.lang.Integer> deleteDataItems(android.net.Uri uri, int i17);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItem> getDataItem(android.net.Uri uri);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItemBuffer> getDataItems();

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItemBuffer> getDataItems(android.net.Uri uri);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItemBuffer> getDataItems(android.net.Uri uri, int i17);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataClient.GetFdForAssetResponse> getFdForAsset(com.google.android.gms.wearable.Asset asset);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataClient.GetFdForAssetResponse> getFdForAsset(com.google.android.gms.wearable.DataItemAsset dataItemAsset);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.DataItem> putDataItem(com.google.android.gms.wearable.PutDataRequest putDataRequest);

    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.DataClient.OnDataChangedListener onDataChangedListener);

    public DataClient(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }
}
