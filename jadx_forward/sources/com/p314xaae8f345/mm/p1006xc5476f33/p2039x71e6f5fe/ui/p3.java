package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public final class p3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 f241144d;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65) {
        this.f241144d = activityC17308x95e1b65;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f241144d.f240912i;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f241144d.f240912i;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
    }
}
