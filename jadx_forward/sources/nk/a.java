package nk;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.HashSet hashSet = new java.util.HashSet(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            hashSet.add(com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e.f21396x681a0c0c.createFromParcel(parcel));
        }
        return new com.p314xaae8f345.mm.p621xcc7b5c73.C4984xbc204a24(hashSet);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p621xcc7b5c73.C4984xbc204a24[i17];
    }
}
