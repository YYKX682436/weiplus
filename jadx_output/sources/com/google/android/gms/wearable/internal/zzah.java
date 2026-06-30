package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzah extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.wearable.CapabilityInfo {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzah> CREATOR = new com.google.android.gms.wearable.internal.zzai();
    private final java.lang.String name;
    private final java.util.List<com.google.android.gms.wearable.internal.zzfo> zzca;
    private final java.lang.Object lock = new java.lang.Object();
    private java.util.Set<com.google.android.gms.wearable.Node> zzbt = null;

    public zzah(java.lang.String str, java.util.List<com.google.android.gms.wearable.internal.zzfo> list) {
        this.name = str;
        this.zzca = list;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.wearable.internal.zzah.class != obj.getClass()) {
            return false;
        }
        com.google.android.gms.wearable.internal.zzah zzahVar = (com.google.android.gms.wearable.internal.zzah) obj;
        java.lang.String str = this.name;
        if (str == null ? zzahVar.name != null : !str.equals(zzahVar.name)) {
            return false;
        }
        java.util.List<com.google.android.gms.wearable.internal.zzfo> list = this.zzca;
        java.util.List<com.google.android.gms.wearable.internal.zzfo> list2 = zzahVar.zzca;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final java.util.Set<com.google.android.gms.wearable.Node> getNodes() {
        java.util.Set<com.google.android.gms.wearable.Node> set;
        synchronized (this.lock) {
            if (this.zzbt == null) {
                this.zzbt = new java.util.HashSet(this.zzca);
            }
            set = this.zzbt;
        }
        return set;
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        java.util.List<com.google.android.gms.wearable.internal.zzfo> list = this.zzca;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzca);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 18 + valueOf.length());
        sb6.append("CapabilityInfo{");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(valueOf);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzca, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
