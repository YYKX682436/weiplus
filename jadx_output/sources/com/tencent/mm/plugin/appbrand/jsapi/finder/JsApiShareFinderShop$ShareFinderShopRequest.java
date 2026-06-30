package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\t\b\u0010¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0018J\u0012\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiShareFinderShop$ShareFinderShopRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Landroid/os/Parcel;", "in", "Ljz5/f0;", "readParcel", "dest", "", "flags", "writeToParcel", "", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "reqData", "<init>", "()V", "parcel", "(Landroid/os/Parcel;)V", "e", "com/tencent/mm/plugin/appbrand/jsapi/finder/v0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiShareFinderShop$ShareFinderShopRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private java.lang.String reqData;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.finder.v0 f81179e = new com.tencent.mm.plugin.appbrand.jsapi.finder.v0(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.u0();

    public JsApiShareFinderShop$ShareFinderShopRequest() {
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getReqData() {
        return this.reqData;
    }

    public final void b(java.lang.String str) {
        this.reqData = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopTask.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.reqData = in6.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.reqData);
    }

    public JsApiShareFinderShop$ShareFinderShopRequest(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        readParcel(parcel);
    }
}
