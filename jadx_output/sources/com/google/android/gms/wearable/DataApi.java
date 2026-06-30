package com.google.android.gms.wearable;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public interface DataApi {
    public static final java.lang.String ACTION_DATA_CHANGED = "com.google.android.gms.wearable.DATA_CHANGED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface DataItemResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.wearable.DataItem getDataItem();
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface DataListener {
        void onDataChanged(com.google.android.gms.wearable.DataEventBuffer dataEventBuffer);
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface DeleteDataItemsResult extends com.google.android.gms.common.api.Result {
        int getNumDeleted();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface GetFdForAssetResult extends com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
        android.os.ParcelFileDescriptor getFd();

        java.io.InputStream getInputStream();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener, android.net.Uri uri, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DeleteDataItemsResult> deleteDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DeleteDataItemsResult> deleteDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DataItemResult> getDataItem(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataItemBuffer> getDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataItemBuffer> getDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataItemBuffer> getDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.GetFdForAssetResult> getFdForAsset(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.Asset asset);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.GetFdForAssetResult> getFdForAsset(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataItemAsset dataItemAsset);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DataItemResult> putDataItem(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.PutDataRequest putDataRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener);
}
