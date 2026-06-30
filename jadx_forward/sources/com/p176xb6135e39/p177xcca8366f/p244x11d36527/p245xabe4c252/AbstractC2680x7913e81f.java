package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.HeaderBehavior */
/* loaded from: classes15.dex */
public abstract class AbstractC2680x7913e81f<V extends android.view.View> extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2682x7f47f62a<V> {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f125857f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.OverScroller f125858g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f125859h;

    /* renamed from: i, reason: collision with root package name */
    public int f125860i;

    /* renamed from: m, reason: collision with root package name */
    public int f125861m;

    /* renamed from: n, reason: collision with root package name */
    public int f125862n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.VelocityTracker f125863o;

    public AbstractC2680x7913e81f() {
        this.f125860i = -1;
        this.f125862n = -1;
    }

    public boolean C(android.view.View view) {
        return false;
    }

    public int D(android.view.View view) {
        return -view.getHeight();
    }

    public int E(android.view.View view) {
        return view.getHeight();
    }

    public void F(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view) {
    }

    public int G(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        return H(c1081xa22a3e5a, view, i17, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int H(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17, int i18, int i19) {
        int b17;
        int y17 = y();
        if (i18 == 0 || y17 < i18 || y17 > i19 || y17 == (b17 = h3.a.b(i17, i18, i19))) {
            return 0;
        }
        B(b17);
        return y17 - b17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 != 3) goto L37;
     */
    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f125862n
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f125862n = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f125859h
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L8a
        L2f:
            int r6 = r4.f125860i
            if (r6 != r5) goto L34
            goto L8a
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L8a
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f125861m
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f125862n
            if (r6 <= r0) goto L8a
            r4.f125859h = r2
            r4.f125861m = r5
            goto L8a
        L51:
            r4.f125859h = r3
            r4.f125860i = r5
            android.view.VelocityTracker r5 = r4.f125863o
            if (r5 == 0) goto L8a
            r5.recycle()
            r5 = 0
            r4.f125863o = r5
            goto L8a
        L60:
            r4.f125859h = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.C(r6)
            if (r2 == 0) goto L8a
            boolean r5 = r5.q(r6, r0, r1)
            if (r5 == 0) goto L8a
            r4.f125861m = r1
            int r5 = r7.getPointerId(r3)
            r4.f125860i = r5
            android.view.VelocityTracker r5 = r4.f125863o
            if (r5 != 0) goto L8a
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.f125863o = r5
        L8a:
            android.view.VelocityTracker r5 = r4.f125863o
            if (r5 == 0) goto L91
            r5.addMovement(r7)
        L91:
            boolean r5 = r4.f125859h
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r0 != 3) goto L50;
     */
    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f.x(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public AbstractC2680x7913e81f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f125860i = -1;
        this.f125862n = -1;
    }
}
