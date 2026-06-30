package e60;

/* loaded from: classes8.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a.f28878x681a0c0c.createFromParcel(parcel));
        }
        return new com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641(arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174.f28879x681a0c0c.createFromParcel(parcel), parcel.readString(), parcel.readInt(), com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d.f28876x681a0c0c.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641[i17];
    }
}
