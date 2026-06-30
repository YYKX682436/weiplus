package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/BindRemoteServiceData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.BindRemoteServiceData */
/* loaded from: classes7.dex */
final /* data */ class C11540x7c757cfc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11540x7c757cfc> f33362x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ea();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f156401d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f156402e;

    /* renamed from: f, reason: collision with root package name */
    public final int f156403f;

    public C11540x7c757cfc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 stat, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
        this.f156401d = initConfig;
        this.f156402e = stat;
        this.f156403f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48817xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11540x7c757cfc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11540x7c757cfc c11540x7c757cfc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11540x7c757cfc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156401d, c11540x7c757cfc.f156401d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156402e, c11540x7c757cfc.f156402e) && this.f156403f == c11540x7c757cfc.f156403f;
    }

    /* renamed from: hashCode */
    public int m48818x8cdac1b() {
        return (((this.f156401d.hashCode() * 31) + this.f156402e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f156403f);
    }

    /* renamed from: toString */
    public java.lang.String m48819x9616526c() {
        return "BindRemoteServiceData(initConfig=" + this.f156401d + ", stat=" + this.f156402e + ", loaderId=" + this.f156403f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f156401d, i17);
        out.writeParcelable(this.f156402e, i17);
        out.writeInt(this.f156403f);
    }
}
