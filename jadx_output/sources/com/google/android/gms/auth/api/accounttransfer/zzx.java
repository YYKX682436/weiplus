package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public final class zzx implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzw createFromParcel(android.os.Parcel parcel) {
        int i17;
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i18 = 0;
        java.lang.String str = null;
        byte[] bArr = null;
        android.app.PendingIntent pendingIntent = null;
        com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData = null;
        int i19 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    i17 = 1;
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    i17 = 2;
                    break;
                case 3:
                    i18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    i17 = 3;
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    i17 = 4;
                    break;
                case 5:
                    pendingIntent = (android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.app.PendingIntent.CREATOR);
                    i17 = 5;
                    break;
                case 6:
                    deviceMetaData = (com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR);
                    i17 = 6;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    continue;
            }
            hashSet.add(java.lang.Integer.valueOf(i17));
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new com.google.android.gms.auth.api.accounttransfer.zzw(hashSet, i19, str, i18, bArr, pendingIntent, deviceMetaData);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Overread allowed size end=");
        sb6.append(validateObjectHeader);
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(sb6.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzw[] newArray(int i17) {
        return new com.google.android.gms.auth.api.accounttransfer.zzw[i17];
    }
}
