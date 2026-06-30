package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzeg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzeg> CREATOR = new com.google.android.gms.wearable.internal.zzeh();
    public final int statusCode;
    public final com.google.android.gms.wearable.internal.zzfo zzea;

    public zzeg(int i17, com.google.android.gms.wearable.internal.zzfo zzfoVar) {
        this.statusCode = i17;
        this.zzea = zzfoVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzea, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
