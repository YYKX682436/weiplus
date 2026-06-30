package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzbw implements com.google.android.gms.wearable.DataApi {
    private static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener, android.content.IntentFilter[] intentFilterArr) {
        return com.google.android.gms.wearable.internal.zzb.zza(googleApiClient, new com.google.android.gms.wearable.internal.zzce(intentFilterArr), dataListener);
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener) {
        return zza(googleApiClient, dataListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DeleteDataItemsResult> deleteDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri) {
        return deleteDataItems(googleApiClient, uri, 0);
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DataItemResult> getDataItem(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzby(this, googleApiClient, uri));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataItemBuffer> getDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzbz(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.GetFdForAssetResult> getFdForAsset(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.Asset asset) {
        if (asset == null) {
            throw new java.lang.IllegalArgumentException("asset is null");
        }
        if (asset.getDigest() == null) {
            throw new java.lang.IllegalArgumentException("invalid asset");
        }
        if (asset.getData() == null) {
            return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzcc(this, googleApiClient, asset));
        }
        throw new java.lang.IllegalArgumentException("invalid asset");
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DataItemResult> putDataItem(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.PutDataRequest putDataRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzbx(this, googleApiClient, putDataRequest));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzcf(this, googleApiClient, dataListener));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataApi.DataListener dataListener, android.net.Uri uri, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri, "uri must not be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(googleApiClient, dataListener, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zza("com.google.android.gms.wearable.DATA_CHANGED", uri, i17)});
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.DeleteDataItemsResult> deleteDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri, "uri must not be null");
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z17, "invalid filter type");
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzcb(this, googleApiClient, uri, i17));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataItemBuffer> getDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri) {
        return getDataItems(googleApiClient, uri, 0);
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataApi.GetFdForAssetResult> getFdForAsset(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.DataItemAsset dataItemAsset) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzcd(this, googleApiClient, dataItemAsset));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.DataItemBuffer> getDataItems(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri, "uri must not be null");
        boolean z17 = true;
        if (i17 != 0 && i17 != 1) {
            z17 = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z17, "invalid filter type");
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzca(this, googleApiClient, uri, i17));
    }
}
