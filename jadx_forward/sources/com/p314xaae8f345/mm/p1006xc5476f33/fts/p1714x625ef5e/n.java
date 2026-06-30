package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class n implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219169d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar) {
        this.f219169d = lVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219169d;
        if (lVar.f423740d) {
            java.lang.String str = (java.lang.String) obj;
            if (!lVar.o(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener filterByUsername %s", str);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L != null && !lVar.q(L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", str);
                return;
            }
            if (i17 == 2) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.a0(lVar, str));
            } else if (i17 == 3 || i17 == 4) {
                if (!lVar.f219124m.containsKey(str)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e0(lVar, str));
                }
            } else if (i17 == 5) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y(lVar, str));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.g0(lVar, str));
        }
    }
}
