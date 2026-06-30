package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameCenterListView */
/* loaded from: classes4.dex */
public class C15947x4bb5f08a extends android.widget.ListView implements xn5.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f222239q;

    /* renamed from: r, reason: collision with root package name */
    public static int f222240r;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222241d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f222242e;

    /* renamed from: f, reason: collision with root package name */
    public float f222243f;

    /* renamed from: g, reason: collision with root package name */
    public int f222244g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f222245h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f222246i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Scroller f222247m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f222248n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f222249o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f222250p;

    public C15947x4bb5f08a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222241d = context;
    }

    /* renamed from: setCanPulldown */
    public static void m64737xabebf695(boolean z17) {
        f222239q = z17;
    }

    /* renamed from: setDefaultPadding */
    public static void m64738xfdf2d792(int i17) {
        f222240r = i17;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f222250p != null && this.f222247m.computeScrollOffset()) {
            this.f222250p.setPadding(0, this.f222247m.getCurrY(), 0, 0);
            int i17 = (int) (((r1 - r0) / f222240r) * 255.0f);
            this.f222249o.setAlpha(255 - i17);
            this.f222248n.setAlpha(i17);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (!f222239q || this.f222250p == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f222246i = false;
            this.f222243f = motionEvent.getRawY();
        } else if (action == 2 && this.f222245h) {
            if (this.f222246i) {
                return true;
            }
            int rawY = (int) (motionEvent.getRawY() - this.f222243f);
            if (this.f222250p.getPaddingTop() <= f222240r + this.f222244g) {
                if (rawY > 0 && java.lang.Math.abs(rawY) >= this.f222244g) {
                    this.f222246i = true;
                    this.f222247m.startScroll(0, this.f222250p.getPaddingTop(), 0, -this.f222250p.getPaddingTop(), 500);
                    this.f222248n.setClickable(true);
                    invalidate();
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            } else if (this.f222250p.getPaddingTop() >= (-this.f222244g) && rawY < 0 && java.lang.Math.abs(rawY) >= this.f222244g) {
                this.f222246i = true;
                this.f222247m.startScroll(0, 0, 0, f222240r, 500);
                invalidate();
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.content.Context context = this.f222241d;
        this.f222244g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f222247m = new android.widget.Scroller(context);
        super.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i0(this));
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (!z17 || this.f222242e) {
            return;
        }
        android.view.View childAt = getChildAt(0);
        this.f222250p = childAt;
        this.f222249o = (android.widget.ImageView) childAt.findViewById(com.p314xaae8f345.mm.R.id.n0h);
        this.f222248n = (android.widget.ImageView) this.f222250p.findViewById(com.p314xaae8f345.mm.R.id.ahg);
        this.f222242e = true;
    }
}
