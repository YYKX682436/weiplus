package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public class DataItemAssetParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable, com.google.android.gms.wearable.DataItemAsset {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.DataItemAssetParcelable> CREATOR = new com.google.android.gms.wearable.internal.zzda();
    private final java.lang.String zzdm;
    private final java.lang.String zzdn;

    public DataItemAssetParcelable(com.google.android.gms.wearable.DataItemAsset dataItemAsset) {
        this.zzdm = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataItemAsset.getId());
        this.zzdn = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataItemAsset.getDataItemKey());
    }

    @Override // com.google.android.gms.common.data.Freezable
    public /* bridge */ /* synthetic */ com.google.android.gms.wearable.DataItemAsset freeze() {
        return this;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public java.lang.String getDataItemKey() {
        return this.zzdn;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public java.lang.String getId() {
        return this.zzdm;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemAssetParcelable[@");
        sb6.append(java.lang.Integer.toHexString(hashCode()));
        if (this.zzdm == null) {
            str = ",noid";
        } else {
            sb6.append(",");
            str = this.zzdm;
        }
        sb6.append(str);
        sb6.append(", key=");
        sb6.append(this.zzdn);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getDataItemKey(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public DataItemAssetParcelable(java.lang.String str, java.lang.String str2) {
        this.zzdm = str;
        this.zzdn = str2;
    }
}
