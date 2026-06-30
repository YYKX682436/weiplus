package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMSmoothHorizontalScrollView */
/* loaded from: classes3.dex */
public class C21515xce1dd6e4 extends android.widget.HorizontalScrollView implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f279107d;

    /* renamed from: e, reason: collision with root package name */
    public float f279108e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f279109f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.TranslateAnimation f279110g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Interpolator f279111h;

    public C21515xce1dd6e4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279109f = new android.graphics.Rect();
        this.f279111h = new android.view.animation.DecelerateInterpolator();
        setFadingEdgeLength(a());
    }

    public int a() {
        return 0;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        if (getChildCount() > 0) {
            this.f279107d = getChildAt(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r0 != 3) goto L32;
     */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2642x2e06d1.C21515xce1dd6e4.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
