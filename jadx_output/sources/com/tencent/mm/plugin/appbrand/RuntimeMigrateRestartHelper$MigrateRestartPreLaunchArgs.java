package com.tencent.mm.plugin.appbrand;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs> CREATOR = new com.tencent.mm.plugin.appbrand.pe();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f74879d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f74880e;

    public RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs(java.lang.String sourceInstanceId, java.lang.String targetAppId) {
        kotlin.jvm.internal.o.g(sourceInstanceId, "sourceInstanceId");
        kotlin.jvm.internal.o.g(targetAppId, "targetAppId");
        this.f74879d = sourceInstanceId;
        this.f74880e = targetAppId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs runtimeMigrateRestartHelper$MigrateRestartPreLaunchArgs = (com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs) obj;
        return kotlin.jvm.internal.o.b(this.f74879d, runtimeMigrateRestartHelper$MigrateRestartPreLaunchArgs.f74879d) && kotlin.jvm.internal.o.b(this.f74880e, runtimeMigrateRestartHelper$MigrateRestartPreLaunchArgs.f74880e);
    }

    public int hashCode() {
        return (this.f74879d.hashCode() * 31) + this.f74880e.hashCode();
    }

    public java.lang.String toString() {
        return "MigrateRestartPreLaunchArgs(sourceInstanceId=" + this.f74879d + ", targetAppId=" + this.f74880e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f74879d);
        out.writeString(this.f74880e);
    }
}
