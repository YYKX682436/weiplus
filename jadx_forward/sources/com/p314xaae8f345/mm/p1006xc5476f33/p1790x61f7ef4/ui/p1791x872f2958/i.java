package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 f224903d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1) {
        this.f224903d = activityC16174xab39c6e1;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1 = this.f224903d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U6 = activityC16174xab39c6e1.U6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
            java.util.List list = U6.A;
            if (list == null || list.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteScene] can not do scene. lable is null");
                return;
            }
            w11.h0 h0Var = new w11.h0(list, 1, 2, activityC16174xab39c6e1.f224850d);
            gm0.j1.n().f354821b.g(h0Var);
            activityC16174xab39c6e1.f224859p = db5.e1.Q(activityC16174xab39c6e1.mo55332x76847179(), activityC16174xab39c6e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16174xab39c6e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571404e2), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.j(h0Var));
            java.lang.String actionInfo = "" + list.size();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionInfo, "actionInfo");
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.k(4L, actionInfo));
        }
    }
}
