package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launch/magicbrush_frame/WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84247d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84248e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs f84249f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f84250g;

    public WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper(java.lang.String bizInstance, java.lang.String appId, com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs initArgs, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo pkgWrappingInfo) {
        kotlin.jvm.internal.o.g(bizInstance, "bizInstance");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(initArgs, "initArgs");
        kotlin.jvm.internal.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        this.f84247d = bizInstance;
        this.f84248e = appId;
        this.f84249f = initArgs;
        this.f84250g = pkgWrappingInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper = (com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper) obj;
        return kotlin.jvm.internal.o.b(this.f84247d, wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper.f84247d) && kotlin.jvm.internal.o.b(this.f84248e, wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper.f84248e) && kotlin.jvm.internal.o.b(this.f84249f, wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper.f84249f) && kotlin.jvm.internal.o.b(this.f84250g, wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper.f84250g);
    }

    public int hashCode() {
        return (((((this.f84247d.hashCode() * 31) + this.f84248e.hashCode()) * 31) + this.f84249f.hashCode()) * 31) + this.f84250g.hashCode();
    }

    public java.lang.String toString() {
        return "RegisterToMBPkgManagementDataIPCWrapper(bizInstance=" + this.f84247d + ", appId=" + this.f84248e + ", initArgs=" + this.f84249f + ", pkgWrappingInfo=" + this.f84250g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f84247d);
        out.writeString(this.f84248e);
        this.f84249f.writeToParcel(out, i17);
        out.writeParcelable(this.f84250g, i17);
    }
}
