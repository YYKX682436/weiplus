package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2429xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/finder/OpenFinderViewTaskData;", "Landroid/os/Parcelable;", "CREATOR", "xx4/c", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.finder.OpenFinderViewTaskData */
/* loaded from: classes13.dex */
public final class C19462xd6b08be4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final xx4.c f38770x681a0c0c = new xx4.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267629d;

    public C19462xd6b08be4(android.os.Parcel src) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        this.f267629d = "";
        java.lang.String readString = src.readString();
        this.f267629d = readString != null ? readString : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f267629d);
    }
}
