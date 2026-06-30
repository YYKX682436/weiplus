package vd2;

/* loaded from: classes9.dex */
public final class l2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public static final vd2.l2 f517329d = new vd2.l2();

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        vd2.n2 n2Var = vd2.n2.f517350a;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) vd2.n2.f517354e).mo141623x754a37bb()).d();
        vd2.n2.f517351b = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doReport] newTipsIdList.size = ");
        java.util.List list = vd2.n2.f517352c;
        sb6.append(list.size());
        sb6.append(" ,replaceableTipsIdList.size = ");
        java.util.List list2 = vd2.n2.f517353d;
        sb6.append(list2.size());
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyReplaceManager", sb6.toString());
        if (list2.size() > 0) {
            zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
            java.util.List S0 = kz5.n0.S0(list);
            java.util.List S02 = kz5.n0.S0(list2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) qaVar;
            o3Var.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6675x5a505a34 c6675x5a505a34 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6675x5a505a34();
            c6675x5a505a34.f140145d = S0.size();
            c6675x5a505a34.f140146e = S02.size();
            c6675x5a505a34.f140147f = c6675x5a505a34.b("NewTipsIDs", o3Var.lk(S0, "|"), true);
            c6675x5a505a34.f140148g = c6675x5a505a34.b("DeleteTipsIDs", o3Var.lk(S02, "|"), true);
            c6675x5a505a34.k();
            o3Var.Zk(c6675x5a505a34);
        }
        list.clear();
        list2.clear();
        return true;
    }
}
