package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzcz implements com.google.android.gms.wearable.DataItemAsset {
    private final java.lang.String zzdm;
    private final java.lang.String zzdn;

    public zzcz(com.google.android.gms.wearable.DataItemAsset dataItemAsset) {
        this.zzdm = dataItemAsset.getId();
        this.zzdn = dataItemAsset.getDataItemKey();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.wearable.DataItemAsset freeze() {
        return this;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final java.lang.String getDataItemKey() {
        return this.zzdn;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final java.lang.String getId() {
        return this.zzdm;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataItemAssetEntity[@");
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
}
