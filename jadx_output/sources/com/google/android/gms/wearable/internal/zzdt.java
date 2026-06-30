package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzdt> CREATOR = new com.google.android.gms.wearable.internal.zzds();
    private final int statusCode;
    private final boolean zzdt;
    private final boolean zzdu;

    public zzdt(int i17, boolean z17, boolean z18) {
        this.statusCode = i17;
        this.zzdt = z17;
        this.zzdu = z18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzdt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzdu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
