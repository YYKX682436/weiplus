package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class f6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239245d;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883) {
        this.f239245d = activityC17133x39d21883;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239245d;
        if (activityC17133x39d21883.J1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.k1 k1Var = activityC17133x39d21883.B1;
            if (k1Var == null) {
                activityC17133x39d21883.finish();
                return false;
            }
            r45.g04 g04Var = k1Var.f238409r.f456258i;
            if (g04Var == null) {
                activityC17133x39d21883.finish();
                return false;
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.e(g04Var)) {
                activityC17133x39d21883.finish();
                return false;
            }
            activityC17133x39d21883.f238872b2.c(activityC17133x39d21883.B1.f238409r.f456258i, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d6(this));
            activityC17133x39d21883.B1.f238409r.f456258i = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.n0 n0Var = activityC17133x39d21883.A1;
            if (n0Var == null) {
                activityC17133x39d21883.finish();
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n nVar = n0Var.f238445f;
            if (nVar == null) {
                activityC17133x39d21883.finish();
                return false;
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(nVar)) {
                activityC17133x39d21883.finish();
                return false;
            }
            activityC17133x39d21883.f238872b2.b(activityC17133x39d21883.A1.f238445f, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e6(this));
            activityC17133x39d21883.A1.f238445f = null;
        }
        return false;
    }
}
