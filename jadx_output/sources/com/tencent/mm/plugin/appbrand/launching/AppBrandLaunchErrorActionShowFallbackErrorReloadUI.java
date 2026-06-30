package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorActionShowFallbackErrorReloadUI;", "Lcom/tencent/mm/plugin/appbrand/launching/AppBrandLaunchErrorAction;", "", "appId", "", "versionType", "retryMsg", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandLaunchErrorActionShowFallbackErrorReloadUI extends com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f84344g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandLaunchErrorActionShowFallbackErrorReloadUI(java.lang.String appId, int i17, java.lang.String str) {
        super(appId, i17);
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f84344g = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        if (o6Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLaunchErrorActionShowFallbackErrorReloadUI", "showError with null runtime, reason:" + str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchErrorActionShowFallbackErrorReloadUI", "showError context:" + context + ", runtime:" + o6Var + ", reason:" + str);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        kotlin.jvm.internal.o.d(u07);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = o6Var.l2();
        kotlin.jvm.internal.o.f(l27, "getStatObject(...)");
        com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest showFallbackErrorReloadUIRequest = new com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest(u07, l27, this.f84344g);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, showFallbackErrorReloadUIRequest, null, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeString(this.f84344g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandLaunchErrorActionShowFallbackErrorReloadUI(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f84344g = parcel.readString();
    }
}
