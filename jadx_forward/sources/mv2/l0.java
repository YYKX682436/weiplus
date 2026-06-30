package mv2;

/* loaded from: classes8.dex */
public final class l0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f413134f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f413135g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f413136h;

    /* renamed from: i, reason: collision with root package name */
    public final mv2.k0 f413137i;

    public l0(java.lang.String path, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f413134f = path;
        this.f413135g = userName;
        this.f413136h = "Finder.FinderUploadCoverImageTask";
        this.f413137i = new mv2.k0(this);
    }

    public static final void e(mv2.l0 l0Var, java.lang.String str, boolean z17) {
        l0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f413136h, "updateContact " + str + ", " + z17);
        ya2.g gVar = ya2.h.f542017a;
        ya2.b2 b17 = gVar.b(l0Var.f413135g);
        if (b17 != null) {
            if (z17) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            } else {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            }
            gVar.o(b17);
        }
    }

    @Override // fp0.d
    public void a() {
        java.lang.String str = this.f413134f;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            b(fp0.u.f346824g);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FinderUploadCoverImageTask";
        mVar.f323320f = this.f413137i;
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
        mVar.f69595x6d25b0d9 = str;
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mVar.f69619xe9ed65f6 = w40.e.Qe((w40.e) c17, str, null, 2, null);
        mVar.f69618x114ef53e = "";
        mVar.f69606xccdbf540 = true;
        mVar.f69592xf1ebe47b = 20201;
        mVar.f69580x454032b6 = 100;
        mVar.f69584x89a4c0cf = 1;
        mVar.A = 60;
        mVar.B = 300;
        mVar.f69609xd84b8349 = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f413134f;
    }
}
