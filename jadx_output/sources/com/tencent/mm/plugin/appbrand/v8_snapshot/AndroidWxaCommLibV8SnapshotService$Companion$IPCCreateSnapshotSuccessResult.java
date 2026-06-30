package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult> CREATOR = new com.tencent.mm.plugin.appbrand.v8_snapshot.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f90656d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f90657e;

    public AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult(java.lang.String snapshotPath, java.util.Map contextNameToSnapshotIndexMap) {
        kotlin.jvm.internal.o.g(snapshotPath, "snapshotPath");
        kotlin.jvm.internal.o.g(contextNameToSnapshotIndexMap, "contextNameToSnapshotIndexMap");
        this.f90656d = snapshotPath;
        this.f90657e = contextNameToSnapshotIndexMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f90656d);
        java.util.Map map = this.f90657e;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeInt(((java.lang.Number) entry.getValue()).intValue());
        }
    }
}
