package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

/* loaded from: classes.dex */
public final class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b.class.getClassLoader()));
        }
        return new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b(arrayList, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b[i17];
    }
}
