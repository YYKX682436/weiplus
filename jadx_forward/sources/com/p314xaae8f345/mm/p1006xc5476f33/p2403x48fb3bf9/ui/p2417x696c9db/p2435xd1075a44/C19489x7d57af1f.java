package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton */
/* loaded from: classes3.dex */
public class C19489x7d57af1f extends android.widget.ImageView implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f268586d;

    /* renamed from: e, reason: collision with root package name */
    public int f268587e;

    /* renamed from: f, reason: collision with root package name */
    public int f268588f;

    /* renamed from: g, reason: collision with root package name */
    public int f268589g;

    /* renamed from: h, reason: collision with root package name */
    public int f268590h;

    /* renamed from: i, reason: collision with root package name */
    public int f268591i;

    /* renamed from: m, reason: collision with root package name */
    public int f268592m;

    /* renamed from: n, reason: collision with root package name */
    public int f268593n;

    /* renamed from: o, reason: collision with root package name */
    public int f268594o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup.MarginLayoutParams f268595p;

    /* renamed from: q, reason: collision with root package name */
    public int f268596q;

    /* renamed from: r, reason: collision with root package name */
    public int f268597r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f268598s;

    public C19489x7d57af1f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268593n = 0;
        this.f268594o = 0;
        this.f268598s = true;
        this.f268586d = context;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.content.Context context = this.f268586d;
        this.f268596q = i65.a.b(context, 100);
        i65.a.B(context);
        i65.a.k(context);
        this.f268597r = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f268598s) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f268593n == 0 || this.f268594o == 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            getWindowVisibleDisplayFrame(rect);
            this.f268593n = rect.right - rect.left;
            this.f268594o = rect.bottom - rect.top;
        }
        this.f268587e = (int) motionEvent.getRawX();
        this.f268588f = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f268591i = this.f268587e;
            this.f268592m = this.f268588f;
        } else if (action != 1) {
            if (action == 2) {
                int i17 = this.f268587e - this.f268589g;
                int i18 = this.f268588f - this.f268590h;
                if (i17 != 0 || i18 != 0) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
                    this.f268595p = marginLayoutParams;
                    int i19 = marginLayoutParams.rightMargin + (-i17);
                    marginLayoutParams.rightMargin = i19;
                    marginLayoutParams.topMargin += i18;
                    if (i19 < 0) {
                        marginLayoutParams.rightMargin = 0;
                    } else if (i19 > this.f268593n - getWidth()) {
                        this.f268595p.rightMargin = this.f268593n - getWidth();
                    }
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = this.f268595p;
                    int i27 = marginLayoutParams2.topMargin;
                    if (i27 < 0) {
                        marginLayoutParams2.topMargin = 0;
                    } else if (i27 > this.f268594o - getHeight()) {
                        this.f268595p.topMargin = this.f268594o - getHeight();
                    }
                    requestLayout();
                }
            }
        } else if (java.lang.Math.abs(this.f268591i - this.f268587e) + java.lang.Math.abs(this.f268592m - this.f268588f) > this.f268597r) {
            int i28 = this.f268588f;
            int i29 = this.f268596q;
            if (i28 < i29) {
                this.f268595p.topMargin = 0;
            } else {
                int i37 = this.f268594o;
                if (i28 > i37 - i29) {
                    this.f268595p.topMargin = i37 - getHeight();
                } else {
                    int i38 = this.f268587e;
                    int i39 = this.f268593n;
                    if (i38 > i39 / 2) {
                        this.f268595p.rightMargin = 0;
                    } else {
                        this.f268595p.rightMargin = i39 - getWidth();
                    }
                }
            }
            requestLayout();
        } else {
            performClick();
        }
        this.f268589g = this.f268587e;
        this.f268590h = this.f268588f;
        return true;
    }

    /* renamed from: setCanMove */
    public void m74813xd20050ff(boolean z17) {
        this.f268598s = z17;
    }

    public C19489x7d57af1f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f268593n = 0;
        this.f268594o = 0;
        this.f268598s = true;
        this.f268586d = context;
    }
}
