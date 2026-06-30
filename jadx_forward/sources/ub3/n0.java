package ub3;

/* loaded from: classes15.dex */
public class n0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507657d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507657d = c16332x7cb9791e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507657d;
        if (floatValue == 0.0f) {
            c16332x7cb9791e.f226663y.clear();
            c16332x7cb9791e.f226664z.clear();
            for (int i17 = 0; i17 < c16332x7cb9791e.f226660v; i17++) {
                c16332x7cb9791e.f226663y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationX()));
                c16332x7cb9791e.f226664z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17)).getTranslationY()));
            }
            return;
        }
        android.view.View view = c16332x7cb9791e.f226656r;
        if (view != null) {
            view.setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(0)).floatValue() * (1.0f - floatValue)) - ((c16332x7cb9791e.f226656r.getHeight() * floatValue) / 7.0f));
        }
        for (int i18 = 1; i18 < c16332x7cb9791e.f226660v; i18++) {
            java.util.List list = c16332x7cb9791e.f226645d;
            if (list != null && ((java.util.ArrayList) list).get(i18) != null) {
                float f17 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(i18)).floatValue() * f17) + (c16332x7cb9791e.g(i18) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i18)).floatValue() * f17) + (c16332x7cb9791e.h(i18) * floatValue));
            }
        }
    }
}
