package ub3;

/* loaded from: classes15.dex */
public class p0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f507662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507663f;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e, int i17, int i18) {
        this.f507663f = c16332x7cb9791e;
        this.f507661d = i17;
        this.f507662e = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float m66058xa8797fa8;
        float m66058xa8797fa82;
        int i17;
        float m66058xa8797fa83;
        float m66058xa8797fa84;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i18 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507663f;
        if (floatValue == 0.0f) {
            c16332x7cb9791e.f226663y.clear();
            c16332x7cb9791e.f226664z.clear();
            while (i18 < c16332x7cb9791e.f226660v) {
                c16332x7cb9791e.f226663y.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).getTranslationX()));
                c16332x7cb9791e.f226664z.add(java.lang.Float.valueOf(((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).getTranslationY()));
                i18++;
            }
            return;
        }
        int i19 = this.f507661d;
        if (i19 > 0) {
            while (true) {
                i17 = c16332x7cb9791e.f226659u;
                if (i18 >= i17 - 1) {
                    break;
                }
                android.view.View view = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18);
                float f17 = 1.0f - floatValue;
                float floatValue2 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(i18)).floatValue() * f17;
                float g17 = c16332x7cb9791e.g(i18);
                int i27 = i18 + 1;
                m66058xa8797fa84 = c16332x7cb9791e.m66058xa8797fa8();
                view.setTranslationX(floatValue2 + ((g17 - (i27 * m66058xa8797fa84)) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i18)).floatValue() * f17) + (c16332x7cb9791e.h(i18) * floatValue));
                i18 = i27;
            }
            android.view.View view2 = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17 - 1);
            float floatValue3 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(c16332x7cb9791e.f226659u - 1)).floatValue() * (1.0f - floatValue);
            float g18 = c16332x7cb9791e.g(c16332x7cb9791e.f226659u - 1);
            m66058xa8797fa83 = c16332x7cb9791e.m66058xa8797fa8();
            view2.setTranslationX(floatValue3 + ((g18 - ((m66058xa8797fa83 * i19) / 2.0f)) * floatValue));
        } else {
            while (i18 < c16332x7cb9791e.f226659u) {
                float f18 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(i18)).floatValue() * f18) + (c16332x7cb9791e.g(i18) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i18)).floatValue() * f18) + (c16332x7cb9791e.h(i18) * floatValue));
                i18++;
            }
        }
        int i28 = this.f507662e;
        if (i28 <= 0) {
            for (int i29 = c16332x7cb9791e.f226659u; i29 < c16332x7cb9791e.f226660v; i29++) {
                float f19 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i29)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(i29)).floatValue() * f19) + (c16332x7cb9791e.g(i29) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i29)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i29)).floatValue() * f19) + (c16332x7cb9791e.h(i29) * floatValue));
            }
            return;
        }
        android.view.View view3 = c16332x7cb9791e.f226658t;
        float f27 = 1.0f - floatValue;
        float floatValue4 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(c16332x7cb9791e.f226659u)).floatValue() * f27;
        float g19 = c16332x7cb9791e.g(c16332x7cb9791e.f226659u);
        m66058xa8797fa8 = c16332x7cb9791e.m66058xa8797fa8();
        view3.setTranslationX(floatValue4 + ((g19 + ((m66058xa8797fa8 * i28) / 2.0f)) * floatValue));
        c16332x7cb9791e.f226658t.setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(c16332x7cb9791e.f226659u)).floatValue() * f27) + (c16332x7cb9791e.h(c16332x7cb9791e.f226659u) * floatValue));
        int i37 = c16332x7cb9791e.f226659u;
        while (true) {
            i37++;
            if (i37 >= c16332x7cb9791e.f226660v) {
                return;
            }
            android.view.View view4 = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i37);
            float floatValue5 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(i37)).floatValue() * f27;
            float g27 = c16332x7cb9791e.g(i37);
            float f28 = c16332x7cb9791e.f226660v - i37;
            m66058xa8797fa82 = c16332x7cb9791e.m66058xa8797fa8();
            view4.setTranslationX(floatValue5 + ((g27 + (f28 * m66058xa8797fa82)) * floatValue));
            ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i37)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i37)).floatValue() * f27) + (c16332x7cb9791e.h(i37) * floatValue));
        }
    }
}
