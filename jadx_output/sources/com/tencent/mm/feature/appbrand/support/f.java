package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        ft.d dVar;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        ft.d[] values = ft.d.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                dVar = ft.d.WASERVICE;
                break;
            }
            dVar = values[i17];
            if (dVar.ordinal() == readInt) {
                break;
            }
            i17++;
        }
        return new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord(readString, dVar, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord[i17];
    }
}
