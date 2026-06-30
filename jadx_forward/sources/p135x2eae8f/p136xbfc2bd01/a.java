package p135x2eae8f.p136xbfc2bd01;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421 = (p135x2eae8f.p138x35e001.AbstractC1421x275421) parcel.readParcelable(p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Complex.class.getClassLoader());
        int readInt = parcel.readInt();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        return new p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Complex(readString, createStringArrayList, abstractC1421x275421, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Complex[i17];
    }
}
