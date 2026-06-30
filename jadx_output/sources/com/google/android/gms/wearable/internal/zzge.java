package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzge extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzge> CREATOR = new com.google.android.gms.wearable.internal.zzgf();
    private final int statusCode;
    private final long zzep;
    private final java.util.List<com.google.android.gms.wearable.internal.zzfs> zzer;

    public zzge(int i17, long j17, java.util.List<com.google.android.gms.wearable.internal.zzfs> list) {
        this.statusCode = i17;
        this.zzep = j17;
        this.zzer = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzep);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, this.zzer, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
