package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f242805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m6 f242806e;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m6 m6Var, int i17) {
        this.f242806e = m6Var;
        this.f242805d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m6 m6Var = this.f242806e;
        ((android.app.Dialog) m6Var.f242848d.getTag()).dismiss();
        gm0.j1.u().c().w(327686, java.lang.Integer.valueOf(this.f242805d));
        gm0.j1.u().c().i(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d activityC17404xbaa82c2d = m6Var.f242850f;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d.f241808o;
        activityC17404xbaa82c2d.d7();
    }
}
