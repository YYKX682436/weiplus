package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 f169170a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f169171b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Activity f169172c;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 windowActivity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowActivity, "windowActivity");
        this.f169170a = windowActivity;
        this.f169171b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.l(this));
        this.f169172c = windowActivity.w();
    }

    @Override // xi1.p
    public xi1.o a() {
        android.view.Display defaultDisplay;
        if (this.f169172c != null) {
            return c().a();
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) b3.l.m9714xac92a5d0(this.f169170a.f169178d, android.view.WindowManager.class);
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
        android.app.Activity activity = this.f169172c;
        if (activity == null) {
            if (nVar != null) {
                nVar.e(a(), false);
                return;
            }
            return;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", "requestDeviceOrientation but activity(" + activity + ") destroyed");
            if (nVar != null) {
                nVar.e(c().a(), false);
                return;
            }
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var = this.f169170a;
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
                    c().b(oVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.p(atomicBoolean, decorView, nVar, this));
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
        int i18 = oVar == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.k.f169136a[oVar.ordinal()];
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

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f169171b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onConfigurationChanged */
    public void mo52316x50e1c15d(android.content.res.Configuration configuration) {
        c().mo52316x50e1c15d(configuration);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onPause */
    public void mo52317xb01dfb57() {
        c().mo52317xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onResume */
    public void mo52318x57429eec() {
        c().mo52318x57429eec();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: release */
    public void mo52319x41012807() {
        android.app.Activity activity = this.f169172c;
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            c().mo52319x41012807();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var = this.f169170a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0Var.f169180f, this)) {
            r0Var.f169180f = null;
        }
    }
}
