package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzdj implements android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzdi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzdi createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i17 = 0;
        java.util.ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                i17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.wearable.internal.zzah.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.wearable.internal.zzdi(i17, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.wearable.internal.zzdi[] newArray(int i17) {
        return new com.google.android.gms.wearable.internal.zzdi[i17];
    }
}
