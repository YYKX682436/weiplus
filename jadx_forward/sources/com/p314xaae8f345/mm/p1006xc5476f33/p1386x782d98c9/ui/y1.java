package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e f181259d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e activityC13465x3d3dbc1e) {
        this.f181259d = activityC13465x3d3dbc1e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13465x3d3dbc1e activityC13465x3d3dbc1e = this.f181259d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC13465x3d3dbc1e.f180789e;
        if (u3Var != null && u3Var.isShowing()) {
            activityC13465x3d3dbc1e.f180789e.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC13465x3d3dbc1e.f180788d;
        if (u3Var2 == null || !u3Var2.isShowing()) {
            return;
        }
        activityC13465x3d3dbc1e.f180788d.dismiss();
    }
}
