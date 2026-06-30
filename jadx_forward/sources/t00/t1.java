package t00;

/* loaded from: classes9.dex */
public final class t1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        return new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34[i17];
    }
}
