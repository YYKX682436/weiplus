package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class w0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult jsApiShareFinderShop$ShareFinderShopResult = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult(source);
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderShop", "create from parcel data = " + jsApiShareFinderShop$ShareFinderShopResult.f81181d);
        return jsApiShareFinderShop$ShareFinderShopResult;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult[i17];
    }
}
