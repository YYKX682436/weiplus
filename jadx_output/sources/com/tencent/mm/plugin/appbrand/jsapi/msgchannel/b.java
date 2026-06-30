package com.tencent.mm.plugin.appbrand.jsapi.msgchannel;

/* loaded from: classes.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage.class.getClassLoader()));
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage[i17];
    }
}
