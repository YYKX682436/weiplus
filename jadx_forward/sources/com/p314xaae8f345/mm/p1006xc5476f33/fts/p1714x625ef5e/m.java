package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class m implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219157d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar) {
        this.f219157d = lVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219157d;
        if (lVar.f423740d) {
            java.lang.String str = (java.lang.String) obj;
            if (!lVar.o(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onConversationChangeListener filterByUsername %s", str);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L != null && (!lVar.q(L) || L.k2())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", str);
                return;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    if (lVar.f219123i.contains(str) || lVar.f219124m.containsKey(str)) {
                        return;
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f0(lVar, str));
                    return;
                }
                if (i17 != 5) {
                    return;
                }
            }
            if (lVar.f219124m.containsKey(str)) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) lVar.f219119e).b(65556, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e0(lVar, str));
        }
    }
}
