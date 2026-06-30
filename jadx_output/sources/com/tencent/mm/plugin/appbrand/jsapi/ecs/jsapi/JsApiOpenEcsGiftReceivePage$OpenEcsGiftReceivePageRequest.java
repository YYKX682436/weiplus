package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/ecs/jsapi/JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "describeContents", "", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "orderId", "<init>", "(Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/ecs/jsapi/o", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.o CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.o(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String orderId;

    public JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest(java.lang.String str) {
        this.orderId = str;
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getOrderId() {
        return this.orderId;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.r.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.orderId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest(android.os.Parcel parcel) {
        this(parcel.readString());
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
