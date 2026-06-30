package ub3;

/* loaded from: classes15.dex */
public class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507665d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507665d = c16332x7cb9791e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507665d;
        if (floatValue == 0.0f) {
            c16332x7cb9791e.f226663y.clear();
            c16332x7cb9791e.f226664z.clear();
            for (int i17 = 0; i17 < c16332x7cb9791e.f226660v; i17++) {
                c16332x7cb9791e.f226663y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationX()));
                c16332x7cb9791e.f226664z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationY()));
            }
            return;
        }
        float f17 = 1.0f - floatValue;
        ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(0)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(0)).floatValue() * f17) + (c16332x7cb9791e.g(0) * floatValue));
        ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(0)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(0)).floatValue() * f17) + (c16332x7cb9791e.h(0) * floatValue));
        for (int i18 = 1; i18 < c16332x7cb9791e.f226660v; i18++) {
            ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(i18)).floatValue() * f17) + (c16332x7cb9791e.g(i18) * floatValue));
            ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i18)).floatValue() * f17) + (c16332x7cb9791e.h(i18) * floatValue));
        }
    }
}
