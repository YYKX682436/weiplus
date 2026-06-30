package q24;

/* loaded from: classes.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2078x6b0147b.C17654xcabeae64 f441354a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2078x6b0147b.C17654xcabeae64 c17654xcabeae64) {
        this.f441354a = c17654xcabeae64;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2078x6b0147b.C17654xcabeae64 c17654xcabeae64 = this.f441354a;
        c17654xcabeae64.f243523i = z17;
        c17654xcabeae64.t7(c17654xcabeae64.m158354x19263085().getIntent());
        if (z17) {
            c17654xcabeae64.f243522h &= -137438953473L;
        } else {
            c17654xcabeae64.f243522h |= 137438953472L;
        }
        int i17 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 58;
        p53Var.f464295e = i17;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c17654xcabeae64.f243522h));
    }
}
