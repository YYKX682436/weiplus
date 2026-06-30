package p31;

/* loaded from: classes9.dex */
public final class d implements android.os.Parcelable.Creator {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        long readLong = parcel.readLong();
        java.lang.String readString = parcel.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString);
        return new com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08(readLong, readString, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08[i17];
    }
}
