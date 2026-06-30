package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0014R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljz5/f0;", "writeToParcel", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Lr45/br2;", "d", "Lr45/br2;", "a", "()Lr45/br2;", "b", "(Lr45/br2;)V", "productShareObject", "<init>", "()V", "shareProductShareObject", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/finder/b0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.finder.b0 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.b0(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r45.br2 productShareObject;

    public JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest() {
    }

    /* renamed from: a, reason: from getter */
    public final r45.br2 getProductShareObject() {
        return this.productShareObject;
    }

    public final void b(r45.br2 br2Var) {
        this.productShareObject = br2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickTask.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        com.tencent.mm.ipcinvoker.extension.c.d(this.productShareObject, dest);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest(r45.br2 shareProductShareObject) {
        this();
        kotlin.jvm.internal.o.g(shareProductShareObject, "shareProductShareObject");
        this.productShareObject = shareProductShareObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
        readParcel(parcel);
        java.lang.Object c17 = com.tencent.mm.ipcinvoker.extension.c.c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderProductShareObject");
        this.productShareObject = (r45.br2) c17;
    }
}
