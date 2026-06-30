package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.SmileySubGrid */
/* loaded from: classes15.dex */
public class C22807x4828c5d5 extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public int f294998d;

    /* renamed from: e, reason: collision with root package name */
    public int f294999e;

    /* renamed from: f, reason: collision with root package name */
    public int f295000f;

    /* renamed from: g, reason: collision with root package name */
    public int f295001g;

    /* renamed from: h, reason: collision with root package name */
    public float f295002h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f295003i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f295004m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.WindowManager f295005n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 f295006o;

    /* renamed from: p, reason: collision with root package name */
    public ym5.g5 f295007p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f295008q;

    /* renamed from: r, reason: collision with root package name */
    public ym5.h5 f295009r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f295010s;

    /* renamed from: t, reason: collision with root package name */
    public final int f295011t;

    /* renamed from: u, reason: collision with root package name */
    public volatile int f295012u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f295013v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f295014w;

    public C22807x4828c5d5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f294998d = 6;
        this.f295001g = -1;
        this.f295003i = new android.graphics.Rect();
        this.f295008q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f295012u = -1;
        this.f295013v = true;
        this.f295014w = new java.lang.Object();
        this.f295011t = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f295005n = (android.view.WindowManager) context.getSystemService("window");
        m82741x839f8fda();
        android.view.ViewConfiguration.getPressedStateDuration();
    }

    public void d(android.view.View view) {
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        android.graphics.Rect rect = this.f295003i;
        rect.set(left, top, right, bottom);
        rect.set(rect.left - getPaddingLeft(), rect.top - getPaddingTop(), rect.right + getPaddingRight(), rect.bottom + getPaddingBottom());
        boolean z17 = this.f295004m;
        if (view.isEnabled() != z17) {
            this.f295004m = !z17;
            refreshDrawableState();
        }
    }

    public void f() {
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 abstractC22836x7ad225f4 = this.f295006o;
        if (abstractC22836x7ad225f4 != null) {
            this.f295005n.removeView(abstractC22836x7ad225f4);
            this.f295006o = null;
        }
        this.f295012u = -1;
    }

    /* renamed from: getLongTouchTime */
    public int m82741x839f8fda() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 != 3) goto L62;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2776x373aa5.C22807x4828c5d5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setFromDetail */
    public void m82742x829a3a9d(boolean z17) {
    }

    /* renamed from: setIsShowPopWin */
    public void m82743x41ed9374(boolean z17) {
        this.f295013v = z17;
    }

    /* renamed from: setScrollEnable */
    public void m82744x52f47832(boolean z17) {
        android.view.View view = this.f295010s;
        if (view != null) {
            if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0) view).m78928x52f47832(z17);
            } else if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) view).m78873x6e5cce43(z17);
            }
        }
    }

    /* renamed from: setViewParent */
    public void m82745xa73ce5b1(android.view.View view) {
        this.f295010s = view;
    }
}
