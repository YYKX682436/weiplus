package si0;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.s0 f489692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.nk0 f489693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489694f;

    public r0(si0.s0 s0Var, bw5.nk0 nk0Var, java.lang.String str) {
        this.f489692d = s0Var;
        this.f489693e = nk0Var;
        this.f489694f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f489692d.f489698d;
        if (c17933xe8d1b226 == null) {
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(c17933xe8d1b226);
        f17.f39000xe139598c = this.f489693e.b().f113684d;
        bw5.qk0 b17 = this.f489693e.b();
        int i17 = b17 == null ? -1 : si0.q0.f489685a[b17.ordinal()];
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> public " + this.f489694f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f489692d.f489698d;
            if (c17933xe8d1b2262 != null) {
                c17933xe8d1b2262.m70460x23d307c3(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = this.f489692d.f489698d;
            if (c17933xe8d1b2263 != null) {
                c17933xe8d1b2263.m70472x585e04d1();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = this.f489692d.f489698d;
            if (c17933xe8d1b2264 != null) {
                c17933xe8d1b2264.m70445x635d8e6b();
            }
            si0.s0.b(this.f489692d, f17);
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> private " + this.f489694f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2265 = this.f489692d.f489698d;
            if (c17933xe8d1b2265 != null) {
                c17933xe8d1b2265.m70460x23d307c3(1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2266 = this.f489692d.f489698d;
            if (c17933xe8d1b2266 != null) {
                c17933xe8d1b2266.m70451x2f244d1a();
            }
            si0.s0.b(this.f489692d, f17);
        } else if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> visible " + this.f489694f);
            si0.s0.a(this.f489692d, f17, this.f489693e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2267 = this.f489692d.f489698d;
            if (c17933xe8d1b2267 != null) {
                c17933xe8d1b2267.m70460x23d307c3(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2268 = this.f489692d.f489698d;
            if (c17933xe8d1b2268 != null) {
                c17933xe8d1b2268.m70472x585e04d1();
            }
        } else if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "changeSnsInfoVisibility >> invisible " + this.f489694f);
            si0.s0.a(this.f489692d, f17, this.f489693e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2269 = this.f489692d.f489698d;
            if (c17933xe8d1b2269 != null) {
                c17933xe8d1b2269.m70460x23d307c3(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b22610 = this.f489692d.f489698d;
            if (c17933xe8d1b22610 != null) {
                c17933xe8d1b22610.m70472x585e04d1();
            }
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b22611 = this.f489692d.f489698d;
            if (c17933xe8d1b22611 != null) {
                c17933xe8d1b22611.f68881x4c58c87d = f17.mo14344x5f01b1f6();
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PlatformChangeVisibilityDelegateImpl", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b22612 = this.f489692d.f489698d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b22612);
        Fj.v3(c17933xe8d1b22612.f68891x29d1292e, this.f489692d.f489698d);
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b22613 = this.f489692d.f489698d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b22613);
        long j17 = c17933xe8d1b22613.f68891x29d1292e;
        o75.b bVar = o75.b.f425114b;
        gVar.i7(j17, o75.b.f425116d);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6110x1b517f4f c6110x1b517f4f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6110x1b517f4f();
        c6110x1b517f4f.f136386g.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlatformChangeVisibilityDelegateImpl", "event publish, snsId is " + this.f489694f);
        c6110x1b517f4f.e();
    }
}
