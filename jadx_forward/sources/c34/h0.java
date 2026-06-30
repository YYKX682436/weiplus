package c34;

@j95.b
/* loaded from: classes11.dex */
public class h0 extends i95.w implements yd0.i, a34.e {

    /* renamed from: q, reason: collision with root package name */
    public static com.p314xaae8f345.mm.vfs.r6 f119725q;

    /* renamed from: d, reason: collision with root package name */
    public c34.s f119726d;

    /* renamed from: e, reason: collision with root package name */
    public c34.u f119727e;

    /* renamed from: f, reason: collision with root package name */
    public f34.i f119728f;

    /* renamed from: g, reason: collision with root package name */
    public f34.c f119729g;

    /* renamed from: h, reason: collision with root package name */
    public h34.i0 f119730h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f119731i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final u25.a f119732m = new c34.d0(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.b8 f119733n = new c34.f0(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f8 f119734o = new c34.g0(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2081x633fb29.C17661x1f327a92 f119735p = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2081x633fb29.C17661x1f327a92();

    public static java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        if (!gm0.j1.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        if (f119725q == null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c01.d9.b().f());
            f119725q = r6Var;
            r6Var.J();
        }
        return java.lang.String.format("%s/Sk%s_%s", c01.d9.b().f(), str2, kk.k.g(str.getBytes()));
    }

    public static f34.c Bi() {
        gm0.j1.b().c();
        if (wi().f119729g == null) {
            wi().f119729g = new f34.c();
        }
        return wi().f119729g;
    }

    public static f34.i Di() {
        gm0.j1.b().c();
        if (wi().f119728f == null) {
            wi().f119728f = new f34.i();
        }
        return wi().f119728f;
    }

    public static c34.s Ni() {
        gm0.j1.b().c();
        if (wi().f119726d == null) {
            wi().f119726d = new c34.s(c01.d9.b().s());
        }
        return wi().f119726d;
    }

    public static c34.u Ri() {
        gm0.j1.b().c();
        if (wi().f119727e == null) {
            wi().f119727e = new c34.u(c01.d9.b().s());
        }
        return wi().f119727e;
    }

    public static h34.i0 Ui() {
        gm0.j1.b().c();
        if (wi().f119730h == null) {
            wi().f119730h = new h34.i0(c01.d9.b().s());
        }
        return wi().f119730h;
    }

    public static c34.h0 wi() {
        return (c34.h0) i95.n0.c(c34.h0.class);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.p2621x8fb0427b.l8 r17 = c01.d9.b().r();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) r17).f276653g.a(this.f119734o, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).f276609i.f276584a.put(this.f119733n, new java.lang.Object());
        gm0.j1.e().j(new c34.e0(this));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.mm.p2621x8fb0427b.l8 r17 = c01.d9.b().r();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) r17).f276653g.j(this.f119734o);
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).f276609i.f276584a.remove(this.f119733n);
    }
}
