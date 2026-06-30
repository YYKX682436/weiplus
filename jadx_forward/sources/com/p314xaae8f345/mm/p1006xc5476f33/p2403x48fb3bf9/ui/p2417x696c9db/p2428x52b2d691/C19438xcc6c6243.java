package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetNewLifeContact$NewLifeGetNewLifeContactData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/g2", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetNewLifeContact$NewLifeGetNewLifeContactData */
/* loaded from: classes.dex */
final class C19438xcc6c6243 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g2 f38751x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g2(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267417d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267418e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f267419f;

    public C19438xcc6c6243(java.lang.String jsonStr, java.lang.String extInfo, java.lang.String curUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curUrl, "curUrl");
        this.f267417d = "";
        this.f267418e = "";
        this.f267419f = "";
        this.f267417d = jsonStr;
        this.f267418e = extInfo;
        this.f267419f = curUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f267417d);
        parcel.writeString(this.f267418e);
        parcel.writeString(this.f267419f);
    }

    public C19438xcc6c6243(android.os.Parcel src) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        this.f267417d = "";
        this.f267418e = "";
        this.f267419f = "";
        java.lang.String readString = src.readString();
        this.f267417d = readString == null ? "" : readString;
        java.lang.String readString2 = src.readString();
        this.f267418e = readString2 == null ? "" : readString2;
        java.lang.String readString3 = src.readString();
        this.f267419f = readString3 != null ? readString3 : "";
    }
}
