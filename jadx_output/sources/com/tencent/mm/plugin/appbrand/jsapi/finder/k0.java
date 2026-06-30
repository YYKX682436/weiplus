package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class k0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult jsApiShareCurrentLive$ShareCurrentLiveResult = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult(parcel);
        com.tencent.mars.xlog.Log.i("JsApiShareCurrentLive", "create from parcel data = " + jsApiShareCurrentLive$ShareCurrentLiveResult.f81170d);
        return jsApiShareCurrentLive$ShareCurrentLiveResult;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult[i17];
    }
}
