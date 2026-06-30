package com.tencent.mm.plugin.appbrand.jsapi.channels;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenChannelsCreateContactRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/channels/m0;", "getTaskClass", "Landroid/os/Parcel;", "dest", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "params", "<init>", "(Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/channels/k0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class OpenChannelsCreateContactRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.channels.k0 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.channels.k0(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String params;

    public OpenChannelsCreateContactRequest(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.params = params;
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getParams() {
        return this.params;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.channels.m0> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.channels.m0.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.params);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OpenChannelsCreateContactRequest(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r2 = r2.readString()
            if (r2 != 0) goto Ld
            java.lang.String r2 = ""
        Ld:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsCreateContactRequest.<init>(android.os.Parcel):void");
    }
}
