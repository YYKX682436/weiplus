package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public final class nf extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f290950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21425xb877b9b3 f290951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f290952f;

    public nf(android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.ui.C21425xb877b9b3 c21425xb877b9b3, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f290950d = linearLayout;
        this.f290951e = c21425xb877b9b3;
        this.f290952f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f290950d.setVisibility(8);
        android.view.View view = this.f290951e.f278529f;
        if (view != null) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bce);
        }
        this.f290952f.setListener(null);
    }
}
