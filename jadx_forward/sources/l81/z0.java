package l81;

/* loaded from: classes7.dex */
public final class z0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        l81.a1 a1Var = (l81.a1) kz5.n0.a0(l81.a1.f398543h, parcel.readInt());
        if (a1Var == null) {
            a1Var = l81.a1.f398539d;
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f(readLong, readLong2, a1Var, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f[i17];
    }
}
