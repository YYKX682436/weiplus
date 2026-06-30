package qi2;

/* loaded from: classes10.dex */
public final class h1 implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qi2.j1 f445060a;

    public h1(qi2.j1 j1Var) {
        this.f445060a = j1Var;
    }

    @Override // si2.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l a() {
        return this.f445060a.f445068h.a();
    }

    @Override // si2.b
    public void c(dk2.pf battleData, yz5.l lVar) {
        java.lang.Boolean bool;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        qi2.j1 j1Var = this.f445060a;
        dk2.u4 u4Var = ((mm2.o4) j1Var.f445068h.g().a(mm2.o4.class)).Z;
        java.lang.Boolean valueOf = u4Var != null ? java.lang.Boolean.valueOf(u4Var.i()) : null;
        zh2.c cVar = j1Var.f445068h;
        dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        int i17 = 1;
        if (u4Var2 != null) {
            bool = java.lang.Boolean.valueOf(u4Var2.f315691e == 7);
        } else {
            bool = null;
        }
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPkPanelWidget", "onLaunchVisitorBattle isBattleFinish: " + valueOf + " isBattlePublicityFinish: " + bool, null);
        qf2.c3 c3Var = (qf2.c3) cVar.mo57008x143f1b92(qf2.c3.class);
        if (c3Var != null) {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool2) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
                i17 = 2;
            }
            c3Var.c7(i17, battleData, new qi2.g1(lVar, j1Var));
        }
    }
}
