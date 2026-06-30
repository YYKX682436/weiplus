package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class zzm implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.PasswordSpecification> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.credentials.PasswordSpecification createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.util.ArrayList<java.lang.String> arrayList = null;
        java.util.ArrayList<java.lang.Integer> arrayList2 = null;
        int i17 = 0;
        int i18 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(parcel, readHeader);
            } else if (fieldId == 3) {
                arrayList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntegerList(parcel, readHeader);
            } else if (fieldId == 4) {
                i17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                i18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.auth.api.credentials.PasswordSpecification(str, arrayList, arrayList2, i17, i18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.credentials.PasswordSpecification[] newArray(int i17) {
        return new com.google.android.gms.auth.api.credentials.PasswordSpecification[i17];
    }
}
