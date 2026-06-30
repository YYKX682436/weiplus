package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes9.dex */
public final class t implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea c12186x79c39fea = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea(java.lang.String.valueOf(parcel.readString()));
        java.util.List list = c12186x79c39fea.f163849h;
        java.util.RandomAccess createTypedArrayList = parcel.createTypedArrayList(com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3.f32580x681a0c0c);
        if (createTypedArrayList == null) {
            createTypedArrayList = kz5.p0.f395529d;
        }
        ((java.util.ArrayList) list).addAll(createTypedArrayList);
        byte[] bArr = new byte[parcel.readInt()];
        c12186x79c39fea.f163848g = bArr;
        parcel.readByteArray(bArr);
        c12186x79c39fea.f163846e = (com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e) parcel.readParcelable(com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.class.getClassLoader());
        return c12186x79c39fea;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea[i17];
    }
}
