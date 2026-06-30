package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class l0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        java.lang.String readString4 = parcel.readString();
        java.lang.String readString5 = parcel.readString();
        r45.w3 w3Var = new r45.w3();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        w3Var.parseFrom(bArr);
        return new com.tencent.mm.plugin.appbrand.service.CdpCommandParams(readString, readString2, readString3, readString4, readString5, w3Var);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.service.CdpCommandParams[i17];
    }
}
