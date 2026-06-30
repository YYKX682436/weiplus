package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174875d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var) {
        this.f174875d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var = this.f174875d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = q0Var.f174879d;
        if (nVar != null) {
            nVar.f();
            q0Var.f174879d = null;
        }
    }
}
