package al5;

/* loaded from: classes14.dex */
public class f0 extends com.p314xaae8f345.mm.ui.p2740x696c9db.w4 implements vj5.l {

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f87421e;

    /* renamed from: f, reason: collision with root package name */
    public final al5.e0 f87422f;

    /* renamed from: i, reason: collision with root package name */
    public int f87425i;

    /* renamed from: m, reason: collision with root package name */
    public int f87426m;

    /* renamed from: n, reason: collision with root package name */
    public final int f87427n;

    /* renamed from: o, reason: collision with root package name */
    public int f87428o;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f87430q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f87431r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f87432s;

    /* renamed from: t, reason: collision with root package name */
    public al5.d0 f87433t;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f87423g = new android.graphics.Rect();

    /* renamed from: h, reason: collision with root package name */
    public boolean f87424h = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f87429p = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f87434u = true;

    public f0(android.view.View view, al5.e0 e0Var, boolean z17) {
        this.f87430q = false;
        this.f87421e = view;
        android.app.Activity activity = (android.app.Activity) view.getContext();
        this.f292406d = activity;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        this.f87422f = e0Var;
        this.f87430q = z17;
        this.f87427n = com.p314xaae8f345.mm.ui.bk.j(view.getContext()) * 2;
        this.f87428o = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.b(view.getContext(), true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.w4
    public void b(int i17, boolean z17) {
        al5.e0 e0Var = this.f87422f;
        if (z17) {
            this.f87428o = i17;
            e0Var.J2(true, i17);
        } else {
            e0Var.J2(false, this.f87428o);
        }
        al5.d0 d0Var = this.f87433t;
        if (d0Var != null) {
            d0Var.a(z17);
        }
    }

    public void c() {
        if (fp.h.c(30) && this.f87434u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputPanelHelper", "close. observer:%s", this);
            if (com.p314xaae8f345.mm.ui.b4.c(this.f87421e.getContext()) && this.f87430q) {
                vj5.n.b(a()).f(this);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.b5.f291830a.b(this);
            }
        }
    }

    public void d(int i17) {
        android.view.View view = this.f87421e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(view.getContext())) {
            if (!((fp.h.c(24) && (view.getContext() instanceof android.app.Activity)) ? ((android.app.Activity) view.getContext()).isInMultiWindowMode() : false)) {
                int i18 = this.f87425i;
                android.graphics.Rect rect = this.f87423g;
                int i19 = rect.bottom;
                this.f87425i = android.view.View.MeasureSpec.getSize(i17);
                view.getWindowVisibleDisplayFrame(rect);
                if (!this.f87424h) {
                    this.f87424h = i19 != rect.bottom;
                }
                int i27 = rect.bottom;
                int i28 = this.f87426m;
                int i29 = this.f87427n;
                if (i27 > i28 - i29) {
                    this.f87426m = i27;
                }
                int i37 = this.f87426m - i27;
                boolean z17 = i37 > i29;
                if (z17) {
                    this.f87428o = i37;
                }
                if (this.f87424h && z17 != this.f87429p && (fp.h.a(30) || !this.f87434u)) {
                    al5.e0 e0Var = this.f87422f;
                    if (i37 == i29) {
                        e0Var.J2(false, this.f87428o - i37);
                        al5.d0 d0Var = this.f87433t;
                        if (d0Var != null) {
                            d0Var.a(false);
                        }
                    } else {
                        e0Var.J2(z17, this.f87428o);
                        al5.d0 d0Var2 = this.f87433t;
                        if (d0Var2 != null) {
                            d0Var2.a(z17);
                        }
                    }
                }
                this.f87429p = z17;
                if ((!this.f87424h || i18 <= this.f87425i + i29) && i18 >= this.f87425i - i29) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputPanelHelper", "onMeasure: run, %s", java.lang.Boolean.valueOf(z17));
                this.f87424h = false;
                if (z17) {
                    java.lang.Runnable runnable = this.f87431r;
                    if (runnable != null) {
                        runnable.run();
                        this.f87431r = null;
                        return;
                    }
                    return;
                }
                java.lang.Runnable runnable2 = this.f87432s;
                if (runnable2 != null) {
                    runnable2.run();
                    this.f87432s = null;
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputPanelHelper", "onMeasure: delay call runnable");
    }

    public void e(java.lang.Runnable runnable) {
        this.f87432s = runnable;
        this.f87431r = null;
        this.f87421e.postDelayed(new al5.c0(this), 200L);
    }

    public void f(java.lang.Runnable runnable) {
        this.f87431r = runnable;
        this.f87432s = null;
        this.f87421e.postDelayed(new al5.b0(this), 200L);
    }

    @Override // vj5.l
    public void f4(int i17, int i18, int i19, e3.d dVar, android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        boolean isVisible = windowInsets.isVisible(android.view.WindowInsets.Type.ime());
        android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.ime());
        if (fp.e0.h()) {
            insets = android.graphics.Insets.max(insets, windowInsets.getInsets(256));
            isVisible = isVisible || windowInsets.isVisible(256);
        }
        android.graphics.Insets max = android.graphics.Insets.max(android.graphics.Insets.subtract(insets, windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars())), android.graphics.Insets.NONE);
        int i27 = max.bottom - max.top;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputPanelHelper", "onSystemBarHeightChange %s, %s", java.lang.Boolean.valueOf(isVisible), java.lang.Integer.valueOf(i27));
        b(i27, isVisible);
    }

    public void g() {
        if (fp.h.c(30) && this.f87434u) {
            android.view.View view = this.f87421e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InputPanelHelper", "start: observer:%s，context:%s", this, view.getContext());
            if (com.p314xaae8f345.mm.ui.b4.c(view.getContext()) && this.f87430q) {
                vj5.n.b(a()).d(this);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.b5.f291830a.a(this, (android.app.Activity) view.getContext(), true);
            }
        }
    }

    @Override // vj5.k
    public void n6(int i17) {
    }
}
