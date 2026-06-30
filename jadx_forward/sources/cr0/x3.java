package cr0;

/* loaded from: classes12.dex */
public final class x3 implements android.os.Parcelable.Creator {
    public x3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString);
        java.lang.String readString2 = parcel.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString2);
        java.lang.String readString3 = parcel.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString3);
        java.lang.String readString4 = parcel.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString4);
        return new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10873xa9ee8cad(readInt, readString, readString2, readString3, readString4, parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10873xa9ee8cad[i17];
    }
}
