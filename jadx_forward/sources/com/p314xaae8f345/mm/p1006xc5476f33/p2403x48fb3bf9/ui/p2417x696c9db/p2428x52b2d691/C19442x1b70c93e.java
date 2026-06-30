package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenBizPublishImage$IPCBizPublishImageRet", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet */
/* loaded from: classes.dex */
public final /* data */ class C19442x1b70c93e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e> f38755x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g6();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f267425d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267426e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f267427f;

    public C19442x1b70c93e(boolean z17, java.lang.String errMsg, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        this.f267425d = z17;
        this.f267426e = errMsg;
        this.f267427f = extraData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74569xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e c19442x1b70c93e = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e) obj;
        return this.f267425d == c19442x1b70c93e.f267425d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267426e, c19442x1b70c93e.f267426e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267427f, c19442x1b70c93e.f267427f);
    }

    /* renamed from: hashCode */
    public int m74570x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f267425d) * 31) + this.f267426e.hashCode()) * 31) + this.f267427f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74571x9616526c() {
        return "IPCBizPublishImageRet(isSuc=" + this.f267425d + ", errMsg=" + this.f267426e + ", extraData=" + this.f267427f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f267425d ? 1 : 0);
        out.writeString(this.f267426e);
        out.writeParcelable(this.f267427f, i17);
    }
}
