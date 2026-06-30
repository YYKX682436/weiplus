package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public class w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j {

    /* renamed from: j, reason: collision with root package name */
    public static final android.util.SparseArray f169200j = new android.util.SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.k0 f169201a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v f169202b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v f169203c;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f169205e;

    /* renamed from: h, reason: collision with root package name */
    public int f169208h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f169204d = false;

    /* renamed from: f, reason: collision with root package name */
    public android.database.ContentObserver f169206f = null;

    /* renamed from: g, reason: collision with root package name */
    public xi1.o f169207g = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.b0 f169209i = null;

    public w(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationHandler construct");
        this.f169208h = activity.getResources().getConfiguration().orientation;
        this.f169205e = new java.lang.ref.WeakReference(activity);
        boolean f17 = f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        activity.setRequestedOrientation(h(this.f169208h, f17).f536245d);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w c(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w wVar;
        android.util.SparseArray sparseArray = f169200j;
        synchronized (sparseArray) {
            wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w) sparseArray.get(activity.hashCode());
            if (wVar == null) {
                wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w(activity);
                sparseArray.put(activity.hashCode(), wVar);
            }
        }
        return wVar;
    }

    public static boolean f() {
        int i17 = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: systenm orientation %d", java.lang.Integer.valueOf(i17));
        return i17 != 1;
    }

    @Override // xi1.p
    public xi1.o a() {
        boolean f17 = f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        return h(this.f169208h, f17);
    }

    @Override // xi1.p
    public void b(xi1.o oVar, xi1.n nVar) {
        android.app.Activity activity = (android.app.Activity) this.f169205e.get();
        boolean f17 = f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "getCurrentOrientation");
        xi1.o h17 = h(this.f169208h, f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation reqOrientation = [%s], listener = [%s] currentOrientation = [%s], latestOrientation = [%s]", oVar, nVar, h17, this.f169207g);
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandDeviceOrientationHandler", new java.lang.RuntimeException(), "No Activity found when request device orientation", new java.lang.Object[0]);
            if (nVar != null) {
                nVar.e(h17, false);
            }
            synchronized (this) {
                this.f169207g = oVar;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar = null;
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation null");
            if (nVar != null) {
                nVar.e(h17, false);
            }
            synchronized (this) {
                this.f169207g = null;
            }
            return;
        }
        if (activity.isInMultiWindowMode()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation, activity[%s] isInMultiWindowMode, req[%s], callback fail", activity.getLocalClassName(), oVar);
            d();
            activity.setRequestedOrientation(oVar.f536245d);
            if (nVar != null) {
                nVar.e(h17, h17 == oVar);
                return;
            }
            return;
        }
        if (oVar == h17 && this.f169207g != xi1.o.UNSPECIFIED) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation currentOrientation hit. [%s]", oVar);
            synchronized (this) {
                this.f169202b = null;
            }
            if (nVar != null) {
                nVar.e(oVar, true);
            }
            this.f169207g = oVar;
            d();
            activity.setRequestedOrientation(oVar.f536245d);
            return;
        }
        synchronized (this) {
            if (this.f169204d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "requestDeviceOrientation mFinished = true");
                this.f169207g = oVar;
                return;
            }
            if (this.f169202b == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v(oVar, nVar, null);
                this.f169202b = vVar2;
                i(vVar2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar3 = this.f169203c;
                if (vVar3 == null) {
                    vVar3 = null;
                }
                this.f169203c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v(oVar, nVar, null);
                vVar = vVar3;
            }
            this.f169207g = oVar;
            if (vVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "dismissRequest not null");
                xi1.n nVar2 = vVar.f169199b;
                if (nVar2 == null) {
                    return;
                }
                nVar2.e(h17, false);
            }
        }
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.b0 b0Var = this.f169209i;
        if (b0Var != null) {
            b0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationRetrier", "cancelTickTok");
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.z(b0Var));
            this.f169209i = null;
        }
    }

    public final void e(xi1.o oVar, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar = this.f169203c;
        if (oVar == vVar.f169198a) {
            xi1.n nVar = vVar.f169199b;
            if (nVar != null) {
                list.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.u(nVar, oVar, true, "PendingRequest.Listener orientation equal direct", null));
            }
            this.f169203c = null;
            return;
        }
        if (((android.app.Activity) this.f169205e.get()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar2 = this.f169203c;
            this.f169202b = vVar2;
            this.f169203c = null;
            i(vVar2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDeviceOrientationHandler", "No Activity when handle pending request");
        xi1.n nVar2 = this.f169203c.f169199b;
        if (nVar2 != null) {
            list.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.u(nVar2, oVar, false, "PendingRequest.Listener activity == null", null));
        }
    }

    public final void g(xi1.o oVar) {
        android.app.Activity activity = (android.app.Activity) this.f169205e.get();
        if (activity == null || oVar == null) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(activity == null);
            objArr[1] = java.lang.Boolean.valueOf(oVar == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandDeviceOrientationHandler", runtimeException, "onConfigurationChanged activity[isNull ? %b] newConfig[isNull ? %b]", objArr);
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.u> linkedList = new java.util.LinkedList();
        synchronized (this) {
            if (this.f169204d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged Finished = true");
                return;
            }
            if (this.f169202b == null) {
                return;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = oVar == null ? "null" : oVar.name();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.onConfigurationChanged [%s]", objArr2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar = this.f169202b;
            xi1.n nVar = vVar.f169199b;
            if (nVar != null) {
                linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.u(nVar, oVar, oVar != null && oVar.a(vVar.f169198a), "CurrentRequest.listener result received", null));
            }
            this.f169202b = null;
            if (this.f169203c != null) {
                e(oVar, linkedList);
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.u uVar : linkedList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "Notify Listener[%s]", uVar.f169197d);
                xi1.n nVar2 = uVar.f169194a;
                if (nVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "PendingNotify: Listener is null when execute.");
                } else {
                    nVar2.e(uVar.f169195b, uVar.f169196c);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "parseConfiguration configuration == %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (z17) {
            return xi1.o.LANDSCAPE_LOCKED;
        }
        synchronized (this) {
            oVar = this.f169207g;
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

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "AppBrandDeviceOrientationConfig.requestDeviceOrientationImpl setRequestOrientation [%s]", vVar);
        android.app.Activity activity = (android.app.Activity) this.f169205e.get();
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandDeviceOrientationHandler", "hy: ui already released!");
            xi1.n nVar = vVar.f169199b;
            if (nVar != null) {
                nVar.e(vVar.f169198a, false);
                return;
            }
            return;
        }
        activity.setRequestedOrientation(vVar.f169198a.f536245d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "current orientation=" + this.f169208h + "  request orientation=" + vVar.f169198a);
        int i17 = this.f169208h;
        xi1.o oVar = vVar.f169198a;
        if ((i17 == 2 && (oVar.a(xi1.o.LANDSCAPE_SENSOR) || oVar.a(xi1.o.LANDSCAPE_LEFT) || oVar.a(xi1.o.LANDSCAPE_RIGHT))) || (this.f169208h == 1 && oVar.a(xi1.o.PORTRAIT)) || this.f169208h == 0 || oVar == xi1.o.UNSPECIFIED) {
            g(vVar.f169198a);
            return;
        }
        if (this.f169209i == null) {
            this.f169209i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.b0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.b0 b0Var = this.f169209i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.t(this, vVar, activity);
        b0Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.y(b0Var, tVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onConfigurationChanged */
    public void mo52316x50e1c15d(android.content.res.Configuration configuration) {
        d();
        this.f169208h = configuration.orientation;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged  " + this.f169208h);
        g(h(this.f169208h, f()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onPause */
    public void mo52317xb01dfb57() {
        if (this.f169206f != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().unregisterContentObserver(this.f169206f);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandDeviceOrientationHandler", th6, "unregisterContentObserver", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: onResume */
    public void mo52318x57429eec() {
        xi1.o oVar;
        synchronized (this) {
            oVar = this.f169207g;
        }
        b(oVar, null);
        android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getContentResolver();
        android.net.Uri uriFor = android.provider.Settings.System.getUriFor("accelerometer_rotation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.s(this, new android.os.Handler());
        this.f169206f = sVar;
        try {
            contentResolver.registerContentObserver(uriFor, false, sVar);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandDeviceOrientationHandler", th6, "registerContentObserver [Settings.System.ACCELEROMETER_ROTATION] ", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j
    /* renamed from: release */
    public void mo52319x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "release");
        android.util.SparseArray sparseArray = f169200j;
        synchronized (sparseArray) {
            int indexOfValue = sparseArray.indexOfValue(this);
            if (indexOfValue >= 0) {
                sparseArray.removeAt(indexOfValue);
            }
        }
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar = this.f169202b;
            if (vVar == null && this.f169203c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "Every request is executed well");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", "Still has request not executed current[%s] pending[%s]", vVar, this.f169203c);
            this.f169202b = null;
            this.f169203c = null;
            this.f169204d = true;
        }
    }
}
