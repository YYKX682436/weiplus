package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class nb implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam[i17];
    }
}
