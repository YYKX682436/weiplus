package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiShareFinderShop$ShareFinderShopResult", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiShareFinderShop$ShareFinderShopResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.w0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f81181d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
    public void readParcel(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f81181d = in6.readString();
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderShop", "readParcel, data = " + this.f81181d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f81181d);
    }
}
