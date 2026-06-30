package al5;

/* loaded from: classes14.dex */
public class f0 extends com.tencent.mm.ui.tools.w4 implements vj5.l {

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f5888e;

    /* renamed from: f, reason: collision with root package name */
    public final al5.e0 f5889f;

    /* renamed from: i, reason: collision with root package name */
    public int f5892i;

    /* renamed from: m, reason: collision with root package name */
    public int f5893m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5894n;

    /* renamed from: o, reason: collision with root package name */
    public int f5895o;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5897q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f5898r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f5899s;

    /* renamed from: t, reason: collision with root package name */
    public al5.d0 f5900t;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f5890g = new android.graphics.Rect();

    /* renamed from: h, reason: collision with root package name */
    public boolean f5891h = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5896p = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5901u = true;

    public f0(android.view.View view, al5.e0 e0Var, boolean z17) {
        this.f5897q = false;
        this.f5888e = view;
        android.app.Activity activity = (android.app.Activity) view.getContext();
        this.f210873d = activity;
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        this.f5889f = e0Var;
        this.f5897q = z17;
        this.f5894n = com.tencent.mm.ui.bk.j(view.getContext()) * 2;
        this.f5895o = com.tencent.mm.sdk.platformtools.d2.b(view.getContext(), true);
    }

    @Override // com.tencent.mm.ui.tools.w4
    public void b(int i17, boolean z17) {
        al5.e0 e0Var = this.f5889f;
        if (z17) {
            this.f5895o = i17;
            e0Var.J2(true, i17);
        } else {
            e0Var.J2(false, this.f5895o);
        }
        al5.d0 d0Var = this.f5900t;
        if (d0Var != null) {
            d0Var.a(z17);
        }
    }

    public void c() {
        if (fp.h.c(30) && this.f5901u) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InputPanelHelper", "close. observer:%s", this);
            if (com.tencent.mm.ui.b4.c(this.f5888e.getContext()) && this.f5897q) {
                vj5.n.b(a()).f(this);
            } else {
                com.tencent.mm.ui.tools.b5.f210297a.b(this);
            }
        }
    }

    public void d(int i17) {
        android.view.View view = this.f5888e;
        if (com.tencent.mm.sdk.platformtools.d2.j(view.getContext())) {
            if (!((fp.h.c(24) && (view.getContext() instanceof android.app.Activity)) ? ((android.app.Activity) view.getContext()).isInMultiWindowMode() : false)) {
                int i18 = this.f5892i;
                android.graphics.Rect rect = this.f5890g;
                int i19 = rect.bottom;
                this.f5892i = android.view.View.MeasureSpec.getSize(i17);
                view.getWindowVisibleDisplayFrame(rect);
                if (!this.f5891h) {
                    this.f5891h = i19 != rect.bottom;
                }
                int i27 = rect.bottom;
                int i28 = this.f5893m;
                int i29 = this.f5894n;
                if (i27 > i28 - i29) {
                    this.f5893m = i27;
                }
                int i37 = this.f5893m - i27;
                boolean z17 = i37 > i29;
                if (z17) {
                    this.f5895o = i37;
                }
                if (this.f5891h && z17 != this.f5896p && (fp.h.a(30) || !this.f5901u)) {
                    al5.e0 e0Var = this.f5889f;
                    if (i37 == i29) {
                        e0Var.J2(false, this.f5895o - i37);
                        al5.d0 d0Var = this.f5900t;
                        if (d0Var != null) {
                            d0Var.a(false);
                        }
                    } else {
                        e0Var.J2(z17, this.f5895o);
                        al5.d0 d0Var2 = this.f5900t;
                        if (d0Var2 != null) {
                            d0Var2.a(z17);
                        }
                    }
                }
                this.f5896p = z17;
                if ((!this.f5891h || i18 <= this.f5892i + i29) && i18 >= this.f5892i - i29) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.InputPanelHelper", "onMeasure: run, %s", java.lang.Boolean.valueOf(z17));
                this.f5891h = false;
                if (z17) {
                    java.lang.Runnable runnable = this.f5898r;
                    if (runnable != null) {
                        runnable.run();
                        this.f5898r = null;
                        return;
                    }
                    return;
                }
                java.lang.Runnable runnable2 = this.f5899s;
                if (runnable2 != null) {
                    runnable2.run();
                    this.f5899s = null;
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.InputPanelHelper", "onMeasure: delay call runnable");
    }

    public void e(java.lang.Runnable runnable) {
        this.f5899s = runnable;
        this.f5898r = null;
        this.f5888e.postDelayed(new al5.c0(this), 200L);
    }

    public void f(java.lang.Runnable runnable) {
        this.f5898r = runnable;
        this.f5899s = null;
        this.f5888e.postDelayed(new al5.b0(this), 200L);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.InputPanelHelper", "onSystemBarHeightChange %s, %s", java.lang.Boolean.valueOf(isVisible), java.lang.Integer.valueOf(i27));
        b(i27, isVisible);
    }

    public void g() {
        if (fp.h.c(30) && this.f5901u) {
            android.view.View view = this.f5888e;
            com.tencent.mars.xlog.Log.i("MicroMsg.InputPanelHelper", "start: observer:%s，context:%s", this, view.getContext());
            if (com.tencent.mm.ui.b4.c(view.getContext()) && this.f5897q) {
                vj5.n.b(a()).d(this);
            } else {
                com.tencent.mm.ui.tools.b5.f210297a.a(this, (android.app.Activity) view.getContext(), true);
            }
        }
    }

    @Override // vj5.k
    public void n6(int i17) {
    }
}
