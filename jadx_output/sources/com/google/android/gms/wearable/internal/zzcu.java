package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzcu extends com.google.android.gms.wearable.DataClient.GetFdForAssetResponse {
    private final com.google.android.gms.wearable.DataApi.GetFdForAssetResult zzdj;

    public zzcu(com.google.android.gms.wearable.DataApi.GetFdForAssetResult getFdForAssetResult) {
        this.zzdj = getFdForAssetResult;
    }

    @Override // com.google.android.gms.wearable.DataClient.GetFdForAssetResponse
    public final android.os.ParcelFileDescriptor getFdForAsset() {
        return this.zzdj.getFd();
    }

    @Override // com.google.android.gms.wearable.DataClient.GetFdForAssetResponse
    public final java.io.InputStream getInputStream() {
        return this.zzdj.getInputStream();
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        this.zzdj.release();
    }
}
