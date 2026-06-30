package uy0;

/* loaded from: classes4.dex */
public final class l implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2.class.getClassLoader()));
        }
        return new com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2(arrayList, com.p314xaae8f345.mm.p916x4268f0dc.api.C11010x5ff4d15f.f29779x681a0c0c.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.api.C11012xa5f608f2[i17];
    }
}
