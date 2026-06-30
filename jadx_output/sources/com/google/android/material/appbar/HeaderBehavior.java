package com.google.android.material.appbar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public abstract class HeaderBehavior<V extends android.view.View> extends com.google.android.material.appbar.ViewOffsetBehavior<V> {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f44324f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.OverScroller f44325g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44326h;

    /* renamed from: i, reason: collision with root package name */
    public int f44327i;

    /* renamed from: m, reason: collision with root package name */
    public int f44328m;

    /* renamed from: n, reason: collision with root package name */
    public int f44329n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.VelocityTracker f44330o;

    public HeaderBehavior() {
        this.f44327i = -1;
        this.f44329n = -1;
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

    public void F(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
    }

    public int G(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        return H(coordinatorLayout, view, i17, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int H(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17, int i18, int i19) {
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
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f44329n
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f44329n = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f44326h
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
            int r6 = r4.f44327i
            if (r6 != r5) goto L34
            goto L8a
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L8a
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f44328m
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f44329n
            if (r6 <= r0) goto L8a
            r4.f44326h = r2
            r4.f44328m = r5
            goto L8a
        L51:
            r4.f44326h = r3
            r4.f44327i = r5
            android.view.VelocityTracker r5 = r4.f44330o
            if (r5 == 0) goto L8a
            r5.recycle()
            r5 = 0
            r4.f44330o = r5
            goto L8a
        L60:
            r4.f44326h = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.C(r6)
            if (r2 == 0) goto L8a
            boolean r5 = r5.q(r6, r0, r1)
            if (r5 == 0) goto L8a
            r4.f44328m = r1
            int r5 = r7.getPointerId(r3)
            r4.f44327i = r5
            android.view.VelocityTracker r5 = r4.f44330o
            if (r5 != 0) goto L8a
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.f44330o = r5
        L8a:
            android.view.VelocityTracker r5 = r4.f44330o
            if (r5 == 0) goto L91
            r5.addMovement(r7)
        L91:
            boolean r5 = r4.f44326h
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r0 != 3) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.x(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44327i = -1;
        this.f44329n = -1;
    }
}
