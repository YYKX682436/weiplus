package p012xc85e97e9.p112x993b6d55;

/* renamed from: androidx.transition.ChangeClipBounds */
/* loaded from: classes13.dex */
public class C1174x257a2215 extends p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 {
    public static final java.lang.String[] L = {"android:clipBounds:clip"};

    public C1174x257a2215(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void T(u4.m1 m1Var) {
        android.view.View view = m1Var.f506048b;
        if (view.getVisibility() == 8) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        android.graphics.Rect a17 = n3.w0.a(view);
        java.util.Map map = m1Var.f506047a;
        ((java.util.HashMap) map).put("android:clipBounds:clip", a17);
        if (a17 == null) {
            ((java.util.HashMap) map).put("android:clipBounds:bounds", new android.graphics.Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void g(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void j(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public android.animation.Animator n(android.view.ViewGroup viewGroup, u4.m1 m1Var, u4.m1 m1Var2) {
        android.animation.ObjectAnimator objectAnimator = null;
        if (m1Var != null && m1Var2 != null) {
            java.util.Map map = m1Var.f506047a;
            if (((java.util.HashMap) map).containsKey("android:clipBounds:clip")) {
                java.util.Map map2 = m1Var2.f506047a;
                if (((java.util.HashMap) map2).containsKey("android:clipBounds:clip")) {
                    android.graphics.Rect rect = (android.graphics.Rect) ((java.util.HashMap) map).get("android:clipBounds:clip");
                    android.graphics.Rect rect2 = (android.graphics.Rect) ((java.util.HashMap) map2).get("android:clipBounds:clip");
                    boolean z17 = rect2 == null;
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    if (rect == null) {
                        rect = (android.graphics.Rect) ((java.util.HashMap) map).get("android:clipBounds:bounds");
                    } else if (rect2 == null) {
                        rect2 = (android.graphics.Rect) ((java.util.HashMap) map2).get("android:clipBounds:bounds");
                    }
                    if (rect.equals(rect2)) {
                        return null;
                    }
                    android.view.View view = m1Var2.f506048b;
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.w0.c(view, rect);
                    objectAnimator = android.animation.ObjectAnimator.ofObject(m1Var2.f506048b, (android.util.Property<android.view.View, V>) u4.w1.f506109e, new u4.i0(new android.graphics.Rect()), rect, rect2);
                    if (z17) {
                        objectAnimator.addListener(new u4.k(this, m1Var2.f506048b));
                    }
                }
            }
        }
        return objectAnimator;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public java.lang.String[] x() {
        return L;
    }
}
