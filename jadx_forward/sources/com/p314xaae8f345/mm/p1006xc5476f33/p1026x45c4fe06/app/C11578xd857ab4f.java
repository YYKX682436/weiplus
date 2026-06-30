package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult */
/* loaded from: classes4.dex */
public final /* data */ class C11578xd857ab4f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11578xd857ab4f> f33431x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.u8();

    /* renamed from: d, reason: collision with root package name */
    public final int f156531d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156532e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f156533f;

    public C11578xd857ab4f(int i17, boolean z17, java.lang.String str) {
        this.f156531d = i17;
        this.f156532e = z17;
        this.f156533f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48902xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11578xd857ab4f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11578xd857ab4f c11578xd857ab4f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11578xd857ab4f) obj;
        return this.f156531d == c11578xd857ab4f.f156531d && this.f156532e == c11578xd857ab4f.f156532e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156533f, c11578xd857ab4f.f156533f);
    }

    /* renamed from: hashCode */
    public int m48903x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f156531d) * 31) + java.lang.Boolean.hashCode(this.f156532e)) * 31;
        java.lang.String str = this.f156533f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m48904x9616526c() {
        return "IPCReportMiniProgramPageDataResult(reportId=" + this.f156531d + ", isSucceed=" + this.f156532e + ", errMsg=" + this.f156533f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f156531d);
        out.writeInt(this.f156532e ? 1 : 0);
        out.writeString(this.f156533f);
    }
}
