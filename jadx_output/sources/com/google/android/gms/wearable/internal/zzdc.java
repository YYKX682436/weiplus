package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdc implements com.google.android.gms.wearable.DataItem {
    private byte[] data;
    private android.net.Uri uri;
    private java.util.Map<java.lang.String, com.google.android.gms.wearable.DataItemAsset> zzdo;

    public zzdc(com.google.android.gms.wearable.DataItem dataItem) {
        this.uri = dataItem.getUri();
        this.data = dataItem.getData();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.wearable.DataItemAsset> entry : dataItem.getAssets().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put(entry.getKey(), entry.getValue().freeze());
            }
        }
        this.zzdo = java.util.Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.wearable.DataItem freeze() {
        return this;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final java.util.Map<java.lang.String, com.google.android.gms.wearable.DataItemAsset> getAssets() {
        return this.zzdo;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() {
        return this.data;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final android.net.Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final com.google.android.gms.wearable.DataItem setData(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        boolean isLoggable = android.util.Log.isLoggable("DataItem", 3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemEntity{ ");
        java.lang.String valueOf = java.lang.String.valueOf(this.uri);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 4);
        sb7.append("uri=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        byte[] bArr = this.data;
        java.lang.String valueOf2 = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(valueOf2.length() + 9);
        sb8.append(", dataSz=");
        sb8.append(valueOf2);
        sb6.append(sb8.toString());
        int size = this.zzdo.size();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(23);
        sb9.append(", numAssets=");
        sb9.append(size);
        sb6.append(sb9.toString());
        if (isLoggable && !this.zzdo.isEmpty()) {
            sb6.append(", assets=[");
            java.lang.String str = "";
            for (java.util.Map.Entry<java.lang.String, com.google.android.gms.wearable.DataItemAsset> entry : this.zzdo.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String id6 = entry.getValue().getId();
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(str.length() + 2 + java.lang.String.valueOf(key).length() + java.lang.String.valueOf(id6).length());
                sb10.append(str);
                sb10.append(key);
                sb10.append(": ");
                sb10.append(id6);
                sb6.append(sb10.toString());
                str = ", ";
            }
            sb6.append("]");
        }
        sb6.append(" }");
        return sb6.toString();
    }
}
