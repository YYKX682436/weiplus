package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes7.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        ft.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9.f28809x681a0c0c.createFromParcel(parcel));
        }
        int readInt2 = parcel.readInt();
        ft.d[] m130354xcee59d22 = ft.d.m130354xcee59d22();
        int length = m130354xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                dVar = ft.d.WASERVICE;
                break;
            }
            ft.d dVar2 = m130354xcee59d22[i18];
            if (dVar2.ordinal() == readInt2) {
                dVar = dVar2;
                break;
            }
            i18++;
        }
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7(readString, arrayList, dVar, parcel.readInt() != 0, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10457xa2522bd7[i17];
    }
}
