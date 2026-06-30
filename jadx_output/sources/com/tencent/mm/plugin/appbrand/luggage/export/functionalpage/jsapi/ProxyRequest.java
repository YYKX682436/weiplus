package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/jsapi/ProxyRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/jsapi/a0;", "getTaskClass", "Landroid/os/Parcel;", "dest", "", "flags", "Ljz5/f0;", "writeToParcel", "d", "I", "a", "()I", "b", "(I)V", "functionHash", "<init>", "CREATOR", "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/jsapi/z", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ProxyRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.z CREATOR = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.z(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int functionHash;

    public ProxyRequest(int i17) {
        this.functionHash = i17;
    }

    /* renamed from: a, reason: from getter */
    public final int getFunctionHash() {
        return this.functionHash;
    }

    public final void b(int i17) {
        this.functionHash = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.a0> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.a0.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeInt(this.functionHash);
    }
}
