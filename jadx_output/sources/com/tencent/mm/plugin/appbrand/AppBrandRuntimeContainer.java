package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class AppBrandRuntimeContainer<RUNTIME extends com.tencent.mm.plugin.appbrand.AppBrandRuntime> extends xi1.h implements com.tencent.mm.plugin.appbrand.hc {

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.FrameLayout f74838q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f74839r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f74840s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.task.b1 f74841t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Class f74842u;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.h1 f74845x;

    /* renamed from: y, reason: collision with root package name */
    public android.app.Application.ActivityLifecycleCallbacks f74846y;

    /* renamed from: v, reason: collision with root package name */
    public boolean f74843v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f74844w = false;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.oc f74847z = new com.tencent.mm.plugin.appbrand.r4(this);

    public AppBrandRuntimeContainer(com.tencent.mm.plugin.appbrand.task.b1 b1Var, java.lang.Class cls) {
        com.tencent.mm.plugin.appbrand.ui.b8 b8Var = (com.tencent.mm.plugin.appbrand.ui.b8) b1Var;
        G(com.tencent.mm.plugin.appbrand.ui.z6.b(b8Var.f89579a));
        this.f74839r = new java.util.LinkedList();
        this.f74840s = new java.util.HashMap();
        b8Var.getClass();
        boolean z17 = com.tencent.mm.plugin.appbrand.ui.AppBrandUI.X;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) b8Var.f89579a.f90318h;
        this.f74838q = frameLayout;
        this.f74841t = b1Var;
        this.f74842u = cls;
        frameLayout.setOnSystemUiVisibilityChangeListener(new com.tencent.mm.plugin.appbrand.s4(this));
        com.tencent.mm.plugin.appbrand.platform.window.activity.w c17 = com.tencent.mm.plugin.appbrand.platform.window.activity.w.c(w());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        synchronized (c17) {
            c17.f87671d = false;
        }
        android.app.Application application = (android.app.Application) this.f87645d.getApplicationContext();
        com.tencent.mm.plugin.appbrand.t4 t4Var = new com.tencent.mm.plugin.appbrand.t4(this);
        this.f74846y = t4Var;
        application.registerActivityLifecycleCallbacks(t4Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.r0
    public final boolean D() {
        return this.f74844w;
    }

    public final void H(android.view.ViewGroup viewGroup) {
        android.widget.FrameLayout frameLayout = this.f74838q;
        if (frameLayout.indexOfChild(viewGroup) == -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeContainer", "bringRtViewToTop: such runtime view does not exist");
            return;
        }
        frameLayout.bringChildToFront(viewGroup);
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f74845x;
        if (h1Var != null) {
            frameLayout.bringChildToFront(h1Var);
        }
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime I(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        java.lang.Class cls = this.f74842u;
        return (com.tencent.mm.plugin.appbrand.AppBrandRuntime) new d56.b(cls, cls).d(this).f226632b;
    }

    public final void J(java.lang.String str) {
        java.util.Iterator it = this.f74839r.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) it.next();
            if (str == null || !str.equals(appBrandRuntime.f74803n)) {
                it.remove();
                appBrandRuntime.f74810s.setVisibility(8);
                this.f74840s.put(appBrandRuntime.f74803n, appBrandRuntime);
                appBrandRuntime.d1();
                if (!appBrandRuntime.J0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, rt(%s).initialized()=false, just destroy", appBrandRuntime.f74803n);
                    T(appBrandRuntime);
                } else if (appBrandRuntime.V) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, rt(%s).isResumed()=true, make it pause", appBrandRuntime.f74803n);
                    appBrandRuntime.f0();
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, exclude appId(%s)", str);
            }
        }
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime L(java.lang.String str) {
        java.util.Iterator it = this.f74839r.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) it.next();
            if (appBrandRuntime.f74803n.equals(str)) {
                return appBrandRuntime;
            }
        }
        return (com.tencent.mm.plugin.appbrand.AppBrandRuntime) this.f74840s.get(str);
    }

    public boolean M(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        return false;
    }

    public void N(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        boolean J1 = appBrandRuntime2.J1();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "loadExisted  form %s to %s ,runSaveStackWhenLoopJump: %b", appBrandRuntime, appBrandRuntime2, java.lang.Boolean.valueOf(J1));
        if (!J1) {
            V(appBrandRuntime2, false);
            W(appBrandRuntime2);
        } else if (appBrandRuntime2.f74796e == this) {
            this.f74839r.push(appBrandRuntime2);
            appBrandRuntime2.f74810s.setVisibility(0);
            H(appBrandRuntime2.f74810s);
            this.f74840s.remove(appBrandRuntime2.f74803n);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", appBrandRuntime2.f74803n + " addToStackAgain, mRuntimeStack is" + this.f74839r);
        } else {
            V(appBrandRuntime2, false);
            W(appBrandRuntime2);
        }
        appBrandRuntime2.h0();
        appBrandRuntime2.f74804o = appBrandRuntime;
        if (J1) {
            if (appBrandRuntime2.V) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeContainer", "runSaveStackWhenLoopJump but runtime is resumed , turn to pause");
                appBrandRuntime2.f0();
            }
            appBrandRuntime2.N(this, appBrandInitConfig);
        } else {
            appBrandRuntime2.e0(appBrandInitConfig);
        }
        if (appBrandRuntime != null) {
            appBrandRuntime.f0();
            appBrandRuntime2.i0();
        }
    }

    public void O(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        appBrandRuntime2.f74804o = appBrandRuntime;
        appBrandRuntime2.I0(appBrandInitConfig);
        this.f74839r.push(appBrandRuntime2);
        m(appBrandRuntime2.f74810s);
        if (appBrandRuntime != null) {
            appBrandRuntime.f0();
        }
        appBrandRuntime2.X0();
    }

    public void Q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "onResume tid = %d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        Y(new com.tencent.mm.plugin.appbrand.y4(this));
    }

    public void R(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, java.lang.Runnable runnable) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = appBrandRuntime == null ? "null" : appBrandRuntime.f74803n;
        objArr[1] = appBrandRuntime2.f74803n;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "onRuntimeClose entered, in.appId[%s], out.appId[%s]", objArr);
        runnable.run();
    }

    public final void S() {
        if (this.f74846y != null) {
            ((android.app.Application) this.f87645d.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f74846y);
            this.f74846y = null;
        }
        getOrientationHandler().release();
        this.f74841t = null;
    }

    public final void T(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "removeImpl entered appId[%s]", appBrandRuntime.f74803n);
        com.tencent.mm.plugin.appbrand.b5 b5Var = new com.tencent.mm.plugin.appbrand.b5(this, appBrandRuntime);
        if (n(appBrandRuntime)) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime i17 = i(appBrandRuntime);
            R(i17, appBrandRuntime, new com.tencent.mm.plugin.appbrand.q4(this, appBrandRuntime, i17, b5Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "removeImpl appId[%s], not in runtime stack, just cleanup", appBrandRuntime.f74803n);
            b5Var.run();
        }
    }

    public void U(java.lang.Exception exc) {
    }

    public final void V(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17) {
        if (!this.f74839r.contains(appBrandRuntime) || z17) {
            this.f74839r.remove(appBrandRuntime);
            this.f74839r.push(appBrandRuntime);
            if (this.f74838q.indexOfChild(appBrandRuntime.f74810s) == -1) {
                m(appBrandRuntime.f74810s);
            }
            this.f74840s.remove(appBrandRuntime.f74803n);
        }
    }

    public final void W(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        java.util.LinkedList linkedList = this.f74839r;
        linkedList.remove(appBrandRuntime);
        linkedList.push(appBrandRuntime);
        appBrandRuntime.f74810s.setVisibility(0);
        H(appBrandRuntime.f74810s);
    }

    public final void Y(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else if (w() != null) {
            w().runOnUiThread(runnable);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeContainer", "runOnUiThread getActivity()==null");
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(runnable);
        }
    }

    @Override // xi1.h, xi1.i
    public void d(int i17, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.d(i17, appBrandRuntime);
        android.view.View view = (android.view.View) appBrandRuntime.f74810s.getParent();
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public RUNTIME getActiveRuntime() {
        return (RUNTIME) this.f74839r.peek();
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public int getStackSize() {
        return this.f74839r.size();
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.r0, xi1.g, xi1.s
    public final android.util.DisplayMetrics getVDisplayMetrics() {
        android.widget.FrameLayout frameLayout = this.f74838q;
        if (!frameLayout.isLaidOut()) {
            return super.getVDisplayMetrics();
        }
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        android.util.DisplayMetrics displayMetrics = this.f87649h;
        if (displayMetrics == null) {
            displayMetrics = com.tencent.mm.plugin.appbrand.platform.window.activity.r0.A(w(), true);
            this.f87649h = displayMetrics;
        }
        if (measuredWidth > 0 && measuredHeight > 0) {
            displayMetrics.widthPixels = measuredWidth;
            displayMetrics.heightPixels = measuredHeight;
        }
        return displayMetrics;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public xi1.g getWindowAndroid() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime i(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            throw new java.lang.NullPointerException("Null runtime");
        }
        java.util.ListIterator listIterator = this.f74839r.listIterator();
        boolean z17 = false;
        while (listIterator.hasNext()) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) listIterator.next();
            if (appBrandRuntime2 == appBrandRuntime) {
                z17 = true;
            } else if (z17) {
                return appBrandRuntime2;
            }
        }
        if (z17) {
            return null;
        }
        throw new java.lang.IllegalAccessError(java.lang.String.format("Runtime not in stack %s", appBrandRuntime.f74803n));
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void j(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig == null) {
            return;
        }
        w().runOnUiThread(new com.tencent.mm.plugin.appbrand.u4(this, appBrandRuntime, appBrandInitConfig));
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public final void k(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            return;
        }
        this.f74839r.remove(appBrandRuntime);
        this.f74840s.remove(appBrandRuntime.f74803n, appBrandRuntime);
        android.view.ViewParent parent = appBrandRuntime.f74810s.getParent();
        android.widget.FrameLayout frameLayout = this.f74838q;
        if (parent == frameLayout) {
            frameLayout.removeView(appBrandRuntime.f74810s);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void l(final com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        appBrandRuntime.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer.this;
                appBrandRuntimeContainer.getClass();
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = appBrandRuntime;
                if (appBrandRuntime2.f74796e == appBrandRuntimeContainer && appBrandRuntime2 == appBrandRuntimeContainer.getActiveRuntime()) {
                    if (appBrandRuntime2.Y != null) {
                        return;
                    }
                    if (appBrandRuntimeContainer.f74844w || appBrandRuntimeContainer.E()) {
                        appBrandRuntime2.f0();
                    }
                }
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void m(com.tencent.mm.plugin.appbrand.widget.q qVar) {
        android.widget.FrameLayout frameLayout = this.f74838q;
        int childCount = frameLayout.getChildCount();
        int i17 = 0;
        if (this.f74845x != null) {
            int childCount2 = frameLayout.getChildCount();
            if (childCount2 > 1 || (childCount2 == 1 && this.f74845x != null)) {
                i17 = childCount - 1;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "attachRtViewToTree: name = [%s], index = [%d]", (java.lang.String) qVar.getTag(), java.lang.Integer.valueOf(i17));
        if (qVar.getParent() != null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            ((android.view.ViewGroup) qVar.getParent()).removeAllViews();
        }
        frameLayout.addView(qVar, i17);
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f74845x;
        if (h1Var != null) {
            if (h1Var.getParent() == null) {
                frameLayout.addView(this.f74845x);
            }
            if (frameLayout == this.f74845x.getParent() && frameLayout.indexOfChild(this.f74845x) != frameLayout.getChildCount() - 1) {
                frameLayout.bringChildToFront(this.f74845x);
            }
        }
        getActiveRuntime().P(4, 1, this.f74847z);
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public boolean n(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        return appBrandRuntime != null && this.f74839r.contains(appBrandRuntime);
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void p(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            return;
        }
        appBrandRuntime.B1(this.f74847z);
        this.f74839r.remove(appBrandRuntime);
        this.f74840s.remove(appBrandRuntime.f74803n, appBrandRuntime);
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.r0, xi1.g
    public boolean q5() {
        return ((com.tencent.mm.plugin.appbrand.ui.b8) this.f74841t).f89579a.F7();
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public final void r(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            return;
        }
        Y(new com.tencent.mm.plugin.appbrand.a5(this, appBrandRuntime));
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void s(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        java.util.LinkedList linkedList = this.f74839r;
        int i17 = 0;
        for (int size = linkedList.size() - 1; size >= 0; size--) {
            if (linkedList.get(size) == appBrandRuntime) {
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "stripRuntimeToOneInstance  size: " + i17 + " before " + linkedList);
        if (i17 >= 2) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext() && appBrandRuntime != it.next()) {
                it.next();
            }
            while (it.hasNext()) {
                if (((com.tencent.mm.plugin.appbrand.AppBrandRuntime) it.next()) == appBrandRuntime) {
                    it.remove();
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "stripRuntimeToOneInstance after " + linkedList);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void t(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Object obj, java.lang.Runnable runnable) {
        android.app.Activity w17;
        if (appBrandRuntime == null || (w17 = w()) == null) {
            return;
        }
        w17.runOnUiThread(new com.tencent.mm.plugin.appbrand.w4(this, appBrandRuntime, obj, runnable));
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.r0
    public boolean u() {
        return true;
    }
}
