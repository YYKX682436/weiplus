package td1;

/* loaded from: classes4.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString);
        int readInt = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readString2);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a(readString, readInt, readString2);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12223x7fb6c59a[i17];
    }
}
