package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzee extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzee> CREATOR = new com.google.android.gms.wearable.internal.zzef();
    public final int statusCode;
    public final android.os.ParcelFileDescriptor zzdz;

    public zzee(int i17, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.statusCode = i17;
        this.zzdz = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzdz, i17 | 1, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
