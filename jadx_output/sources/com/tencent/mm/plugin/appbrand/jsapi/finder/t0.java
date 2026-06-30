package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class t0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult jsApiShareFinderProduct$ShareFinderProductResult = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult(parcel);
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderProduct", "create from parcel data = " + jsApiShareFinderProduct$ShareFinderProductResult.f81178d);
        return jsApiShareFinderProduct$ShareFinderProductResult;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult[i17];
    }
}
