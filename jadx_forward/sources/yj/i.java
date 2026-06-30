package yj;

/* loaded from: classes5.dex */
public final class i implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        return new com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8(parcel.readInt() != 0, parcel.createByteArray(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8[i17];
    }
}
