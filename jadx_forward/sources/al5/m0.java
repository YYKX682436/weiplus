package al5;

/* loaded from: classes3.dex */
public final class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f87485d;

    public m0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c) {
        this.f87485d = c22613xe7040d9c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        yz5.a onShownListener = this.f87485d.getOnShownListener();
        if (onShownListener != null) {
        }
    }
}
