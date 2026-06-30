package qk;

/* loaded from: classes11.dex */
public final class ca implements android.os.Parcelable.Creator {
    public ca(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9 = new com.p314xaae8f345.mm.api.C4990x83627a9();
        java.lang.Object readValue = parcel.readValue(java.lang.Integer.TYPE.getClassLoader());
        c4990x83627a9.f134744d = readValue instanceof java.lang.Integer ? (java.lang.Integer) readValue : null;
        c4990x83627a9.f134746f = parcel.readByte() != 0;
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        c4990x83627a9.f134747g = readString;
        c4990x83627a9.f134748h = parcel.readInt();
        return c4990x83627a9;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.api.C4990x83627a9[i17];
    }
}
