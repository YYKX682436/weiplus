package mv2;

/* loaded from: classes8.dex */
public final class n0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f413140f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f413141g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f413142h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f413143i;

    /* renamed from: m, reason: collision with root package name */
    public dn.h f413144m;

    /* renamed from: n, reason: collision with root package name */
    public final mv2.m0 f413145n;

    public n0(java.lang.String path, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f413140f = path;
        this.f413141g = "Finder.FinderUploadCryptoLiveCoverImageTask";
        this.f413142h = "";
        this.f413143i = "";
        this.f413145n = new mv2.m0(this);
    }

    @Override // fp0.d
    public void a() {
        java.lang.String str = this.f413140f;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            b(fp0.u.f346824g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f323320f = this.f413145n;
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
        mVar.f69595x6d25b0d9 = str;
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mVar.f69619xe9ed65f6 = w40.e.Qe((w40.e) c17, str, null, 2, null);
        mVar.f69618x114ef53e = "";
        mVar.f69606xccdbf540 = true;
        mVar.f69592xf1ebe47b = 20304;
        mVar.f69580x454032b6 = 292;
        mVar.f69584x89a4c0cf = 2;
        mVar.A = 60;
        mVar.B = 300;
        mVar.f69609xd84b8349 = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f413140f;
    }
}
