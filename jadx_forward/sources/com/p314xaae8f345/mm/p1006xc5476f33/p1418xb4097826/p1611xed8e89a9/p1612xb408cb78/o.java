package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 f204914d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6) {
        this.f204914d = c14879x7c6ab7a6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 foldRecyclerView = this.f204914d.getFoldRecyclerView();
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
