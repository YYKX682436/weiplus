package com.tencent.mm.advertise.impl.jsapi;

/* loaded from: classes.dex */
public final class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper.class.getClassLoader()));
        }
        return new com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper(arrayList, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper[i17];
    }
}
