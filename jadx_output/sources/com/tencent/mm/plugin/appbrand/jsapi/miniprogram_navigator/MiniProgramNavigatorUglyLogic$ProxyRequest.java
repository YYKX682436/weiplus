package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0082\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b#\u0010&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0018\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006)"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic$ProxyRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Landroid/os/Parcelable;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic$ProxyTask;", "getTaskClass", "", "oneShotForeground", "Landroid/os/Parcel;", "dest", "", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "a", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "b", "initConfig", "statObj", "Lcom/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic$ProxyRequest;", "c", "", "toString", "hashCode", "", "other", "equals", "d", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "getInitConfig", "()Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "e", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "()Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "<init>", "(Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;)V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/l0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class MiniProgramNavigatorUglyLogic$ProxyRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l0 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l0(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObj;

    public MiniProgramNavigatorUglyLogic$ProxyRequest(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObj) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(statObj, "statObj");
        this.initConfig = initConfig;
        this.statObj = statObj;
    }

    public static /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest d(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest miniProgramNavigatorUglyLogic$ProxyRequest, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            appBrandInitConfigWC = miniProgramNavigatorUglyLogic$ProxyRequest.initConfig;
        }
        if ((i17 & 2) != 0) {
            appBrandStatObject = miniProgramNavigatorUglyLogic$ProxyRequest.statObj;
        }
        return miniProgramNavigatorUglyLogic$ProxyRequest.c(appBrandInitConfigWC, appBrandStatObject);
    }

    /* renamed from: a, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC getInitConfig() {
        return this.initConfig;
    }

    /* renamed from: b, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject getStatObj() {
        return this.statObj;
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest c(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObj) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(statObj, "statObj");
        return new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest(initConfig, statObj);
    }

    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject e() {
        return this.statObj;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest miniProgramNavigatorUglyLogic$ProxyRequest = (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest) other;
        return kotlin.jvm.internal.o.b(this.initConfig, miniProgramNavigatorUglyLogic$ProxyRequest.initConfig) && kotlin.jvm.internal.o.b(this.statObj, miniProgramNavigatorUglyLogic$ProxyRequest.statObj);
    }

    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC getInitConfig() {
        return this.initConfig;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyTask> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyTask.class;
    }

    public int hashCode() {
        return (this.initConfig.hashCode() * 31) + this.statObj.hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    public java.lang.String toString() {
        return "ProxyRequest(initConfig=" + this.initConfig + ", statObj=" + this.statObj + ')';
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeParcelable(this.initConfig, i17);
        dest.writeParcelable(this.statObj, i17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MiniProgramNavigatorUglyLogic$ProxyRequest(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC> r0 = com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            kotlin.jvm.internal.o.d(r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) r0
            java.lang.Class<com.tencent.mm.plugin.appbrand.report.AppBrandStatObject> r1 = com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r1)
            kotlin.jvm.internal.o.d(r3)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r3 = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) r3
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyRequest.<init>(android.os.Parcel):void");
    }
}
