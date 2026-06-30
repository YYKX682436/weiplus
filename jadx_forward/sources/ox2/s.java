package ox2;

/* loaded from: classes2.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431241f;

    public s(yz5.a aVar, yz5.a aVar2, android.view.View view) {
        this.f431239d = aVar;
        this.f431240e = aVar2;
        this.f431241f = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f431240e.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f431239d.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.animation.ValueAnimator valueAnimator = animator instanceof android.animation.ValueAnimator ? (android.animation.ValueAnimator) animator : null;
        if (valueAnimator != null) {
            valueAnimator.setFloatValues(this.f431241f.getScaleX(), 0.0f);
        }
    }
}
