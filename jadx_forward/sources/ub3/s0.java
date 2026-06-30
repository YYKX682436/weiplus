package ub3;

/* loaded from: classes15.dex */
public class s0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507670d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507670d = c16332x7cb9791e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507670d;
        if (floatValue == 0.0f) {
            c16332x7cb9791e.f226663y.clear();
            c16332x7cb9791e.f226664z.clear();
            while (i17 < c16332x7cb9791e.f226660v) {
                c16332x7cb9791e.f226663y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationX()));
                c16332x7cb9791e.f226664z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationY()));
                i17++;
            }
            return;
        }
        while (i17 < c16332x7cb9791e.f226660v) {
            android.view.View view = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17);
            if (i17 < c16332x7cb9791e.f226663y.size()) {
                ub3.v0 v0Var = c16332x7cb9791e.f226646e;
                int i18 = v0Var.f507674a;
                if (i18 == 1) {
                    v0Var.getClass();
                    float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    c16332x7cb9791e.f226646e.getClass();
                    view.setScaleX((1.0f - ((i17 + 1) * 0.01f)) + (floatValue2 * 0.01f));
                    view.setTranslationY((c16332x7cb9791e.h(i17) * floatValue) + ((1.0f - floatValue) * ((java.lang.Float) c16332x7cb9791e.f226664z.get(i17)).floatValue()));
                } else if (i18 == 2) {
                    view.setScaleY((1.0f - (v0Var.f507677d * (i17 + 1))) + (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * c16332x7cb9791e.f226646e.f507677d));
                    view.setTranslationX((c16332x7cb9791e.g(i17) * floatValue) + ((1.0f - floatValue) * ((java.lang.Float) c16332x7cb9791e.f226663y.get(i17)).floatValue()));
                }
            }
            i17++;
        }
    }
}
