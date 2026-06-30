package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzfs> CREATOR = new com.google.android.gms.wearable.internal.zzft();
    private final java.lang.String label;
    private final java.lang.String packageName;
    private final long zzep;

    public zzfs(java.lang.String str, java.lang.String str2, long j17) {
        this.packageName = str;
        this.label = str2;
        this.zzep = j17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.label, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzep);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
