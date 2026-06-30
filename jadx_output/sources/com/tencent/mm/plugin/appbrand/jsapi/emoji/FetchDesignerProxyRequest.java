package com.tencent.mm.plugin.appbrand.jsapi.emoji;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0014J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/FetchDesignerProxyRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/JsApiOpenDesignerProfile$EmotionDesignerContext;", "d", "Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/JsApiOpenDesignerProfile$EmotionDesignerContext;", "a", "()Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/JsApiOpenDesignerProfile$EmotionDesignerContext;", "pageExternalContext", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/emoji/JsApiOpenDesignerProfile$EmotionDesignerContext;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class FetchDesignerProxyRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.emoji.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext pageExternalContext;

    public FetchDesignerProxyRequest(com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext pageExternalContext) {
        kotlin.jvm.internal.o.g(pageExternalContext, "pageExternalContext");
        this.pageExternalContext = pageExternalContext;
    }

    /* renamed from: a, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext getPageExternalContext() {
        return this.pageExternalContext;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.emoji.g.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.pageExternalContext.writeToParcel(out, i17);
    }
}
