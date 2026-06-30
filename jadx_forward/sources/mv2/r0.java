package mv2;

/* loaded from: classes8.dex */
public final class r0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f413157f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f413158g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f413159h;

    /* renamed from: i, reason: collision with root package name */
    public final mv2.q0 f413160i;

    public r0(java.lang.String coverPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverPath, "coverPath");
        this.f413157f = coverPath;
        this.f413158g = "Finder.FinderUploadMediaCoverTask";
        this.f413159h = "";
        this.f413160i = new mv2.q0(this);
    }

    @Override // fp0.d
    public void a() {
        this.f413159h = "";
        java.lang.String str = this.f413157f;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            b(fp0.u.f346824g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FinderUploadCoverImageTask";
        mVar.f323320f = this.f413160i;
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
        mVar.f69595x6d25b0d9 = str;
        mVar.f69619xe9ed65f6 = str;
        mVar.f69618x114ef53e = "";
        mVar.f69606xccdbf540 = true;
        mVar.f69592xf1ebe47b = 20304;
        mVar.f69580x454032b6 = 251;
        mVar.f69609xd84b8349 = 2;
        mVar.f69584x89a4c0cf = 2;
        mVar.N = ((ey2.j) ((xy2.e) pf5.u.f435469a.e(zy2.b6.class).c(xy2.e.class))).P6(xy2.d.f539691e);
        mVar.A = 120;
        mVar.B = 300;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f413157f;
    }
}
