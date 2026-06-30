package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzj implements android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzi createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        byte b17 = 0;
        java.lang.String str = null;
        byte b18 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                b17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
            } else if (fieldId == 3) {
                b18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, readHeader);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.wearable.internal.zzi(b17, b18, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzi[] newArray(int i17) {
        return new com.google.android.gms.wearable.internal.zzi[i17];
    }
}
