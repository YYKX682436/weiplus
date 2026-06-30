package androidx.transition;

/* loaded from: classes13.dex */
public class ChangeTransform extends androidx.transition.Transition {
    public static final java.lang.String[] P = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final android.util.Property Q = new u4.o(float[].class, "nonTranslations");
    public static final android.util.Property R = new u4.p(android.graphics.PointF.class, "translations");
    public static final boolean S = true;
    public final boolean L;
    public final boolean M;
    public final android.graphics.Matrix N;

    public ChangeTransform(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = true;
        this.M = true;
        this.N = new android.graphics.Matrix();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424562f);
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) attributeSet;
        this.L = d3.r.b(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.M = d3.r.b(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    public final void T(u4.m1 m1Var) {
        android.view.View view = m1Var.f424515b;
        if (view.getVisibility() == 8) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) m1Var.f424514a;
        hashMap.put("android:changeTransform:parent", view.getParent());
        hashMap.put("android:changeTransform:transforms", new u4.t(view));
        android.graphics.Matrix matrix = view.getMatrix();
        hashMap.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new android.graphics.Matrix(matrix));
        if (this.M) {
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            u4.w1.f424572a.b((android.view.ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            hashMap.put("android:changeTransform:parentMatrix", matrix2);
            hashMap.put("android:changeTransform:intermediateMatrix", view.getTag(com.tencent.mm.R.id.oj9));
            hashMap.put("android:changeTransform:intermediateParentMatrix", view.getTag(com.tencent.mm.R.id.f486262kp3));
        }
    }

    @Override // androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        T(m1Var);
        if (S) {
            return;
        }
        ((android.view.ViewGroup) m1Var.f424515b.getParent()).startViewTransition(m1Var.f424515b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator n(android.view.ViewGroup r26, u4.m1 r27, u4.m1 r28) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.n(android.view.ViewGroup, u4.m1, u4.m1):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] x() {
        return P;
    }
}
