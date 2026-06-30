package androidx.transition;

/* loaded from: classes13.dex */
public class Explode extends androidx.transition.Visibility {
    public static final android.animation.TimeInterpolator P = new android.view.animation.DecelerateInterpolator();
    public static final android.animation.TimeInterpolator Q = new android.view.animation.AccelerateInterpolator();
    public final int[] N;

    public Explode(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = new int[2];
        this.F = new u4.u();
    }

    private void T(u4.m1 m1Var) {
        android.view.View view = m1Var.f424515b;
        int[] iArr = this.N;
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int width = view.getWidth() + i17;
        int height = view.getHeight() + i18;
        ((java.util.HashMap) m1Var.f424514a).put("android:explode:screenBounds", new android.graphics.Rect(i17, i18, width, height));
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator V(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        if (m1Var2 == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) ((java.util.HashMap) m1Var2.f424514a).get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        X(viewGroup, rect, this.N);
        return u4.p1.a(view, m1Var2, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, P);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator W(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        float f17;
        float f18;
        if (m1Var == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) ((java.util.HashMap) m1Var.f424514a).get("android:explode:screenBounds");
        int i17 = rect.left;
        int i18 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) m1Var.f424515b.getTag(com.tencent.mm.R.id.oj7);
        if (iArr != null) {
            f17 = (r7 - rect.left) + translationX;
            f18 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f17 = translationX;
            f18 = translationY;
        }
        X(viewGroup, rect, this.N);
        return u4.p1.a(view, m1Var, i17, i18, translationX, translationY, f17 + r0[0], f18 + r0[1], Q);
    }

    public final void X(android.view.View view, android.graphics.Rect rect, int[] iArr) {
        int centerY;
        int i17;
        int[] iArr2 = this.N;
        view.getLocationOnScreen(iArr2);
        int i18 = iArr2[0];
        int i19 = iArr2[1];
        u4.a1 a1Var = this.G;
        android.graphics.Rect a17 = a1Var == null ? null : a1Var.a(this);
        if (a17 == null) {
            i17 = (view.getWidth() / 2) + i18 + java.lang.Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i19 + java.lang.Math.round(view.getTranslationY());
        } else {
            int centerX = a17.centerX();
            centerY = a17.centerY();
            i17 = centerX;
        }
        float centerX2 = rect.centerX() - i17;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (java.lang.Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (java.lang.Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) java.lang.Math.sqrt((centerX2 * centerX2) + (centerY2 * centerY2));
        int i27 = i17 - i18;
        int i28 = centerY - i19;
        float max = java.lang.Math.max(i27, view.getWidth() - i27);
        float max2 = java.lang.Math.max(i28, view.getHeight() - i28);
        float sqrt2 = (float) java.lang.Math.sqrt((max * max) + (max2 * max2));
        iArr[0] = java.lang.Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = java.lang.Math.round(sqrt2 * (centerY2 / sqrt));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        T(m1Var);
        T(m1Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        T(m1Var);
        T(m1Var);
    }
}
