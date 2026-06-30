package mv2;

/* loaded from: classes8.dex */
public final class i0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f413109f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f413110g;

    /* renamed from: h, reason: collision with root package name */
    public final mv2.h0 f413111h;

    public i0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f413109f = path;
        this.f413110g = "";
        this.f413111h = new mv2.h0(this);
    }

    @Override // fp0.d
    public void a() {
        this.f413110g = "";
        java.lang.String str = this.f413109f;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            b(fp0.u.f346824g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FinderUploadCoverImageTask";
        mVar.f323320f = this.f413111h;
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
        mVar.f69595x6d25b0d9 = str;
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mVar.f69619xe9ed65f6 = w40.e.Qe((w40.e) c17, str, null, 2, null);
        mVar.f69618x114ef53e = "";
        mVar.f69606xccdbf540 = true;
        mVar.f69592xf1ebe47b = 20304;
        mVar.f69580x454032b6 = 251;
        mVar.f69584x89a4c0cf = 2;
        mVar.A = 60;
        mVar.B = 300;
        mVar.f69609xd84b8349 = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f413109f;
    }
}
