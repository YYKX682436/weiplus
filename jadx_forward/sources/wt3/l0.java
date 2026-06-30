package wt3;

/* loaded from: classes5.dex */
public final class l0 implements android.os.Parcelable.Creator {
    public l0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16998x3e4182e2 c16998x3e4182e2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16998x3e4182e2(new java.util.ArrayList());
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            c16998x3e4182e2.f237263d.add(bArr);
        }
        return c16998x3e4182e2;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16998x3e4182e2[i17];
    }
}
