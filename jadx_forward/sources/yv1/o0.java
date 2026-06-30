package yv1;

/* loaded from: classes12.dex */
public final class o0 implements android.os.Parcelable.Creator {
    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            java.lang.String readString = parcel.readString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString);
            yv1.p0 p0Var = new yv1.p0();
            c13100x4dbf8b6d.f177174d.put(readString, p0Var);
            p0Var.f547666a = parcel.readLong();
            int readInt2 = parcel.readInt();
            java.util.HashSet hashSet = new java.util.HashSet(readInt2);
            p0Var.f547667b = hashSet;
            for (int i18 = 0; i18 < readInt2; i18++) {
                hashSet.add(java.lang.Long.valueOf(parcel.readLong()));
            }
        }
        return c13100x4dbf8b6d;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[i17];
    }
}
