package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/GetWxInfoMpPageResponse;", "Landroid/os/Parcelable;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse */
/* loaded from: classes.dex */
public final /* data */ class C19433xdbdb1298 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298> f38747x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.f();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f267409d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f267410e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f267411f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f267412g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f267413h;

    public C19433xdbdb1298(boolean z17, java.lang.String nickName, java.lang.String headImgUrl, java.lang.String userName, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headImgUrl, "headImgUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        this.f267409d = z17;
        this.f267410e = nickName;
        this.f267411f = headImgUrl;
        this.f267412g = userName;
        this.f267413h = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74555xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298 c19433xdbdb1298 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298) obj;
        return this.f267409d == c19433xdbdb1298.f267409d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267410e, c19433xdbdb1298.f267410e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267411f, c19433xdbdb1298.f267411f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267412g, c19433xdbdb1298.f267412g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f267413h, c19433xdbdb1298.f267413h);
    }

    /* renamed from: hashCode */
    public int m74556x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f267409d) * 31) + this.f267410e.hashCode()) * 31) + this.f267411f.hashCode()) * 31) + this.f267412g.hashCode()) * 31) + this.f267413h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74557x9616526c() {
        return "GetWxInfoMpPageResponse(success=" + this.f267409d + ", nickName=" + this.f267410e + ", headImgUrl=" + this.f267411f + ", userName=" + this.f267412g + ", errorMsg=" + this.f267413h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f267409d ? 1 : 0);
        out.writeString(this.f267410e);
        out.writeString(this.f267411f);
        out.writeString(this.f267412g);
        out.writeString(this.f267413h);
    }

    public /* synthetic */ C19433xdbdb1298(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4);
    }
}
