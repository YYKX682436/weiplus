package nr0;

/* loaded from: classes13.dex */
public final class b implements android.os.Parcelable.Creator {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        return new com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498(readString, readInt, readInt2, readString2 != null ? readString2 : "");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.C10891x95c0498[i17];
    }
}
