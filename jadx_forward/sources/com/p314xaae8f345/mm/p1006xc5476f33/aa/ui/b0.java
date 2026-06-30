package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class b0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c0 f154108d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c0 c0Var) {
        this.f154108d = c0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c0 c0Var = this.f154108d;
        if (itemId == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "go to launch list: %d", java.lang.Integer.valueOf(c0Var.f154120d.f153985s));
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a = c0Var.f154120d;
            if (activityC11342x8f12a65a.f153985s == 1) {
                return;
            }
            activityC11342x8f12a65a.f153985s = 1;
            activityC11342x8f12a65a.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571287ar);
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w wVar = activityC11342x8f12a65a.f153978i;
            wVar.f154396f = activityC11342x8f12a65a.f153985s;
            ((java.util.ArrayList) wVar.f154394d).clear();
            activityC11342x8f12a65a.f153978i.notifyDataSetChanged();
            activityC11342x8f12a65a.f7(true, activityC11342x8f12a65a.f153985s);
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "go to pay query list: %d", java.lang.Integer.valueOf(c0Var.f154120d.f153985s));
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a2 = c0Var.f154120d;
        if (activityC11342x8f12a65a2.f153985s == 2) {
            return;
        }
        activityC11342x8f12a65a2.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571290au);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w wVar2 = activityC11342x8f12a65a2.f153978i;
        wVar2.f154396f = activityC11342x8f12a65a2.f153985s;
        ((java.util.ArrayList) wVar2.f154394d).clear();
        activityC11342x8f12a65a2.f153978i.notifyDataSetChanged();
        activityC11342x8f12a65a2.f153985s = 2;
        activityC11342x8f12a65a2.f7(true, 2);
    }
}
