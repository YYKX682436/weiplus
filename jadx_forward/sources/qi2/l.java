package qi2;

/* loaded from: classes10.dex */
public final class l implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qi2.n f445097a;

    public l(qi2.n nVar) {
        this.f445097a = nVar;
    }

    @Override // si2.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l a() {
        return this.f445097a.f445110h.a();
    }

    @Override // si2.b
    public void b(dk2.m battleData, yz5.l lVar) {
        java.lang.Boolean bool;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        qi2.n nVar = this.f445097a;
        dk2.u4 u4Var = ((mm2.o4) nVar.f445110h.g().a(mm2.o4.class)).Z;
        java.lang.Boolean valueOf = u4Var != null ? java.lang.Boolean.valueOf(u4Var.i()) : null;
        zh2.c cVar = nVar.f445110h;
        dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        int i17 = 1;
        boolean z17 = false;
        if (u4Var2 != null) {
            bool = java.lang.Boolean.valueOf(u4Var2.f315691e == 7);
        } else {
            bool = null;
        }
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPkPanelWidget", "onLaunchVisitorBattle isBattleFinish: " + valueOf + " isBattlePublicityFinish: " + bool, null);
        dk2.u4 u4Var3 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        if (u4Var3 != null && u4Var3.g()) {
            z17 = true;
        }
        if (!z17) {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool2) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
                cVar.b(battleData, new qi2.j(lVar, nVar));
                return;
            }
        }
        qf2.y1 y1Var = (qf2.y1) cVar.mo57008x143f1b92(qf2.y1.class);
        if (y1Var != null) {
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool3) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool3)) {
                i17 = 2;
            }
            qi2.k kVar = new qi2.k(lVar, nVar);
            ((mm2.y2) y1Var.m56788xbba4bfc0(mm2.y2.class)).f411101u = battleData;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(y1Var, null, null, new qf2.n1(y1Var, battleData, i17, kVar, null), 3, null);
        }
    }
}
