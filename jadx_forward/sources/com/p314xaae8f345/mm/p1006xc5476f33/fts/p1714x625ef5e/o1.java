package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class o1 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219176d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var) {
        this.f219176d = s1Var;
    }

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        o13.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219176d;
        if (s1Var.f423740d && (obj instanceof java.lang.String)) {
            java.lang.String str = (java.lang.String) obj;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "onContactChangeListener " + obj + ", " + i17);
                if ((i17 == 3 || i17 == 4) && (yVar = s1Var.f219197e) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(s1Var.f219199g + 1, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i1(s1Var, str, s1Var.f219202m));
                }
            }
        }
    }
}
