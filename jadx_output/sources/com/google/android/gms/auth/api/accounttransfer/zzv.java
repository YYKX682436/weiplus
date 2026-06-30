package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public final class zzv implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzu createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.android.gms.auth.api.accounttransfer.zzw zzwVar = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        int i17 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            int i18 = 1;
            if (fieldId != 1) {
                i18 = 2;
                if (fieldId != 2) {
                    i18 = 3;
                    if (fieldId != 3) {
                        i18 = 4;
                        if (fieldId != 4) {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    zzwVar = (com.google.android.gms.auth.api.accounttransfer.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR);
                }
            } else {
                i17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            }
            hashSet.add(java.lang.Integer.valueOf(i18));
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new com.google.android.gms.auth.api.accounttransfer.zzu(hashSet, i17, zzwVar, str, str2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Overread allowed size end=");
        sb6.append(validateObjectHeader);
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(sb6.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzu[] newArray(int i17) {
        return new com.google.android.gms.auth.api.accounttransfer.zzu[i17];
    }
}
