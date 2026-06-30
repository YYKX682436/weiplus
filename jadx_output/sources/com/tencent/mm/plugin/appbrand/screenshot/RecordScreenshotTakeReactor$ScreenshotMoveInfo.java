package com.tencent.mm.plugin.appbrand.screenshot;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/screenshot/RecordScreenshotTakeReactor$ScreenshotMoveInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class RecordScreenshotTakeReactor$ScreenshotMoveInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.screenshot.RecordScreenshotTakeReactor$ScreenshotMoveInfo> CREATOR = new com.tencent.mm.plugin.appbrand.screenshot.f1();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88461d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88462e;

    public RecordScreenshotTakeReactor$ScreenshotMoveInfo(java.lang.String fromPath, java.lang.String toPath) {
        kotlin.jvm.internal.o.g(fromPath, "fromPath");
        kotlin.jvm.internal.o.g(toPath, "toPath");
        this.f88461d = fromPath;
        this.f88462e = toPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "ScreenshotMoveInfo(fromPath='" + this.f88461d + "', toPath='" + this.f88462e + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f88461d);
        out.writeString(this.f88462e);
    }
}
