package c34;

@j95.b
/* loaded from: classes11.dex */
public class h0 extends i95.w implements yd0.i, a34.e {

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.mm.vfs.r6 f38192q;

    /* renamed from: d, reason: collision with root package name */
    public c34.s f38193d;

    /* renamed from: e, reason: collision with root package name */
    public c34.u f38194e;

    /* renamed from: f, reason: collision with root package name */
    public f34.i f38195f;

    /* renamed from: g, reason: collision with root package name */
    public f34.c f38196g;

    /* renamed from: h, reason: collision with root package name */
    public h34.i0 f38197h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f38198i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final u25.a f38199m = new c34.d0(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.storage.b8 f38200n = new c34.f0(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.storage.f8 f38201o = new c34.g0(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.shake.model.ShakeMgrImpl f38202p = new com.tencent.mm.plugin.shake.model.ShakeMgrImpl();

    public static java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        if (!gm0.j1.a() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        if (f38192q == null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c01.d9.b().f());
            f38192q = r6Var;
            r6Var.J();
        }
        return java.lang.String.format("%s/Sk%s_%s", c01.d9.b().f(), str2, kk.k.g(str.getBytes()));
    }

    public static f34.c Bi() {
        gm0.j1.b().c();
        if (wi().f38196g == null) {
            wi().f38196g = new f34.c();
        }
        return wi().f38196g;
    }

    public static f34.i Di() {
        gm0.j1.b().c();
        if (wi().f38195f == null) {
            wi().f38195f = new f34.i();
        }
        return wi().f38195f;
    }

    public static c34.s Ni() {
        gm0.j1.b().c();
        if (wi().f38193d == null) {
            wi().f38193d = new c34.s(c01.d9.b().s());
        }
        return wi().f38193d;
    }

    public static c34.u Ri() {
        gm0.j1.b().c();
        if (wi().f38194e == null) {
            wi().f38194e = new c34.u(c01.d9.b().s());
        }
        return wi().f38194e;
    }

    public static h34.i0 Ui() {
        gm0.j1.b().c();
        if (wi().f38197h == null) {
            wi().f38197h = new h34.i0(c01.d9.b().s());
        }
        return wi().f38197h;
    }

    public static c34.h0 wi() {
        return (c34.h0) i95.n0.c(c34.h0.class);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.storage.l8 r17 = c01.d9.b().r();
        ((com.tencent.mm.storage.m4) r17).f195120g.a(this.f38201o, null);
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        ((com.tencent.mm.storage.k4) q17).f195076i.f195051a.put(this.f38200n, new java.lang.Object());
        gm0.j1.e().j(new c34.e0(this));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mm.storage.l8 r17 = c01.d9.b().r();
        ((com.tencent.mm.storage.m4) r17).f195120g.j(this.f38201o);
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        ((com.tencent.mm.storage.k4) q17).f195076i.f195051a.remove(this.f38200n);
    }
}
