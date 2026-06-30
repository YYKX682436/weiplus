package nu3;

/* loaded from: classes4.dex */
public final class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071.f37777x681a0c0c.createFromParcel(parcel));
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17031x9fd08c34(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17031x9fd08c34[i17];
    }
}
