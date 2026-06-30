package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 f174889d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var) {
        this.f174889d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = this.f174889d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 c12930x168b4c78 = u0Var.f174893c;
        if (c12930x168b4c78 != null) {
            try {
                if (c12930x168b4c78.getParent() != null) {
                    ((android.view.ViewGroup) u0Var.f174893c.getParent()).removeView(u0Var.f174893c);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatIndicatorController", e17, "detachFloatIndicatorView exception:%s", e17);
            }
        }
    }
}
