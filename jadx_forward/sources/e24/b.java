package e24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2065x55bb7a46.C17544x7049e9fd f328542a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2065x55bb7a46.C17544x7049e9fd c17544x7049e9fd) {
        this.f328542a = c17544x7049e9fd;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2065x55bb7a46.C17544x7049e9fd c17544x7049e9fd = this.f328542a;
        c17544x7049e9fd.f243437i = z17;
        c17544x7049e9fd.t7(c17544x7049e9fd.m158354x19263085().getIntent());
        boolean z18 = !z17;
        c17544x7049e9fd.getClass();
        long i17 = c01.z1.i();
        long j17 = z18 ? i17 & (-137438953473L) : i17 | 137438953472L;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
        int i18 = z18 ? 2 : 1;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 97;
        p53Var.f464295e = i18;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).qj(!z17, c17544x7049e9fd.f243436h == 1);
    }
}
