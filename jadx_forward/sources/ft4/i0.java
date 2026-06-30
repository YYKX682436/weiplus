package ft4;

/* loaded from: classes14.dex */
public final class i0 implements gt4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f f348163a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f) {
        this.f348163a = activityC19138xce65e38f;
    }

    @Override // gt4.y
    public java.util.Map a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348163a;
        dt4.p pVar = activityC19138xce65e38f.f261977w;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        dt4.s k17 = pVar.k(activityC19138xce65e38f.f261970p, "", i17, i18);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = k17.f324819e.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(java.lang.Integer.valueOf(((dt4.u) it.next()).f324825a), java.lang.Boolean.TRUE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "getDotMap result size " + linkedHashMap.size());
        return linkedHashMap;
    }

    @Override // gt4.y
    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "onSelectMonth month:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348163a;
        activityC19138xce65e38f.f261966i = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, 8, java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f));
        gt4.s0 s0Var = activityC19138xce65e38f.f261973s;
        if (s0Var != null) {
            s0Var.e();
        }
        activityC19138xce65e38f.f261962e = (i17 * 100) + 1;
        activityC19138xce65e38f.f261963f = activityC19138xce65e38f.f261965h;
        activityC19138xce65e38f.f261971q = 1;
        ft4.i iVar = activityC19138xce65e38f.f261975u;
        if (iVar != null) {
            iVar.f348160i = true;
        }
        activityC19138xce65e38f.X6(i17);
        ft4.i iVar2 = activityC19138xce65e38f.f261975u;
        if (iVar2 != null && iVar2.f348158g == 1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC19138xce65e38f.A;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectMonth", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            c1162x665295de.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectMonth", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // gt4.y
    public void c(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "onSelectSection start:" + i17 + " end:" + i18 + " quickDatePickBtnState:" + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348163a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, 9, java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f), java.lang.Integer.valueOf(i19));
        gt4.s0 s0Var = activityC19138xce65e38f.f261973s;
        if (s0Var != null) {
            s0Var.e();
        }
        activityC19138xce65e38f.f261962e = i17;
        activityC19138xce65e38f.f261963f = i18;
        if (i17 == i18) {
            activityC19138xce65e38f.f261971q = 2;
            ft4.i iVar = activityC19138xce65e38f.f261975u;
            if (iVar != null) {
                iVar.f348160i = false;
            }
        } else {
            activityC19138xce65e38f.f261971q = 3;
            ft4.i iVar2 = activityC19138xce65e38f.f261975u;
            if (iVar2 != null) {
                iVar2.f348160i = true;
            }
        }
        activityC19138xce65e38f.X6(0);
        ft4.i iVar3 = activityC19138xce65e38f.f261975u;
        if (iVar3 != null && iVar3.f348158g == 1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC19138xce65e38f.A;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectSection", "(III)V", "Undefined", "scrollToPosition", "(I)V");
            c1162x665295de.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectSection", "(III)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
