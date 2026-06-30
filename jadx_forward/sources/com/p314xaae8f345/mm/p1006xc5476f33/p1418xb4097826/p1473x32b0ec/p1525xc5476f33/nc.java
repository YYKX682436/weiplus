package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public final int f195141a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f195142b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mc.f195018d);

    public nc(int i17) {
        this.f195141a = i17;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nc ncVar, android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc jcVar) {
        ncVar.getClass();
        view.setScaleX(jcVar.f194612a);
        view.setScaleY(jcVar.f194613b);
        android.graphics.drawable.Drawable drawable = jcVar.f194614c;
        if (drawable == null) {
            ncVar.d(view2, jcVar.f194615d);
        } else {
            if (view2 == null) {
                return;
            }
            view2.setBackground(drawable);
        }
    }

    public final android.animation.AnimatorSet b(android.view.View view, android.view.View view2, float f17, float f18, int i17, int i18, long j17, android.view.animation.Interpolator interpolator) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17, f18);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17, f18);
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(i17, i18);
        ofArgb.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kc(this, view2));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofArgb);
        animatorSet.setDuration(j17);
        animatorSet.setInterpolator(interpolator);
        return animatorSet;
    }

    public final android.animation.AnimatorSet c(android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jc jcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ic icVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hc hcVar) {
        android.animation.AnimatorSet b17 = b(view, view2, icVar.f194487a, icVar.f194488b, jcVar.f194615d, hcVar.f194328a, icVar.f194490d, new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet b18 = b(view, view2, icVar.f194488b, icVar.f194489c, hcVar.f194328a, hcVar.f194329b, icVar.f194490d, new android.view.animation.AccelerateInterpolator());
        android.animation.AnimatorSet b19 = b(view, view2, icVar.f194489c, icVar.f194488b, hcVar.f194329b, hcVar.f194328a, icVar.f194490d, new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet b27 = b(view, view2, icVar.f194488b, icVar.f194489c, hcVar.f194328a, hcVar.f194329b, icVar.f194490d, new android.view.animation.AccelerateInterpolator());
        android.animation.AnimatorSet b28 = b(view, view2, icVar.f194489c, icVar.f194488b, hcVar.f194329b, hcVar.f194328a, icVar.f194490d, new android.view.animation.DecelerateInterpolator());
        float f17 = icVar.f194488b;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17, jcVar.f194612a);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17, jcVar.f194613b);
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(hcVar.f194328a, jcVar.f194615d);
        ofArgb.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kc(this, view2));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofArgb);
        animatorSet.setDuration(icVar.f194490d);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playSequentially(b17, b18, b19, b27, b28, animatorSet);
        return animatorSet2;
    }

    public final void d(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i17);
        jz5.g gVar = this.f195142b;
        gradientDrawable.setSize(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        view.setBackground(gradientDrawable);
    }
}
