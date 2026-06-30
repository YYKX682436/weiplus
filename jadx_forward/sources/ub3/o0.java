package ub3;

/* loaded from: classes15.dex */
public class o0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507659d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507659d = c16332x7cb9791e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507659d;
        if (floatValue != 0.0f) {
            while (i17 < c16332x7cb9791e.f226660v) {
                float f17 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(i17)).floatValue() * f17) + (c16332x7cb9791e.g(i17) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i17)).floatValue() * f17) + (c16332x7cb9791e.h(i17) * floatValue));
                i17++;
            }
            return;
        }
        c16332x7cb9791e.f226663y.clear();
        c16332x7cb9791e.f226664z.clear();
        while (i17 < c16332x7cb9791e.f226660v) {
            c16332x7cb9791e.f226663y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationX()));
            c16332x7cb9791e.f226664z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationY()));
            i17++;
        }
    }
}
