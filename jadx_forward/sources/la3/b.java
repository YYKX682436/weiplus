package la3;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final la3.d f399044a;

    public b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w permission, la3.d webViewData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewData, "webViewData");
        this.f399044a = webViewData;
        new java.lang.ref.WeakReference(context);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17) {
        if (c27816xac2547f9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteApp.WebViewChromeClient", "webview is null");
            return;
        }
        java.lang.String mo120156xb5887639 = c27816xac2547f9.mo120156xb5887639();
        if (mo120156xb5887639 == null) {
            mo120156xb5887639 = "";
        }
        this.f399044a.a("progress", kz5.c1.k(new jz5.l("url", mo120156xb5887639), new jz5.l("progress", java.lang.Integer.valueOf(i17))));
    }
}
