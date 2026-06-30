package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class yf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ag f294121a;

    public yf(com.p314xaae8f345.mm.ui.ag agVar) {
        this.f294121a = agVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.ag agVar = this.f294121a;
        com.p314xaae8f345.mm.ui.n8 n8Var = agVar.f278667a.f278548b;
        if (n8Var != null) {
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h17 = ((com.p314xaae8f345.mm.ui.C21374x812c2fd3) n8Var).f278294t.h(0);
            if (h17 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22377x93874272 c22377x93874272 = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) h17).G;
                if (c22377x93874272 != null) {
                    c22377x93874272.a();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainUI", "Unexpected. Call resumeRequestLayoutForAnimation() failed");
                }
            }
            com.p314xaae8f345.mm.ui.cf.f279625d.b();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "Unexpecte situation, notifyChattingUIAnimationEnd() failed.");
        }
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3.c(agVar.f278667a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.ag agVar = this.f294121a;
        com.p314xaae8f345.mm.ui.C21427xe5bb8a3.b(agVar.f278667a);
        agVar.f278667a.o(false, 0);
    }
}
