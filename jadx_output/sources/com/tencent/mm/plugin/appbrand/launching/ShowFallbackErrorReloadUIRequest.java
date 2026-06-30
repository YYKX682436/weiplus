package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUIRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "", "preferRunOnUiThreadForStartingProcessProxyUI", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "d", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "getInitConfig", "()Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "initConfig", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "e", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "b", "()Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "statObject", "", "f", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "retryMsg", "<init>", "(Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;Ljava/lang/String;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ShowFallbackErrorReloadUIRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest> CREATOR = new com.tencent.mm.plugin.appbrand.launching.hc();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObject;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String retryMsg;

    public ShowFallbackErrorReloadUIRequest(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObject, java.lang.String str) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(statObject, "statObject");
        this.initConfig = initConfig;
        this.statObject = statObject;
        this.retryMsg = str;
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getRetryMsg() {
        return this.retryMsg;
    }

    /* renamed from: b, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject getStatObject() {
        return this.statObject;
    }

    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC getInitConfig() {
        return this.initConfig;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.launching.jc.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean preferRunOnUiThreadForStartingProcessProxyUI() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.initConfig, i17);
        out.writeParcelable(this.statObject, i17);
        out.writeString(this.retryMsg);
    }
}
