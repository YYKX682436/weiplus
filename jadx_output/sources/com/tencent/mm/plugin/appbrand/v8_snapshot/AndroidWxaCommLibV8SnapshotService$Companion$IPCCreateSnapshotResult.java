package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult> CREATOR = new com.tencent.mm.plugin.appbrand.v8_snapshot.b();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f90653d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult f90654e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult f90655f;

    public AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult(boolean z17, com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult, com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult) {
        this.f90653d = z17;
        this.f90654e = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult;
        this.f90655f = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f90653d ? 1 : 0);
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult = this.f90654e;
        if (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult.writeToParcel(out, i17);
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult = this.f90655f;
        if (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult.writeToParcel(out, i17);
        }
    }
}
