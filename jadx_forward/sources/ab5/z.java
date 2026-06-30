package ab5;

/* loaded from: classes9.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f84518a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f84519b;

    /* renamed from: c, reason: collision with root package name */
    public ab5.y f84520c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f84522e;

    /* renamed from: h, reason: collision with root package name */
    public int f84525h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f84526i;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 f84521d = new k91.z5().a();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f84523f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f84524g = "";

    public z(android.content.Context context) {
        this.f84519b = context;
    }

    public static void a(ab5.z zVar, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.d())) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13798, java.lang.Integer.valueOf(i17), zVar.d(), 0, zVar.f84524g, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
    }

    public static java.lang.String b(ab5.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26 = zVar.f84521d;
        if (c11832x1f85bd26 == null) {
            return "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11832x1f85bd26.f159015h)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f84521d.f159014g)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd262 = zVar.f84521d;
                c11832x1f85bd262.f159015h = ab5.c0.c(c11832x1f85bd262.f159014g);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f84521d.f159015h)) {
                zVar.f84521d.f159015h = "";
            }
        }
        return zVar.f84519b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571547ii, zVar.f84521d.f159015h);
    }

    public final void c(int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d())) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13918, d(), java.lang.Integer.valueOf(i17), this.f84524g, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
    }

    public final java.lang.String d() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f84522e)) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f84523f)) {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(this.f84522e);
            if (Bi != null) {
                this.f84523f = Bi.f68904x28d45f97;
            }
        }
        return this.f84523f;
    }

    public void e(int i17) {
        this.f84518a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f84519b, 1, true);
        switch (i17) {
            case 1:
                this.f84520c = new ab5.p(this);
                break;
            case 2:
                this.f84520c = new ab5.q(this);
                break;
            case 3:
                this.f84520c = new ab5.w(this);
                break;
            case 4:
                this.f84520c = new ab5.x(this);
                break;
            case 5:
                this.f84520c = new ab5.u(this);
                break;
            case 6:
                this.f84520c = new ab5.v(this);
                break;
            default:
                return;
        }
        ab5.y yVar = this.f84520c;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceActionSheet", "resetTitleView, state is null");
        } else {
            android.view.View a17 = yVar.a();
            if (a17 != null) {
                this.f84518a.s(a17, false);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f84518a;
        k0Var.f293405n = new ab5.o(this);
        k0Var.f293414s = new ab5.n(this);
        k0Var.C = new ab5.m(this);
        k0Var.v();
    }
}
