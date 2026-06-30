package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227407d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227407d = c16344xea85a40c;
    }

    @Override // java.lang.Runnable
    public void run() {
        in5.s0 s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227407d;
        if (!c16344xea85a40c.f227321w.h1(c16344xea85a40c.A1) || (s0Var = (in5.s0) c16344xea85a40c.f227321w.p0(c16344xea85a40c.A1)) == null) {
            return;
        }
        c16344xea85a40c.p(s0Var, c16344xea85a40c.A1, true);
        if (c16344xea85a40c.i()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7 j7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7) c16344xea85a40c.U.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j7.class);
            android.view.View view = s0Var.f3639x46306858;
            j7Var.getClass();
            android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.j0c) : null;
            if (findViewById != null) {
                findViewById.sendAccessibilityEvent(32768);
            }
            if (findViewById != null) {
                findViewById.announceForAccessibility(j7Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gjx));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = c16344xea85a40c.V;
        if (activityC16363x8a0a619d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o3) activityC16363x8a0a619d.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o3.class);
            android.view.View view2 = s0Var.f3639x46306858;
            o3Var.getClass();
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.j0c);
            findViewById2.sendAccessibilityEvent(32768);
            findViewById2.announceForAccessibility(o3Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gjx));
        }
    }
}
