package i41;

@j95.b
/* loaded from: classes4.dex */
public class l extends i95.w implements j41.c0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f369905n;

    /* renamed from: d, reason: collision with root package name */
    public u41.d f369906d;

    /* renamed from: e, reason: collision with root package name */
    public u41.b f369907e;

    /* renamed from: f, reason: collision with root package name */
    public u41.l f369908f;

    /* renamed from: g, reason: collision with root package name */
    public u41.h f369909g;

    /* renamed from: h, reason: collision with root package name */
    public u41.j f369910h;

    /* renamed from: i, reason: collision with root package name */
    public k41.r0 f369911i;

    /* renamed from: m, reason: collision with root package name */
    public u41.f f369912m;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f369905n = hashMap;
        hashMap.put(-923510998, new i41.e());
        hashMap.put(1560773163, new i41.f());
        hashMap.put(-565094361, new i41.g());
        hashMap.put(64785613, new i41.h());
        hashMap.put(-256987579, new i41.i());
        hashMap.put(340868664, new i41.j());
        hashMap.put(-862743677, new i41.k());
    }

    public u41.d Ai() {
        gm0.j1.b().c();
        if (this.f369906d == null) {
            gm0.j1.i();
            this.f369906d = new u41.d(gm0.j1.u().f354686f);
        }
        return this.f369906d;
    }

    public u41.f Bi() {
        gm0.j1.b().c();
        if (this.f369912m == null) {
            gm0.j1.i();
            this.f369912m = new u41.f(gm0.j1.u().f354686f);
        }
        return this.f369912m;
    }

    public k41.r0 Di() {
        gm0.j1.b().c();
        if (this.f369911i == null) {
            gm0.j1.i();
            this.f369911i = new k41.r0(gm0.j1.u().f354686f);
        }
        return this.f369911i;
    }

    public u41.h Ni() {
        gm0.j1.b().c();
        if (this.f369909g == null) {
            gm0.j1.i();
            this.f369909g = new u41.h(gm0.j1.u().f354686f);
        }
        return this.f369909g;
    }

    public u41.j Ri() {
        gm0.j1.b().c();
        if (this.f369910h == null) {
            gm0.j1.i();
            this.f369910h = new u41.j(gm0.j1.u().f354686f);
        }
        return this.f369910h;
    }

    public u41.l Ui() {
        gm0.j1.b().c();
        if (this.f369908f == null) {
            gm0.j1.i();
            this.f369908f = new u41.l(gm0.j1.u().f354686f);
        }
        return this.f369908f;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginOpenIM", "onAccountInitialized");
        ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
        k41.h1 h1Var = k41.h1.f385540d;
        gm0.j1.d().a(4010, h1Var);
        gm0.j1.d().a(6849, h1Var);
        gm0.j1.d().a(5997, h1Var);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginOpenIM", "onAccountRelease");
        ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).getClass();
        k41.h1 h1Var = k41.h1.f385540d;
        gm0.j1.d().q(4010, h1Var);
        gm0.j1.d().q(6849, h1Var);
        gm0.j1.d().q(5997, h1Var);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            q25.b.b(new y41.a(), "//im");
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j();
        }
    }

    public u41.b wi() {
        gm0.j1.b().c();
        if (this.f369907e == null) {
            gm0.j1.i();
            this.f369907e = new u41.b(gm0.j1.u().f354686f);
        }
        return this.f369907e;
    }
}
