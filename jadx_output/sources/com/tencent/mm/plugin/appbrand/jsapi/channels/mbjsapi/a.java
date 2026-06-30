package com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi;

/* loaded from: classes7.dex */
public final class a implements android.os.Parcelable.Creator {
    public a(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityRequest[i17];
    }
}
