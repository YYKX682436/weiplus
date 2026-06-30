package al5;

/* loaded from: classes3.dex */
public final class o0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f87503d;

    public o0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c) {
        this.f87503d = c22613xe7040d9c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f87503d;
        c22613xe7040d9c.e(c22613xe7040d9c.getTranslationY(), true, false);
        yz5.a onShownListener = c22613xe7040d9c.getOnShownListener();
        if (onShownListener != null) {
        }
    }
}
