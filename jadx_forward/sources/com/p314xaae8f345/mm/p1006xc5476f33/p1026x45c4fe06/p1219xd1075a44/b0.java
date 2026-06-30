package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes3.dex */
public class b0 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f172584f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f172585g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f172586h;

    /* renamed from: i, reason: collision with root package name */
    public float f172587i;

    /* renamed from: m, reason: collision with root package name */
    public float f172588m;

    public b0(android.content.Context context) {
        super(context, null);
        this.f172584f = true;
        setGravity(17);
        setText("vConsole");
        setTextColor(-1);
        float f17 = getContext().getResources().getDisplayMetrics().density;
        int i17 = (int) (13.0f * f17);
        setPadding(i17, (int) (4.0f * f17), i17, (int) (f17 * 6.0f));
        setBackgroundDrawable(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a0(null));
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() == null) {
            setBackground(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a0(null));
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelPendingInputEvents();
        this.f172586h = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r4 != null ? r4.contains(r0, r2) : false) == false) goto L14;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L65
            if (r0 == r3) goto L4a
            if (r0 == r2) goto Lf
            goto Laf
        Lf:
            boolean r0 = r8.f172586h
            if (r0 != 0) goto L26
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r4 = r8.f172585g
            if (r4 != 0) goto L20
            goto L24
        L20:
            boolean r1 = r4.contains(r0, r2)
        L24:
            if (r1 != 0) goto Laf
        L26:
            float r0 = r8.getX()
            float r1 = r9.getRawX()
            float r2 = r8.f172587i
            float r1 = r1 - r2
            float r0 = r0 + r1
            r8.setX(r0)
            float r0 = r8.getY()
            float r1 = r9.getRawY()
            float r2 = r8.f172588m
            float r1 = r1 - r2
            float r0 = r0 + r1
            r8.setY(r0)
            r8.requestLayout()
            r8.f172586h = r3
            goto Laf
        L4a:
            boolean r0 = r8.f172586h
            if (r0 != 0) goto Laf
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r4 = r8.f172585g
            if (r4 != 0) goto L5b
            goto L5f
        L5b:
            boolean r1 = r4.contains(r0, r2)
        L5f:
            if (r1 == 0) goto Laf
            r8.performClick()
            goto Laf
        L65:
            boolean r0 = r8.f172584f
            if (r0 == 0) goto L8d
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r8.getX()
            float r4 = r8.getY()
            float r5 = r8.getX()
            int r6 = r8.getWidth()
            float r6 = (float) r6
            float r5 = r5 + r6
            float r6 = r8.getY()
            int r7 = r8.getHeight()
            float r7 = (float) r7
            float r6 = r6 + r7
            r0.<init>(r2, r4, r5, r6)
            r8.f172585g = r0
            goto Lad
        L8d:
            int[] r0 = new int[r2]
            r8.getLocationInWindow(r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            r4 = r0[r1]
            float r5 = (float) r4
            r6 = r0[r3]
            float r6 = (float) r6
            int r7 = r8.getWidth()
            int r4 = r4 + r7
            float r4 = (float) r4
            r0 = r0[r3]
            int r7 = r8.getHeight()
            int r0 = r0 + r7
            float r0 = (float) r0
            r2.<init>(r5, r6, r4, r0)
            r8.f172585g = r2
        Lad:
            r8.f172586h = r1
        Laf:
            float r0 = r9.getRawX()
            r8.f172587i = r0
            float r9 = r9.getRawY()
            r8.f172588m = r9
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
