package qs3;

/* loaded from: classes15.dex */
public final class j0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16952x9dd7e703 f447888a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16952x9dd7e703 c16952x9dd7e703) {
        this.f447888a = c16952x9dd7e703;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16952x9dd7e703 c16952x9dd7e703 = this.f447888a;
        if (c16952x9dd7e703.f236563r) {
            return;
        }
        c16952x9dd7e703.f236552d.mo50305x3d8a09a2(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
