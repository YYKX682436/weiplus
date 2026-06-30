package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzee implements android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzed> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzed createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        com.google.android.gms.internal.measurement.zzjx zzjxVar = null;
        java.lang.String str3 = null;
        com.google.android.gms.internal.measurement.zzeu zzeuVar = null;
        com.google.android.gms.internal.measurement.zzeu zzeuVar2 = null;
        com.google.android.gms.internal.measurement.zzeu zzeuVar3 = null;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        boolean z17 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzjxVar = (com.google.android.gms.internal.measurement.zzjx) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.measurement.zzjx.CREATOR);
                    break;
                case 5:
                    j17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzeuVar = (com.google.android.gms.internal.measurement.zzeu) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.measurement.zzeu.CREATOR);
                    break;
                case 9:
                    j18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzeuVar2 = (com.google.android.gms.internal.measurement.zzeu) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.measurement.zzeu.CREATOR);
                    break;
                case 11:
                    j19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzeuVar3 = (com.google.android.gms.internal.measurement.zzeu) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.measurement.zzeu.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.measurement.zzed(str, str2, zzjxVar, j17, z17, str3, zzeuVar, j18, zzeuVar2, j19, zzeuVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzed[] newArray(int i17) {
        return new com.google.android.gms.internal.measurement.zzed[i17];
    }
}
