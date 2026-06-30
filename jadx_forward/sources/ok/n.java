package ok;

/* loaded from: classes10.dex */
public class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public float f427481d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f427482e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f427483f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final float f427484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ok.p f427485h;

    public n(ok.p pVar, float f17) {
        this.f427485h = pVar;
        this.f427484g = (float) java.lang.Math.pow(pVar.f427489e / f17, 0.25d);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f17;
        float f18;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        int i17 = this.f427483f;
        ok.p pVar = this.f427485h;
        if (i17 < 4 && pVar.f427492h) {
            android.graphics.Matrix m10942xfeaf52d0 = pVar.f427487c.m10942xfeaf52d0();
            float f19 = this.f427484g;
            m10942xfeaf52d0.postScale(f19, f19);
            this.f427483f++;
        }
        android.graphics.RectF m10938xe0f502ed = pVar.f427487c.m10938xe0f502ed();
        android.graphics.Rect m10934x9faf4b34 = pVar.f427487c.m10934x9faf4b34();
        if (pVar.f427493i) {
            float f27 = m10938xe0f502ed.top;
            int i18 = m10934x9faf4b34.top;
            float f28 = f27 > ((float) i18) ? i18 - f27 : 0.0f;
            float f29 = m10938xe0f502ed.right;
            int i19 = m10934x9faf4b34.right;
            float f37 = f29 < ((float) i19) ? i19 - f29 : 0.0f;
            float f38 = m10938xe0f502ed.bottom;
            int i27 = m10934x9faf4b34.bottom;
            if (f38 < i27) {
                f28 = i27 - f38;
            }
            f17 = f28;
            float f39 = m10938xe0f502ed.left;
            int i28 = m10934x9faf4b34.left;
            f18 = f39 > ((float) i28) ? i28 - f39 : f37;
        } else {
            float f47 = pVar.f427490f + (floatValue2 - this.f427482e);
            pVar.f427490f = f47;
            pVar.f427491g += floatValue - this.f427481d;
            f18 = f47 - m10938xe0f502ed.centerX();
            f17 = pVar.f427491g - m10938xe0f502ed.centerY();
        }
        pVar.f427487c.m10942xfeaf52d0().postTranslate(f18, f17);
        pVar.f427487c.postInvalidate();
        this.f427481d = floatValue;
        this.f427482e = floatValue2;
    }
}
