package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class l5 extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.hc, xi1.g, xi1.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f84220d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84221e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84222f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f84223g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f84224h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.h1 f84225i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f84226m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f84227n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.oc f84228o;

    /* renamed from: p, reason: collision with root package name */
    public xi1.p f84229p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.k5 f84230q;

    public l5(android.content.Context context, java.lang.Class cls) {
        super(context);
        this.f84221e = true;
        this.f84226m = new java.util.LinkedList();
        this.f84227n = new java.util.HashMap();
        this.f84224h = this;
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = new com.tencent.mm.plugin.appbrand.widget.input.h1(getContext(), this);
        this.f84225i = h1Var;
        addView(h1Var);
        this.f84228o = new com.tencent.mm.plugin.appbrand.h5(this);
        this.f84230q = new com.tencent.mm.plugin.appbrand.k5(0, 0, 0, 0);
        this.f84220d = context;
        this.f84223g = cls;
    }

    public void A() {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchResume tid[%d], mResumed[%b]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(this.f84221e));
        if (this.f84221e) {
            return;
        }
        this.f84221e = true;
        C(new com.tencent.mm.plugin.appbrand.i5(this));
    }

    public void B(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (!this.f84226m.contains(appBrandRuntime2)) {
            this.f84226m.push(appBrandRuntime2);
            if (this.f84224h.indexOfChild(appBrandRuntime2.f74810s) == -1) {
                m(appBrandRuntime2.f74810s);
            }
            ((java.util.HashMap) this.f84227n).remove(appBrandRuntime2.f74803n);
        }
        java.util.LinkedList linkedList = this.f84226m;
        linkedList.remove(appBrandRuntime2);
        linkedList.push(appBrandRuntime2);
        appBrandRuntime2.f74810s.setVisibility(0);
        android.widget.FrameLayout frameLayout = this.f84224h;
        com.tencent.mm.plugin.appbrand.widget.q qVar = appBrandRuntime2.f74810s;
        if (frameLayout.indexOfChild(qVar) == -1) {
            com.tencent.mars.xlog.Log.w("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "bringRtViewToTop: such runtime view does not exist");
        } else {
            frameLayout.bringChildToFront(qVar);
            com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f84225i;
            if (h1Var != null) {
                frameLayout.bringChildToFront(h1Var);
            }
            D();
            this.f84224h.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478492d));
        }
        appBrandRuntime2.h0();
        appBrandRuntime2.f74804o = appBrandRuntime;
        appBrandRuntime2.e0(appBrandInitConfig);
        if (appBrandRuntime != null) {
            appBrandRuntime.f0();
            appBrandRuntime2.i0();
        }
    }

    public final void C(java.lang.Runnable runnable) {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public final void D() {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.g5(this));
            return;
        }
        android.widget.FrameLayout frameLayout = this.f84224h;
        this.f84230q.getClass();
        frameLayout.setPadding(0, 0, 0, 0);
    }

    @Override // xi1.i
    public void a(com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams wxaWindowLayoutParams, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
    }

    @Override // xi1.i
    public android.view.ViewGroup.LayoutParams b(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this == ((xi1.g) obj) ? 0 : -1;
    }

    @Override // xi1.g, xi1.s
    public xi1.m createFullscreenHandler(xi1.k kVar) {
        return (xi1.m) com.tencent.mm.plugin.appbrand.utils.o1.a("Luggage.WXA.WindowFullscreenHandler.Dummy", xi1.m.class);
    }

    @Override // xi1.i
    public void d(int i17, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime;
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4 || (activeRuntime = getActiveRuntime()) == null || activeRuntime.L0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        activeRuntime.Z0();
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getActiveRuntime() {
        return (com.tencent.mm.plugin.appbrand.AppBrandRuntime) this.f84226m.peek();
    }

    public final android.app.Activity getActivity() {
        return q75.a.a(this.f84220d);
    }

    @Override // xi1.g
    public xi1.e getNavigationBar() {
        return null;
    }

    @Override // xi1.g, xi1.s
    public xi1.p getOrientationHandler() {
        if (this.f84229p == null) {
            this.f84229p = new com.tencent.mm.plugin.appbrand.la(this);
        }
        return this.f84229p;
    }

    @Override // xi1.g
    public android.graphics.Rect getSafeAreaInsets() {
        return null;
    }

    @Override // xi1.s
    public float getScale() {
        return 1.0f;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public int getStackSize() {
        return this.f84226m.size();
    }

    @Override // xi1.s
    public xi1.f getStatusBar() {
        return null;
    }

    @Override // xi1.g, xi1.s
    public android.util.DisplayMetrics getVDisplayMetrics() {
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        com.tencent.mm.plugin.appbrand.k5 windowCompatInfo = getWindowCompatInfo();
        int width = getWidth();
        windowCompatInfo.getClass();
        displayMetrics2.widthPixels = width + 0 + 0;
        displayMetrics2.heightPixels = getHeight() + 0 + 0;
        return displayMetrics2;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public xi1.g getWindowAndroid() {
        return this;
    }

    public com.tencent.mm.plugin.appbrand.k5 getWindowCompatInfo() {
        return this.f84230q;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime i(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            throw new java.lang.NullPointerException("Null runtime");
        }
        java.util.ListIterator listIterator = this.f84226m.listIterator();
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

    @Override // xi1.g
    public boolean isInMultiWindowMode() {
        return false;
    }

    @Override // xi1.s
    public boolean isLargeScreenWindow() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void j(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig == null) {
            return;
        }
        C(new com.tencent.mm.plugin.appbrand.c5(this, appBrandRuntime, appBrandInitConfig));
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void k(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            return;
        }
        this.f84226m.remove(appBrandRuntime);
        ((java.util.HashMap) this.f84227n).remove(appBrandRuntime.f74803n, appBrandRuntime);
        android.view.ViewParent parent = appBrandRuntime.f74810s.getParent();
        android.widget.FrameLayout frameLayout = this.f84224h;
        if (parent == frameLayout) {
            frameLayout.removeView(appBrandRuntime.f74810s);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void m(com.tencent.mm.plugin.appbrand.widget.q qVar) {
        android.widget.FrameLayout frameLayout = this.f84224h;
        int childCount = frameLayout.getChildCount();
        int i17 = 0;
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f84225i;
        if (h1Var != null) {
            int childCount2 = frameLayout.getChildCount();
            if (childCount2 > 1 || (childCount2 == 1 && h1Var != null)) {
                i17 = childCount - 1;
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "loadNewRtContentView: name = [%s], index = [%d]", qVar.getTag(), java.lang.Integer.valueOf(i17));
        if (qVar.getParent() != null) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "loadNewRtContentView : parent is not null");
            ((android.view.ViewGroup) qVar.getParent()).removeView(qVar);
        }
        frameLayout.addView(qVar, i17);
        frameLayout.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478492d));
        D();
        getActiveRuntime().P(4, 1, this.f84228o);
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public boolean n(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        return this.f84226m.contains(appBrandRuntime);
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void p(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            return;
        }
        appBrandRuntime.B1(this.f84228o);
        this.f84226m.remove(appBrandRuntime);
        ((java.util.HashMap) this.f84227n).remove(appBrandRuntime.f74803n, appBrandRuntime);
    }

    @Override // xi1.g
    public boolean q5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void r(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime == null) {
            return;
        }
        C(new com.tencent.mm.plugin.appbrand.f5(this, appBrandRuntime));
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void s(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
    }

    @Override // xi1.g, xi1.s
    public void setSoftOrientation(java.lang.String str) {
    }

    @Override // xi1.g
    public void setWindowDescription(xi1.d dVar) {
    }

    @Override // xi1.g, xi1.s
    public boolean shouldInLargeScreenCompatMode() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.hc
    public void t(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Object obj, java.lang.Runnable runnable) {
    }

    public final void u() {
        java.util.Iterator it = this.f84226m.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) it.next();
            appBrandRuntime.f74810s.setVisibility(8);
            ((java.util.HashMap) this.f84227n).put(appBrandRuntime.f74803n, appBrandRuntime);
            appBrandRuntime.d1();
        }
        this.f84226m.clear();
    }

    public void w() {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchPause tid[%d], mResumed[%b]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(this.f84221e));
        if (this.f84221e) {
            this.f84221e = false;
            C(new com.tencent.mm.plugin.appbrand.j5(this));
        }
    }
}
