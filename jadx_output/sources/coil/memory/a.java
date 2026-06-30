package coil.memory;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        coil.size.Size size = (coil.size.Size) parcel.readParcelable(coil.memory.MemoryCache$Key.Complex.class.getClassLoader());
        int readInt = parcel.readInt();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new coil.memory.MemoryCache$Key.Complex(readString, createStringArrayList, size, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new coil.memory.MemoryCache$Key.Complex[i17];
    }
}
