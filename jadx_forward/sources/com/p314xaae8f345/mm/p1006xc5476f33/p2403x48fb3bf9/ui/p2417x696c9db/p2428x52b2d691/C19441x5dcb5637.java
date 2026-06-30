package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$DeleteProfileOutboxRequest", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest */
/* loaded from: classes.dex */
final /* data */ class C19441x5dcb5637 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19441x5dcb5637> f38754x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267423d;

    /* renamed from: e, reason: collision with root package name */
    public final int f267424e;

    public C19441x5dcb5637(java.lang.String msgId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        this.f267423d = msgId;
        this.f267424e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74565xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19441x5dcb5637)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19441x5dcb5637 c19441x5dcb5637 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19441x5dcb5637) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267423d, c19441x5dcb5637.f267423d) && this.f267424e == c19441x5dcb5637.f267424e;
    }

    /* renamed from: hashCode */
    public int m74566x8cdac1b() {
        return (this.f267423d.hashCode() * 31) + java.lang.Integer.hashCode(this.f267424e);
    }

    /* renamed from: toString */
    public java.lang.String m74567x9616526c() {
        return "DeleteProfileOutboxRequest(msgId=" + this.f267423d + ", bizType=" + this.f267424e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f267423d);
        out.writeInt(this.f267424e);
    }
}
