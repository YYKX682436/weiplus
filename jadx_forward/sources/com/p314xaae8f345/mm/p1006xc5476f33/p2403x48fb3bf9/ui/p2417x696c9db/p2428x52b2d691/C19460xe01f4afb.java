package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiSetWxPayTestInfo$RequestType", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiSetWxPayTestInfo$RequestType */
/* loaded from: classes.dex */
public final /* data */ class C19460xe01f4afb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19460xe01f4afb> f38768x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.lc();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267453d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267454e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f267455f;

    public C19460xe01f4afb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f267453d = str;
        this.f267454e = str2;
        this.f267455f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74586xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19460xe01f4afb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19460xe01f4afb c19460xe01f4afb = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19460xe01f4afb) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267453d, c19460xe01f4afb.f267453d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267454e, c19460xe01f4afb.f267454e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267455f, c19460xe01f4afb.f267455f);
    }

    /* renamed from: hashCode */
    public int m74587x8cdac1b() {
        java.lang.String str = this.f267453d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f267454e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f267455f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m74588x9616526c() {
        return "RequestType(ipLong=" + this.f267453d + ", ipShort=" + this.f267454e + ", ipPay=" + this.f267455f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f267453d);
        out.writeString(this.f267454e);
        out.writeString(this.f267455f);
    }
}
