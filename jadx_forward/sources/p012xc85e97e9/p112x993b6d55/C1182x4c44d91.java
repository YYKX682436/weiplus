package p012xc85e97e9.p112x993b6d55;

/* renamed from: androidx.transition.Slide */
/* loaded from: classes13.dex */
public class C1182x4c44d91 extends p012xc85e97e9.p112x993b6d55.AbstractC1185xea883f32 {
    public static final android.animation.TimeInterpolator P = new android.view.animation.DecelerateInterpolator();
    public static final android.animation.TimeInterpolator Q = new android.view.animation.AccelerateInterpolator();
    public static final u4.r0 R = new u4.l0();
    public static final u4.r0 S = new u4.m0();
    public static final u4.r0 T = new u4.n0();
    public static final u4.r0 U = new u4.o0();
    public static final u4.r0 V = new u4.p0();
    public static final u4.r0 W = new u4.q0();
    public u4.r0 N;

    public C1182x4c44d91() {
        this.N = W;
        X(80);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1185xea883f32
    public android.animation.Animator V(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        if (m1Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) ((java.util.HashMap) m1Var2.f506047a).get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return u4.p1.a(view, m1Var2, iArr[0], iArr[1], this.N.b(viewGroup, view), this.N.a(viewGroup, view), translationX, translationY, P);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1185xea883f32
    public android.animation.Animator W(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        if (m1Var == null) {
            return null;
        }
        int[] iArr = (int[]) ((java.util.HashMap) m1Var.f506047a).get("android:slide:screenPosition");
        return u4.p1.a(view, m1Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.N.b(viewGroup, view), this.N.a(viewGroup, view), Q);
    }

    public void X(int i17) {
        if (i17 == 3) {
            this.N = R;
        } else if (i17 == 5) {
            this.N = U;
        } else if (i17 == 48) {
            this.N = T;
        } else if (i17 == 80) {
            this.N = W;
        } else if (i17 == 8388611) {
            this.N = S;
        } else {
            if (i17 != 8388613) {
                throw new java.lang.IllegalArgumentException("Invalid slide direction");
            }
            this.N = V;
        }
        u4.k0 k0Var = new u4.k0();
        k0Var.f506040b = i17;
        this.F = k0Var;
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1185xea883f32, p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void g(u4.m1 m1Var) {
        T(m1Var);
        int[] iArr = new int[2];
        m1Var.f506048b.getLocationOnScreen(iArr);
        ((java.util.HashMap) m1Var.f506047a).put("android:slide:screenPosition", iArr);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1185xea883f32, p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void j(u4.m1 m1Var) {
        T(m1Var);
        int[] iArr = new int[2];
        m1Var.f506048b.getLocationOnScreen(iArr);
        ((java.util.HashMap) m1Var.f506047a).put("android:slide:screenPosition", iArr);
    }

    public C1182x4c44d91(int i17) {
        this.N = W;
        X(i17);
    }

    public C1182x4c44d91(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = W;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f506096g);
        int e17 = d3.r.e(obtainStyledAttributes, (org.xmlpull.v1.XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        X(e17);
    }
}
