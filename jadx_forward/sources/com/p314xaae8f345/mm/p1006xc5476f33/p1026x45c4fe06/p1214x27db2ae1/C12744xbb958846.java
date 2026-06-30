package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams */
/* loaded from: classes7.dex */
final class C12744xbb958846 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12744xbb958846> f35309x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.u1();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f172192d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 f172193e;

    public C12744xbb958846(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 reader, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 category) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reader, "reader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        this.f172192d = reader;
        this.f172193e = category;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f172192d, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var = this.f172193e;
        out.writeString(l3Var != null ? l3Var.f172308d : null);
    }
}
