package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes5.dex */
public final class j8 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        long readLong4 = parcel.readLong();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt3 = parcel.readInt();
            arrayList = new java.util.ArrayList(readInt3);
            int i17 = 0;
            while (i17 != readInt3) {
                arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
                i17++;
                readInt3 = readInt3;
            }
        }
        return new com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord(readInt, readInt2, readString, readString2, readString3, readLong, readLong2, readLong3, readLong4, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord[i17];
    }
}
