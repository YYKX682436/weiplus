package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f290092f;

    public u0(com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var, java.lang.String str, long j17, boolean z17) {
        this.f290090d = j1Var;
        this.f290091e = str;
        this.f290092f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290090d;
        j1Var.getClass();
        android.app.Activity a17 = com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.v.f290093a.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService", "onScreenShot, getTopActivity failed");
            return;
        }
        if (a17.isInMultiWindowMode()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", "onScreenShot, activity is in multi window mode, skip");
            return;
        }
        java.lang.Object systemService = a17.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService", "onScreenShot, getWindowManager failed");
            return;
        }
        java.lang.String str = this.f290091e;
        if (str != null) {
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                boolean z17 = this.f290092f;
                if (z17) {
                    j1Var.f290031d = currentTimeMillis;
                } else if (!j1Var.f290038n) {
                    android.view.View wi6 = j1Var.wi();
                    if (!(wi6 != null && wi6.isAttachedToWindow()) && currentTimeMillis - j1Var.f290031d <= 5000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, user cancelled, skip");
                        return;
                    }
                }
                qj5.n nVar = j1Var.f290033f;
                if (nVar != null) {
                    if (nVar.i()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, screenShotShare showing, skip");
                        return;
                    }
                    qj5.n nVar2 = j1Var.f290033f;
                    if (nVar2 != null) {
                        nVar2.u();
                    }
                    j1Var.f290033f = null;
                }
                if (j1Var.f290038n && z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScreenShotShareService", "onScreenShot, old screenshot is loading, ignore new screenshot");
                    return;
                }
                java.lang.ref.WeakReference weakReference = j1Var.f290035h;
                android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                if (activity != null && activity != a17 && !activity.isDestroyed()) {
                    j1Var.Di(activity);
                }
                if (activity != a17 || j1Var.f290034g == null) {
                    com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x xVar = j1Var.f290034g;
                    if (xVar != null) {
                        xVar.b();
                    }
                    j1Var.f290034g = null;
                    android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = j1Var.f290036i;
                    if (activityLifecycleCallbacks != null) {
                        try {
                            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            a17.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                        } catch (java.lang.Throwable th6) {
                            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                        }
                        p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                    }
                    j1Var.f290036i = null;
                    j1Var.f290035h = null;
                    j1Var.f290034g = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.x(windowManager);
                    j1Var.f290035h = new java.lang.ref.WeakReference(a17);
                    com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.b0 b0Var = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.b0(j1Var);
                    j1Var.f290036i = b0Var;
                    a17.getApplication().registerActivityLifecycleCallbacks(b0Var);
                }
                j1Var.f290039o = str;
                android.view.View decorView = a17.getWindow().getDecorView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
                if (decorView.getTag(com.p314xaae8f345.mm.R.id.v1_) == null) {
                    android.view.Window.Callback callback = a17.getWindow().getCallback();
                    decorView.setTag(com.p314xaae8f345.mm.R.id.v1_, callback);
                    a17.getWindow().setCallback(new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.s0(callback, j1Var));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, isLoading: " + j1Var.f290038n + ", isPending: " + z17);
                if (j1Var.f290038n) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "onScreenShot, screenshot end pending, show");
                    j1Var.Ai();
                    j1Var.f290038n = false;
                    ct.e3.j2(j1Var, null, 1, null);
                    return;
                }
                if (z17) {
                    j1Var.Ri(a17, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.e0(j1Var, a17));
                    return;
                } else {
                    j1Var.Ri(a17, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.d0(j1Var));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotShareService", "onScreenShot, file not exists");
    }
}
