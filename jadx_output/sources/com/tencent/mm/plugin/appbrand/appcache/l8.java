package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes5.dex */
public final class l8 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord.CREATOR.createFromParcel(parcel));
        }
        return new com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecordList(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecordList[i17];
    }
}
