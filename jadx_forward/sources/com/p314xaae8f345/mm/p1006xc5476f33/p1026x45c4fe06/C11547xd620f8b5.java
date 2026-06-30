package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult */
/* loaded from: classes7.dex */
public final /* data */ class C11547xd620f8b5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11547xd620f8b5> f33373x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.qe();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f156414d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f156415e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f156416f;

    public C11547xd620f8b5(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f156414d = z17;
        this.f156415e = c11809xbc286be4;
        this.f156416f = c12559xbdae8559;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48837xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11547xd620f8b5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11547xd620f8b5 c11547xd620f8b5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11547xd620f8b5) obj;
        return this.f156414d == c11547xd620f8b5.f156414d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156415e, c11547xd620f8b5.f156415e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156416f, c11547xd620f8b5.f156416f);
    }

    /* renamed from: hashCode */
    public int m48838x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f156414d) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f156415e;
        int hashCode2 = (hashCode + (c11809xbc286be4 == null ? 0 : c11809xbc286be4.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = this.f156416f;
        return hashCode2 + (c12559xbdae8559 != null ? c12559xbdae8559.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m48839x9616526c() {
        return "MigrateRestartPreLaunchResult(succeed=" + this.f156414d + ", config=" + this.f156415e + ", stat=" + this.f156416f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f156414d ? 1 : 0);
        out.writeParcelable(this.f156415e, i17);
        out.writeParcelable(this.f156416f, i17);
    }
}
