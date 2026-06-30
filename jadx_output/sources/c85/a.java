package c85;

/* loaded from: classes9.dex */
public final class a implements android.os.Parcelable.Creator {
    public a(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        java.lang.String readString4 = parcel.readString();
        java.lang.String readString5 = parcel.readString();
        java.lang.String readString6 = parcel.readString();
        java.lang.Object readValue = parcel.readValue(java.lang.Integer.TYPE.getClassLoader());
        return new com.tencent.mm.sendtowework.AppBrandData(readString, readString2, readString3, readString4, readString5, readString6, readValue instanceof java.lang.Integer ? (java.lang.Integer) readValue : null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.sendtowework.AppBrandData[i17];
    }
}
