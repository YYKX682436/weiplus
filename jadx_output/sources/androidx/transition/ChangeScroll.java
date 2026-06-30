package androidx.transition;

/* loaded from: classes13.dex */
public class ChangeScroll extends androidx.transition.Transition {
    public static final java.lang.String[] L = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void T(u4.m1 m1Var) {
        ((java.util.HashMap) m1Var.f424514a).put("android:changeScroll:x", java.lang.Integer.valueOf(m1Var.f424515b.getScrollX()));
        ((java.util.HashMap) m1Var.f424514a).put("android:changeScroll:y", java.lang.Integer.valueOf(m1Var.f424515b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator n(android.view.ViewGroup viewGroup, u4.m1 m1Var, u4.m1 m1Var2) {
        android.animation.ObjectAnimator objectAnimator;
        android.animation.ObjectAnimator objectAnimator2 = null;
        if (m1Var == null || m1Var2 == null) {
            return null;
        }
        android.view.View view = m1Var2.f424515b;
        java.util.HashMap hashMap = (java.util.HashMap) m1Var.f424514a;
        int intValue = ((java.lang.Integer) hashMap.get("android:changeScroll:x")).intValue();
        java.util.HashMap hashMap2 = (java.util.HashMap) m1Var2.f424514a;
        int intValue2 = ((java.lang.Integer) hashMap2.get("android:changeScroll:x")).intValue();
        int intValue3 = ((java.lang.Integer) hashMap.get("android:changeScroll:y")).intValue();
        int intValue4 = ((java.lang.Integer) hashMap2.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = android.animation.ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = android.animation.ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        boolean z17 = u4.l1.f424511a;
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimator, objectAnimator2);
        return animatorSet;
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] x() {
        return L;
    }
}
