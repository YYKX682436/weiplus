package ub3;

/* loaded from: classes15.dex */
public class f0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507635e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e, int i17) {
        this.f507635e = c16332x7cb9791e;
        this.f507634d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i17 = this.f507634d;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507635e;
            if (i17 >= c16332x7cb9791e.f226660v - 1) {
                return;
            }
            android.view.View view = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17);
            ub3.v0 v0Var = c16332x7cb9791e.f226646e;
            int i18 = v0Var.f507674a;
            if (i18 == 1) {
                v0Var.getClass();
                int i19 = i17 + 1;
                float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                c16332x7cb9791e.f226646e.getClass();
                view.setScaleX((1.0f - (i19 * 0.01f)) + (floatValue * 0.01f));
                int i27 = c16332x7cb9791e.f226646e.f507675b;
                if (i27 == 2) {
                    view.setTranslationY(c16332x7cb9791e.h(i19) - (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * c16332x7cb9791e.f226662x));
                } else if (i27 == 1) {
                    view.setTranslationY(c16332x7cb9791e.h(i19) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * c16332x7cb9791e.f226662x));
                }
            } else if (i18 == 2) {
                float f17 = v0Var.f507677d;
                int i28 = i17 + 1;
                view.setScaleY((1.0f - (f17 * i28)) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * c16332x7cb9791e.f226646e.f507677d));
                int i29 = c16332x7cb9791e.f226646e.f507675b;
                if (i29 == 3) {
                    view.setTranslationX(c16332x7cb9791e.g(i28) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * c16332x7cb9791e.f226661w));
                } else if (i29 == 4) {
                    view.setTranslationX(c16332x7cb9791e.g(i28) - (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * c16332x7cb9791e.f226661w));
                }
            }
            i17++;
        }
    }
}
