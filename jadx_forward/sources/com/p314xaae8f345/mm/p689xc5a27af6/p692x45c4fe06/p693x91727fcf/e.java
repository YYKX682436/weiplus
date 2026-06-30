package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes7.dex */
public final class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7.f28807x681a0c0c.createFromParcel(parcel));
        }
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10458x88813eff[i17];
    }
}
