package lh;

/* loaded from: classes7.dex */
public final class h implements android.os.Parcelable.Creator {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71 c4628xe6192e71 = new com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71();
        c4628xe6192e71.f134083d = parcel.readLong();
        c4628xe6192e71.f134084e = parcel.readLong();
        c4628xe6192e71.f134085f = parcel.readLong();
        return c4628xe6192e71;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71[i17];
    }
}
