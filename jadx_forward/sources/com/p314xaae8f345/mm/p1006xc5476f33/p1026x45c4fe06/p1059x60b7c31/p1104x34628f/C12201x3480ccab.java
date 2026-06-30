package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/page/JsApiNavigateToWC$LaunchArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs */
/* loaded from: classes7.dex */
public final /* data */ class C12201x3480ccab implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab> f34589x681a0c0c = new nd1.v();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164026d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f164027e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f164028f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f164029g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f164030h;

    public C12201x3480ccab(java.lang.String url, android.os.Bundle singlePageUiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 oldConfig, java.lang.Integer num, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singlePageUiParams, "singlePageUiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldConfig, "oldConfig");
        this.f164026d = url;
        this.f164027e = singlePageUiParams;
        this.f164028f = oldConfig;
        this.f164029g = num;
        this.f164030h = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51160xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab c12201x3480ccab = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164026d, c12201x3480ccab.f164026d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164027e, c12201x3480ccab.f164027e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164028f, c12201x3480ccab.f164028f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164029g, c12201x3480ccab.f164029g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164030h, c12201x3480ccab.f164030h);
    }

    /* renamed from: hashCode */
    public int m51161x8cdac1b() {
        int hashCode = ((((this.f164026d.hashCode() * 31) + this.f164027e.hashCode()) * 31) + this.f164028f.hashCode()) * 31;
        java.lang.Integer num = this.f164029g;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f164030h;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m51162x9616526c() {
        return "LaunchArgs(url=" + this.f164026d + ", singlePageUiParams=" + this.f164027e + ", oldConfig=" + this.f164028f + ", scene=" + this.f164029g + ", sceneNote=" + this.f164030h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f164026d);
        out.writeBundle(this.f164027e);
        out.writeParcelable(this.f164028f, i17);
        java.lang.Integer num = this.f164029g;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.f164030h);
    }
}
