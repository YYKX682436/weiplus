package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launch/magicbrush_frame/WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.r();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f84251d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC f84252e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84253f;

    public WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper(boolean z17, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC, java.lang.String str) {
        this.f84251d = z17;
        this.f84252e = appBrandSysConfigWC;
        this.f84253f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper = (com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper) obj;
        return this.f84251d == wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper.f84251d && kotlin.jvm.internal.o.b(this.f84252e, wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper.f84252e) && kotlin.jvm.internal.o.b(this.f84253f, wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper.f84253f);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f84251d) * 31;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = this.f84252e;
        int hashCode2 = (hashCode + (appBrandSysConfigWC == null ? 0 : appBrandSysConfigWC.hashCode())) * 31;
        java.lang.String str = this.f84253f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WAMagicBrushFrameColdLaunchResultIPCWrapper(succeed=" + this.f84251d + ", config=" + this.f84252e + ", exceptionMessage=" + this.f84253f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f84251d ? 1 : 0);
        out.writeParcelable(this.f84252e, i17);
        out.writeString(this.f84253f);
    }

    public /* synthetic */ WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper(boolean z17, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : appBrandSysConfigWC, (i17 & 4) != 0 ? null : str);
    }
}
