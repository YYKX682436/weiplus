package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData */
/* loaded from: classes7.dex */
final /* data */ class C11879x7c757cfc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11879x7c757cfc> f33628x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.k();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f159810d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f159811e;

    /* renamed from: f, reason: collision with root package name */
    public final int f159812f;

    public C11879x7c757cfc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 stat, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
        this.f159810d = initConfig;
        this.f159811e = stat;
        this.f159812f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50378xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11879x7c757cfc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11879x7c757cfc c11879x7c757cfc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11879x7c757cfc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f159810d, c11879x7c757cfc.f159810d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f159811e, c11879x7c757cfc.f159811e) && this.f159812f == c11879x7c757cfc.f159812f;
    }

    /* renamed from: hashCode */
    public int m50379x8cdac1b() {
        return (((this.f159810d.hashCode() * 31) + this.f159811e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f159812f);
    }

    /* renamed from: toString */
    public java.lang.String m50380x9616526c() {
        return "BindRemoteServiceData(initConfig=" + this.f159810d + ", stat=" + this.f159811e + ", requestId=" + this.f159812f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f159810d, i17);
        out.writeParcelable(this.f159811e, i17);
        out.writeInt(this.f159812f);
    }
}
