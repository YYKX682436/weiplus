package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class uf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vf f281600a;

    public uf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vf vfVar) {
        this.f281600a = vfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vf vfVar = this.f281600a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = vfVar.f281661e;
        rfVar.B = false;
        if (rfVar.f281363f == null || !(!rfVar.f281380z.f334376c.isEmpty())) {
            return;
        }
        vfVar.f281661e.f281363f.setText(vfVar.f281660d);
    }
}
