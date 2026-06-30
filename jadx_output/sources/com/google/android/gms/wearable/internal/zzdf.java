package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdf extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.wearable.DataItem {
    private final int zzdl;

    public zzdf(com.google.android.gms.common.data.DataHolder dataHolder, int i17, int i18) {
        super(dataHolder, i17);
        this.zzdl = i18;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.wearable.DataItem freeze() {
        return new com.google.android.gms.wearable.internal.zzdc(this);
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final java.util.Map<java.lang.String, com.google.android.gms.wearable.DataItemAsset> getAssets() {
        java.util.HashMap hashMap = new java.util.HashMap(this.zzdl);
        for (int i17 = 0; i17 < this.zzdl; i17++) {
            com.google.android.gms.wearable.internal.zzdb zzdbVar = new com.google.android.gms.wearable.internal.zzdb(this.mDataHolder, this.mDataRow + i17);
            if (zzdbVar.getDataItemKey() != null) {
                hashMap.put(zzdbVar.getDataItemKey(), zzdbVar);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final byte[] getData() {
        return getByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final android.net.Uri getUri() {
        return android.net.Uri.parse(getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
    }

    @Override // com.google.android.gms.wearable.DataItem
    public final com.google.android.gms.wearable.DataItem setData(byte[] bArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        boolean isLoggable = android.util.Log.isLoggable("DataItem", 3);
        byte[] data = getData();
        java.util.Map<java.lang.String, com.google.android.gms.wearable.DataItemAsset> assets = getAssets();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemRef{ ");
        java.lang.String valueOf = java.lang.String.valueOf(getUri());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 4);
        sb7.append("uri=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        java.lang.String valueOf2 = java.lang.String.valueOf(data == null ? "null" : java.lang.Integer.valueOf(data.length));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(valueOf2.length() + 9);
        sb8.append(", dataSz=");
        sb8.append(valueOf2);
        sb6.append(sb8.toString());
        int size = assets.size();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(23);
        sb9.append(", numAssets=");
        sb9.append(size);
        sb6.append(sb9.toString());
        if (isLoggable && !assets.isEmpty()) {
            sb6.append(", assets=[");
            java.lang.String str = "";
            for (java.util.Map.Entry<java.lang.String, com.google.android.gms.wearable.DataItemAsset> entry : assets.entrySet()) {
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
