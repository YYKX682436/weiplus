package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launch/magicbrush_frame/WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper */
/* loaded from: classes7.dex */
public final /* data */ class C12317xbec6cfe9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12317xbec6cfe9> f35042x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.q();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165780d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f165781e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745 f165782f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f165783g;

    public C12317xbec6cfe9(java.lang.String bizInstance, java.lang.String appId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745 initArgs, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 pkgWrappingInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizInstance, "bizInstance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initArgs, "initArgs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        this.f165780d = bizInstance;
        this.f165781e = appId;
        this.f165782f = initArgs;
        this.f165783g = pkgWrappingInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51623xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12317xbec6cfe9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12317xbec6cfe9 c12317xbec6cfe9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12317xbec6cfe9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165780d, c12317xbec6cfe9.f165780d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165781e, c12317xbec6cfe9.f165781e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165782f, c12317xbec6cfe9.f165782f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165783g, c12317xbec6cfe9.f165783g);
    }

    /* renamed from: hashCode */
    public int m51624x8cdac1b() {
        return (((((this.f165780d.hashCode() * 31) + this.f165781e.hashCode()) * 31) + this.f165782f.m51938x8cdac1b()) * 31) + this.f165783g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51625x9616526c() {
        return "RegisterToMBPkgManagementDataIPCWrapper(bizInstance=" + this.f165780d + ", appId=" + this.f165781e + ", initArgs=" + this.f165782f + ", pkgWrappingInfo=" + this.f165783g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165780d);
        out.writeString(this.f165781e);
        this.f165782f.writeToParcel(out, i17);
        out.writeParcelable(this.f165783g, i17);
    }
}
