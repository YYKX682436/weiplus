package androidx.transition;

/* loaded from: classes13.dex */
public abstract class Visibility extends androidx.transition.Transition {
    public static final java.lang.String[] M = {"android:visibility:visibility", "android:visibility:parent"};
    public int L;

    public Visibility() {
        this.L = 3;
    }

    public final void T(u4.m1 m1Var) {
        int visibility = m1Var.f424515b.getVisibility();
        java.util.Map map = m1Var.f424514a;
        ((java.util.HashMap) map).put("android:visibility:visibility", java.lang.Integer.valueOf(visibility));
        ((java.util.HashMap) map).put("android:visibility:parent", m1Var.f424515b.getParent());
        int[] iArr = new int[2];
        m1Var.f424515b.getLocationOnScreen(iArr);
        ((java.util.HashMap) map).put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u4.d2 U(u4.m1 r9, u4.m1 r10) {
        /*
            r8 = this;
            u4.d2 r0 = new u4.d2
            r0.<init>()
            r1 = 0
            r0.f424464a = r1
            r0.f424465b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r9 == 0) goto L37
            java.util.Map r6 = r9.f424514a
            r7 = r6
            java.util.HashMap r7 = (java.util.HashMap) r7
            boolean r7 = r7.containsKey(r5)
            if (r7 == 0) goto L37
            r7 = r6
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f424466c = r7
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f424468e = r6
            goto L3b
        L37:
            r0.f424466c = r4
            r0.f424468e = r3
        L3b:
            if (r10 == 0) goto L62
            java.util.Map r6 = r10.f424514a
            r7 = r6
            java.util.HashMap r7 = (java.util.HashMap) r7
            boolean r7 = r7.containsKey(r5)
            if (r7 == 0) goto L62
            r3 = r6
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f424467d = r3
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f424469f = r2
            goto L66
        L62:
            r0.f424467d = r4
            r0.f424469f = r3
        L66:
            r2 = 1
            if (r9 == 0) goto L9a
            if (r10 == 0) goto L9a
            int r9 = r0.f424466c
            int r10 = r0.f424467d
            if (r9 != r10) goto L78
            android.view.ViewGroup r3 = r0.f424468e
            android.view.ViewGroup r4 = r0.f424469f
            if (r3 != r4) goto L78
            return r0
        L78:
            if (r9 == r10) goto L88
            if (r9 != 0) goto L81
            r0.f424465b = r1
            r0.f424464a = r2
            goto Laf
        L81:
            if (r10 != 0) goto Laf
            r0.f424465b = r2
            r0.f424464a = r2
            goto Laf
        L88:
            android.view.ViewGroup r9 = r0.f424469f
            if (r9 != 0) goto L91
            r0.f424465b = r1
            r0.f424464a = r2
            goto Laf
        L91:
            android.view.ViewGroup r9 = r0.f424468e
            if (r9 != 0) goto Laf
            r0.f424465b = r2
            r0.f424464a = r2
            goto Laf
        L9a:
            if (r9 != 0) goto La5
            int r9 = r0.f424467d
            if (r9 != 0) goto La5
            r0.f424465b = r2
            r0.f424464a = r2
            goto Laf
        La5:
            if (r10 != 0) goto Laf
            int r9 = r0.f424466c
            if (r9 != 0) goto Laf
            r0.f424465b = r1
            r0.f424464a = r2
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.U(u4.m1, u4.m1):u4.d2");
    }

    public android.animation.Animator V(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        return null;
    }

    public android.animation.Animator W(android.view.ViewGroup viewGroup, android.view.View view, u4.m1 m1Var, u4.m1 m1Var2) {
        return null;
    }

    @Override // androidx.transition.Transition
    public void g(u4.m1 m1Var) {
        T(m1Var);
    }

    @Override // androidx.transition.Transition
    public void j(u4.m1 m1Var) {
        T(m1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator n(android.view.ViewGroup r10, u4.m1 r11, u4.m1 r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.n(android.view.ViewGroup, u4.m1, u4.m1):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] x() {
        return M;
    }

    @Override // androidx.transition.Transition
    public boolean z(u4.m1 m1Var, u4.m1 m1Var2) {
        if (m1Var == null && m1Var2 == null) {
            return false;
        }
        if (m1Var != null && m1Var2 != null && ((java.util.HashMap) m1Var2.f424514a).containsKey("android:visibility:visibility") != ((java.util.HashMap) m1Var.f424514a).containsKey("android:visibility:visibility")) {
            return false;
        }
        u4.d2 U = U(m1Var, m1Var2);
        if (U.f424464a) {
            return U.f424466c == 0 || U.f424467d == 0;
        }
        return false;
    }

    public Visibility(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = 3;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424560d);
        int e17 = d3.r.e(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (e17 != 0) {
            if ((e17 & (-4)) == 0) {
                this.L = e17;
                return;
            }
            throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }
}
