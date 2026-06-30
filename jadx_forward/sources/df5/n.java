package df5;

/* loaded from: classes14.dex */
public class n extends android.widget.HorizontalScrollView {

    /* renamed from: d, reason: collision with root package name */
    public final int f313701d;

    /* renamed from: e, reason: collision with root package name */
    public float f313702e;

    /* renamed from: f, reason: collision with root package name */
    public float f313703f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f313704g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f313705h;

    /* renamed from: i, reason: collision with root package name */
    public final int f313706i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f313707m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f313708n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f313709o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.LinearGradient f313710p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.LinearGradient f313711q;

    /* renamed from: r, reason: collision with root package name */
    public int f313712r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f313701d = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        android.view.ViewConfiguration.getLongPressTimeout();
        this.f313705h = new df5.m(this);
        this.f313706i = i65.a.b(context, 16);
        this.f313707m = new android.graphics.Paint(1);
        this.f313708n = new android.graphics.RectF();
        this.f313709o = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT);
        setHorizontalFadingEdgeEnabled(false);
        setWillNotDraw(false);
    }

    public final boolean a() {
        android.view.View childAt = getChildAt(0);
        return childAt != null && childAt.getWidth() > (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (!a()) {
            super.dispatchDraw(canvas);
            return;
        }
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int width = (childAt.getWidth() - getWidth()) + getPaddingLeft() + getPaddingRight();
        if (width <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        int i17 = this.f313712r;
        int i18 = this.f313706i;
        if (i17 != i18 || this.f313710p == null) {
            this.f313712r = i18;
            float f17 = i18;
            this.f313710p = new android.graphics.LinearGradient(0.0f, 0.0f, f17, 0.0f, -16777216, 0, android.graphics.Shader.TileMode.CLAMP);
            this.f313711q = new android.graphics.LinearGradient(0.0f, 0.0f, f17, 0.0f, 0, -16777216, android.graphics.Shader.TileMode.CLAMP);
        }
        int scrollX = getScrollX();
        boolean z17 = scrollX > 0;
        boolean z18 = scrollX < width;
        if (!z17 && !z18) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.RectF rectF = this.f313708n;
        float f18 = scrollX;
        rectF.set(f18, 0.0f, getWidth() + scrollX, getHeight());
        int saveLayer = canvas.saveLayer(rectF, null);
        super.dispatchDraw(canvas);
        android.graphics.Paint paint = this.f313707m;
        paint.setXfermode(this.f313709o);
        if (z17) {
            int save = canvas.save();
            canvas.translate(f18, 0.0f);
            paint.setShader(this.f313710p);
            canvas.drawRect(0.0f, 0.0f, i18, getHeight(), paint);
            canvas.restoreToCount(save);
        }
        if (z18) {
            int save2 = canvas.save();
            canvas.translate((scrollX + getWidth()) - i18, 0.0f);
            paint.setShader(this.f313711q);
            canvas.drawRect(0.0f, 0.0f, i18, getHeight(), paint);
            canvas.restoreToCount(save2);
        }
        paint.setXfermode(null);
        paint.setShader(null);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (!a()) {
            return false;
        }
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f313702e = ev6.getX();
            this.f313703f = ev6.getY();
            this.f313704g = false;
            super.onInterceptTouchEvent(ev6);
            return false;
        }
        if (actionMasked != 2) {
            return false;
        }
        float abs = java.lang.Math.abs(ev6.getX() - this.f313702e);
        float abs2 = java.lang.Math.abs(ev6.getY() - this.f313703f);
        if (abs <= this.f313701d || abs <= abs2) {
            return false;
        }
        this.f313704g = true;
        android.os.Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f313705h);
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(ev6.getDownTime(), ev6.getEventTime(), 0, this.f313702e, this.f313703f, 0);
        super.onTouchEvent(obtain);
        obtain.recycle();
        return true;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77;
        super.onScrollChanged(i17, i18, i19, i27);
        java.lang.Object parent = getParent();
        while (true) {
            if (!(parent instanceof android.view.View)) {
                c22095x76baed77 = null;
                break;
            } else {
                if (parent instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77) {
                    c22095x76baed77 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77) parent;
                    break;
                }
                parent = ((android.view.View) parent).getParent();
            }
        }
        if (c22095x76baed77 != null && c22095x76baed77.f286202p) {
            c22095x76baed77.removeCallbacks(c22095x76baed77.H);
            if (c22095x76baed77.f286206t == null) {
                c22095x76baed77.G = true;
                c22095x76baed77.k();
                java.lang.Runnable runnable = c22095x76baed77.V;
                c22095x76baed77.removeCallbacks(runnable);
                c22095x76baed77.postDelayed(runnable, 120L);
            }
            c22095x76baed77.v();
        }
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (a()) {
            return super.onTouchEvent(ev6);
        }
        return false;
    }
}
