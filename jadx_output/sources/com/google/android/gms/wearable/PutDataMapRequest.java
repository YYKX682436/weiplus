package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class PutDataMapRequest {
    private final com.google.android.gms.wearable.DataMap zzr;
    private final com.google.android.gms.wearable.PutDataRequest zzs;

    private PutDataMapRequest(com.google.android.gms.wearable.PutDataRequest putDataRequest, com.google.android.gms.wearable.DataMap dataMap) {
        this.zzs = putDataRequest;
        com.google.android.gms.wearable.DataMap dataMap2 = new com.google.android.gms.wearable.DataMap();
        this.zzr = dataMap2;
        if (dataMap != null) {
            dataMap2.putAll(dataMap);
        }
    }

    public static com.google.android.gms.wearable.PutDataMapRequest create(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "path must not be null");
        return new com.google.android.gms.wearable.PutDataMapRequest(com.google.android.gms.wearable.PutDataRequest.create(str), null);
    }

    public static com.google.android.gms.wearable.PutDataMapRequest createFromDataMapItem(com.google.android.gms.wearable.DataMapItem dataMapItem) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(dataMapItem, "source must not be null");
        return new com.google.android.gms.wearable.PutDataMapRequest(com.google.android.gms.wearable.PutDataRequest.zza(dataMapItem.getUri()), dataMapItem.getDataMap());
    }

    public static com.google.android.gms.wearable.PutDataMapRequest createWithAutoAppendedId(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "pathPrefix must not be null");
        return new com.google.android.gms.wearable.PutDataMapRequest(com.google.android.gms.wearable.PutDataRequest.createWithAutoAppendedId(str), null);
    }

    public com.google.android.gms.wearable.PutDataRequest asPutDataRequest() {
        com.google.android.gms.internal.wearable.zzf zza = com.google.android.gms.internal.wearable.zze.zza(this.zzr);
        this.zzs.setData(com.google.android.gms.internal.wearable.zzt.zzb(zza.zzfw));
        int size = zza.zzfx.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String num = java.lang.Integer.toString(i17);
            com.google.android.gms.wearable.Asset asset = zza.zzfx.get(i17);
            if (num == null) {
                java.lang.String valueOf = java.lang.String.valueOf(asset);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 26);
                sb6.append("asset key cannot be null: ");
                sb6.append(valueOf);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
            if (asset == null) {
                throw new java.lang.IllegalStateException(num.length() != 0 ? "asset cannot be null: key=".concat(num) : new java.lang.String("asset cannot be null: key="));
            }
            if (android.util.Log.isLoggable(com.google.android.gms.wearable.DataMap.TAG, 3)) {
                new java.lang.StringBuilder(num.length() + 33 + java.lang.String.valueOf(asset).length());
            }
            this.zzs.putAsset(num, asset);
        }
        return this.zzs;
    }

    public com.google.android.gms.wearable.DataMap getDataMap() {
        return this.zzr;
    }

    public android.net.Uri getUri() {
        return this.zzs.getUri();
    }

    public boolean isUrgent() {
        return this.zzs.isUrgent();
    }

    public com.google.android.gms.wearable.PutDataMapRequest setUrgent() {
        this.zzs.setUrgent();
        return this;
    }
}
