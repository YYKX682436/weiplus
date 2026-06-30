package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class PutDataRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final java.lang.String WEAR_URI_SCHEME = "wear";
    private byte[] data;
    private final android.net.Uri uri;
    private final android.os.Bundle zzv;
    private long zzw;
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.PutDataRequest> CREATOR = new com.google.android.gms.wearable.zzh();
    private static final long zzt = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);
    private static final java.util.Random zzu = new java.security.SecureRandom();

    private PutDataRequest(android.net.Uri uri) {
        this(uri, new android.os.Bundle(), null, zzt);
    }

    public static com.google.android.gms.wearable.PutDataRequest create(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "path must not be null");
        return zza(zza(str));
    }

    public static com.google.android.gms.wearable.PutDataRequest createFromDataItem(com.google.android.gms.wearable.DataItem dataItem) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(dataItem, "source must not be null");
        com.google.android.gms.wearable.PutDataRequest zza = zza(dataItem.getUri());
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.wearable.DataItemAsset> entry : dataItem.getAssets().entrySet()) {
            if (entry.getValue().getId() == null) {
                java.lang.String valueOf = java.lang.String.valueOf(entry.getKey());
                throw new java.lang.IllegalStateException(valueOf.length() != 0 ? "Cannot create an asset for a put request without a digest: ".concat(valueOf) : new java.lang.String("Cannot create an asset for a put request without a digest: "));
            }
            zza.putAsset(entry.getKey(), com.google.android.gms.wearable.Asset.createFromRef(entry.getValue().getId()));
        }
        zza.setData(dataItem.getData());
        return zza;
    }

    public static com.google.android.gms.wearable.PutDataRequest createWithAutoAppendedId(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "pathPrefix must not be null");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        if (!str.endsWith("/")) {
            sb6.append("/");
        }
        sb6.append("PN");
        sb6.append(zzu.nextLong());
        return new com.google.android.gms.wearable.PutDataRequest(zza(sb6.toString()));
    }

    private static android.net.Uri zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new java.lang.IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new java.lang.IllegalArgumentException("A path must start with a single / .");
        }
        return new android.net.Uri.Builder().scheme(WEAR_URI_SCHEME).path(str).build();
    }

    public com.google.android.gms.wearable.Asset getAsset(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "key must not be null");
        return (com.google.android.gms.wearable.Asset) this.zzv.getParcelable(str);
    }

    public java.util.Map<java.lang.String, com.google.android.gms.wearable.Asset> getAssets() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.zzv.keySet()) {
            hashMap.put(str, (com.google.android.gms.wearable.Asset) this.zzv.getParcelable(str));
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public byte[] getData() {
        return this.data;
    }

    public android.net.Uri getUri() {
        return this.uri;
    }

    public boolean hasAsset(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "key must not be null");
        return this.zzv.containsKey(str);
    }

    public boolean isUrgent() {
        return this.zzw == 0;
    }

    public com.google.android.gms.wearable.PutDataRequest putAsset(java.lang.String str, com.google.android.gms.wearable.Asset asset) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(asset);
        this.zzv.putParcelable(str, asset);
        return this;
    }

    public com.google.android.gms.wearable.PutDataRequest removeAsset(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str, "key must not be null");
        this.zzv.remove(str);
        return this;
    }

    public com.google.android.gms.wearable.PutDataRequest setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public com.google.android.gms.wearable.PutDataRequest setUrgent() {
        this.zzw = 0L;
        return this;
    }

    public java.lang.String toString() {
        return toString(android.util.Log.isLoggable(com.google.android.gms.wearable.DataMap.TAG, 3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(parcel, "dest must not be null");
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getUri(), i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 4, this.zzv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, getData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public PutDataRequest(android.net.Uri uri, android.os.Bundle bundle, byte[] bArr, long j17) {
        this.uri = uri;
        this.zzv = bundle;
        bundle.setClassLoader(com.google.android.gms.wearable.internal.DataItemAssetParcelable.class.getClassLoader());
        this.data = bArr;
        this.zzw = j17;
    }

    public static com.google.android.gms.wearable.PutDataRequest zza(android.net.Uri uri) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri, "uri must not be null");
        return new com.google.android.gms.wearable.PutDataRequest(uri);
    }

    public java.lang.String toString(boolean z17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PutDataRequest[");
        byte[] bArr = this.data;
        java.lang.String valueOf = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 7);
        sb7.append("dataSz=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        int size = this.zzv.size();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(23);
        sb8.append(", numAssets=");
        sb8.append(size);
        sb6.append(sb8.toString());
        java.lang.String valueOf2 = java.lang.String.valueOf(this.uri);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(valueOf2.length() + 6);
        sb9.append(", uri=");
        sb9.append(valueOf2);
        sb6.append(sb9.toString());
        long j17 = this.zzw;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder(35);
        sb10.append(", syncDeadline=");
        sb10.append(j17);
        sb6.append(sb10.toString());
        if (z17) {
            sb6.append("]\n  assets: ");
            for (java.lang.String str2 : this.zzv.keySet()) {
                java.lang.String valueOf3 = java.lang.String.valueOf(this.zzv.getParcelable(str2));
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7 + valueOf3.length());
                sb11.append("\n    ");
                sb11.append(str2);
                sb11.append(": ");
                sb11.append(valueOf3);
                sb6.append(sb11.toString());
            }
            str = "\n  ]";
        } else {
            str = "]";
        }
        sb6.append(str);
        return sb6.toString();
    }
}
