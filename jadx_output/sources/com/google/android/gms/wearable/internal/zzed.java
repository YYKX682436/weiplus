package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzed implements android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzec> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzec createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i17 = 0;
        com.google.android.gms.wearable.internal.zzdd zzddVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                i17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzddVar = (com.google.android.gms.wearable.internal.zzdd) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.wearable.internal.zzdd.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.wearable.internal.zzec(i17, zzddVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzec[] newArray(int i17) {
        return new com.google.android.gms.wearable.internal.zzec[i17];
    }
}
