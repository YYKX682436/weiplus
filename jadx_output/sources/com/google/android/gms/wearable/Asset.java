package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class Asset extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.Asset> CREATOR = new com.google.android.gms.wearable.zze();
    private byte[] data;
    private android.net.Uri uri;
    private java.lang.String zze;
    private android.os.ParcelFileDescriptor zzf;

    public Asset(byte[] bArr, java.lang.String str, android.os.ParcelFileDescriptor parcelFileDescriptor, android.net.Uri uri) {
        this.data = bArr;
        this.zze = str;
        this.zzf = parcelFileDescriptor;
        this.uri = uri;
    }

    public static com.google.android.gms.wearable.Asset createFromBytes(byte[] bArr) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(bArr);
        return new com.google.android.gms.wearable.Asset(bArr, null, null, null);
    }

    public static com.google.android.gms.wearable.Asset createFromFd(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(parcelFileDescriptor);
        return new com.google.android.gms.wearable.Asset(null, null, parcelFileDescriptor, null);
    }

    public static com.google.android.gms.wearable.Asset createFromRef(java.lang.String str) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(str);
        return new com.google.android.gms.wearable.Asset(null, str, null, null);
    }

    public static com.google.android.gms.wearable.Asset createFromUri(android.net.Uri uri) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(uri);
        return new com.google.android.gms.wearable.Asset(null, null, null, uri);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.wearable.Asset)) {
            return false;
        }
        com.google.android.gms.wearable.Asset asset = (com.google.android.gms.wearable.Asset) obj;
        return java.util.Arrays.equals(this.data, asset.data) && com.google.android.gms.common.internal.Objects.equal(this.zze, asset.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, asset.zzf) && com.google.android.gms.common.internal.Objects.equal(this.uri, asset.uri);
    }

    public final byte[] getData() {
        return this.data;
    }

    public java.lang.String getDigest() {
        return this.zze;
    }

    public android.os.ParcelFileDescriptor getFd() {
        return this.zzf;
    }

    public android.net.Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return java.util.Arrays.deepHashCode(new java.lang.Object[]{this.data, this.zze, this.zzf, this.uri});
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Asset[@");
        sb6.append(java.lang.Integer.toHexString(hashCode()));
        if (this.zze == null) {
            str = ", nodigest";
        } else {
            sb6.append(", ");
            str = this.zze;
        }
        sb6.append(str);
        if (this.data != null) {
            sb6.append(", size=");
            sb6.append(this.data.length);
        }
        if (this.zzf != null) {
            sb6.append(", fd=");
            sb6.append(this.zzf);
        }
        if (this.uri != null) {
            sb6.append(", uri=");
            sb6.append(this.uri);
        }
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(parcel);
        int i18 = i17 | 1;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, this.data, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getDigest(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzf, i18, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.uri, i18, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
