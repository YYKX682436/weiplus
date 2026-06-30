package rj1;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12625xe68f958.class.getClassLoader()));
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12625xe68f958(readString, arrayList, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12625xe68f958[i17];
    }
}
