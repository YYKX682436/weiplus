package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes11.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.f0 f254134d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.f0 f0Var) {
        this.f254134d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "doOpenHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.f0 f0Var = this.f254134d;
        f0Var.f254143f.f254296e.smoothScrollBy(f0Var.f254143f.f254297f.getTop(), f0Var.f254142e);
        f0Var.f254143f.o(4);
        f0Var.f254143f.j(true, false, 0, 0);
    }
}
