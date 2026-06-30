package of1;

/* loaded from: classes7.dex */
public final class c0 implements of1.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f426429a = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426430b;

    public c0(of1.v0 v0Var) {
        this.f426430b = v0Var;
    }

    @Override // of1.w
    public boolean a(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        if (!this.f426429a.remove(reqUrl)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f426430b.D1(), "overrideUrlRedirect(reason:" + i17 + ", forceRedirect:" + z17 + ", reqUrl:" + reqUrl + ", fullUrl:" + fullUrl + ") INGORED");
        return true;
    }

    @Override // of1.w
    public void b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        pm0.v.X(new of1.b0(this.f426430b, url, this));
    }

    @Override // of1.w
    public boolean c(java.lang.String url, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (i17 != 0 || !this.f426429a.remove(url)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f426430b.D1(), "overrideGetA8Key(url:" + url + ", force:" + z17 + ", reason:" + i17 + ") IGNORED");
        return true;
    }
}
