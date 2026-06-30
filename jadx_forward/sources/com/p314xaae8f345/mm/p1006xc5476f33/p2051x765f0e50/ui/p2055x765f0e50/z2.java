package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class z2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17390xeb03cc89 f243338d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17390xeb03cc89 activityC17390xeb03cc89) {
        this.f243338d = activityC17390xeb03cc89;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17390xeb03cc89 activityC17390xeb03cc89 = this.f243338d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef.f243039e.a(activityC17390xeb03cc89, "select_view_dark_mode", activityC17390xeb03cc89.f241737s ? "dark_mode" : "normal_mode", 4);
        j75.f m67437x4bd5310 = activityC17390xeb03cc89.m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.B3(new t14.t());
        }
        boolean z17 = activityC17390xeb03cc89.f241738t;
        if ((!z17 || activityC17390xeb03cc89.f241730i == z17) && (z17 || activityC17390xeb03cc89.f241729h == activityC17390xeb03cc89.f241737s)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_follow_system", activityC17390xeb03cc89.f241738t);
            com.p314xaae8f345.mm.ui.bk.x0();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode", activityC17390xeb03cc89.f241737s);
            if (activityC17390xeb03cc89.f241738t) {
                com.p314xaae8f345.mm.ui.ee.e(2, activityC17390xeb03cc89.getTaskId());
            } else {
                com.p314xaae8f345.mm.ui.ee.e(activityC17390xeb03cc89.f241737s ? 1 : 0, activityC17390xeb03cc89.getTaskId());
            }
            activityC17390xeb03cc89.Y6();
            activityC17390xeb03cc89.finish();
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC17390xeb03cc89.mo55332x76847179());
            u1Var.g(activityC17390xeb03cc89.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ij6));
            u1Var.a(true);
            u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a3(activityC17390xeb03cc89));
            u1Var.q(false);
        }
        return true;
    }
}
