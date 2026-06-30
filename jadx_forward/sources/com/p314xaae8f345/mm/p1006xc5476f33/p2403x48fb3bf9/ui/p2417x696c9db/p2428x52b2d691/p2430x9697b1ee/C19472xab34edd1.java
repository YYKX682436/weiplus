package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetMsgParams;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgParams */
/* loaded from: classes8.dex */
public final class C19472xab34edd1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19472xab34edd1> f38780x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.n();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267691d;

    /* renamed from: e, reason: collision with root package name */
    public final long f267692e;

    /* renamed from: f, reason: collision with root package name */
    public final int f267693f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f267694g;

    public C19472xab34edd1(java.lang.String sessionId, long j17, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f267691d = sessionId;
        this.f267692e = j17;
        this.f267693f = i17;
        this.f267694g = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f267691d);
        out.writeLong(this.f267692e);
        out.writeInt(this.f267693f);
        out.writeInt(this.f267694g ? 1 : 0);
    }
}
