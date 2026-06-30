package ml5;

/* loaded from: classes10.dex */
public final class z implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f409994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa f409995e;

    public z(android.animation.Animator.AnimatorListener animatorListener, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa) {
        this.f409994d = animatorListener;
        this.f409995e = c22678xac4e51fa;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f409994d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f409994d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
        ml5.h onChangeListener = this.f409995e.getOnChangeListener();
        ml5.i iVar = onChangeListener instanceof ml5.i ? (ml5.i) onChangeListener : null;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f409994d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f409994d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation);
        }
    }
}
