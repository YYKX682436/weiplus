package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/fakenative/JsApiRemoveSplashScreenshot$RemoveParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot$RemoveParams */
/* loaded from: classes4.dex */
final /* data */ class C12095xaadb9f8c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12095xaadb9f8c> f34158x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f162425d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162426e;

    public C12095xaadb9f8c(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f162425d = appId;
        this.f162426e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12095xaadb9f8c)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12095xaadb9f8c c12095xaadb9f8c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12095xaadb9f8c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162425d, c12095xaadb9f8c.f162425d) && this.f162426e == c12095xaadb9f8c.f162426e;
    }

    /* renamed from: hashCode */
    public int m50921x8cdac1b() {
        return (this.f162425d.hashCode() * 31) + java.lang.Integer.hashCode(this.f162426e);
    }

    /* renamed from: toString */
    public java.lang.String m50922x9616526c() {
        return "RemoveParams(appId=" + this.f162425d + ", versionType=" + this.f162426e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f162425d);
        out.writeInt(this.f162426e);
    }
}
