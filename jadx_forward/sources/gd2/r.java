package gd2;

/* loaded from: classes3.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f352089d;

    public r(gd2.x xVar, gd2.x xVar2) {
        this.f352089d = xVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.widget.ImageView imageView = this.f352089d.f352106j;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.widget.ImageView imageView = this.f352089d.f352106j;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
    }
}
