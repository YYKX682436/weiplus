package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f174833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174834e;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var, int i17) {
        this.f174834e = q0Var;
        this.f174833d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174834e.f174879d;
        if (nVar != null) {
            int i17 = this.f174833d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            if (c12929x567537a0 == null || !nVar.f174858j) {
                return;
            }
            if (c12929x567537a0.f175072l2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "collapseFloatBall isDragging and ignore");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "collapseFloatBall collapseState: %s, collapseReason: %d", java.lang.Integer.valueOf(c12929x567537a0.T1), java.lang.Integer.valueOf(i17));
            if (i17 == 1 || i17 == 2) {
                qp1.i.a();
            }
            if (!c12929x567537a0.V1 || c12929x567537a0.W()) {
                return;
            }
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) c12929x567537a0.getLayoutParams();
            boolean z17 = c12929x567537a0.f175096x1;
            int i18 = layoutParams.x;
            c12929x567537a0.t0(z17, true, i18, layoutParams.y, c12929x567537a0.y(c12929x567537a0.Z(i18), true), layoutParams.y, false, i17, -1);
        }
    }
}
