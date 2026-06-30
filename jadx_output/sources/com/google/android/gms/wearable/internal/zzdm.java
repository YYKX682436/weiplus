package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzdm> CREATOR = new com.google.android.gms.wearable.internal.zzdn();
    public final int statusCode;
    public final android.os.ParcelFileDescriptor zzdr;

    public zzdm(int i17, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.statusCode = i17;
        this.zzdr = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzdr, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
