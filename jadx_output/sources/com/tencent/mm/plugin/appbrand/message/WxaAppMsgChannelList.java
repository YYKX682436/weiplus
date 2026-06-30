package com.tencent.mm.plugin.appbrand.message;

/* loaded from: classes7.dex */
public class WxaAppMsgChannelList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannelList> CREATOR = new oh1.k1();

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f86015d;

    public WxaAppMsgChannelList() {
        this.f86015d = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            parcel.writeParcelableList(this.f86015d, i17);
            return;
        }
        com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel[] wxaAppMsgChannelArr = new com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel[this.f86015d.size()];
        this.f86015d.toArray(wxaAppMsgChannelArr);
        parcel.writeParcelableArray(wxaAppMsgChannelArr, i17);
    }

    public WxaAppMsgChannelList(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f86015d = arrayList;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            parcel.readParcelableList(arrayList, com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel.class.getClassLoader());
            return;
        }
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel.class.getClassLoader());
        if (readParcelableArray == null || readParcelableArray.length <= 0) {
            return;
        }
        for (com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel wxaAppMsgChannel : (com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel[]) java.util.Arrays.copyOf(readParcelableArray, readParcelableArray.length, com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel[].class)) {
            this.f86015d.add(wxaAppMsgChannel);
        }
    }
}
