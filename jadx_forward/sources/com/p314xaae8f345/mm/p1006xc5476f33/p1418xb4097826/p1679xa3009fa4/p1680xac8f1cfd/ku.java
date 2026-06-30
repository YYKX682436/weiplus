package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ku extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80 f216524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu f216525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80 t80Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu nuVar) {
        super(0);
        this.f216524d = t80Var;
        this.f216525e = nuVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0;
        int P6;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 Q6 = this.f216524d.Q6();
            if (Q6 != null && (m56388xcaeb60d0 = Q6.m56388xcaeb60d0()) != 0 && (P6 = this.f216524d.P6()) >= 0 && P6 < m56388xcaeb60d0.size()) {
                long mo2128x1ed62e84 = ((so2.j5) m56388xcaeb60d0.get(P6)).mo2128x1ed62e84();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu nuVar = this.f216525e;
                if (mo2128x1ed62e84 == nuVar.f216896q) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopupUIC", "remove feed fail,feed " + pm0.v.u(this.f216525e.f216896q) + " is playing!");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80 t80Var = this.f216524d;
                    synchronized (m56388xcaeb60d0) {
                        java.util.Iterator it = m56388xcaeb60d0.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            if (((so2.j5) it.next()).mo2128x1ed62e84() == nuVar.f216896q) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 >= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopupUIC", "tabType:" + nuVar.f216895p + " remove feed " + pm0.v.u(nuVar.f216896q) + ",pos:" + i17 + '!');
                            nuVar.V6(0L);
                            nuVar.f216895p = -1;
                            m56388xcaeb60d0.remove(i17);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = t80Var.f217528e;
                            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l17 = ctVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).l() : null;
                            if (l17 != null) {
                                l17.mo56053xb9568715(i17, 1);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "Finder.FinderPopupUIC");
        }
        return jz5.f0.f384359a;
    }
}
