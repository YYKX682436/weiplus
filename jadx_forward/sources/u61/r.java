package u61;

/* loaded from: classes4.dex */
public final class r implements android.os.Parcelable.Creator {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0.f33358x681a0c0c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe createFromParcel = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe.f33357x681a0c0c.createFromParcel(parcel);
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0 c11383xcdc70ad0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0(createFromParcel, readString);
        r45.fn4 fn4Var = new r45.fn4();
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        fn4Var.mo75930xb5cb93b2(readString2);
        java.lang.String readString3 = parcel.readString();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732(c11383xcdc70ad0, fn4Var, readString3 != null ? readString3 : "", parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732[i17];
    }
}
