package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254227d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3) {
        this.f254227d = c18557xc00aa3f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254227d;
        if (c18557xc00aa3f3.f254064k2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData recent: %d", java.lang.Integer.valueOf(c18557xc00aa3f3.f254056c2.f254194g.size()));
            c18557xc00aa3f3.f254064k2.m162452xe131cdea(c18557xc00aa3f3.f254056c2.f254194g);
        }
        if (c18557xc00aa3f3.f254065l2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData my: %d", java.lang.Integer.valueOf(c18557xc00aa3f3.f254056c2.f254195h.size()));
            c18557xc00aa3f3.f254065l2.m162452xe131cdea(c18557xc00aa3f3.f254056c2.f254195h);
        }
        if (c18557xc00aa3f3.f254066m2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData common used: %d", java.lang.Integer.valueOf(c18557xc00aa3f3.f254056c2.f254196i.size()));
            int m162447x8c6e4d5c = c18557xc00aa3f3.f254066m2.m162447x8c6e4d5c();
            c18557xc00aa3f3.f254066m2.m162452xe131cdea(c18557xc00aa3f3.f254056c2.f254196i);
            if (c18557xc00aa3f3.H2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "do fadeInOut Item Animation");
                c18557xc00aa3f3.f254066m2.s(m162447x8c6e4d5c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "checkWeAppSectionData force update commonused weapp isHeaderOpen:%b", java.lang.Boolean.valueOf(c18557xc00aa3f3.f254075v2));
            }
        }
    }
}
