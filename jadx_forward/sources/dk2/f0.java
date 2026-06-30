package dk2;

/* loaded from: classes3.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.iy1 f314949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f314950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r45.iy1 iy1Var, dk2.g0 g0Var) {
        super(0);
        this.f314949d = iy1Var;
        this.f314950e = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLayerShowView: verify_mode:");
        r45.iy1 iy1Var = this.f314949d;
        sb6.append(iy1Var.m75939xb282bd08(0));
        sb6.append(", verification_id:");
        sb6.append(iy1Var.m75945x2fec8307(2));
        sb6.append(", remaining_seconds:");
        sb6.append(iy1Var.m75939xb282bd08(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", sb6.toString());
        int m75939xb282bd08 = iy1Var.m75939xb282bd08(0);
        dk2.g0 g0Var = this.f314950e;
        if (m75939xb282bd08 == 1 || m75939xb282bd08 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = g0Var.f315002b;
            if (k0Var != null) {
                java.lang.String m75945x2fec8307 = iy1Var.m75945x2fec8307(6);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57633x6d192964(k0Var, m75945x2fec8307 == null ? "" : m75945x2fec8307, iy1Var.m75945x2fec8307(1), iy1Var.m75945x2fec8307(5), true, false, g0Var.f315013m, null, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r1.f34829x366c91de, null);
            }
            dk2.g0.a(g0Var, iy1Var.m75939xb282bd08(3));
            g0Var.f315010j = iy1Var.m75945x2fec8307(10);
        } else if (m75939xb282bd08 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = g0Var.f315002b;
            if (k0Var2 != null) {
                java.lang.String m75945x2fec83072 = iy1Var.m75945x2fec8307(6);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57633x6d192964(k0Var2, m75945x2fec83072 == null ? "" : m75945x2fec83072, iy1Var.m75945x2fec8307(1), iy1Var.m75945x2fec8307(5), true, false, g0Var.f315013m, null, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r1.f34829x366c91de, null);
            }
            dk2.g0.a(g0Var, iy1Var.m75939xb282bd08(3));
            g0Var.f315010j = iy1Var.m75945x2fec8307(10);
        } else if (m75939xb282bd08 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var3 = g0Var.f315002b;
            if (k0Var3 != null) {
                java.lang.String m75945x2fec83073 = iy1Var.m75945x2fec8307(6);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57633x6d192964(k0Var3, m75945x2fec83073 == null ? "" : m75945x2fec83073, iy1Var.m75945x2fec8307(1), iy1Var.m75945x2fec8307(5), true, false, g0Var.f315013m, null, null, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
            }
        } else if (m75939xb282bd08 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var4 = g0Var.f315002b;
            if (k0Var4 != null) {
                java.lang.String m75945x2fec83074 = iy1Var.m75945x2fec8307(6);
                java.lang.String str = m75945x2fec83074 == null ? "" : m75945x2fec83074;
                java.lang.String m75945x2fec83075 = iy1Var.m75945x2fec8307(1);
                java.util.LinkedList m75941xfb821914 = iy1Var.m75941xfb821914(15);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57633x6d192964(k0Var4, str, m75945x2fec83075, null, true, false, g0Var.f315013m, m75941xfb821914 != null ? kz5.n0.S0(m75941xfb821914) : null, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) iy1Var.m75936x14adae67(16), iy1Var.m75945x2fec8307(17), 16, null);
            }
            g0Var.f315007g = iy1Var.m75945x2fec8307(8);
            g0Var.f315008h = iy1Var.m75939xb282bd08(12);
            g0Var.f315009i = iy1Var.m75945x2fec8307(5);
            g0Var.f315010j = iy1Var.m75945x2fec8307(10);
            g0Var.f315011k = iy1Var.m75939xb282bd08(9);
            g0Var.f315012l = iy1Var.m75939xb282bd08(18);
            dk2.g0.a(g0Var, iy1Var.m75939xb282bd08(11));
        }
        return jz5.f0.f384359a;
    }
}
