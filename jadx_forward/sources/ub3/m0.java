package ub3;

/* loaded from: classes15.dex */
public class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f507653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f507654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507655f;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e, int i17, int i18) {
        this.f507655f = c16332x7cb9791e;
        this.f507653d = i17;
        this.f507654e = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float m66057x180bac5f;
        float m66057x180bac5f2;
        int i17;
        float m66057x180bac5f3;
        float m66057x180bac5f4;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i18 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507655f;
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
        int i19 = this.f507653d;
        if (i19 > 0) {
            while (true) {
                i17 = c16332x7cb9791e.f226657s;
                if (i18 >= i17 - 1) {
                    break;
                }
                android.view.View view = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18);
                float f17 = 1.0f - floatValue;
                float floatValue2 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(i18)).floatValue() * f17;
                float g17 = c16332x7cb9791e.g(i18);
                int i27 = i18 + 1;
                m66057x180bac5f4 = c16332x7cb9791e.m66057x180bac5f();
                view.setTranslationX(floatValue2 + ((g17 - (i27 * m66057x180bac5f4)) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i18)).floatValue() * f17) + (c16332x7cb9791e.h(i18) * floatValue));
                i18 = i27;
            }
            android.view.View view2 = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17 - 1);
            float floatValue3 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(c16332x7cb9791e.f226657s - 1)).floatValue();
            float f18 = 1.0f - floatValue;
            float g18 = c16332x7cb9791e.g(c16332x7cb9791e.f226657s - 1);
            m66057x180bac5f3 = c16332x7cb9791e.m66057x180bac5f();
            view2.setTranslationX((floatValue3 * f18) + ((g18 - ((m66057x180bac5f3 * i19) / 2.0f)) * floatValue));
            ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(c16332x7cb9791e.f226657s - 1)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(c16332x7cb9791e.f226657s - 1)).floatValue() * f18) + (c16332x7cb9791e.h(c16332x7cb9791e.f226657s - 1) * floatValue));
        } else {
            while (i18 < c16332x7cb9791e.f226657s) {
                float f19 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(i18)).floatValue() * f19) + (c16332x7cb9791e.g(i18) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i18)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i18)).floatValue() * f19) + (c16332x7cb9791e.h(i18) * floatValue));
                i18++;
            }
        }
        int i28 = this.f507654e;
        if (i28 > 0) {
            android.view.View view3 = c16332x7cb9791e.f226656r;
            float floatValue4 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(c16332x7cb9791e.f226657s)).floatValue();
            float f27 = 1.0f - floatValue;
            float g19 = c16332x7cb9791e.g(c16332x7cb9791e.f226657s);
            m66057x180bac5f = c16332x7cb9791e.m66057x180bac5f();
            view3.setTranslationX((floatValue4 * f27) + ((g19 + ((m66057x180bac5f * i28) / 2.0f)) * floatValue));
            int i29 = c16332x7cb9791e.f226657s;
            while (true) {
                i29++;
                if (i29 >= c16332x7cb9791e.f226660v) {
                    break;
                }
                android.view.View view4 = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i29);
                float floatValue5 = ((java.lang.Float) c16332x7cb9791e.f226663y.get(i29)).floatValue() * f27;
                float g27 = c16332x7cb9791e.g(i29);
                float f28 = c16332x7cb9791e.f226660v - i29;
                m66057x180bac5f2 = c16332x7cb9791e.m66057x180bac5f();
                view4.setTranslationX(floatValue5 + ((g27 + (f28 * m66057x180bac5f2)) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i29)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i29)).floatValue() * f27) + (c16332x7cb9791e.h(i29) * floatValue));
            }
        } else {
            for (int i37 = c16332x7cb9791e.f226657s; i37 < c16332x7cb9791e.f226660v; i37++) {
                float f29 = 1.0f - floatValue;
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i37)).setTranslationX((((java.lang.Float) c16332x7cb9791e.f226663y.get(i37)).floatValue() * f29) + (c16332x7cb9791e.g(i37) * floatValue));
                ((android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i37)).setTranslationY((((java.lang.Float) c16332x7cb9791e.f226664z.get(i37)).floatValue() * f29) + (c16332x7cb9791e.h(i37) * floatValue));
            }
        }
        c16332x7cb9791e.f226656r.setTranslationY(((1.0f - floatValue) * ((java.lang.Float) c16332x7cb9791e.f226664z.get(c16332x7cb9791e.f226657s)).floatValue()) - ((floatValue * c16332x7cb9791e.f226656r.getHeight()) / 7.0f));
    }
}
