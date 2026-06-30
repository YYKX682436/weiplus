package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdb extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.wearable.DataItemAsset {
    public zzdb(com.google.android.gms.common.data.DataHolder dataHolder, int i17) {
        super(dataHolder, i17);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.wearable.DataItemAsset freeze() {
        return new com.google.android.gms.wearable.internal.zzcz(this);
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final java.lang.String getDataItemKey() {
        return getString("asset_key");
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final java.lang.String getId() {
        return getString("asset_id");
    }
}
