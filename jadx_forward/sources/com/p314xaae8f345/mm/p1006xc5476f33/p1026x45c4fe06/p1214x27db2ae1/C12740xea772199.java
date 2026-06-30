package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult */
/* loaded from: classes.dex */
final class C12740xea772199 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12740xea772199> f35306x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f172189d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f172190e;

    public C12740xea772199(java.lang.String snapshotPath, java.util.Map contextNameToSnapshotIndexMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotPath, "snapshotPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextNameToSnapshotIndexMap, "contextNameToSnapshotIndexMap");
        this.f172189d = snapshotPath;
        this.f172190e = contextNameToSnapshotIndexMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f172189d);
        java.util.Map map = this.f172190e;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeInt(((java.lang.Number) entry.getValue()).intValue());
        }
    }
}
