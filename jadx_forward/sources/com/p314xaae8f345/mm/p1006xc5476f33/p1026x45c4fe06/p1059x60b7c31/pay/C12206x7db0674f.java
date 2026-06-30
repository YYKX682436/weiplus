package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/JsApiReportCrossPlatformPayParameter;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayParameter */
/* loaded from: classes7.dex */
public final /* data */ class C12206x7db0674f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12206x7db0674f> f34592x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164084d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164085e;

    public C12206x7db0674f(java.lang.String type, java.lang.String reportId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportId, "reportId");
        this.f164084d = type;
        this.f164085e = reportId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51182xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12206x7db0674f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12206x7db0674f c12206x7db0674f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12206x7db0674f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164084d, c12206x7db0674f.f164084d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164085e, c12206x7db0674f.f164085e);
    }

    /* renamed from: hashCode */
    public int m51183x8cdac1b() {
        return (this.f164084d.hashCode() * 31) + this.f164085e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51184x9616526c() {
        return "JsApiReportCrossPlatformPayParameter(type=" + this.f164084d + ", reportId=" + this.f164085e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f164084d);
        out.writeString(this.f164085e);
    }
}
