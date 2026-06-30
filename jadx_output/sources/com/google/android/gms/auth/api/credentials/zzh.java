package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class zzh implements android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.CredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.credentials.CredentialRequest createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i17 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        java.lang.String[] strArr = null;
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig = null;
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig credentialPickerConfig2 = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        z17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 2:
                        strArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, readHeader);
                        break;
                    case 3:
                        credentialPickerConfig = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 6:
                        str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 7:
                        str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 8:
                        z19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            } else {
                i17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.auth.api.credentials.CredentialRequest(i17, z17, strArr, credentialPickerConfig, credentialPickerConfig2, z18, str, str2, z19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.auth.api.credentials.CredentialRequest[] newArray(int i17) {
        return new com.google.android.gms.auth.api.credentials.CredentialRequest[i17];
    }
}
