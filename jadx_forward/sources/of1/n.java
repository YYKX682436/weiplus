package of1;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final of1.v0 f426511a;

    public n(of1.v0 webViewController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewController, "webViewController");
        this.f426511a = webViewController;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getContentFromWebpage */
    public final void m151203x7ace5096(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = this.f426511a.f426555a2;
        if (c19231x33dc2abd == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("transHelper");
            throw null;
        }
        if (str == null) {
            str = "";
        }
        c19231x33dc2abd.b(str);
    }
}
