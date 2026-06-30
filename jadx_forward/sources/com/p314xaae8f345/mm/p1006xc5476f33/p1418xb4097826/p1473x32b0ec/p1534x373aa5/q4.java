package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class q4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 f198133d;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77) {
        this.f198133d = c14313x19517c77;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = this.f198133d;
        int i17 = c14313x19517c77.f197397r;
        c14313x19517c77.getClass();
        if (i17 == 0) {
            c14313x19517c77.setTranslationX(c14313x19517c77.f197392m);
            android.graphics.drawable.Drawable drawable = c14313x19517c77.B;
        } else {
            c14313x19517c77.setTranslationX(c14313x19517c77.f197391i);
            android.graphics.drawable.Drawable drawable2 = c14313x19517c77.B;
        }
        yz5.a onAnimCallback = c14313x19517c77.getOnAnimCallback();
        if (onAnimCallback != null) {
            onAnimCallback.mo152xb9724478();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = this.f198133d;
        int i17 = c14313x19517c77.f197397r;
        c14313x19517c77.getClass();
        c14313x19517c77.setBackground(i17 == 0 ? c14313x19517c77.B : c14313x19517c77.A);
        yz5.a onAnimCallback = c14313x19517c77.getOnAnimCallback();
        if (onAnimCallback != null) {
            onAnimCallback.mo152xb9724478();
        }
    }
}
