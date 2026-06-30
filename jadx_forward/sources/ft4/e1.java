package ft4;

/* loaded from: classes14.dex */
public final class e1 implements gt4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c f348142a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c) {
        this.f348142a = activityC19139x26e1e89c;
    }

    @Override // gt4.y
    public java.util.Map a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = this.f348142a;
        dt4.p pVar = activityC19139x26e1e89c.f261991q;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        dt4.s k17 = pVar.k(activityC19139x26e1e89c.f261987m, activityC19139x26e1e89c.f261982e, i17, i18);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = k17.f324819e.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(java.lang.Integer.valueOf(((dt4.u) it.next()).f324825a), java.lang.Boolean.TRUE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "getDotMap result size " + linkedHashMap.size());
        return linkedHashMap;
    }

    @Override // gt4.y
    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "onSelectMonth month:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = this.f348142a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 4, 8, java.lang.Integer.valueOf(activityC19139x26e1e89c.f261983f), java.lang.Integer.valueOf(activityC19139x26e1e89c.f261984g));
        gt4.s0 s0Var = activityC19139x26e1e89c.f261990p;
        if (s0Var != null) {
            s0Var.e();
        }
        int i18 = i17 * 100;
        activityC19139x26e1e89c.f261983f = i18 + 1;
        activityC19139x26e1e89c.f261984g = i18 + 31;
        activityC19139x26e1e89c.f261999y = 1;
        activityC19139x26e1e89c.U6();
    }

    @Override // gt4.y
    public void c(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "onSelectSection start:" + i17 + " end:" + i18 + " quickDatePickBtnState:" + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = this.f348142a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 4, 9, java.lang.Integer.valueOf(activityC19139x26e1e89c.f261983f), java.lang.Integer.valueOf(activityC19139x26e1e89c.f261984g), java.lang.Integer.valueOf(i19));
        gt4.s0 s0Var = activityC19139x26e1e89c.f261990p;
        if (s0Var != null) {
            s0Var.e();
        }
        activityC19139x26e1e89c.f261983f = i17;
        activityC19139x26e1e89c.f261984g = i18;
        if (i17 == i18) {
            activityC19139x26e1e89c.f261999y = 2;
        } else {
            activityC19139x26e1e89c.f261999y = 3;
        }
        activityC19139x26e1e89c.U6();
    }
}
