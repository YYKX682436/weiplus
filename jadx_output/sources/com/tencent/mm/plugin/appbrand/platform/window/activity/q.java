package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class q implements com.tencent.mm.plugin.appbrand.platform.window.activity.j {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.platform.window.activity.r0 f87637a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f87638b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Activity f87639c;

    public q(com.tencent.mm.plugin.appbrand.platform.window.activity.r0 windowActivity) {
        kotlin.jvm.internal.o.g(windowActivity, "windowActivity");
        this.f87637a = windowActivity;
        this.f87638b = jz5.h.b(new com.tencent.mm.plugin.appbrand.platform.window.activity.l(this));
        this.f87639c = windowActivity.w();
    }

    @Override // xi1.p
    public xi1.o a() {
        android.view.Display defaultDisplay;
        if (this.f87639c != null) {
            return c().a();
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) b3.l.getSystemService(this.f87637a.f87645d, android.view.WindowManager.class);
        java.lang.Integer valueOf = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? null : java.lang.Integer.valueOf(defaultDisplay.getRotation());
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            return xi1.o.PORTRAIT;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return xi1.o.LANDSCAPE_LEFT;
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            return xi1.o.LANDSCAPE_RIGHT;
        }
        return null;
    }

    @Override // xi1.p
    public void b(xi1.o oVar, xi1.n nVar) {
        android.app.Activity activity = this.f87639c;
        if (activity == null) {
            if (nVar != null) {
                nVar.e(a(), false);
                return;
            }
            return;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", "requestDeviceOrientation but activity(" + activity + ") destroyed");
            if (nVar != null) {
                nVar.e(c().a(), false);
                return;
            }
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = this.f87637a;
        if (i17 < 26 || !activity.isInPictureInPictureMode()) {
            android.view.Window window = activity.getWindow();
            android.view.View decorView = window != null ? window.getDecorView() : null;
            if (decorView != null) {
                android.view.ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
                    if (oVar != null) {
                        oVar.name();
                    }
                    r0Var.getClass();
                    c().b(oVar, new com.tencent.mm.plugin.appbrand.platform.window.activity.p(atomicBoolean, decorView, nVar, this));
                    atomicBoolean.set(false);
                    return;
                }
            }
            c().b(oVar, nVar);
            return;
        }
        if (oVar != null) {
            oVar.name();
        }
        r0Var.getClass();
        int i18 = oVar == null ? -1 : com.tencent.mm.plugin.appbrand.platform.window.activity.k.f87603a[oVar.ordinal()];
        if (i18 == -1) {
            if (nVar != null) {
                nVar.e(c().a(), false);
            }
        } else {
            if (i18 != 1) {
                activity.enterPictureInPictureMode(new android.app.PictureInPictureParams.Builder().setAspectRatio(new android.util.Rational(16, 9)).build());
                if (nVar != null) {
                    nVar.e(oVar, true);
                    return;
                }
                return;
            }
            activity.enterPictureInPictureMode(new android.app.PictureInPictureParams.Builder().setAspectRatio(new android.util.Rational(9, 16)).build());
            if (nVar != null) {
                nVar.e(oVar, true);
            }
        }
    }

    public final com.tencent.mm.plugin.appbrand.platform.window.activity.j c() {
        java.lang.Object value = ((jz5.n) this.f87638b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.appbrand.platform.window.activity.j) value;
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        c().onConfigurationChanged(configuration);
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onPause() {
        c().onPause();
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onResume() {
        c().onResume();
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void release() {
        android.app.Activity activity = this.f87639c;
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            c().release();
        }
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = this.f87637a;
        if (kotlin.jvm.internal.o.b(r0Var.f87647f, this)) {
            r0Var.f87647f = null;
        }
    }
}
