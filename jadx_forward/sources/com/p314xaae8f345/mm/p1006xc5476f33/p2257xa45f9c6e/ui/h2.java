package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 f254157d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var) {
        this.f254157d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = this.f254157d;
        synchronized (o2Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "removeExceedData %d", java.lang.Integer.valueOf(o2Var.f254202o.size()));
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c : o2Var.f254202o) {
                ((gh4.e0) i95.n0.c(gh4.e0.class)).Ni(c16601x7ed0e40c);
                ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(c16601x7ed0e40c.f66791xc8a07680, false, 4);
                o2Var.h(c16601x7ed0e40c, 0, 2, 4);
            }
            o2Var.f254202o.clear();
        }
    }
}
