package c85;

/* loaded from: classes9.dex */
public final class c implements android.os.Parcelable.Creator {
    public c(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.Object readValue = parcel.readValue(java.lang.Long.TYPE.getClassLoader());
        return new com.tencent.mm.sendtowework.FileData(readString, readValue instanceof java.lang.Long ? (java.lang.Long) readValue : null, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.sendtowework.FileData[i17];
    }
}
