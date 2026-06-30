package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$AppInitConfigParcelWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper */
/* loaded from: classes7.dex */
public final /* data */ class C12597xe8378b65 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12597xe8378b65> f35261x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.f0();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f170519d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f170520e;

    public C12597xe8378b65(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 stat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
        this.f170519d = initConfig;
        this.f170520e = stat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52761xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12597xe8378b65)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12597xe8378b65 c12597xe8378b65 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12597xe8378b65) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170519d, c12597xe8378b65.f170519d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170520e, c12597xe8378b65.f170520e);
    }

    /* renamed from: hashCode */
    public int m52762x8cdac1b() {
        return (this.f170519d.hashCode() * 31) + this.f170520e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52763x9616526c() {
        return "AppInitConfigParcelWrapper(initConfig=" + this.f170519d + ", stat=" + this.f170520e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f170519d, i17);
        out.writeParcelable(this.f170520e, i17);
    }
}
