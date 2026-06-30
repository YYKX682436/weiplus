package vj5;

/* loaded from: classes7.dex */
public class h extends android.widget.FrameLayout implements vj5.k {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f519233v = vj5.n.f519251k;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f519234d;

    /* renamed from: e, reason: collision with root package name */
    public vj5.n f519235e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f519236f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f519237g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f519238h;

    /* renamed from: i, reason: collision with root package name */
    public int f519239i;

    /* renamed from: m, reason: collision with root package name */
    public int f519240m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f519241n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f519242o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f519243p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f519244q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f519245r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f519246s;

    /* renamed from: t, reason: collision with root package name */
    public int f519247t;

    /* renamed from: u, reason: collision with root package name */
    public vj5.g f519248u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context instanceof android.content.MutableContextWrapper ? new vj5.f((android.content.MutableContextWrapper) context) : context);
        int i17 = vj5.f.f519227c;
        this.f519234d = new vj5.b(this);
        this.f519239i = 0;
        this.f519240m = 0;
        this.f519241n = false;
        this.f519242o = false;
        this.f519243p = false;
        this.f519244q = false;
        this.f519245r = false;
        this.f519246s = new int[2];
        this.f519247t = 0;
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.RuntimeException("Should be called on main-thread");
        }
        v();
        if (getContext() instanceof vj5.f) {
            ((vj5.f) getContext()).f519229b = new vj5.c(this);
        }
    }

    public void B(int i17, boolean z17, boolean z18) {
        android.app.Activity activity;
        int i18;
        vj5.g gVar = this.f519248u;
        if (gVar != null && i17 == gVar.f519230a && z17 == gVar.f519231b && z18 == gVar.f519232c) {
            return;
        }
        try {
            int i19 = this.f519239i;
            int i27 = this.f519240m;
            this.f519239i = i17;
            if (f519233v && (activity = this.f519236f) != null) {
                android.view.Window window = activity.getWindow();
                vj5.o.e(window);
                if (!z18) {
                    u75.d.g();
                } else if (!com.p314xaae8f345.mm.ui.v9.c(window, z17)) {
                    this.f519239i = z17 ? ((((int) ((((i17 >> 24) & 255) * 0.78f) + (255 * 0.22000003f))) & 255) << 24) | ((((int) ((((i17 >> 16) & 255) * 0.78f) + (0 * 0.22000003f))) & 255) << 16) | ((((int) ((((i17 >> 8) & 255) * 0.78f) + (0 * 0.22000003f))) & 255) << 8) | ((255 & ((int) (((i17 & 255) * 0.78f) + (0 * 0.22000003f)))) << 0) : i17;
                    this.f519240m = z17 ? android.graphics.Color.argb(51, 0, 0, 0) : 0;
                    i18 = this.f519239i;
                    if (i18 != 0 && this.f519240m == 0) {
                        super.setWillNotDraw(true);
                        u();
                    } else if (i19 == i18 || i27 != this.f519240m) {
                        super.setWillNotDraw(false);
                        u();
                    }
                }
                this.f519239i = i17;
                this.f519240m = 0;
                i18 = this.f519239i;
                if (i18 != 0) {
                }
                if (i19 == i18) {
                }
                super.setWillNotDraw(false);
                u();
            }
        } finally {
            this.f519248u = new vj5.g(i17, z17, z18);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.f519238h > 0 && f519233v && !this.f519241n && !willNotDraw()) {
            android.graphics.Paint paint = this.f519237g;
            if (paint == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DrawStatusBarFrameLayout", "drawStatusBarBackground NULL paint");
            } else {
                paint.setColor(this.f519239i);
                canvas.drawRect(0.0f, 0.0f, getWidth(), this.f519238h, this.f519237g);
            }
        }
        super.dispatchDraw(canvas);
        if (this.f519238h <= 0 || !f519233v || !this.f519241n || willNotDraw()) {
            return;
        }
        android.graphics.Paint paint2 = this.f519237g;
        if (paint2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DrawStatusBarFrameLayout", "drawStatusBarForeground NULL paint");
        } else {
            paint2.setColor(this.f519240m);
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.f519238h, this.f519237g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSystemUiVisibilityChanged(int i17) {
        super.dispatchSystemUiVisibilityChanged(i17);
        vj5.n nVar = this.f519235e;
        if (nVar == null) {
            return;
        }
        n6(nVar.f519259e);
    }

    /* renamed from: getDrawnStatusBarHeight */
    public int m172249x6b326eb4() {
        return java.lang.Math.max(0, this.f519238h);
    }

    public void n6(int i17) {
        q(i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vj5.n nVar = this.f519235e;
        if (nVar == null) {
            return;
        }
        n6(nVar.f519259e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f519235e == null || this.f519242o) {
            return;
        }
        int[] iArr = this.f519246s;
        getLocationInWindow(iArr);
        if (this.f519247t != iArr[1]) {
            this.f519235e.e();
        }
        this.f519247t = iArr[1];
    }

    public void q(int i17) {
        getLocationInWindow(this.f519246s);
        this.f519247t = this.f519246s[1];
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            int i18 = this.f519246s[0];
            int i19 = this.f519246s[1];
        }
        this.f519238h = java.lang.Math.max(0, i17 - java.lang.Math.max(t(this.f519246s[1]), 0));
        if (this.f519242o) {
            this.f519244q = true;
            return;
        }
        try {
            setPadding(0, this.f519241n ? 0 : this.f519238h, 0, 0);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DrawStatusBarFrameLayout", "applyStatusBarHeight setPadding e=%s", e17.getMessage());
        }
        if (isLayoutRequested()) {
            u();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f519242o) {
            this.f519245r = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(boolean z17) {
        this.f519241n = z17;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this)) {
            q(this.f519238h);
        }
    }

    /* renamed from: setLayoutFrozen */
    public final void m172250xf161ffec(boolean z17) {
        if (!(android.os.Looper.getMainLooper() == android.os.Looper.myLooper())) {
            post(new vj5.d(this, z17));
            return;
        }
        boolean z18 = z17 != this.f519242o;
        this.f519242o = z17;
        if (!z18 || z17) {
            return;
        }
        if (this.f519243p) {
            v();
            this.f519243p = false;
        }
        if (this.f519245r || this.f519244q) {
            q(this.f519238h);
            this.f519245r = false;
            this.f519244q = false;
        }
    }

    /* renamed from: setStatusBarColor */
    public void mo2242x7c84ae24(int i17) {
        if (f519233v) {
            android.app.Activity activity = this.f519236f;
            x(i17, activity == null ? false : vj5.o.h(activity.getWindow()));
        }
    }

    @Override // android.view.View
    public final void setWillNotDraw(boolean z17) {
    }

    public int t(int i17) {
        if (i17 == 0) {
            return 0;
        }
        android.view.View view = this;
        while (view != null) {
            i17 -= java.lang.Math.round(view.getTranslationY());
            view = view.getParent() instanceof android.view.View ? (android.view.View) view.getParent() : null;
        }
        return i17;
    }

    public void u() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public void v() {
        this.f519248u = null;
        if (!f519233v) {
            this.f519236f = null;
            this.f519237g = null;
            return;
        }
        setPadding(0, 0, 0, 0);
        this.f519238h = 0;
        vj5.n nVar = this.f519235e;
        if (nVar != null) {
            nVar.f(this);
        }
        android.app.Activity a17 = q75.a.a(getContext());
        this.f519236f = a17;
        if (a17 == null) {
            this.f519237g = null;
            super.setWillNotDraw(true);
            return;
        }
        vj5.n b17 = vj5.n.b(a17);
        this.f519235e = b17;
        b17.d(this);
        android.graphics.Paint paint = new android.graphics.Paint(0);
        this.f519237g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        super.setWillNotDraw(false);
    }

    @Override // android.view.View
    public final boolean willNotDraw() {
        return super.willNotDraw();
    }

    public void x(int i17, boolean z17) {
        B(i17, z17, true);
    }
}
