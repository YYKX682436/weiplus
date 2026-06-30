package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class q5 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n5 f173158a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f173159b;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f173162e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f173163f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.x f173164g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f173165h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f173166i;

    /* renamed from: l, reason: collision with root package name */
    public int f173169l;

    /* renamed from: m, reason: collision with root package name */
    public int f173170m;

    /* renamed from: n, reason: collision with root package name */
    public int f173171n;

    /* renamed from: o, reason: collision with root package name */
    public final int f173172o;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f173160c = new android.graphics.Rect();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f173161d = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public boolean f173167j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f173168k = true;

    public q5(android.app.Activity activity) {
        this.f173163f = activity;
        c();
        this.f173162e = activity.findViewById(android.R.id.content);
        this.f173165h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o5(this);
        this.f173166i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p5(this);
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        if (identifier > 0) {
            this.f173171n = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f173172o = i65.a.b(activity, 96);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var) {
        int i17;
        android.view.DisplayCutout displayCutout;
        int safeInsetBottom;
        android.view.WindowInsets b17 = com.p314xaae8f345.mm.ui.qk.b(q5Var.f173163f);
        if (b17 != null) {
            q5Var.f173171n = b17.getStableInsetBottom();
        }
        android.view.View view = q5Var.f173159b;
        android.graphics.Rect rect = q5Var.f173160c;
        view.getWindowVisibleDisplayFrame(rect);
        android.view.View view2 = q5Var.f173162e;
        android.graphics.Rect rect2 = q5Var.f173161d;
        view2.getWindowVisibleDisplayFrame(rect2);
        int i18 = rect.bottom;
        if (i18 > q5Var.f173169l) {
            q5Var.f173169l = i18;
        }
        int i19 = rect2.bottom;
        if (i19 > q5Var.f173170m) {
            q5Var.f173170m = i19;
        }
        int i27 = q5Var.f173170m;
        int i28 = q5Var.f173169l;
        int i29 = i27 - i28;
        if (q5Var.f173168k) {
            i17 = i19 - i18;
            if (fp.h.c(28) && view2.getRootWindowInsets() != null && (displayCutout = view2.getRootWindowInsets().getDisplayCutout()) != null && (safeInsetBottom = displayCutout.getSafeInsetBottom()) == i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: has cutout bottom, %s", java.lang.Integer.valueOf(safeInsetBottom));
                i17 -= safeInsetBottom;
            }
            int i37 = q5Var.f173171n;
            if (i17 == i37 && i37 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: navigationHeight %d, %d, %d", java.lang.Integer.valueOf(q5Var.f173169l), java.lang.Integer.valueOf(q5Var.f173170m), java.lang.Integer.valueOf(q5Var.f173171n));
                i17 -= q5Var.f173171n;
            }
            int i38 = q5Var.f173172o;
            if (i17 == i29 && i29 > 0 && i29 < i38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: max bottom diff %d, %d, %d", java.lang.Integer.valueOf(q5Var.f173169l), java.lang.Integer.valueOf(q5Var.f173170m), java.lang.Integer.valueOf(i29));
                i17 -= i29;
            }
            if (i17 == 0 && q5Var.f173170m - rect2.bottom > i38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: adjust nothing not work!");
                i17 = q5Var.f173170m - rect2.bottom;
            }
        } else {
            i17 = i28 - i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", rect.toShortString(), rect2.toShortString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n5 n5Var = q5Var.f173158a;
        if (n5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h2 h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h2) n5Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = h2Var.f173011a;
            if (l2Var.f173061a != 2) {
                return;
            }
            if (i17 > 0) {
                android.view.View view3 = l2Var.f173067g;
                boolean h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2.h(view3 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : view3.getContext(), i17);
                l2Var.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f2(h2Var, i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j2 j2Var = l2Var.f173068h;
                if (j2Var != null && (h17 || j2Var.mo53489x1c4fb41d() != i17)) {
                    l2Var.f173068h.d(i17);
                }
            }
            boolean z17 = i17 > 0;
            if (l2Var.f173066f != z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j2 j2Var2 = l2Var.f173068h;
                if (j2Var2 != null) {
                    j2Var2.a(z17);
                }
                l2Var.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g2(h2Var, z17));
            }
            l2Var.f173066f = z17;
        }
    }

    public void b() {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "close: ");
        this.f173162e.getViewTreeObserver().removeOnGlobalLayoutListener(this.f173166i);
        if (this.f173167j && (view = this.f173159b) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f173165h);
            try {
                this.f173163f.getWindowManager().removeView(this.f173159b);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
            }
            this.f173159b = null;
        }
        this.f173167j = false;
    }

    public final void c() {
        if ((this.f173163f.getWindow().getAttributes().softInputMode & 240) == 48) {
            this.f173168k = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "activity soft input should be adjust nothing");
            this.f173168k = false;
        }
    }

    public void d() {
        c();
        android.view.View view = this.f173162e;
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KeyboardHeightProvider", "start: %s, %s", java.lang.Boolean.valueOf(this.f173167j), view.getWindowToken());
            if (this.f173167j || view.getWindowToken() == null) {
                return;
            }
            android.app.Activity activity = this.f173163f;
            if (activity.isFinishing()) {
                return;
            }
            this.f173167j = true;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activity);
            this.f173159b = linearLayout;
            linearLayout.setBackgroundColor(0);
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(1003, 131096, 1);
            layoutParams.width = 0;
            layoutParams.height = -1;
            layoutParams.gravity = 8388659;
            layoutParams.softInputMode = 16;
            layoutParams.setTitle("KeyboardWindow@" + hashCode());
            try {
                activity.getWindowManager().addView(this.f173159b, layoutParams);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KeyboardHeightProvider", e17, "", new java.lang.Object[0]);
                this.f173167j = false;
                this.f173159b = null;
            }
            if (this.f173167j) {
                this.f173159b.getViewTreeObserver().addOnGlobalLayoutListener(this.f173165h);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.f173166i);
            }
            this.f173169l = 0;
            this.f173170m = 0;
            if ((activity.getWindow().getAttributes().softInputMode & 240) == 48) {
                this.f173168k = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KeyboardHeightProvider", "start: activity soft input should be adjust nothing");
                this.f173168k = false;
            }
        }
    }
}
