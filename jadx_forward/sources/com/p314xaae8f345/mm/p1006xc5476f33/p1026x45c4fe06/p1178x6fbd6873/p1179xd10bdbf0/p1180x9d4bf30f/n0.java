package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public class n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f169140a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f169141b = this;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f169142c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.Configuration f169143d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f169144e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.WindowInsets[] f169145f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.g f169146g;

    public n0(android.app.Activity activity) {
        this.f169142c = android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper());
        boolean z17 = false;
        this.f169144e = false;
        this.f169145f = new android.view.WindowInsets[4];
        this.f169140a = activity;
        this.f169143d = new android.content.res.Configuration(activity.getResources().getConfiguration());
        android.view.View decorView = activity.getWindow() == null ? null : activity.getWindow().getDecorView();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(a());
        objArr[1] = activity.getLocalClassName();
        if (decorView != null && decorView.isAttachedToWindow()) {
            z17 = true;
        }
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", "<init> hasCutOut[%b] activity[%s], isDecorViewAttached[%b]", objArr);
        if (decorView == null || decorView.isAttachedToWindow()) {
            return;
        }
        decorView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0.this.a();
            }
        });
    }

    public static boolean e(android.view.WindowInsets windowInsets) {
        android.view.DisplayCutout displayCutout;
        java.util.List<android.graphics.Rect> boundingRects;
        return (windowInsets == null || (displayCutout = windowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.size() <= 0) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0
    public boolean a() {
        android.view.WindowInsets windowInsets;
        final android.view.View decorView = this.f169140a.getWindow().getDecorView();
        final int rotation = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.a.a(this.f169140a).getRotation();
        synchronized (this.f169141b) {
            windowInsets = this.f169145f[rotation];
        }
        if (windowInsets != null) {
            boolean e17 = e(windowInsets);
            this.f169144e = e17;
            return e17;
        }
        if (!decorView.isAttachedToWindow()) {
            com.p314xaae8f345.mm.ui.qk c17 = com.p314xaae8f345.mm.ui.qk.c(this.f169140a, true);
            c17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.o0(this, rotation, decorView, c17));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            android.view.WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            synchronized (this.f169141b) {
                this.f169145f[rotation] = rootWindowInsets;
                this.f169144e = e(rootWindowInsets);
            }
        } else {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            final android.view.WindowInsets[] windowInsetsArr = {null};
            this.f169142c.postAtFrontOfQueue(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0.this;
                    android.view.WindowInsets[] windowInsetsArr2 = windowInsetsArr;
                    android.view.View view = decorView;
                    int i17 = rotation;
                    java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                    n0Var.getClass();
                    windowInsetsArr2[0] = view.getRootWindowInsets();
                    synchronized (n0Var.f169141b) {
                        n0Var.f169145f[i17] = windowInsetsArr2[0];
                        n0Var.f169144e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0.e(windowInsetsArr2[0]);
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                countDownLatch.await(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", "hasCutout await main thread failed, %s", e18);
            }
        }
        return this.f169144e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0
    public void b(android.view.WindowManager.LayoutParams layoutParams) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0
    public int c() {
        android.app.Activity activity = this.f169140a;
        if (activity == null) {
            return 0;
        }
        nf.y yVar = nf.x.f418149b;
        return yVar != null ? yVar.c(activity) : com.p314xaae8f345.mm.ui.v9.b(activity);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0
    public void d(android.content.res.Configuration configuration) {
        android.content.res.Configuration configuration2 = this.f169143d;
        if ((configuration2 != null && configuration != null && configuration2.screenWidthDp == configuration.screenWidthDp && configuration2.screenHeightDp == configuration.screenHeightDp && configuration2.smallestScreenWidthDp == configuration.smallestScreenWidthDp) ? false : true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.g gVar = this.f169146g;
            if (gVar != null) {
                gVar.a();
            } else {
                this.f169146g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.g(new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$b
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        android.view.Window window = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0.this.f169140a.getWindow();
                        if (window == null) {
                            return null;
                        }
                        return window.getDecorView();
                    }
                }, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.platform.window.activity.n0$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0.this;
                        n0Var.getClass();
                        boolean e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e();
                        synchronized (n0Var.f169141b) {
                            for (int i17 = 0; i17 <= 3; i17++) {
                                n0Var.f169145f[i17] = null;
                            }
                        }
                        if (e17) {
                            try {
                                com.p314xaae8f345.mm.ui.qk c17 = com.p314xaae8f345.mm.ui.qk.c(n0Var.f169140a, true);
                                c17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.p0(n0Var, c17));
                                n0Var.f169140a.getWindow().getDecorView().requestApplyInsets();
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.WindowAndroidActivityCutoutHandlerApi28", e18, "resetCache", new java.lang.Object[0]);
                            }
                        }
                    }
                });
            }
            this.f169146g.b();
        }
        this.f169143d = new android.content.res.Configuration(configuration);
    }
}
