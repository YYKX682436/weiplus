package ry4;

/* loaded from: classes.dex */
public final class g0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f483165d;

    public g0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f483165d = c22699x3dcdb352;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f483165d;
        c22699x3dcdb352.setVisibility(8);
        c22699x3dcdb352.setTranslationX(0.0f);
    }
}
