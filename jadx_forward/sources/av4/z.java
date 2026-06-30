package av4;

/* loaded from: classes.dex */
public final class z implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19212xf72cfeaa(linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19212xf72cfeaa[i17];
    }
}
