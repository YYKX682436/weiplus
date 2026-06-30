package j63;

/* loaded from: classes7.dex */
public final class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(readInt);
            for (int i17 = 0; i17 != readInt; i17++) {
                arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895.f36984x681a0c0c.createFromParcel(parcel));
            }
            arrayList = arrayList2;
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697[i17];
    }
}
