package ft4;

/* loaded from: classes14.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f f348139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.j f348140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f348141f;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f, ft4.j jVar, int i17) {
        this.f348139d = activityC19138xce65e38f;
        this.f348140e = jVar;
        this.f348141f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List m17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348139d;
        dt4.p pVar = activityC19138xce65e38f.f261977w;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        java.util.List n17 = pVar.n("", activityC19138xce65e38f.f261970p, this.f348140e.f348165b.f348170b, 1, false);
        if (!((java.util.ArrayList) n17).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "loadBottomMore pos:" + this.f348141f + ", more < " + this.f348140e.f348165b.f348170b + " tradeData:" + ((dt4.u) kz5.n0.X(n17)).f324825a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            dt4.t tVar = new dt4.t();
            int i17 = (((dt4.u) kz5.n0.X(n17)).f324825a / 100) * 100;
            tVar.f324820a = i17 + 1;
            tVar.f324821b = i17 + 31;
            arrayList.add(tVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f2 = this.f348139d;
            if (activityC19138xce65e38f2.f261969o == 1) {
                dt4.p pVar2 = activityC19138xce65e38f2.f261977w;
                if (pVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar2.l(activityC19138xce65e38f2.f261970p, arrayList);
            } else {
                dt4.p pVar3 = activityC19138xce65e38f2.f261977w;
                if (pVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar3.m(activityC19138xce65e38f2.f261970p, arrayList);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f3 = this.f348139d;
            int V6 = activityC19138xce65e38f3.V6(m17, activityC19138xce65e38f3.f261974t);
            if (V6 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletLedgerMainUI", "loadBottomMore pos:" + this.f348141f + ", getSectionData count is 0");
                ft4.i iVar = this.f348139d.f261975u;
                if (iVar != null) {
                    iVar.f348159h = 0;
                }
                if (iVar != null) {
                    iVar.m8155x27702c4(this.f348141f);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f348139d.A;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                int i18 = this.f348141f - 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c1162x665295de, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                c1162x665295de.mo2420xc593c771(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f4 = this.f348139d;
                ft4.i iVar2 = activityC19138xce65e38f4.f261975u;
                if (iVar2 != null) {
                    java.util.List list = activityC19138xce65e38f4.f261974t;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
                    iVar2.f348156e = list;
                }
                ft4.i iVar3 = this.f348139d.f261975u;
                if (iVar3 != null) {
                    iVar3.m8153xd399a4d9(this.f348141f, V6);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "loadBottomMore pos:" + this.f348141f + ", more < " + this.f348140e.f348165b.f348170b);
            ft4.i iVar4 = this.f348139d.f261975u;
            if (iVar4 != null) {
                iVar4.f348159h = 0;
            }
            if (iVar4 != null) {
                iVar4.m8155x27702c4(this.f348141f);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f348139d.A;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c1163xf1deaba42.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2;
            int i19 = this.f348141f - 1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c1162x665295de2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1162x665295de2.mo2420xc593c771(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        ft4.d0 d0Var = new ft4.d0(this.f348139d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(d0Var, 20L, false);
    }
}
