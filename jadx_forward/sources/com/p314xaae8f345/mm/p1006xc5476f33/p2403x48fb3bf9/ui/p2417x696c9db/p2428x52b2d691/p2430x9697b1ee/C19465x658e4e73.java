package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GameLifeMsg;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GameLifeMsg */
/* loaded from: classes8.dex */
public final class C19465x658e4e73 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19465x658e4e73> f38773x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f267658d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267659e;

    /* renamed from: f, reason: collision with root package name */
    public final double f267660f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f267661g;

    /* renamed from: h, reason: collision with root package name */
    public final int f267662h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f267663i;

    /* renamed from: m, reason: collision with root package name */
    public final int f267664m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f267665n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f267666o;

    /* renamed from: p, reason: collision with root package name */
    public final int f267667p;

    /* renamed from: q, reason: collision with root package name */
    public final int f267668q;

    public C19465x658e4e73(java.lang.String toUsername, java.lang.String fromUsername, double d17, java.lang.String content, int i17, java.lang.String sessionId, int i18, java.lang.String msgSource, java.lang.String appId, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgSource, "msgSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f267658d = toUsername;
        this.f267659e = fromUsername;
        this.f267660f = d17;
        this.f267661g = content;
        this.f267662h = i17;
        this.f267663i = sessionId;
        this.f267664m = i18;
        this.f267665n = msgSource;
        this.f267666o = appId;
        this.f267667p = i19;
        this.f267668q = i27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f267658d);
        out.writeString(this.f267659e);
        out.writeDouble(this.f267660f);
        out.writeString(this.f267661g);
        out.writeInt(this.f267662h);
        out.writeString(this.f267663i);
        out.writeInt(this.f267664m);
        out.writeString(this.f267665n);
        out.writeString(this.f267666o);
        out.writeInt(this.f267667p);
        out.writeInt(this.f267668q);
    }
}
