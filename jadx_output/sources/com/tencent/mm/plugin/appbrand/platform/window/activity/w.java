package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class w implements com.tencent.mm.plugin.appbrand.platform.window.activity.j {

    /* renamed from: j, reason: collision with root package name */
    public static final android.util.SparseArray f87667j = new android.util.SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.k0 f87668a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.v f87669b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.v f87670c;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f87672e;

    /* renamed from: h, reason: collision with root package name */
    public int f87675h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f87671d = false;

    /* renamed from: f, reason: collision with root package name */
    public android.database.ContentObserver f87673f = null;

    /* renamed from: g, reason: collision with root package name */
    public xi1.o f87674g = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.b0 f87676i = null;

    public w(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationHandler construct");
        this.f87675h = activity.getResources().getConfiguration().orientation;
        this.f87672e = new java.lang.ref.WeakReference(activity);
        boolean f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        activity.setRequestedOrientation(h(this.f87675h, f17).f454712d);
    }

    public static com.tencent.mm.plugin.appbrand.platform.window.activity.w c(android.app.Activity activity) {
        com.tencent.mm.plugin.appbrand.platform.window.activity.w wVar;
        android.util.SparseArray sparseArray = f87667j;
        synchronized (sparseArray) {
            wVar = (com.tencent.mm.plugin.appbrand.platform.window.activity.w) sparseArray.get(activity.hashCode());
            if (wVar == null) {
                wVar = new com.tencent.mm.plugin.appbrand.platform.window.activity.w(activity);
                sparseArray.put(activity.hashCode(), wVar);
            }
        }
        return wVar;
    }

    public static boolean f() {
        int i17 = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: systenm orientation %d", java.lang.Integer.valueOf(i17));
        return i17 != 1;
    }

    @Override // xi1.p
    public xi1.o a() {
        boolean f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        return h(this.f87675h, f17);
    }

    @Override // xi1.p
    public void b(xi1.o oVar, xi1.n nVar) {
        android.app.Activity activity = (android.app.Activity) this.f87672e.get();
        boolean f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        xi1.o h17 = h(this.f87675h, f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation reqOrientation = [%s], listener = [%s] currentOrientation = [%s], latestOrientation = [%s]", oVar, nVar, h17, this.f87674g);
        if (activity == null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", new java.lang.RuntimeException(), "No Activity found when request device orientation", new java.lang.Object[0]);
            if (nVar != null) {
                nVar.e(h17, false);
            }
            synchronized (this) {
                this.f87674g = oVar;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar = null;
        if (oVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation null");
            if (nVar != null) {
                nVar.e(h17, false);
            }
            synchronized (this) {
                this.f87674g = null;
            }
            return;
        }
        if (activity.isInMultiWindowMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation, activity[%s] isInMultiWindowMode, req[%s], callback fail", activity.getLocalClassName(), oVar);
            d();
            activity.setRequestedOrientation(oVar.f454712d);
            if (nVar != null) {
                nVar.e(h17, h17 == oVar);
                return;
            }
            return;
        }
        if (oVar == h17 && this.f87674g != xi1.o.UNSPECIFIED) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation currentOrientation hit. [%s]", oVar);
            synchronized (this) {
                this.f87669b = null;
            }
            if (nVar != null) {
                nVar.e(oVar, true);
            }
            this.f87674g = oVar;
            d();
            activity.setRequestedOrientation(oVar.f454712d);
            return;
        }
        synchronized (this) {
            if (this.f87671d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation mFinished = true");
                this.f87674g = oVar;
                return;
            }
            if (this.f87669b == null) {
                com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar2 = new com.tencent.mm.plugin.appbrand.platform.window.activity.v(oVar, nVar, null);
                this.f87669b = vVar2;
                i(vVar2);
            } else {
                com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar3 = this.f87670c;
                if (vVar3 == null) {
                    vVar3 = null;
                }
                this.f87670c = new com.tencent.mm.plugin.appbrand.platform.window.activity.v(oVar, nVar, null);
                vVar = vVar3;
            }
            this.f87674g = oVar;
            if (vVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "dismissRequest not null");
                xi1.n nVar2 = vVar.f87666b;
                if (nVar2 == null) {
                    return;
                }
                nVar2.e(h17, false);
            }
        }
    }

    public final void d() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.b0 b0Var = this.f87676i;
        if (b0Var != null) {
            b0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationRetrier", "cancelTickTok");
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.platform.window.activity.z(b0Var));
            this.f87676i = null;
        }
    }

    public final void e(xi1.o oVar, java.util.List list) {
        com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar = this.f87670c;
        if (oVar == vVar.f87665a) {
            xi1.n nVar = vVar.f87666b;
            if (nVar != null) {
                list.add(new com.tencent.mm.plugin.appbrand.platform.window.activity.u(nVar, oVar, true, "PendingRequest.Listener orientation equal direct", null));
            }
            this.f87670c = null;
            return;
        }
        if (((android.app.Activity) this.f87672e.get()) != null) {
            com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar2 = this.f87670c;
            this.f87669b = vVar2;
            this.f87670c = null;
            i(vVar2);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDeviceOrientationHandler", "No Activity when handle pending request");
        xi1.n nVar2 = this.f87670c.f87666b;
        if (nVar2 != null) {
            list.add(new com.tencent.mm.plugin.appbrand.platform.window.activity.u(nVar2, oVar, false, "PendingRequest.Listener activity == null", null));
        }
    }

    public final void g(xi1.o oVar) {
        android.app.Activity activity = (android.app.Activity) this.f87672e.get();
        if (activity == null || oVar == null) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(activity == null);
            objArr[1] = java.lang.Boolean.valueOf(oVar == null);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", runtimeException, "onConfigurationChanged activity[isNull ? %b] newConfig[isNull ? %b]", objArr);
        }
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.platform.window.activity.u> linkedList = new java.util.LinkedList();
        synchronized (this) {
            if (this.f87671d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged Finished = true");
                return;
            }
            if (this.f87669b == null) {
                return;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = oVar == null ? "null" : oVar.name();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.onConfigurationChanged [%s]", objArr2);
            com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar = this.f87669b;
            xi1.n nVar = vVar.f87666b;
            if (nVar != null) {
                linkedList.add(new com.tencent.mm.plugin.appbrand.platform.window.activity.u(nVar, oVar, oVar != null && oVar.a(vVar.f87665a), "CurrentRequest.listener result received", null));
            }
            this.f87669b = null;
            if (this.f87670c != null) {
                e(oVar, linkedList);
            }
            for (com.tencent.mm.plugin.appbrand.platform.window.activity.u uVar : linkedList) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "Notify Listener[%s]", uVar.f87664d);
                xi1.n nVar2 = uVar.f87661a;
                if (nVar2 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "PendingNotify: Listener is null when execute.");
                } else {
                    nVar2.e(uVar.f87662b, uVar.f87663c);
                }
            }
        }
    }

    public final xi1.o h(int i17, boolean z17) {
        xi1.o oVar;
        if (i17 != 2) {
            if (i17 == 1) {
                return xi1.o.PORTRAIT;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (z17) {
            return xi1.o.LANDSCAPE_LOCKED;
        }
        synchronized (this) {
            oVar = this.f87674g;
        }
        if (oVar != null) {
            int ordinal = oVar.ordinal();
            if (ordinal == 4) {
                return xi1.o.LANDSCAPE_LEFT;
            }
            if (ordinal == 5) {
                return xi1.o.LANDSCAPE_RIGHT;
            }
        }
        return xi1.o.LANDSCAPE_SENSOR;
    }

    public final void i(com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.requestDeviceOrientationImpl setRequestOrientation [%s]", vVar);
        android.app.Activity activity = (android.app.Activity) this.f87672e.get();
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandDeviceOrientationHandler", "hy: ui already released!");
            xi1.n nVar = vVar.f87666b;
            if (nVar != null) {
                nVar.e(vVar.f87665a, false);
                return;
            }
            return;
        }
        activity.setRequestedOrientation(vVar.f87665a.f454712d);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "current orientation=" + this.f87675h + "  request orientation=" + vVar.f87665a);
        int i17 = this.f87675h;
        xi1.o oVar = vVar.f87665a;
        if ((i17 == 2 && (oVar.a(xi1.o.LANDSCAPE_SENSOR) || oVar.a(xi1.o.LANDSCAPE_LEFT) || oVar.a(xi1.o.LANDSCAPE_RIGHT))) || (this.f87675h == 1 && oVar.a(xi1.o.PORTRAIT)) || this.f87675h == 0 || oVar == xi1.o.UNSPECIFIED) {
            g(vVar.f87665a);
            return;
        }
        if (this.f87676i == null) {
            this.f87676i = new com.tencent.mm.plugin.appbrand.platform.window.activity.b0();
        }
        com.tencent.mm.plugin.appbrand.platform.window.activity.b0 b0Var = this.f87676i;
        com.tencent.mm.plugin.appbrand.platform.window.activity.t tVar = new com.tencent.mm.plugin.appbrand.platform.window.activity.t(this, vVar, activity);
        b0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.platform.window.activity.y(b0Var, tVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        d();
        this.f87675h = configuration.orientation;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged  " + this.f87675h);
        g(h(this.f87675h, f()));
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onPause() {
        if (this.f87673f != null) {
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().unregisterContentObserver(this.f87673f);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", th6, "unregisterContentObserver", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onResume() {
        xi1.o oVar;
        synchronized (this) {
            oVar = this.f87674g;
        }
        b(oVar, null);
        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getContentResolver();
        android.net.Uri uriFor = android.provider.Settings.System.getUriFor("accelerometer_rotation");
        com.tencent.mm.plugin.appbrand.platform.window.activity.s sVar = new com.tencent.mm.plugin.appbrand.platform.window.activity.s(this, new android.os.Handler());
        this.f87673f = sVar;
        try {
            contentResolver.registerContentObserver(uriFor, false, sVar);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", th6, "registerContentObserver [Settings.System.ACCELEROMETER_ROTATION] ", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "release");
        android.util.SparseArray sparseArray = f87667j;
        synchronized (sparseArray) {
            int indexOfValue = sparseArray.indexOfValue(this);
            if (indexOfValue >= 0) {
                sparseArray.removeAt(indexOfValue);
            }
        }
        synchronized (this) {
            com.tencent.mm.plugin.appbrand.platform.window.activity.v vVar = this.f87669b;
            if (vVar == null && this.f87670c == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "Every request is executed well");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "Still has request not executed current[%s] pending[%s]", vVar, this.f87670c);
            this.f87669b = null;
            this.f87670c = null;
            this.f87671d = true;
        }
    }
}
