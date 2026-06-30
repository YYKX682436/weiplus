package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class je implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f210929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f210930e;

    public je(ym5.n6 n6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949) {
        this.f210929d = n6Var;
        this.f210930e = activityC15059x3e98c949;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.n6 n6Var = this.f210929d;
        if (n6Var.mo177319xb073c692().getVisibility() == 0) {
            if (n6Var.mo177319xb073c692().getAnimation() == null || (n6Var.mo177319xb073c692().getAnimation().hasStarted() && n6Var.mo177319xb073c692().getAnimation().hasEnded())) {
                n6Var.mo177319xb073c692().requestFocus();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78475x7b383410(this.f210930e);
            }
        }
    }
}
