package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z f254147e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar, int i17) {
        this.f254147e = zVar;
        this.f254146d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254147e;
        int bottom = zVar.f254297f.getBottom() - zVar.f254302m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "closeHeader distance: %d, bottom: %d", java.lang.Integer.valueOf(bottom), java.lang.Integer.valueOf(zVar.f254297f.getBottom()));
        int i17 = zVar.f254294J ? 10 : 600;
        zVar.f254296e.smoothScrollBy(bottom, i17);
        zVar.F = !zVar.f254294J;
        zVar.f254294J = false;
        int i18 = zVar.I;
        if (i18 != 0) {
            zVar.I = 0;
        } else {
            i18 = this.f254146d;
        }
        zVar.j(false, false, i18, i17);
    }
}
