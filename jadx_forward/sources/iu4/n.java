package iu4;

/* loaded from: classes9.dex */
public class n implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu4.c0 f376571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 f376572b;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6 viewOnClickListenerC19201x9aa113d6, iu4.c0 c0Var) {
        this.f376572b = viewOnClickListenerC19201x9aa113d6;
        this.f376571a = c0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f376572b.f262847i.setAnimationListener(null);
        iu4.c0 c0Var = this.f376571a;
        if (c0Var != null) {
            c0Var.mo139888xc3989e01();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
