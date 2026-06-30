package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\t\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u001aJ\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u000e\u0010\u0012R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/RequestMerchantTransferRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "Ljz5/f0;", "readParcel", "dest", "", "flags", "writeToParcel", "", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "queryString", "e", "a", "c", "appId", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/pay/y2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class RequestMerchantTransferRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.pay.y2 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.pay.y2(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private java.lang.String queryString;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private java.lang.String appId;

    public RequestMerchantTransferRequest() {
        this.queryString = "";
        this.appId = "";
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getQueryString() {
        return this.queryString;
    }

    public final void c(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.appId = str;
    }

    public final void d(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.queryString = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferTask.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.queryString = readString;
        java.lang.String readString2 = parcel.readString();
        this.appId = readString2 != null ? readString2 : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.queryString);
        dest.writeString(this.appId);
    }

    public RequestMerchantTransferRequest(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.queryString = "";
        this.appId = "";
        readParcel(parcel);
    }
}
