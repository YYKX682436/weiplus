package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public interface DataItem extends com.google.android.gms.common.data.Freezable<com.google.android.gms.wearable.DataItem> {
    java.util.Map<java.lang.String, com.google.android.gms.wearable.DataItemAsset> getAssets();

    byte[] getData();

    android.net.Uri getUri();

    com.google.android.gms.wearable.DataItem setData(byte[] bArr);
}
