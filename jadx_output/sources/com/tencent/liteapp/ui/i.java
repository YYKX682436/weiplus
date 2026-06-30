package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class i extends com.tencent.liteapp.ui.a {

    /* renamed from: b, reason: collision with root package name */
    public volatile com.tencent.liteapp.ui.f f46169b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f46170c;

    /* renamed from: f, reason: collision with root package name */
    public volatile android.view.View f46173f;

    /* renamed from: g, reason: collision with root package name */
    public volatile android.app.Activity f46174g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f46175h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f46176i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f46178k;

    /* renamed from: l, reason: collision with root package name */
    public int f46179l;

    /* renamed from: m, reason: collision with root package name */
    public int f46180m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f46181n;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f46182o;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f46171d = new android.graphics.Rect();

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f46172e = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public boolean f46177j = false;

    /* JADX WARN: Multi-variable type inference failed */
    public i(android.app.Activity activity) {
        this.f46178k = true;
        this.f46174g = activity;
        this.f46125a = activity;
        kd.c.c("LiteApp.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        if (activity instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) activity).mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.liteapp.ui.KeyboardHeightProvider$1
                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onDestroy(androidx.lifecycle.y yVar) {
                    kd.c.c("LiteApp.KeyboardHeightProvider", "onDestroy: addObserver ", new java.lang.Object[0]);
                    com.tencent.liteapp.ui.i.this.c();
                    com.tencent.liteapp.ui.i.this.f46174g = null;
                }
            });
        } else {
            kd.c.e("LiteApp.KeyboardHeightProvider", "KeyboardHeightProvider: activity is not MMFragmentActivity:%s", activity);
        }
        if ((activity.getWindow().getAttributes().softInputMode & 240) != 48) {
            kd.c.e("LiteApp.KeyboardHeightProvider", "activity soft input should be adjust nothing", new java.lang.Object[0]);
            this.f46178k = false;
        }
        this.f46173f = activity.findViewById(android.R.id.content);
        this.f46175h = new com.tencent.liteapp.ui.g(this);
        this.f46176i = new com.tencent.liteapp.ui.h(this);
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        if (identifier > 0) {
            this.f46181n = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f46182o = java.lang.Math.round(activity.getResources().getDisplayMetrics().density * 96.0f);
    }

    public static void b(com.tencent.liteapp.ui.i iVar) {
        int i17;
        int i18;
        boolean z17;
        int i19;
        android.view.DisplayCutout displayCutout;
        int safeInsetBottom;
        iVar.f46170c.getWindowVisibleDisplayFrame(iVar.f46171d);
        iVar.f46173f.getWindowVisibleDisplayFrame(iVar.f46172e);
        int i27 = iVar.f46171d.bottom;
        if (i27 > iVar.f46179l) {
            iVar.f46179l = i27;
        }
        int i28 = iVar.f46172e.bottom;
        if (i28 > iVar.f46180m) {
            iVar.f46180m = i28;
        }
        int i29 = iVar.f46180m;
        int i37 = iVar.f46179l;
        int i38 = i29 - i37;
        if (iVar.f46178k) {
            kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == true, %s, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(iVar.f46171d.bottom));
            i19 = iVar.f46172e.bottom - iVar.f46171d.bottom;
            if (android.os.Build.VERSION.SDK_INT >= 28 && iVar.f46173f.getRootWindowInsets() != null && (displayCutout = iVar.f46173f.getRootWindowInsets().getDisplayCutout()) != null && (safeInsetBottom = displayCutout.getSafeInsetBottom()) == i19) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: has cutout bottom, %s", java.lang.Integer.valueOf(safeInsetBottom));
                i19 -= safeInsetBottom;
            }
            if (i19 == iVar.f46181n && iVar.f46181n != 0) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: navigationHeight %d, %d, %d", java.lang.Integer.valueOf(iVar.f46179l), java.lang.Integer.valueOf(iVar.f46180m), java.lang.Integer.valueOf(iVar.f46181n));
                i19 -= iVar.f46181n;
            }
            if (i19 == i38 && i38 > 0 && i38 < iVar.f46182o) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: max bottom diff %d, %d, %d", java.lang.Integer.valueOf(iVar.f46179l), java.lang.Integer.valueOf(iVar.f46180m), java.lang.Integer.valueOf(i38));
                i19 -= i38;
            }
            z17 = false;
            if (i19 == 0 && iVar.f46180m - iVar.f46172e.bottom > iVar.f46182o) {
                kd.c.e("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: adjust nothing not work!", new java.lang.Object[0]);
                i17 = iVar.f46180m;
                i18 = iVar.f46172e.bottom;
            }
            kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", iVar.f46171d.toShortString(), iVar.f46172e.toShortString());
            iVar.d(i19, z17);
        }
        kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == false, %s, %s", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(iVar.f46171d.bottom));
        i17 = iVar.f46179l;
        i18 = iVar.f46171d.bottom;
        i19 = i17 - i18;
        z17 = true;
        kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", iVar.f46171d.toShortString(), iVar.f46172e.toShortString());
        iVar.d(i19, z17);
    }

    public void c() {
        android.view.View view;
        android.view.Window window;
        kd.c.c("LiteApp.KeyboardHeightProvider", "close: ", new java.lang.Object[0]);
        if (this.f46174g == null) {
            kd.c.e("LiteApp.KeyboardHeightProvider", "close: activity is null", new java.lang.Object[0]);
            return;
        }
        kd.c.c("LiteApp.KeyboardHeightProvider", "close: version:%s", 31);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 31) {
            if (this.f46173f != null) {
                this.f46173f.getViewTreeObserver().removeOnGlobalLayoutListener(this.f46176i);
            }
            if (this.f46177j && (view = this.f46170c) != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f46175h);
                try {
                    this.f46174g.getWindowManager().removeView(this.f46170c);
                } catch (java.lang.Exception e17) {
                    kd.c.b("LiteApp.KeyboardHeightProvider", e17.toString(), new java.lang.Object[0]);
                }
                this.f46170c = null;
            }
            this.f46177j = false;
            return;
        }
        if (i17 >= 30) {
            java.util.Set set = com.tencent.liteapp.ui.e.f46147a;
            kd.c.c("LiteApp.KeyBoardHeightProviderUtil", "unRegister: activity:%s observer:%s ", a(), this);
            com.tencent.liteapp.ui.e.f46147a.remove(this);
            android.app.Activity a17 = a();
            if (a17 == null || (window = a17.getWindow()) == null) {
                return;
            }
            android.view.View decorView = window.getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            decorView.post(new com.tencent.liteapp.ui.d(window));
        }
    }

    public final void d(int i17, boolean z17) {
        if (this.f46169b != null) {
            com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = (com.tencent.liteapp.WxaLiteAppWidgetAdapter) this.f46169b;
            wxaLiteAppWidgetAdapter.getClass();
            boolean z18 = i17 > 0;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("shown", java.lang.Boolean.valueOf(z18));
            hashMap.put("height", java.lang.Integer.valueOf(i17));
            kx5.n.h().j(wxaLiteAppWidgetAdapter.f45967f, "notifyKeyboardChanged", hashMap);
        }
    }
}
