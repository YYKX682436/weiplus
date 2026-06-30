package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ef implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f f213537d;

    public ef(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f) {
        this.f213537d = c15326x96ed1d6f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f = this.f213537d;
        c15326x96ed1d6f.getClass();
        java.lang.Object animatedValue = animator.getAnimatedValue("leftAvatarTranslationX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Object animatedValue2 = animator.getAnimatedValue("rightAvatarTranslationX");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        java.lang.Object animatedValue3 = animator.getAnimatedValue("avatarTranslationY");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
        float floatValue3 = ((java.lang.Float) animatedValue3).floatValue();
        java.lang.Object animatedValue4 = animator.getAnimatedValue("leftAvatarRotation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
        float floatValue4 = ((java.lang.Float) animatedValue4).floatValue();
        java.lang.Object animatedValue5 = animator.getAnimatedValue("rightAvatarRotation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
        float floatValue5 = ((java.lang.Float) animatedValue5).floatValue();
        java.lang.Object animatedValue6 = animator.getAnimatedValue("avatarAlpha");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue6, "null cannot be cast to non-null type kotlin.Float");
        float floatValue6 = ((java.lang.Float) animatedValue6).floatValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMileStoneView", "avatarAnimatorValue: leftTranslationX: " + floatValue + ", rightTranslationX: " + floatValue2 + ", translationY: " + floatValue3 + ", leftRotation: " + floatValue4 + ", rightRotation: " + floatValue5);
        android.widget.ImageView imageView = c15326x96ed1d6f.mileStoneLeftAvatar;
        imageView.setTranslationX(floatValue);
        imageView.setTranslationY(floatValue3);
        imageView.setRotation(floatValue4);
        imageView.setAlpha(floatValue6);
        android.widget.ImageView imageView2 = c15326x96ed1d6f.mileStoneRightAvatar;
        imageView2.setTranslationX(floatValue2);
        imageView2.setTranslationY(floatValue3);
        imageView2.setRotation(floatValue5);
        imageView2.setAlpha(floatValue6);
    }
}
