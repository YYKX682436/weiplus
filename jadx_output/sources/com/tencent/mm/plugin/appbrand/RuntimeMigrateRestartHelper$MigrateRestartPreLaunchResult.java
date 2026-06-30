package com.tencent.mm.plugin.appbrand;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult> CREATOR = new com.tencent.mm.plugin.appbrand.qe();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f74881d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f74882e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f74883f;

    public RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult(boolean z17, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f74881d = z17;
        this.f74882e = appBrandInitConfigWC;
        this.f74883f = appBrandStatObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult = (com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult) obj;
        return this.f74881d == runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult.f74881d && kotlin.jvm.internal.o.b(this.f74882e, runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult.f74882e) && kotlin.jvm.internal.o.b(this.f74883f, runtimeMigrateRestartHelper$MigrateRestartPreLaunchResult.f74883f);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f74881d) * 31;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f74882e;
        int hashCode2 = (hashCode + (appBrandInitConfigWC == null ? 0 : appBrandInitConfigWC.hashCode())) * 31;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = this.f74883f;
        return hashCode2 + (appBrandStatObject != null ? appBrandStatObject.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MigrateRestartPreLaunchResult(succeed=" + this.f74881d + ", config=" + this.f74882e + ", stat=" + this.f74883f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f74881d ? 1 : 0);
        out.writeParcelable(this.f74882e, i17);
        out.writeParcelable(this.f74883f, i17);
    }
}
