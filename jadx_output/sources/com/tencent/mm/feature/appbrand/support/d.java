package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        ft.d dVar;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord.CREATOR.createFromParcel(parcel));
        }
        int readInt2 = parcel.readInt();
        ft.d[] values = ft.d.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                dVar = ft.d.WASERVICE;
                break;
            }
            ft.d dVar2 = values[i18];
            if (dVar2.ordinal() == readInt2) {
                dVar = dVar2;
                break;
            }
            i18++;
        }
        return new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess(readString, arrayList, dVar, parcel.readInt() != 0, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppProcess[i17];
    }
}
