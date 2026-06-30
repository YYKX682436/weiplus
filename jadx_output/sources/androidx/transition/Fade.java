package androidx.transition;

/* loaded from: classes13.dex */
public class Fade extends androidx.transition.Visibility {
    public Fade(int i17) {
        if ((i17 & (-4)) == 0) {
            this.L = i17;
            return;
        }
        throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator V(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        java.lang.Float f17;
        float floatValue = (m1Var == null || (f17 = (java.lang.Float) ((java.util.HashMap) m1Var.f424514a).get("android:fade:transitionAlpha")) == null) ? 0.0f : f17.floatValue();
        return X(view, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator W(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        java.lang.Float f17;
        u4.a2 a2Var = u4.w1.f424572a;
        return X(view, (m1Var == null || (f17 = (java.lang.Float) ((java.util.HashMap) m1Var.f424514a).get("android:fade:transitionAlpha")) == null) ? 1.0f : f17.floatValue(), 0.0f);
    }

    public final android.animation.Animator X(android.view.View view, float f17, float f18) {
        if (f17 == f18) {
            return null;
        }
        u4.w1.c(view, f17);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) u4.w1.f424575d, f18);
        ofFloat.addListener(new u4.w(view));
        a(new u4.v(this, view));
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        T(m1Var);
        java.util.Map map = m1Var.f424514a;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("android:fade:transitionAlpha", java.lang.Float.valueOf(u4.w1.f424572a.a(m1Var.f424515b)));
    }

    public Fade(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424561e);
        int e17 = d3.r.e(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "fadingMode", 0, this.L);
        if ((e17 & (-4)) == 0) {
            this.L = e17;
            obtainStyledAttributes.recycle();
            return;
        }
        throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
