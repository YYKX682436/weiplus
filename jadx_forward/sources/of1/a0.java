package of1;

/* loaded from: classes7.dex */
public final class a0 implements of1.w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f426417a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f426418b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426419c;

    public a0(of1.v0 v0Var) {
        this.f426419c = v0Var;
    }

    @Override // of1.w
    public boolean a(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        if (this.f426417a || i17 != 0) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new of1.x(this));
        return false;
    }

    @Override // of1.w
    public void b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        pm0.v.X(new of1.z(this.f426419c, url, this));
    }

    @Override // of1.w
    public boolean c(java.lang.String url, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return false;
    }
}
