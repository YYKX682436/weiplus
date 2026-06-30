package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult */
/* loaded from: classes7.dex */
final class C12739x5dc836a4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4> f35305x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.b();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f172186d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12740xea772199 f172187e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12738x3fae91e0 f172188f;

    public C12739x5dc836a4(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12740xea772199 c12740xea772199, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12738x3fae91e0 c12738x3fae91e0) {
        this.f172186d = z17;
        this.f172187e = c12740xea772199;
        this.f172188f = c12738x3fae91e0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f172186d ? 1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12740xea772199 c12740xea772199 = this.f172187e;
        if (c12740xea772199 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c12740xea772199.writeToParcel(out, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12738x3fae91e0 c12738x3fae91e0 = this.f172188f;
        if (c12738x3fae91e0 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c12738x3fae91e0.writeToParcel(out, i17);
        }
    }
}
