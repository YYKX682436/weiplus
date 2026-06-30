package n24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.sns.C17633x704b109e f415849a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.sns.C17633x704b109e c17633x704b109e) {
        this.f415849a = c17633x704b109e;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.sns.C17633x704b109e c17633x704b109e = this.f415849a;
        c17633x704b109e.f243508i = z17;
        c17633x704b109e.t7(c17633x704b109e.m158354x19263085().getIntent());
        if (z17) {
            c17633x704b109e.f243507h |= 274877906944L;
        } else {
            c17633x704b109e.f243507h &= -274877906945L;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(c17633x704b109e.f243507h));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", c17633x704b109e.f243507h);
        int i17 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 98;
        p53Var.f464295e = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }
}
