package u61;

/* loaded from: classes4.dex */
public final class q implements android.os.Parcelable.Creator {
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe createFromParcel = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe.f33357x681a0c0c.createFromParcel(parcel);
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0(createFromParcel, readString);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11383xcdc70ad0[i17];
    }
}
