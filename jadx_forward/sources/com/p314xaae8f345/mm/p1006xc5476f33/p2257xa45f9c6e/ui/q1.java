package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254224e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3, int i17) {
        this.f254224e = c18557xc00aa3f3;
        this.f254223d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254224e;
        rh4.n0 n0Var = c18557xc00aa3f3.f254064k2;
        int i17 = this.f254223d;
        if (n0Var != null && i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onDataUpdated WeAppSectionData recent: %d", java.lang.Integer.valueOf(c18557xc00aa3f3.f254056c2.f254194g.size()));
            c18557xc00aa3f3.f254064k2.m162452xe131cdea(c18557xc00aa3f3.f254056c2.f254194g);
        }
        if (c18557xc00aa3f3.f254065l2 != null && i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onDataUpdated WeAppSectionData my: %d", java.lang.Integer.valueOf(c18557xc00aa3f3.f254056c2.f254195h.size()));
            c18557xc00aa3f3.f254065l2.m162452xe131cdea(c18557xc00aa3f3.f254056c2.f254195h);
        }
        if (c18557xc00aa3f3.f254066m2 == null || i17 != 7) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onDataUpdated WeAppSectionData common used: %d", java.lang.Integer.valueOf(c18557xc00aa3f3.f254056c2.f254196i.size()));
        int m162447x8c6e4d5c = c18557xc00aa3f3.f254066m2.m162447x8c6e4d5c();
        c18557xc00aa3f3.f254066m2.m162452xe131cdea(c18557xc00aa3f3.f254056c2.f254196i);
        if (c18557xc00aa3f3.H2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "do fadeInOut Item Animation");
            c18557xc00aa3f3.f254066m2.s(m162447x8c6e4d5c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onDataUpdated force update commonused weapp isHeaderOpen:%b", java.lang.Boolean.valueOf(c18557xc00aa3f3.f254075v2));
            if (c18557xc00aa3f3.f254075v2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.g1(c18557xc00aa3f3, c18557xc00aa3f3.J2);
            }
        }
    }
}
