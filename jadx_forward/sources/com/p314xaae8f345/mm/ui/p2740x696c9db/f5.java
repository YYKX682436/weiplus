package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public class f5 extends com.p314xaae8f345.mm.ui.p2740x696c9db.w4 {

    /* renamed from: x, reason: collision with root package name */
    public static int f291932x = 1;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.ui.p2740x696c9db.c5 f291933e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.ui.p2740x696c9db.g5 f291934f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f291935g;

    /* renamed from: m, reason: collision with root package name */
    public volatile android.view.View f291938m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.app.Activity f291939n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f291940o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f291941p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f291943r;

    /* renamed from: s, reason: collision with root package name */
    public int f291944s;

    /* renamed from: t, reason: collision with root package name */
    public int f291945t;

    /* renamed from: u, reason: collision with root package name */
    public volatile int f291946u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f291947v;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f291936h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f291937i = new android.graphics.Rect();

    /* renamed from: q, reason: collision with root package name */
    public boolean f291942q = false;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f291948w = true;

    /* JADX WARN: Multi-variable type inference failed */
    public f5(android.app.Activity activity) {
        this.f291943r = true;
        this.f291939n = activity;
        this.f292406d = activity;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        if (activity instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) activity).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.ui.tools.KeyboardHeightProvider$1
                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onDestroy */
                public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "onDestroy: addObserver ");
                    com.p314xaae8f345.mm.ui.p2740x696c9db.f5.this.d();
                    com.p314xaae8f345.mm.ui.p2740x696c9db.f5.this.f291939n = null;
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "KeyboardHeightProvider: activity is not MMFragmentActivity:%s", activity);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if ((activity.getWindow().getAttributes().softInputMode & 240) != 48) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "activity soft input should be adjust nothing");
            this.f291943r = false;
        }
        this.f291938m = activity.findViewById(android.R.id.content);
        this.f291940o = new com.p314xaae8f345.mm.ui.p2740x696c9db.d5(this);
        this.f291941p = new com.p314xaae8f345.mm.ui.p2740x696c9db.e5(this);
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        if (identifier > 0) {
            this.f291946u = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f291947v = i65.a.b(activity, 96);
    }

    public static void c(com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var) {
        int i17;
        android.view.DisplayCutout displayCutout;
        int safeInsetBottom;
        f5Var.f291935g.getWindowVisibleDisplayFrame(f5Var.f291936h);
        f5Var.f291938m.getWindowVisibleDisplayFrame(f5Var.f291937i);
        int i18 = f5Var.f291936h.bottom;
        if (i18 > f5Var.f291944s) {
            f5Var.f291944s = i18;
        }
        int i19 = f5Var.f291937i.bottom;
        if (i19 > f5Var.f291945t) {
            f5Var.f291945t = i19;
        }
        int i27 = f5Var.f291945t;
        int i28 = f5Var.f291944s;
        int i29 = i27 - i28;
        boolean z17 = true;
        if (f5Var.f291943r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == true, %s, %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(f5Var.f291936h.bottom));
            i17 = f5Var.f291937i.bottom - f5Var.f291936h.bottom;
            if (fp.h.c(28) && f5Var.f291938m.getRootWindowInsets() != null && (displayCutout = f5Var.f291938m.getRootWindowInsets().getDisplayCutout()) != null && (safeInsetBottom = displayCutout.getSafeInsetBottom()) == i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: has cutout bottom, %s", java.lang.Integer.valueOf(safeInsetBottom));
                i17 -= safeInsetBottom;
            }
            if (i17 == f5Var.f291946u && f5Var.f291946u != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: navigationHeight %d, %d, %d", java.lang.Integer.valueOf(f5Var.f291944s), java.lang.Integer.valueOf(f5Var.f291945t), java.lang.Integer.valueOf(f5Var.f291946u));
                i17 -= f5Var.f291946u;
                jx3.f.INSTANCE.t(1062, 5);
            }
            if (i17 == i29 && i29 > 0 && i29 < f5Var.f291947v) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: max bottom diff %d, %d, %d", java.lang.Integer.valueOf(f5Var.f291944s), java.lang.Integer.valueOf(f5Var.f291945t), java.lang.Integer.valueOf(i29));
                i17 -= i29;
                jx3.f.INSTANCE.t(1062, 6);
            }
            if (i17 != 0 || f5Var.f291945t - f5Var.f291937i.bottom <= f5Var.f291947v) {
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: adjust nothing not work!");
                i17 = f5Var.f291945t - f5Var.f291937i.bottom;
                jx3.f.INSTANCE.t(1062, 7);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == false, %s, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(f5Var.f291936h.bottom));
            i17 = f5Var.f291944s - f5Var.f291936h.bottom;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", f5Var.f291936h.toShortString(), f5Var.f291937i.toShortString());
        f5Var.e(i17, z17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.w4
    public void b(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "onNotifyKeyBoardHeightChange() called with: height = [" + i17 + "], isShow = [" + z17 + "]");
        e(i17, this.f291943r ^ true);
        if (this.f291934f != null) {
            ((te2.y1) this.f291934f).getClass();
            gk2.e eVar = dk2.ef.I;
            if (eVar == null || (c14227x4262fb44 = ((mm2.e1) eVar.a(mm2.e1.class)).B) == null) {
                return;
            }
            c14227x4262fb44.mo7808x76db6cb1(java.lang.Boolean.valueOf(z17));
        }
    }

    public void d() {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "close: ");
        if (this.f291939n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "close: activity is null");
            return;
        }
        int i17 = f291932x;
        int i18 = 31;
        if (i17 != 1 && i17 == 0) {
            i18 = 30;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "close: version:%s", java.lang.Integer.valueOf(i18));
        if (fp.h.c(i18)) {
            if (fp.h.c(30)) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.b5.f291830a.b(this);
                return;
            }
            return;
        }
        if (this.f291938m != null) {
            this.f291938m.getViewTreeObserver().removeOnGlobalLayoutListener(this.f291941p);
        }
        if (this.f291942q && (view = this.f291935g) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f291940o);
            try {
                this.f291939n.getWindowManager().removeView(this.f291935g);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
            }
            this.f291935g = null;
        }
        this.f291942q = false;
    }

    public final void e(int i17, boolean z17) {
        if (this.f291933e != null) {
            this.f291933e.w2(i17, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "notifyKeyboardHeightChanged: observer is null, height=%d, isResized=%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        }
    }

    public void f() {
        if (this.f291939n == null || this.f291939n.getWindow() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity or activity.getWindow() is null");
            return;
        }
        if ((this.f291939n.getWindow().getAttributes().softInputMode & 240) != 48) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
            this.f291943r = false;
        } else {
            this.f291943r = true;
        }
        if (this.f291938m == null) {
            this.f291938m = this.f291939n.findViewById(android.R.id.content);
        }
        int i17 = f291932x;
        int i18 = 31;
        if (i17 != 1 && i17 == 0) {
            i18 = 30;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "start: version:%s", java.lang.Integer.valueOf(i18));
        if (fp.h.c(i18) && this.f291948w) {
            if (fp.h.c(30)) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.b5.f291830a.a(this, this.f291939n, false);
                return;
            }
            return;
        }
        if (this.f291938m != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "start: %s, %s", java.lang.Boolean.valueOf(this.f291942q), this.f291938m.getWindowToken());
            if (this.f291942q || this.f291938m.getWindowToken() == null || this.f291939n.isFinishing()) {
                return;
            }
            this.f291942q = true;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.f291939n);
            this.f291935g = linearLayout;
            linearLayout.setBackgroundColor(0);
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(1003, 131096, 1);
            layoutParams.width = 0;
            layoutParams.height = -1;
            layoutParams.gravity = 8388659;
            layoutParams.softInputMode = 16;
            layoutParams.setTitle("KeyboardWindow@" + hashCode());
            try {
                this.f291939n.getWindowManager().addView(this.f291935g, layoutParams);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
                this.f291942q = false;
                this.f291935g = null;
            }
            if (this.f291942q) {
                this.f291935g.getViewTreeObserver().addOnGlobalLayoutListener(this.f291940o);
                this.f291938m.getViewTreeObserver().addOnGlobalLayoutListener(this.f291941p);
            }
            this.f291944s = 0;
            this.f291945t = 0;
            if ((this.f291939n.getWindow().getAttributes().softInputMode & 240) == 48) {
                this.f291943r = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
                this.f291943r = false;
            }
        }
    }
}
