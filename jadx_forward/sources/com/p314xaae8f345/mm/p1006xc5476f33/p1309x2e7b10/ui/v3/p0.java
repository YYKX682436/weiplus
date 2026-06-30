package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176889d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8) {
        this.f176889d = activityC13072x745567c8;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176889d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "click item: %s", java.lang.Integer.valueOf(itemId));
        if (itemId != 1) {
            activityC13072x745567c8.F = activityC13072x745567c8.E;
            activityC13072x745567c8.E = itemId;
            activityC13072x745567c8.D = java.lang.String.valueOf(menuItem.getTitle());
            activityC13072x745567c8.Z6();
            activityC13072x745567c8.Y6(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 2, 6);
            return;
        }
        if (!activityC13072x745567c8.f176747f) {
            db5.e1.C(activityC13072x745567c8.mo55332x76847179(), activityC13072x745567c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.at7), activityC13072x745567c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activityC13072x745567c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC13072x745567c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.o0(activityC13072x745567c8), null);
            return;
        }
        activityC13072x745567c8.F = activityC13072x745567c8.E;
        activityC13072x745567c8.E = 1;
        activityC13072x745567c8.D = java.lang.String.valueOf(menuItem.getTitle());
        activityC13072x745567c8.Z6();
        activityC13072x745567c8.Y6(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 2, 5);
    }
}
