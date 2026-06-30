package tl2;

/* loaded from: classes3.dex */
public final class c extends p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 {
    public final void T(u4.m1 m1Var) {
        android.view.View view = m1Var.f506048b;
        java.util.Map values = m1Var.f506047a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "values");
        android.graphics.drawable.Drawable background = view.getBackground();
        ((java.util.HashMap) values).put("com.tencent.mm:View:drawable_alpha", java.lang.Integer.valueOf(background != null ? background.getAlpha() : 0));
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void g(u4.m1 transitionValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionValues, "transitionValues");
        T(transitionValues);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void j(u4.m1 transitionValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionValues, "transitionValues");
        T(transitionValues);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public android.animation.Animator n(android.view.ViewGroup sceneRoot, u4.m1 m1Var, u4.m1 m1Var2) {
        java.util.Map map;
        java.util.Map map2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneRoot, "sceneRoot");
        java.lang.Object obj = (m1Var == null || (map2 = m1Var.f506047a) == null) ? null : ((java.util.HashMap) map2).get("com.tencent.mm:View:drawable_alpha");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 255;
        java.lang.Object obj2 = (m1Var2 == null || (map = m1Var2.f506047a) == null) ? null : ((java.util.HashMap) map).get("com.tencent.mm:View:drawable_alpha");
        java.lang.Integer num2 = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        int intValue2 = num2 != null ? num2.intValue() : 255;
        if (intValue == intValue2) {
            return null;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(new tl2.a(m1Var2, intValue, m1Var));
        ofFloat.addUpdateListener(new tl2.b(m1Var2, intValue, intValue2));
        return ofFloat;
    }
}
