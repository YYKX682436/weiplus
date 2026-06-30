package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/BizPoiResponse;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse */
/* loaded from: classes8.dex */
public final /* data */ class C19432xec875db8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19432xec875db8> f38746x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.b();

    /* renamed from: d, reason: collision with root package name */
    public final double f267405d;

    /* renamed from: e, reason: collision with root package name */
    public final double f267406e;

    /* renamed from: f, reason: collision with root package name */
    public final long f267407f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f267408g;

    public C19432xec875db8(double d17, double d18, long j17, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        this.f267405d = d17;
        this.f267406e = d18;
        this.f267407f = j17;
        this.f267408g = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74551xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19432xec875db8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19432xec875db8 c19432xec875db8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19432xec875db8) obj;
        return java.lang.Double.compare(this.f267405d, c19432xec875db8.f267405d) == 0 && java.lang.Double.compare(this.f267406e, c19432xec875db8.f267406e) == 0 && this.f267407f == c19432xec875db8.f267407f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267408g, c19432xec875db8.f267408g);
    }

    /* renamed from: hashCode */
    public int m74552x8cdac1b() {
        return (((((java.lang.Double.hashCode(this.f267405d) * 31) + java.lang.Double.hashCode(this.f267406e)) * 31) + java.lang.Long.hashCode(this.f267407f)) * 31) + this.f267408g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74553x9616526c() {
        return "BizPoiResponse(latitude=" + this.f267405d + ", longitude=" + this.f267406e + ", timestamp=" + this.f267407f + ", errorMsg=" + this.f267408g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeDouble(this.f267405d);
        out.writeDouble(this.f267406e);
        out.writeLong(this.f267407f);
        out.writeString(this.f267408g);
    }
}
