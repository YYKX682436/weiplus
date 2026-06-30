package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public final class zzp implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzo createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = 0;
        java.util.ArrayList arrayList = null;
        com.google.android.gms.auth.api.accounttransfer.zzr zzrVar = null;
        int i18 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            int i19 = 1;
            if (fieldId != 1) {
                i19 = 2;
                if (fieldId != 2) {
                    i19 = 3;
                    if (fieldId != 3) {
                        i19 = 4;
                        if (fieldId != 4) {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            zzrVar = (com.google.android.gms.auth.api.accounttransfer.zzr) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.accounttransfer.zzr.CREATOR);
                        }
                    } else {
                        i17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    }
                } else {
                    arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.auth.api.accounttransfer.zzu.CREATOR);
                }
            } else {
                i18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            }
            hashSet.add(java.lang.Integer.valueOf(i19));
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new com.google.android.gms.auth.api.accounttransfer.zzo(hashSet, i18, arrayList, i17, zzrVar);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Overread allowed size end=");
        sb6.append(validateObjectHeader);
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(sb6.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzo[] newArray(int i17) {
        return new com.google.android.gms.auth.api.accounttransfer.zzo[i17];
    }
}
