package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/webview/model/WebViewEventReporter$Companion$IPCWebViewEventData", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/webview/model/w3", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.model.WebViewEventReporter$Companion$IPCWebViewEventData */
/* loaded from: classes8.dex */
final class C19282x8b00f8ad implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.w3 f38724x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.w3(null);

    /* renamed from: d, reason: collision with root package name */
    public int f264264d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f264265e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f264266f;

    public C19282x8b00f8ad(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f264264d = parcel.readInt();
        this.f264265e = parcel.readString();
        this.f264266f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f264264d);
        java.lang.String str = this.f264265e;
        if (str == null) {
            str = "";
        }
        dest.writeString(str);
        java.lang.String str2 = this.f264266f;
        dest.writeString(str2 != null ? str2 : "");
    }
}
