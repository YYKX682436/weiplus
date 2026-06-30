package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224409d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var) {
        this.f224409d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.zr3 e17 = t83.f.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224409d;
        if (e17 == null) {
            m0Var.f224467f.setText("");
            m0Var.f224468g.setText("");
            m0Var.f224468g.setVisibility(8);
            return;
        }
        m0Var.f224467f.setText(e17.f473856m);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f473864u)) {
            m0Var.f224468g.setText("");
            m0Var.f224468g.setVisibility(8);
        } else {
            m0Var.f224468g.setText(e17.f473864u);
            m0Var.f224468g.setVisibility(0);
        }
    }
}
