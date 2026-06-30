package xh1;

/* loaded from: classes7.dex */
public final class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        xh1.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        boolean z17 = source.readByte() > 0;
        xh1.i iVar = xh1.j.f536048e;
        int readInt = source.readInt();
        iVar.getClass();
        xh1.j[] m175532xcee59d22 = xh1.j.m175532xcee59d22();
        int length = m175532xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                jVar = null;
                break;
            }
            jVar = m175532xcee59d22[i17];
            if (jVar.f536052d == readInt) {
                break;
            }
            i17++;
        }
        if (jVar == null) {
            jVar = xh1.j.f536050g;
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b(z17, jVar);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b[i17];
    }
}
