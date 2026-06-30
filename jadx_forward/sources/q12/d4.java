package q12;

/* loaded from: classes9.dex */
public class d4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        android.database.Cursor cursor;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6212x319a155e) abstractC20979x809547d1).f136463g.f88524a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(f9Var.z0());
        if (u17 != null) {
            if (u17.f68689x2262335f == 1) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.y0(u17.f68653x95b20dd4)) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                    cursor = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().S1(u17.f68653x95b20dd4);
                } else if (u17.f68653x95b20dd4 == 17 && u17.j().length() > 0 && com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.y0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(u17.j(), 0))) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                    cursor = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().S1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(u17.j(), 0));
                } else {
                    cursor = null;
                }
                if (cursor != null) {
                    int R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(cursor.getCount() - 1, 0);
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                    cursor.moveToPosition(R);
                    c21053xdbf1e5f4.mo9015xbf5d97fd(cursor);
                    cursor.close();
                    u17 = c21053xdbf1e5f4;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).fj(f9Var, u17.mo42933xb5885648());
                f9Var.l1(0);
                com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j());
                y4Var.f277888c = false;
                f9Var.r1(1);
                f9Var.d1(y4Var.d());
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = u17;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().Y(f9Var.Q0(), c21053xdbf1e5f42, f9Var, null, c21053xdbf1e5f42.K2.ordinal());
        }
        return false;
    }
}
