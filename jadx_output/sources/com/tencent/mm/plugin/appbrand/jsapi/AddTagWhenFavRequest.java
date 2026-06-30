package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/AddTagWhenFavRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/b;", "getTaskClass", "", "describeContents", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class AddTagWhenFavRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.a CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.a(null);

    public AddTagWhenFavRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.b> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.b.class;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddTagWhenFavRequest(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
