package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class f7 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask[i17];
    }
}
