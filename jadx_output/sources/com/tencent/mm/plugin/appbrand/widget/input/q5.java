package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class q5 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.n5 f91625a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f91626b;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f91629e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f91630f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.x f91631g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f91632h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f91633i;

    /* renamed from: l, reason: collision with root package name */
    public int f91636l;

    /* renamed from: m, reason: collision with root package name */
    public int f91637m;

    /* renamed from: n, reason: collision with root package name */
    public int f91638n;

    /* renamed from: o, reason: collision with root package name */
    public final int f91639o;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f91627c = new android.graphics.Rect();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f91628d = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public boolean f91634j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f91635k = true;

    public q5(android.app.Activity activity) {
        this.f91630f = activity;
        c();
        this.f91629e = activity.findViewById(android.R.id.content);
        this.f91632h = new com.tencent.mm.plugin.appbrand.widget.input.o5(this);
        this.f91633i = new com.tencent.mm.plugin.appbrand.widget.input.p5(this);
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        if (identifier > 0) {
            this.f91638n = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f91639o = i65.a.b(activity, 96);
    }

    public static void a(com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var) {
        int i17;
        android.view.DisplayCutout displayCutout;
        int safeInsetBottom;
        android.view.WindowInsets b17 = com.tencent.mm.ui.qk.b(q5Var.f91630f);
        if (b17 != null) {
            q5Var.f91638n = b17.getStableInsetBottom();
        }
        android.view.View view = q5Var.f91626b;
        android.graphics.Rect rect = q5Var.f91627c;
        view.getWindowVisibleDisplayFrame(rect);
        android.view.View view2 = q5Var.f91629e;
        android.graphics.Rect rect2 = q5Var.f91628d;
        view2.getWindowVisibleDisplayFrame(rect2);
        int i18 = rect.bottom;
        if (i18 > q5Var.f91636l) {
            q5Var.f91636l = i18;
        }
        int i19 = rect2.bottom;
        if (i19 > q5Var.f91637m) {
            q5Var.f91637m = i19;
        }
        int i27 = q5Var.f91637m;
        int i28 = q5Var.f91636l;
        int i29 = i27 - i28;
        if (q5Var.f91635k) {
            i17 = i19 - i18;
            if (fp.h.c(28) && view2.getRootWindowInsets() != null && (displayCutout = view2.getRootWindowInsets().getDisplayCutout()) != null && (safeInsetBottom = displayCutout.getSafeInsetBottom()) == i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: has cutout bottom, %s", java.lang.Integer.valueOf(safeInsetBottom));
                i17 -= safeInsetBottom;
            }
            int i37 = q5Var.f91638n;
            if (i17 == i37 && i37 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: navigationHeight %d, %d, %d", java.lang.Integer.valueOf(q5Var.f91636l), java.lang.Integer.valueOf(q5Var.f91637m), java.lang.Integer.valueOf(q5Var.f91638n));
                i17 -= q5Var.f91638n;
            }
            int i38 = q5Var.f91639o;
            if (i17 == i29 && i29 > 0 && i29 < i38) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: max bottom diff %d, %d, %d", java.lang.Integer.valueOf(q5Var.f91636l), java.lang.Integer.valueOf(q5Var.f91637m), java.lang.Integer.valueOf(i29));
                i17 -= i29;
            }
            if (i17 == 0 && q5Var.f91637m - rect2.bottom > i38) {
                com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: adjust nothing not work!");
                i17 = q5Var.f91637m - rect2.bottom;
            }
        } else {
            i17 = i28 - i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", rect.toShortString(), rect2.toShortString());
        com.tencent.mm.plugin.appbrand.widget.input.n5 n5Var = q5Var.f91625a;
        if (n5Var != null) {
            com.tencent.mm.plugin.appbrand.widget.input.h2 h2Var = (com.tencent.mm.plugin.appbrand.widget.input.h2) n5Var;
            com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = h2Var.f91478a;
            if (l2Var.f91528a != 2) {
                return;
            }
            if (i17 > 0) {
                android.view.View view3 = l2Var.f91534g;
                boolean h17 = com.tencent.mm.plugin.appbrand.widget.input.l2.h(view3 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : view3.getContext(), i17);
                l2Var.j(new com.tencent.mm.plugin.appbrand.widget.input.f2(h2Var, i17));
                com.tencent.mm.plugin.appbrand.widget.input.j2 j2Var = l2Var.f91535h;
                if (j2Var != null && (h17 || j2Var.getHeight() != i17)) {
                    l2Var.f91535h.d(i17);
                }
            }
            boolean z17 = i17 > 0;
            if (l2Var.f91533f != z17) {
                com.tencent.mm.plugin.appbrand.widget.input.j2 j2Var2 = l2Var.f91535h;
                if (j2Var2 != null) {
                    j2Var2.a(z17);
                }
                l2Var.j(new com.tencent.mm.plugin.appbrand.widget.input.g2(h2Var, z17));
            }
            l2Var.f91533f = z17;
        }
    }

    public void b() {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "close: ");
        this.f91629e.getViewTreeObserver().removeOnGlobalLayoutListener(this.f91633i);
        if (this.f91634j && (view = this.f91626b) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f91632h);
            try {
                this.f91630f.getWindowManager().removeView(this.f91626b);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
            }
            this.f91626b = null;
        }
        this.f91634j = false;
    }

    public final void c() {
        if ((this.f91630f.getWindow().getAttributes().softInputMode & 240) == 48) {
            this.f91635k = true;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "activity soft input should be adjust nothing");
            this.f91635k = false;
        }
    }

    public void d() {
        c();
        android.view.View view = this.f91629e;
        if (view != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardHeightProvider", "start: %s, %s", java.lang.Boolean.valueOf(this.f91634j), view.getWindowToken());
            if (this.f91634j || view.getWindowToken() == null) {
                return;
            }
            android.app.Activity activity = this.f91630f;
            if (activity.isFinishing()) {
                return;
            }
            this.f91634j = true;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activity);
            this.f91626b = linearLayout;
            linearLayout.setBackgroundColor(0);
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(1003, 131096, 1);
            layoutParams.width = 0;
            layoutParams.height = -1;
            layoutParams.gravity = 8388659;
            layoutParams.softInputMode = 16;
            layoutParams.setTitle("KeyboardWindow@" + hashCode());
            try {
                activity.getWindowManager().addView(this.f91626b, layoutParams);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
                this.f91634j = false;
                this.f91626b = null;
            }
            if (this.f91634j) {
                this.f91626b.getViewTreeObserver().addOnGlobalLayoutListener(this.f91632h);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.f91633i);
            }
            this.f91636l = 0;
            this.f91637m = 0;
            if ((activity.getWindow().getAttributes().softInputMode & 240) == 48) {
                this.f91635k = true;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
                this.f91635k = false;
            }
        }
    }
}
