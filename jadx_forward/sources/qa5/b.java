package qa5;

/* loaded from: classes5.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 f442650d;

    public b(com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3) {
        this.f442650d = c21455x9ab6ec3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f442650d.f278712q = false;
    }
}
