package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16814x951f14f1 f234820d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16814x951f14f1 activityC16814x951f14f1) {
        this.f234820d = activityC16814x951f14f1;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16814x951f14f1 activityC16814x951f14f1 = this.f234820d;
        java.lang.String obj = activityC16814x951f14f1.f234738g.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            db5.t7.m123882x26a183b(activityC16814x951f14f1, com.p314xaae8f345.mm.R.C30867xcad56011.grs, 0).show();
        } else {
            wq3.j jVar = activityC16814x951f14f1.f234737f;
            jVar.getClass();
            r45.ek5 ek5Var = new r45.ek5();
            jVar.f530090j = ek5Var;
            ek5Var.f455115d = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) ? 1 : 0;
            jVar.f530090j.f455116e = obj;
            activityC16814x951f14f1.finish();
        }
        return true;
    }
}
