package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/AppBrandAppConfigParserHelper$AheadRequestArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandAppConfigParserHelper$AheadRequestArgs */
/* loaded from: classes7.dex */
public final /* data */ class C12320xd8d30665 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665> f35045x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165860d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f165861e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f165862f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f165863g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f165864h;

    public C12320xd8d30665(java.lang.String wxaLaunchInstanceId, java.lang.String appId, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 pkgWrappingInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaLaunchInstanceId, "wxaLaunchInstanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        this.f165860d = wxaLaunchInstanceId;
        this.f165861e = appId;
        this.f165862f = z17;
        this.f165863g = z18;
        this.f165864h = pkgWrappingInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51640xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665 c12320xd8d30665 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165860d, c12320xd8d30665.f165860d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165861e, c12320xd8d30665.f165861e) && this.f165862f == c12320xd8d30665.f165862f && this.f165863g == c12320xd8d30665.f165863g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165864h, c12320xd8d30665.f165864h);
    }

    /* renamed from: hashCode */
    public int m51641x8cdac1b() {
        return (((((((this.f165860d.hashCode() * 31) + this.f165861e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f165862f)) * 31) + java.lang.Boolean.hashCode(this.f165863g)) * 31) + this.f165864h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51642x9616526c() {
        return "AheadRequestArgs(wxaLaunchInstanceId=" + this.f165860d + ", appId=" + this.f165861e + ", isGame=" + this.f165862f + ", forceLightMode=" + this.f165863g + ", pkgWrappingInfo=" + this.f165864h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165860d);
        out.writeString(this.f165861e);
        out.writeInt(this.f165862f ? 1 : 0);
        out.writeInt(this.f165863g ? 1 : 0);
        out.writeParcelable(this.f165864h, i17);
    }
}
