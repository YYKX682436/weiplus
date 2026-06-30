package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class gf extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f185013d;

    public gf(android.widget.ImageView imageView) {
        this.f185013d = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f185013d;
        imageView.setVisibility(8);
        imageView.setAlpha(1.0f);
        imageView.setTag(java.lang.Boolean.FALSE);
    }
}
