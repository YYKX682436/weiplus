package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.wearable.DataItem {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzdd> CREATOR = new com.google.android.gms.wearable.internal.zzde();
    private byte[] data;
    private final android.net.Uri uri;
    private final java.util.Map<java.lang.String, com.google.android.gms.wearable.DataItemAsset> zzdo;

    public zzdd(android.net.Uri uri, android.os.Bundle bundle, byte[] bArr) {
        this.uri = uri;
        java.util.HashMap hashMap = new java.util.HashMap();
        bundle.setClassLoader(com.google.android.gms.wearable.internal.DataItemAssetParcelable.class.getClassLoader());
        for (java.lang.String str : bundle.keySet()) {
            hashMap.put(str, (com.google.android.gms.wearable.internal.DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.zzdo = hashMap;
        this.data = bArr;
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
    public final /* synthetic */ com.google.android.gms.wearable.DataItem setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        boolean isLoggable = android.util.Log.isLoggable("DataItem", 3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemParcelable[@");
        sb6.append(java.lang.Integer.toHexString(hashCode()));
        byte[] bArr = this.data;
        java.lang.String valueOf = java.lang.String.valueOf(bArr == null ? "null" : java.lang.Integer.valueOf(bArr.length));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 8);
        sb7.append(",dataSz=");
        sb7.append(valueOf);
        sb6.append(sb7.toString());
        int size = this.zzdo.size();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(23);
        sb8.append(", numAssets=");
        sb8.append(size);
        sb6.append(sb8.toString());
        java.lang.String valueOf2 = java.lang.String.valueOf(this.uri);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(valueOf2.length() + 6);
        sb9.append(", uri=");
        sb9.append(valueOf2);
        sb6.append(sb9.toString());
        if (isLoggable) {
            sb6.append("]\n  assets: ");
            for (java.lang.String str2 : this.zzdo.keySet()) {
                java.lang.String valueOf3 = java.lang.String.valueOf(this.zzdo.get(str2));
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7 + valueOf3.length());
                sb10.append("\n    ");
                sb10.append(str2);
                sb10.append(": ");
                sb10.append(valueOf3);
                sb6.append(sb10.toString());
            }
            str = "\n  ]";
        } else {
            str = "]";
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getUri(), i17, false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.setClassLoader(com.google.android.gms.wearable.internal.DataItemAssetParcelable.class.getClassLoader());
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.wearable.DataItemAsset> entry : this.zzdo.entrySet()) {
            bundle.putParcelable(entry.getKey(), new com.google.android.gms.wearable.internal.DataItemAssetParcelable(entry.getValue()));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, getData(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
