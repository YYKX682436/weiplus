package oj;

/* loaded from: classes11.dex */
public final class v implements android.os.Parcelable.Creator {
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        java.lang.String str = readString != null ? readString : "default";
        java.lang.String readString2 = parcel.readString();
        byte b17 = (byte) 0;
        return new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d(readInt, str, readString2 != null ? readString2 : "default", parcel.readByte() != b17, parcel.readByte() != b17);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d[i17];
    }
}
