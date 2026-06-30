package db5;

/* loaded from: classes8.dex */
public final class l9 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da f309968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f309969e;

    public l9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da c21533x4baf88da, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f309968d = c21533x4baf88da;
        this.f309969e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21533x4baf88da c21533x4baf88da = this.f309968d;
        c21533x4baf88da.f279223g.setVisibility(8);
        android.widget.LinearLayout linearLayout = c21533x4baf88da.f279222f;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bce);
        }
        this.f309969e.setListener(null);
    }
}
