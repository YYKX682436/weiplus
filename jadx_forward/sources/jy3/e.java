package jy3;

/* loaded from: classes11.dex */
public final class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63.f37908x681a0c0c.createFromParcel(parcel));
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1[i17];
    }
}
