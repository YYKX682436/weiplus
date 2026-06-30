package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class n0 implements com.tencent.mm.plugin.appbrand.platform.window.activity.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f87607a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f87608b = this;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f87609c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.Configuration f87610d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87611e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.WindowInsets[] f87612f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.g f87613g;

    public n0(android.app.Activity activity) {
        this.f87609c = android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper());
        boolean z17 = false;
        this.f87611e = false;
        this.f87612f = new android.view.WindowInsets[4];
        this.f87607a = activity;
        this.f87610d = new android.content.res.Configuration(activity.getResources().getConfiguration());
        android.view.View decorView = activity.getWindow() == null ? null : activity.getWindow().getDecorView();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(a());
        objArr[1] = activity.getLocalClassName();
        if (decorView != null && decorView.isAttachedToWindow()) {
            z17 = true;
        }
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", "<init> hasCutOut[%b] activity[%s], isDecorViewAttached[%b]", objArr);
        if (decorView == null || decorView.isAttachedToWindow()) {
            return;
        }
        decorView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.platform.window.activity.n0.this.a();
            }
        });
    }

    public static boolean e(android.view.WindowInsets windowInsets) {
        android.view.DisplayCutout displayCutout;
        java.util.List<android.graphics.Rect> boundingRects;
        return (windowInsets == null || (displayCutout = windowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.size() <= 0) ? false : true;
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public boolean a() {
        android.view.WindowInsets windowInsets;
        final android.view.View decorView = this.f87607a.getWindow().getDecorView();
        final int rotation = com.tencent.mm.plugin.appbrand.platform.window.activity.a.a(this.f87607a).getRotation();
        synchronized (this.f87608b) {
            windowInsets = this.f87612f[rotation];
        }
        if (windowInsets != null) {
            boolean e17 = e(windowInsets);
            this.f87611e = e17;
            return e17;
        }
        if (!decorView.isAttachedToWindow()) {
            com.tencent.mm.ui.qk c17 = com.tencent.mm.ui.qk.c(this.f87607a, true);
            c17.a(new com.tencent.mm.plugin.appbrand.platform.window.activity.o0(this, rotation, decorView, c17));
        } else if (com.tencent.mm.sdk.platformtools.u3.e()) {
            android.view.WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            synchronized (this.f87608b) {
                this.f87612f[rotation] = rootWindowInsets;
                this.f87611e = e(rootWindowInsets);
            }
        } else {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            final android.view.WindowInsets[] windowInsetsArr = {null};
            this.f87609c.postAtFrontOfQueue(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.platform.window.activity.n0 n0Var = com.tencent.mm.plugin.appbrand.platform.window.activity.n0.this;
                    android.view.WindowInsets[] windowInsetsArr2 = windowInsetsArr;
                    android.view.View view = decorView;
                    int i17 = rotation;
                    java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                    n0Var.getClass();
                    windowInsetsArr2[0] = view.getRootWindowInsets();
                    synchronized (n0Var.f87608b) {
                        n0Var.f87612f[i17] = windowInsetsArr2[0];
                        n0Var.f87611e = com.tencent.mm.plugin.appbrand.platform.window.activity.n0.e(windowInsetsArr2[0]);
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                countDownLatch.await(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", "hasCutout await main thread failed, %s", e18);
            }
        }
        return this.f87611e;
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public void b(android.view.WindowManager.LayoutParams layoutParams) {
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public int c() {
        android.app.Activity activity = this.f87607a;
        if (activity == null) {
            return 0;
        }
        nf.y yVar = nf.x.f336616b;
        return yVar != null ? yVar.c(activity) : com.tencent.mm.ui.v9.b(activity);
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.m0
    public void d(android.content.res.Configuration configuration) {
        android.content.res.Configuration configuration2 = this.f87610d;
        if ((configuration2 != null && configuration != null && configuration2.screenWidthDp == configuration.screenWidthDp && configuration2.screenHeightDp == configuration.screenHeightDp && configuration2.smallestScreenWidthDp == configuration.smallestScreenWidthDp) ? false : true) {
            com.tencent.mm.plugin.appbrand.platform.window.activity.g gVar = this.f87613g;
            if (gVar != null) {
                gVar.a();
            } else {
                this.f87613g = new com.tencent.mm.plugin.appbrand.platform.window.activity.g(new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        android.view.Window window = com.tencent.mm.plugin.appbrand.platform.window.activity.n0.this.f87607a.getWindow();
                        if (window == null) {
                            return null;
                        }
                        return window.getDecorView();
                    }
                }, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.platform.window.activity.n0 n0Var = com.tencent.mm.plugin.appbrand.platform.window.activity.n0.this;
                        n0Var.getClass();
                        boolean e17 = com.tencent.mm.sdk.platformtools.u3.e();
                        synchronized (n0Var.f87608b) {
                            for (int i17 = 0; i17 <= 3; i17++) {
                                n0Var.f87612f[i17] = null;
                            }
                        }
                        if (e17) {
                            try {
                                com.tencent.mm.ui.qk c17 = com.tencent.mm.ui.qk.c(n0Var.f87607a, true);
                                c17.a(new com.tencent.mm.plugin.appbrand.platform.window.activity.p0(n0Var, c17));
                                n0Var.f87607a.getWindow().getDecorView().requestApplyInsets();
                            } catch (java.lang.Exception e18) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", e18, "resetCache", new java.lang.Object[0]);
                            }
                        }
                    }
                });
            }
            this.f87613g.b();
        }
        this.f87610d = new android.content.res.Configuration(configuration);
    }
}
