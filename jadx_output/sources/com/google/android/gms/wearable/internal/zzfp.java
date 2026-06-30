package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzfp implements android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzfo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzfo createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        int i17 = 0;
        boolean z17 = false;
        java.lang.String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 4) {
                i17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                z17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.wearable.internal.zzfo(str, str2, i17, z17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzfo[] newArray(int i17) {
        return new com.google.android.gms.wearable.internal.zzfo[i17];
    }
}
