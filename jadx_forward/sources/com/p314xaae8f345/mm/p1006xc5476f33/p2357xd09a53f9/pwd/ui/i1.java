package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e f260545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f260546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j1 f260547f;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j1 j1Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e, android.app.Dialog dialog) {
        this.f260547f = j1Var;
        this.f260545d = c5274xb33ae62e;
        this.f260546e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e = this.f260545d;
        if (c5274xb33ae62e.f135599h != null) {
            android.app.Dialog dialog = this.f260546e;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i17 = c5274xb33ae62e.f135599h.f88068a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j1 j1Var = this.f260547f;
            if (i17 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70.V6(j1Var.f260551d, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 activityC19052xb1f1fd70 = j1Var.f260551d;
                db5.e1.F(activityC19052xb1f1fd70, activityC19052xb1f1fd70.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_h), "", true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70 activityC19052xb1f1fd702 = j1Var.f260551d;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19052xb1f1fd70.G;
                activityC19052xb1f1fd702.c7(false);
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new ss4.e0(null, 19));
            }
        }
    }
}
