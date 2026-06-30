package c85;

/* loaded from: classes9.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.Object readValue = parcel.readValue(java.lang.Long.TYPE.getClassLoader());
        return new com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66(readString, readValue instanceof java.lang.Long ? (java.lang.Long) readValue : null, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66[i17];
    }
}
