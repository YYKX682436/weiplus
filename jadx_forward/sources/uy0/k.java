package uy0;

/* loaded from: classes4.dex */
public final class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb.class.getClassLoader()));
        }
        return new com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : com.p314xaae8f345.mm.p916x4268f0dc.api.C11013xe2775c41.f29782x681a0c0c.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb[i17];
    }
}
