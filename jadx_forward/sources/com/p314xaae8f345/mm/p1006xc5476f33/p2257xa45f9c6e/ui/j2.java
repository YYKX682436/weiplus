package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 f254164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f254165e;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var, boolean z17) {
        this.f254164d = o2Var;
        this.f254165e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "do reload data");
        if (!this.f254164d.f254206s) {
            this.f254164d.f254206s = true;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_comm_use_new, 0) == 1) {
            this.f254164d.d(false, 7);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "not support load common used data");
        }
        this.f254164d.d(false, 1);
        this.f254164d.d(false, 2);
        lh4.n nVar = (lh4.n) this.f254164d.f254201n.get(4);
        if (nVar != null) {
            this.f254164d.c(nVar);
        }
        if (!this.f254165e || (a2Var = this.f254164d.f254188a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onDataUpdated");
        c18557xc00aa3f3.f254077x2 = true;
        c18557xc00aa3f3.post(c18557xc00aa3f3.X2);
        c18557xc00aa3f3.m1();
    }
}
