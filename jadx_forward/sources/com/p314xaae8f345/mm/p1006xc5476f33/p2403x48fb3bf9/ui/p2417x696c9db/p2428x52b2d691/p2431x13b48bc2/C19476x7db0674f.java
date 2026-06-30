package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/wechatpay/JsApiReportCrossPlatformPayParameter;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayParameter */
/* loaded from: classes7.dex */
public final /* data */ class C19476x7db0674f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19476x7db0674f> f38783x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f268150d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f268151e;

    public C19476x7db0674f(java.lang.String type, java.lang.String reportId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportId, "reportId");
        this.f268150d = type;
        this.f268151e = reportId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74742xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19476x7db0674f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19476x7db0674f c19476x7db0674f = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19476x7db0674f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f268150d, c19476x7db0674f.f268150d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f268151e, c19476x7db0674f.f268151e);
    }

    /* renamed from: hashCode */
    public int m74743x8cdac1b() {
        return (this.f268150d.hashCode() * 31) + this.f268151e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74744x9616526c() {
        return "JsApiReportCrossPlatformPayParameter(type=" + this.f268150d + ", reportId=" + this.f268151e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f268150d);
        out.writeString(this.f268151e);
    }
}
