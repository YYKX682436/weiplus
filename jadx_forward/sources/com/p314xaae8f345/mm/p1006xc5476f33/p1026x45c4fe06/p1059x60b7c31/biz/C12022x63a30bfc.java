package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiGpsInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo */
/* loaded from: classes9.dex */
public final /* data */ class C12022x63a30bfc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc> f33929x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.b();

    /* renamed from: d, reason: collision with root package name */
    public final double f161439d;

    /* renamed from: e, reason: collision with root package name */
    public final double f161440e;

    public C12022x63a30bfc(double d17, double d18) {
        this.f161439d = d17;
        this.f161440e = d18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50657xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc c12022x63a30bfc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc) obj;
        return java.lang.Double.compare(this.f161439d, c12022x63a30bfc.f161439d) == 0 && java.lang.Double.compare(this.f161440e, c12022x63a30bfc.f161440e) == 0;
    }

    /* renamed from: hashCode */
    public int m50658x8cdac1b() {
        return (java.lang.Double.hashCode(this.f161439d) * 31) + java.lang.Double.hashCode(this.f161440e);
    }

    /* renamed from: toString */
    public java.lang.String m50659x9616526c() {
        return "BizPoiGpsInfo(latitude=" + this.f161439d + ", longitude=" + this.f161440e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeDouble(this.f161439d);
        out.writeDouble(this.f161440e);
    }
}
