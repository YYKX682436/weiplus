package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.d f148857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.d dVar) {
        super(1);
        this.f148857d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof eb0.c)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((eb0.c) dVar).f332238b;
            com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.d dVar2 = this.f148857d;
            if (f9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgPreProcessUIC", "msgInfo is null, return");
                dVar2.T6(null, null, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b17 = db0.g.f309361a.b(f9Var);
                if (b17 == null) {
                    dVar2.T6(null, f9Var, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 Ri = k5Var != null ? ((zh1.p) k5Var).Ri(b17) : null;
                    dVar2.T6(Ri, f9Var, b17);
                    if (Ri != null && java.lang.System.currentTimeMillis() - Ri.f167786h > ((java.lang.Number) ((jz5.n) db0.d.f309356a).mo141623x754a37bb()).longValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgPreProcessUIC", "time:" + (java.lang.System.currentTimeMillis() - Ri.f167786h) + " fetchOpenMaterialsByCgi");
                        ((zh1.p) k5Var).getClass();
                        ai1.p.f86635b.b(b17, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
