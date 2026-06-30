package yw;

/* loaded from: classes9.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.r3 f547983a = new yw.r3();

    public final com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f a(java.lang.String userName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f c23529x1b784d5f = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f(yw.h1.f547865a.h(userName), null, null, 6, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(userName);
        if (q57 == null) {
            return c23529x1b784d5f;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f m87034x75149012 = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f.m87034x75149012(c23529x1b784d5f, null, null, java.lang.Long.valueOf(q57.mo78012x3fdd41df()), 3, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(userName);
        if ((p17 != null ? p17.d1() : 0) <= 0) {
            return m87034x75149012;
        }
        long u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().u(userName);
        if (z17) {
            return p17.d1() > r01.q3.oj().P0(u17) ? com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f.m87034x75149012(m87034x75149012, null, java.lang.Boolean.TRUE, null, 5, null) : m87034x75149012;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - q57.mo78012x3fdd41df();
        if (qs1.n.f447787a <= 0) {
            qs1.n.f447787a = 43200000L;
        }
        if (currentTimeMillis < qs1.n.f447787a) {
            return p17.d1() > r01.q3.oj().P0(u17) ? com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f.m87034x75149012(m87034x75149012, null, java.lang.Boolean.TRUE, null, 5, null) : m87034x75149012;
        }
        return m87034x75149012;
    }
}
