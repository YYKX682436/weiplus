package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class m7 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        ne1.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        java.util.Iterator it = ((kz5.h) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n7.f166342a).iterator();
        while (true) {
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            ne1.j jVar2 = (ne1.j) it.next();
            if (readInt2 == jVar2.ordinal()) {
                jVar = jVar2;
                break;
            }
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c(readString, readInt, readString2, jVar, parcel.readString(), parcel.readString(), (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c[i17];
    }
}
