package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f254177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 f254178e;

    public l2(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var) {
        this.f254177d = linkedList;
        this.f254178e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "async remove timeout taskbar item");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c : this.f254177d) {
            this.f254178e.h(c16601x7ed0e40c, 0, 2, 5);
            ((gh4.e0) i95.n0.c(gh4.e0.class)).Ni(c16601x7ed0e40c);
            ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(c16601x7ed0e40c.f66791xc8a07680, false, 5);
        }
    }
}
