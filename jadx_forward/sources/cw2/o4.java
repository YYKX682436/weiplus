package cw2;

/* loaded from: classes10.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f305430d;

    public o4(long j17) {
        this.f305430d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Class cls;
        java.lang.String str;
        java.lang.Runnable runnable = cw2.p4.f305453j;
        if (runnable != null) {
            long j17 = this.f305430d;
            if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                cw2.p4 p4Var = cw2.p4.f305444a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNetworkStatusStatistic", "recordFinderNetWorkStatus");
                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadInfo m37748x8ade6947 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37748x8ade6947(251, 20302, 5);
                if (m37748x8ade6947.f18055x7467a666 <= 0) {
                    str = " size:";
                    cls = c61.yb.class;
                } else {
                    r45.sf0 sf0Var = new r45.sf0();
                    cls = c61.yb.class;
                    sf0Var.set(0, java.lang.Long.valueOf(m37748x8ade6947.f18055x7467a666));
                    sf0Var.set(1, java.lang.Long.valueOf(m37748x8ade6947.f18056x990efe87));
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    sf0Var.set(2, java.lang.Long.valueOf(currentTimeMillis - (m37748x8ade6947.f18054xe321d6f7 - m37748x8ade6947.f18053x2584cee9)));
                    sf0Var.set(3, java.lang.Long.valueOf(currentTimeMillis));
                    sf0Var.set(4, java.lang.Integer.valueOf(((c61.p2) ((c61.yb) i95.n0.c(cls))).ij()));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addFinderNetworkInfo info:");
                    sb6.append(sf0Var);
                    str = " size:";
                    sb6.append(str);
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = cw2.p4.f305449f;
                    sb6.append(copyOnWriteArrayList.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNetworkStatusStatistic", sb6.toString());
                    if (copyOnWriteArrayList.size() > 24) {
                        copyOnWriteArrayList.remove(0);
                    }
                    copyOnWriteArrayList.add(sf0Var);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNetworkStatusStatistic", "recordWechatNetWorkStatus");
                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadInfo m37748x8ade69472 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37748x8ade6947(0, 0, 5);
                if (m37748x8ade69472.f18055x7467a666 > 0) {
                    r45.sf0 sf0Var2 = new r45.sf0();
                    sf0Var2.set(0, java.lang.Long.valueOf(m37748x8ade69472.f18055x7467a666));
                    sf0Var2.set(1, java.lang.Long.valueOf(m37748x8ade69472.f18056x990efe87));
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    sf0Var2.set(2, java.lang.Long.valueOf(currentTimeMillis2 - (m37748x8ade69472.f18054xe321d6f7 - m37748x8ade69472.f18053x2584cee9)));
                    sf0Var2.set(3, java.lang.Long.valueOf(currentTimeMillis2));
                    sf0Var2.set(4, java.lang.Integer.valueOf(((c61.p2) ((c61.yb) i95.n0.c(cls))).ij()));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("addWechatNetworkInfo info:");
                    sb7.append(sf0Var2);
                    sb7.append(str);
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = cw2.p4.f305450g;
                    sb7.append(copyOnWriteArrayList2.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNetworkStatusStatistic", sb7.toString());
                    if (copyOnWriteArrayList2.size() > 24) {
                        copyOnWriteArrayList2.remove(0);
                    }
                    copyOnWriteArrayList2.add(sf0Var2);
                }
                if (cw2.p4.f305457n % 3 == 0) {
                    pm0.v.K(null, cw2.n4.f305415d);
                }
                cw2.p4.f305457n++;
                ((ku5.t0) ku5.t0.f394148d).l(runnable, j17, "Finder.FinderNetworkStatusStatistic");
            }
        }
    }
}
