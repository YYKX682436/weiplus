package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes.dex */
public final class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        long readLong = parcel.readLong();
        int readInt3 = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt3);
        for (int i17 = 0; i17 != readInt3; i17++) {
            arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
        }
        int readInt4 = parcel.readInt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(readInt4);
        for (int i18 = 0; i18 != readInt4; i18++) {
            arrayList2.add(java.lang.Float.valueOf(parcel.readFloat()));
        }
        int readInt5 = parcel.readInt();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(readInt5);
        for (int i19 = 0; i19 != readInt5; i19++) {
            arrayList3.add(java.lang.Float.valueOf(parcel.readFloat()));
        }
        return new com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent(readInt, readInt2, readLong, arrayList, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent[i17];
    }
}
