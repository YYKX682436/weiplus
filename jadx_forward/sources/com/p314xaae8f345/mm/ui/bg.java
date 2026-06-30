package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class bg implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f279416a;

    public bg(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f279416a = c21427xe5bb8a3;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f279416a;
        c21427xe5bb8a3.f278558l = false;
        c21427xe5bb8a3.f278549c.setVisibility(8);
        gm0.j1.e().o();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(0);
        c21427xe5bb8a3.s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationEnd");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = this.f279416a;
        c21427xe5bb8a3.f278558l = true;
        gm0.j1.e().p();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(-8);
        c21427xe5bb8a3.o(true, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem pop out onAnimationStart");
    }
}
