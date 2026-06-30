package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176887d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf) {
        this.f176887d = activityC13074xfcf8fabf;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176887d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13074xfcf8fabf.f176802i, "click item: %s", java.lang.Integer.valueOf(itemId));
        if (itemId != 1) {
            activityC13074xfcf8fabf.L = activityC13074xfcf8fabf.K;
            activityC13074xfcf8fabf.K = itemId;
            activityC13074xfcf8fabf.f176801J = java.lang.String.valueOf(menuItem.getTitle());
            activityC13074xfcf8fabf.c7();
            activityC13074xfcf8fabf.Z6(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 1, 6);
            return;
        }
        if (!activityC13074xfcf8fabf.f176747f) {
            db5.e1.C(activityC13074xfcf8fabf.mo55332x76847179(), activityC13074xfcf8fabf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.at7), activityC13074xfcf8fabf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activityC13074xfcf8fabf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC13074xfcf8fabf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.m1(activityC13074xfcf8fabf), null);
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f308708z, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.n1(activityC13074xfcf8fabf, menuItem))) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.Y6(activityC13074xfcf8fabf, menuItem);
    }
}
