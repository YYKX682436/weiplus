package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/pip/PipStablePos;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/pip/a1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.pip.PipStablePos */
/* loaded from: classes7.dex */
final /* data */ class C12546x36433d62 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.a1 f35149x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.a1(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f168955d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f168956e;

    public C12546x36433d62(java.lang.String appId, android.graphics.Point point) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(point, "point");
        this.f168955d = appId;
        this.f168956e = point;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52294xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62 c12546x36433d62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.C12546x36433d62) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f168955d, c12546x36433d62.f168955d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f168956e, c12546x36433d62.f168956e);
    }

    /* renamed from: hashCode */
    public int m52295x8cdac1b() {
        return (this.f168955d.hashCode() * 31) + this.f168956e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52296x9616526c() {
        return "PipStablePos(appId=" + this.f168955d + ", point=" + this.f168956e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        try {
            parcel.writeString(this.f168955d);
            parcel.writeParcelable(this.f168956e, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPipStablePosLogicWC", "writeToParcel fail since " + e17);
        }
    }
}
