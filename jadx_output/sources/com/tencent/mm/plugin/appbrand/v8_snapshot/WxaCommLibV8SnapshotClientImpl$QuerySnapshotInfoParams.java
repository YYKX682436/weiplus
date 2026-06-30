package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams> CREATOR = new com.tencent.mm.plugin.appbrand.v8_snapshot.u1();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90659d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.v8_snapshot.l3 f90660e;

    public WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(reader, "reader");
        kotlin.jvm.internal.o.g(category, "category");
        this.f90659d = reader;
        this.f90660e = category;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f90659d, i17);
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = this.f90660e;
        out.writeString(l3Var != null ? l3Var.f90775d : null);
    }
}
