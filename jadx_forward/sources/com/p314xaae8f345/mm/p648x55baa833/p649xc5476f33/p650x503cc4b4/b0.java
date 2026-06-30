package com.p314xaae8f345.mm.p648x55baa833.p649xc5476f33.p650x503cc4b4;

/* loaded from: classes9.dex */
public class b0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.ql qlVar;
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe) abstractC20979x809547d1;
        if (c5759x7ac701fe != null && (i17 = (qlVar = c5759x7ac701fe.f136078g).f89248a) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyGroupTodoEventIListener", "NotifyGroupTodoEvent %s", qlVar.f89249b, qlVar.f89250c, java.lang.Integer.valueOf(i17));
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(qlVar.f89249b)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(qlVar.f89249b);
                if (p17 == null) {
                    p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(qlVar.f89249b);
                    p17.n1(java.lang.System.currentTimeMillis());
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(p17);
                }
                p17.D1(1);
                p17.z1(xg3.b.b(p17, 1, java.lang.System.currentTimeMillis()));
                g95.u.j(qlVar.f89249b, 10);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, p17.h1(), false, true);
            }
        }
        return false;
    }
}
