package as3;

/* loaded from: classes5.dex */
public final class h0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac f95044d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac) {
        this.f95044d = c16917xf24b9dac;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 foldRecyclerView = this.f95044d.getFoldRecyclerView();
        if (foldRecyclerView != null) {
            java.lang.Object animatedValue = anim.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) animatedValue).intValue();
            android.view.ViewGroup.LayoutParams layoutParams = foldRecyclerView.getLayoutParams();
            layoutParams.height = intValue;
            foldRecyclerView.setLayoutParams(layoutParams);
        }
    }
}
