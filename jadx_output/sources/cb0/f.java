package cb0;

/* loaded from: classes10.dex */
public final class f implements android.os.Parcelable.Creator {
    public f(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.feature.openim.impl.SpamInfo(parcel.readInt(), parcel.readString(), parcel.createByteArray());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.openim.impl.SpamInfo[i17];
    }
}
