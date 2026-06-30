package androidx.transition;

/* loaded from: classes13.dex */
public class ChangeBounds extends androidx.transition.Transition {
    public static final java.lang.String[] M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final android.util.Property N;
    public static final android.util.Property P;
    public static final android.util.Property Q;
    public static final android.util.Property R;
    public static final android.util.Property S;
    public static final u4.i0 T;
    public boolean L;

    static {
        new u4.a(android.graphics.PointF.class, "boundsOrigin");
        N = new u4.b(android.graphics.PointF.class, "topLeft");
        P = new u4.c(android.graphics.PointF.class, "bottomRight");
        Q = new u4.d(android.graphics.PointF.class, "bottomRight");
        R = new u4.e(android.graphics.PointF.class, "topLeft");
        S = new u4.f(android.graphics.PointF.class, "position");
        T = new u4.i0();
    }

    public ChangeBounds() {
        this.L = false;
    }

    public final void T(u4.m1 m1Var) {
        android.view.View view = m1Var.f424515b;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) m1Var.f424514a;
        hashMap.put("android:changeBounds:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", m1Var.f424515b.getParent());
        if (this.L) {
            hashMap.put("android:changeBounds:clip", n3.w0.a(view));
        }
    }

    @Override // androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        T(m1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01b7  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator n(android.view.ViewGroup r21, u4.m1 r22, u4.m1 r23) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeBounds.n(android.view.ViewGroup, u4.m1, u4.m1):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] x() {
        return M;
    }

    public ChangeBounds(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424559c);
        boolean b17 = d3.r.b(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.L = b17;
    }
}
