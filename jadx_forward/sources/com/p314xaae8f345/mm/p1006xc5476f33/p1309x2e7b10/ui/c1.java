package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes12.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f f176496e;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f activityC13050xc93b9c8f, java.lang.String str) {
        this.f176496e = activityC13050xc93b9c8f;
        this.f176495d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f activityC13050xc93b9c8f = this.f176496e;
        if (activityC13050xc93b9c8f.f176341i.getVisibility() != 8) {
            activityC13050xc93b9c8f.f176341i.setVisibility(8);
        }
        activityC13050xc93b9c8f.f176337e = this.f176495d;
        activityC13050xc93b9c8f.getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(activityC13050xc93b9c8f);
        activityC13050xc93b9c8f.f176343n = s6Var;
        s6Var.f292255f = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.w0(activityC13050xc93b9c8f);
        s6Var.f292256g = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x0(activityC13050xc93b9c8f);
        activityC13050xc93b9c8f.f176351v.notifyDataSetChanged();
    }
}
