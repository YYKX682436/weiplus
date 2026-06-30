package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzec extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzec> CREATOR = new com.google.android.gms.wearable.internal.zzed();
    public final int statusCode;
    public final com.google.android.gms.wearable.internal.zzdd zzdy;

    public zzec(int i17, com.google.android.gms.wearable.internal.zzdd zzddVar) {
        this.statusCode = i17;
        this.zzdy = zzddVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzdy, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
