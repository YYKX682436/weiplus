package u04;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final u04.d f505008a = new u04.d();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f505009b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f505010c;

    /* renamed from: d, reason: collision with root package name */
    public static s04.a f505011d;

    static {
        f505009b = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2561xd05e7f95.C20623x2a3d0f77()) == 1;
        f505010c = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2561xd05e7f95.C20624xbdcc9b37()) * 1000 * 60;
    }

    public final java.lang.Long a(java.lang.String str, int i17) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).m134976x2690a4ac();
        if (str != null) {
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(r04.a.class);
            }
            r04.b X6 = ((r04.d) ((r04.a) a17).P6(r04.d.class)).X6(i17 + '_' + str);
            if (X6 != null) {
                return java.lang.Long.valueOf(X6.f66006xa783a79b);
            }
        }
        return null;
    }

    public final void b() {
        ((q04.y) i95.n0.c(q04.y.class)).Ai();
        f505011d = null;
    }
}
