package tl2;

/* loaded from: classes3.dex */
public final class a0 extends p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 {
    public final void T(u4.m1 m1Var) {
        android.view.View view = m1Var.f506048b;
        java.util.Map values = m1Var.f506047a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "values");
        ((java.util.HashMap) values).put("com.tencent.mm:View:translationY", java.lang.Float.valueOf(view.getTranslationX()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "values");
        ((java.util.HashMap) values).put("com.tencent.mm:View:translationX", java.lang.Float.valueOf(view.getTranslationY()));
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
        java.util.Map map3;
        java.util.Map map4;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneRoot, "sceneRoot");
        java.lang.Object obj = 0;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((m1Var == null || (view4 = m1Var.f506048b) == null) ? obj : java.lang.Float.valueOf(view4.getTranslationX()), (m1Var2 == null || (view3 = m1Var2.f506048b) == null) ? obj : java.lang.Float.valueOf(view3.getTranslationX()))) {
            java.lang.Object valueOf = (m1Var == null || (view2 = m1Var.f506048b) == null) ? obj : java.lang.Float.valueOf(view2.getTranslationY());
            if (m1Var2 != null && (view = m1Var2.f506048b) != null) {
                obj = java.lang.Float.valueOf(view.getTranslationY());
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, obj)) {
                return null;
            }
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        java.lang.Object obj2 = (m1Var == null || (map4 = m1Var.f506047a) == null) ? null : ((java.util.HashMap) map4).get("com.tencent.mm:View:translationY");
        java.lang.Float f17 = obj2 instanceof java.lang.Float ? (java.lang.Float) obj2 : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        java.lang.Object obj3 = (m1Var == null || (map3 = m1Var.f506047a) == null) ? null : ((java.util.HashMap) map3).get("com.tencent.mm:View:translationX");
        java.lang.Float f18 = obj3 instanceof java.lang.Float ? (java.lang.Float) obj3 : null;
        float floatValue2 = f18 != null ? f18.floatValue() : 0.0f;
        java.lang.Object obj4 = (m1Var2 == null || (map2 = m1Var2.f506047a) == null) ? null : ((java.util.HashMap) map2).get("com.tencent.mm:View:translationY");
        java.lang.Float f19 = obj4 instanceof java.lang.Float ? (java.lang.Float) obj4 : null;
        float floatValue3 = f19 != null ? f19.floatValue() : 0.0f;
        java.lang.Object obj5 = (m1Var2 == null || (map = m1Var2.f506047a) == null) ? null : ((java.util.HashMap) map).get("com.tencent.mm:View:translationX");
        java.lang.Float f27 = obj5 instanceof java.lang.Float ? (java.lang.Float) obj5 : null;
        float floatValue4 = f27 != null ? f27.floatValue() : 0.0f;
        ofFloat.addListener(new tl2.y(m1Var2, m1Var));
        ofFloat.addUpdateListener(new tl2.z(m1Var2, floatValue, floatValue3, floatValue2, floatValue4));
        return ofFloat;
    }
}
