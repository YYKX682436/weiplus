package d04;

/* loaded from: classes10.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f307026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f307027e;

    public r(android.animation.Animator.AnimatorListener animatorListener, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb) {
        this.f307026d = animatorListener;
        this.f307027e = c17326x8613bffb;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f307027e.Q.cancel();
        android.animation.Animator.AnimatorListener animatorListener = this.f307026d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeMaskView", "onViewDestroy onAnimationEnd");
        this.f307027e.Q.cancel();
        android.animation.Animator.AnimatorListener animatorListener = this.f307026d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f307026d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.f307026d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animation);
        }
    }
}
