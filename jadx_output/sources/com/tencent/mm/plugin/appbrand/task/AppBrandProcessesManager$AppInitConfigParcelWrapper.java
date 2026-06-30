package com.tencent.mm.plugin.appbrand.task;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$AppInitConfigParcelWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandProcessesManager$AppInitConfigParcelWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.task.f0();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f88986d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f88987e;

    public AppBrandProcessesManager$AppInitConfigParcelWrapper(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(stat, "stat");
        this.f88986d = initConfig;
        this.f88987e = stat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper appBrandProcessesManager$AppInitConfigParcelWrapper = (com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper) obj;
        return kotlin.jvm.internal.o.b(this.f88986d, appBrandProcessesManager$AppInitConfigParcelWrapper.f88986d) && kotlin.jvm.internal.o.b(this.f88987e, appBrandProcessesManager$AppInitConfigParcelWrapper.f88987e);
    }

    public int hashCode() {
        return (this.f88986d.hashCode() * 31) + this.f88987e.hashCode();
    }

    public java.lang.String toString() {
        return "AppInitConfigParcelWrapper(initConfig=" + this.f88986d + ", stat=" + this.f88987e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f88986d, i17);
        out.writeParcelable(this.f88987e, i17);
    }
}
