package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f289494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x6 f289495e;

    public p6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x6 x6Var, boolean z17) {
        this.f289495e = x6Var;
        this.f289494d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54;
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 m78446x1cde66a9;
        com.p314xaae8f345.mm.ui.C21410x67d80e90 m78421xefd35ffa;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x6 x6Var = this.f289495e;
        if ((x6Var.f289766d.mo7438x76847179() instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) && (activityC21387x976b8e54 = (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) x6Var.f289766d.mo7438x76847179()) != null && (m78446x1cde66a9 = activityC21387x976b8e54.m78446x1cde66a9()) != null && (m78421xefd35ffa = m78446x1cde66a9.m78421xefd35ffa()) != null) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288826d.getClass();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288837r.set(m78421xefd35ffa.g() == x6Var.f289766d);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606 c22363xe804606 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288826d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = x6Var.f289766d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = c22376x88ed722d.f288905o;
        yf5.j0 j0Var = c22376x88ed722d.f288912v;
        boolean z18 = this.f289494d;
        c22363xe804606.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvExposeHelper", "isAppStateChangeAffectingVisibility isAppForegroundForLastCheckOfficialAccount=" + com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288840u + " isAppForeground=" + com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288839t);
        boolean z19 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288840u;
        boolean z27 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288839t;
        if (z19 != z27) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288840u = z27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvExposeHelper", "isAppStateChangeAffectingVisibility set isAppForegroundForLastCheckOfficialAccount=" + com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288840u);
            z17 = true;
        } else {
            z17 = false;
        }
        c22363xe804606.m(viewOnTouchListenerC22366xcd5c2226, j0Var, z18, false, z17);
    }
}
