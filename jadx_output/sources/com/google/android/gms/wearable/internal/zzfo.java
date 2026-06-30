package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.wearable.Node {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzfo> CREATOR = new com.google.android.gms.wearable.internal.zzfp();
    private final java.lang.String zzbk;
    private final java.lang.String zzdm;
    private final int zzen;
    private final boolean zzeo;

    public zzfo(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        this.zzdm = str;
        this.zzbk = str2;
        this.zzen = i17;
        this.zzeo = z17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.wearable.internal.zzfo) {
            return ((com.google.android.gms.wearable.internal.zzfo) obj).zzdm.equals(this.zzdm);
        }
        return false;
    }

    @Override // com.google.android.gms.wearable.Node
    public final java.lang.String getDisplayName() {
        return this.zzbk;
    }

    @Override // com.google.android.gms.wearable.Node
    public final java.lang.String getId() {
        return this.zzdm;
    }

    public final int hashCode() {
        return this.zzdm.hashCode();
    }

    @Override // com.google.android.gms.wearable.Node
    public final boolean isNearby() {
        return this.zzeo;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzbk;
        java.lang.String str2 = this.zzdm;
        int i17 = this.zzen;
        boolean z17 = this.zzeo;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 45 + java.lang.String.valueOf(str2).length());
        sb6.append("Node{");
        sb6.append(str);
        sb6.append(", id=");
        sb6.append(str2);
        sb6.append(", hops=");
        sb6.append(i17);
        sb6.append(", isNearby=");
        sb6.append(z17);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzen);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isNearby());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
