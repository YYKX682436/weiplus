package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class qe implements kv.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 f155678e;

    public qe(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648, java.lang.String str) {
        this.f155678e = activityC11459xde004648;
        this.f155677d = str;
    }

    @Override // kv.i0
    public void X(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648 = this.f155678e;
        activityC11459xde004648.f155093s = str;
        activityC11459xde004648.f155094t = str2;
        activityC11459xde004648.findViewById(com.p314xaae8f345.mm.R.id.mnr).post(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pe(this));
    }

    @Override // kv.i0
    public void d(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.vfs.w6.h(lp0.b.j() + "temp.avatar");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648 = this.f155678e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC11459xde004648.f155088n;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        activityC11459xde004648.f155088n.dismiss();
    }
}
