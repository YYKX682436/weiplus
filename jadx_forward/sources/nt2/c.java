package nt2;

/* loaded from: classes15.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452 c14956x58c15452 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        r45.lu2 lu2Var = new r45.lu2();
        lu2Var.mo11468x92b714fd(bArr);
        c14956x58c15452.f207196d = lu2Var;
        return c14956x58c15452;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14956x58c15452[i17];
    }
}
