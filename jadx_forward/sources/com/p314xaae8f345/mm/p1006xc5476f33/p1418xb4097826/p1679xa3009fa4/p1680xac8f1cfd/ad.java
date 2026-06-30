package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ad extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215303d;

    public ad(android.view.View view) {
        this.f215303d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd: check bg status, width = ");
        android.view.View view = this.f215303d;
        sb6.append(view.getWidth());
        sb6.append(", color = ");
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        sb6.append(colorDrawable != null ? java.lang.Integer.toHexString(colorDrawable.getColor()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", sb6.toString());
    }
}
