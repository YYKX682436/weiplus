package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class zc implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ad f292482a;

    public zc(com.p314xaae8f345.mm.ui.p2740x696c9db.ad adVar) {
        this.f292482a = adVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ad adVar = this.f292482a;
        if (adVar.f291811d.f291769x != null) {
            h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = adVar.f291811d;
            ((g90.s) vVar).ij(activityC22543x95896a72, activityC22543x95896a72.f291769x, 2, 4, 4, new java.util.HashMap());
        }
        adVar.f291811d.finish();
        adVar.f291811d.overridePendingTransition(0, 0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
