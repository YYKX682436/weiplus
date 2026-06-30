package cw2;

/* loaded from: classes10.dex */
public final class va implements android.os.Parcelable.Creator {
    public va(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1 c15203xfa689ef1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        r45.dd4 dd4Var = new r45.dd4();
        dd4Var.mo11468x92b714fd(bArr);
        c15203xfa689ef1.f212292d = dd4Var;
        return c15203xfa689ef1;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1[i17];
    }
}
