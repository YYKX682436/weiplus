package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult> CREATOR = new com.tencent.mm.plugin.appbrand.v8_snapshot.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f90651d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f90652e;

    public AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f90651d = i17;
        this.f90652e = errMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f90651d);
        out.writeString(this.f90652e);
    }
}
