package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class fc implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask[i17];
    }
}
