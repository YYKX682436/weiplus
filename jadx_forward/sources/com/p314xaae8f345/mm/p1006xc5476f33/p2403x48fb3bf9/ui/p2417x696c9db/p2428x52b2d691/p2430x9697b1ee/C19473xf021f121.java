package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetSessionIdParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams */
/* loaded from: classes8.dex */
public final class C19473xf021f121 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19473xf021f121> f38781x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267695d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267696e;

    /* renamed from: f, reason: collision with root package name */
    public final int f267697f;

    public C19473xf021f121(java.lang.String selfUserName, java.lang.String talker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUserName, "selfUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f267695d = selfUserName;
        this.f267696e = talker;
        this.f267697f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f267695d);
        out.writeString(this.f267696e);
        out.writeInt(this.f267697f);
    }
}
