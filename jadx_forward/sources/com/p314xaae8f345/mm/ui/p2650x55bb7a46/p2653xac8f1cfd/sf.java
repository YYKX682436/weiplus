package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class sf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.tf f281471a;

    public sf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.tf tfVar) {
        this.f281471a = tfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.tf tfVar = this.f281471a;
        if (tfVar.f281528d) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(tfVar.f281529e.a(), tfVar.f281529e.f231013d);
        if (Li.s2(c01.z1.r())) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = tfVar.f281530f;
            rfVar.f281363f.setText(rfVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7l));
        } else if (Li.r2()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar2 = tfVar.f281530f;
            rfVar2.f281363f.setText(rfVar2.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7k));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
