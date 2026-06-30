package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class c3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest[i17];
    }
}
