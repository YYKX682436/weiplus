package e60;

/* loaded from: classes11.dex */
public final class w0 implements android.os.Parcelable.Creator {
    public w0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758 c10615x40454758 = new com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758();
        c10615x40454758.f148638d = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        c10615x40454758.f148639e = readString;
        c10615x40454758.f148640f = parcel.readString();
        return c10615x40454758;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758[i17];
    }
}
