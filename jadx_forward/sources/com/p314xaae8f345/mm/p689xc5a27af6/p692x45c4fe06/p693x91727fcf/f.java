package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes7.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        ft.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        ft.d[] m130354xcee59d22 = ft.d.m130354xcee59d22();
        int length = m130354xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                dVar = ft.d.WASERVICE;
                break;
            }
            dVar = m130354xcee59d22[i17];
            if (dVar.ordinal() == readInt) {
                break;
            }
            i17++;
        }
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9(readString, dVar, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9[i17];
    }
}
