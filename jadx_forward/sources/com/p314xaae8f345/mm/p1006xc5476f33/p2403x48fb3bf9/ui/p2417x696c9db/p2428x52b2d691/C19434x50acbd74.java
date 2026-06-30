package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/ui/tools/newjsapi/n", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData */
/* loaded from: classes.dex */
final class C19434x50acbd74 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n f38748x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267414d;

    public C19434x50acbd74(java.lang.String extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f267414d = "";
        this.f267414d = extInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f267414d);
    }

    public C19434x50acbd74(android.os.Parcel src) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        this.f267414d = "";
        java.lang.String readString = src.readString();
        this.f267414d = readString != null ? readString : "";
    }
}
