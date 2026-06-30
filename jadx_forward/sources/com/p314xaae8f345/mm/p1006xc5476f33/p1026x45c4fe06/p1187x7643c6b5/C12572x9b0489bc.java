package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/service/AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.service.AppBrandLaunchPreCompileAndGenCodeCacheLogic$IPCPreCompileRequest */
/* loaded from: classes7.dex */
public final /* data */ class C12572x9b0489bc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12572x9b0489bc> f35170x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170132d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f170133e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f170134f;

    public C12572x9b0489bc(java.lang.String appId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 appPkgHolder, java.lang.String[] scriptFilePaths) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appPkgHolder, "appPkgHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scriptFilePaths, "scriptFilePaths");
        this.f170132d = appId;
        this.f170133e = appPkgHolder;
        this.f170134f = scriptFilePaths;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52549xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12572x9b0489bc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12572x9b0489bc c12572x9b0489bc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12572x9b0489bc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170132d, c12572x9b0489bc.f170132d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170133e, c12572x9b0489bc.f170133e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170134f, c12572x9b0489bc.f170134f);
    }

    /* renamed from: hashCode */
    public int m52550x8cdac1b() {
        return (((this.f170132d.hashCode() * 31) + this.f170133e.hashCode()) * 31) + java.util.Arrays.hashCode(this.f170134f);
    }

    /* renamed from: toString */
    public java.lang.String m52551x9616526c() {
        return "IPCPreCompileRequest(appId=" + this.f170132d + ", appPkgHolder=" + this.f170133e + ", scriptFilePaths=" + java.util.Arrays.toString(this.f170134f) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170132d);
        out.writeParcelable(this.f170133e, i17);
        out.writeStringArray(this.f170134f);
    }
}
