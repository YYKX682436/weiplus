package com.tencent.mm.plugin.appbrand.debugger.console;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/debugger/console/ConsoleDebugLogImpl$LogInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class ConsoleDebugLogImpl$LogInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl$LogInfo> CREATOR = new com.tencent.mm.plugin.appbrand.debugger.console.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f77641d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f77642e;

    /* renamed from: f, reason: collision with root package name */
    public final int f77643f;

    public ConsoleDebugLogImpl$LogInfo(int i17, java.lang.String logLine) {
        kotlin.jvm.internal.o.g(logLine, "logLine");
        this.f77641d = i17;
        this.f77642e = logLine;
        this.f77643f = (logLine.length() * 2) + 4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "LogInfo(priority=" + this.f77641d + ", logLine='" + this.f77642e + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f77641d);
        out.writeString(this.f77642e);
    }
}
