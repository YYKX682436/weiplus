package jq4;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.y f382718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382719e;

    public q(jq4.y yVar, android.view.View view) {
        this.f382718d = yVar;
        this.f382719e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f382719e;
        int measuredHeight = view.getMeasuredHeight();
        jq4.y yVar = this.f382718d;
        yVar.f382777m = measuredHeight;
        android.animation.Animator animator = yVar.f382774j;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-yVar.f382777m, 0);
        android.view.View view2 = yVar.f382769e;
        if (view2 != null) {
            ofInt.addUpdateListener(new jq4.o(view2, yVar));
        }
        ofInt.addListener(new jq4.p(view, yVar));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        if (yVar.f382769e != null) {
            ofFloat.addUpdateListener(new jq4.n(yVar));
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofInt).with(ofFloat);
        animatorSet.setDuration(300L);
        animatorSet.start();
        yVar.f382774j = animatorSet;
    }
}
