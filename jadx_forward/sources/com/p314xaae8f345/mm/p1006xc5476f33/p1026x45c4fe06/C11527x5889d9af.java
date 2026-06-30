package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer */
/* loaded from: classes7.dex */
public class C11527x5889d9af<RUNTIME extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2> extends xi1.h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc {

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.FrameLayout f156371q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f156372r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f156373s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b1 f156374t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Class f156375u;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 f156378x;

    /* renamed from: y, reason: collision with root package name */
    public android.app.Application.ActivityLifecycleCallbacks f156379y;

    /* renamed from: v, reason: collision with root package name */
    public boolean f156376v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f156377w = false;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc f156380z = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r4(this);

    public C11527x5889d9af(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b1 b1Var, java.lang.Class cls) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b8) b1Var;
        G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(b8Var.f171112a));
        this.f156372r = new java.util.LinkedList();
        this.f156373s = new java.util.HashMap();
        b8Var.getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a.X;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) b8Var.f171112a.f171851h;
        this.f156371q = frameLayout;
        this.f156374t = b1Var;
        this.f156375u = cls;
        frameLayout.setOnSystemUiVisibilityChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s4(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w.c(w());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDeviceOrientationHandler", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        synchronized (c17) {
            c17.f169204d = false;
        }
        android.app.Application application = (android.app.Application) this.f169178d.getApplicationContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t4 t4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t4(this);
        this.f156379y = t4Var;
        application.registerActivityLifecycleCallbacks(t4Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0
    public final boolean D() {
        return this.f156377w;
    }

    public final void H(android.view.ViewGroup viewGroup) {
        android.widget.FrameLayout frameLayout = this.f156371q;
        if (frameLayout.indexOfChild(viewGroup) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeContainer", "bringRtViewToTop: such runtime view does not exist");
            return;
        }
        frameLayout.bringChildToFront(viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f156378x;
        if (h1Var != null) {
            frameLayout.bringChildToFront(h1Var);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        java.lang.Class cls = this.f156375u;
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) new d56.b(cls, cls).d(this).f308165b;
    }

    public final void J(java.lang.String str) {
        java.util.Iterator it = this.f156372r.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) it.next();
            if (str == null || !str.equals(c11510xdd90c2f2.f156336n)) {
                it.remove();
                c11510xdd90c2f2.f156343s.setVisibility(8);
                this.f156373s.put(c11510xdd90c2f2.f156336n, c11510xdd90c2f2);
                c11510xdd90c2f2.d1();
                if (!c11510xdd90c2f2.J0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, rt(%s).initialized()=false, just destroy", c11510xdd90c2f2.f156336n);
                    T(c11510xdd90c2f2);
                } else if (c11510xdd90c2f2.V) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, rt(%s).isResumed()=true, make it pause", c11510xdd90c2f2.f156336n);
                    c11510xdd90c2f2.f0();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, exclude appId(%s)", str);
            }
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 L(java.lang.String str) {
        java.util.Iterator it = this.f156372r.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) it.next();
            if (c11510xdd90c2f2.f156336n.equals(str)) {
                return c11510xdd90c2f2;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.f156373s.get(str);
    }

    public boolean M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        return false;
    }

    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        boolean J1 = c11510xdd90c2f22.J1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "loadExisted  form %s to %s ,runSaveStackWhenLoopJump: %b", c11510xdd90c2f2, c11510xdd90c2f22, java.lang.Boolean.valueOf(J1));
        if (!J1) {
            V(c11510xdd90c2f22, false);
            W(c11510xdd90c2f22);
        } else if (c11510xdd90c2f22.f156329e == this) {
            this.f156372r.push(c11510xdd90c2f22);
            c11510xdd90c2f22.f156343s.setVisibility(0);
            H(c11510xdd90c2f22.f156343s);
            this.f156373s.remove(c11510xdd90c2f22.f156336n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", c11510xdd90c2f22.f156336n + " addToStackAgain, mRuntimeStack is" + this.f156372r);
        } else {
            V(c11510xdd90c2f22, false);
            W(c11510xdd90c2f22);
        }
        c11510xdd90c2f22.h0();
        c11510xdd90c2f22.f156337o = c11510xdd90c2f2;
        if (J1) {
            if (c11510xdd90c2f22.V) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeContainer", "runSaveStackWhenLoopJump but runtime is resumed , turn to pause");
                c11510xdd90c2f22.f0();
            }
            c11510xdd90c2f22.N(this, c11808xe47dc718);
        } else {
            c11510xdd90c2f22.e0(c11808xe47dc718);
        }
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.f0();
            c11510xdd90c2f22.i0();
        }
    }

    public void O(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        c11510xdd90c2f22.f156337o = c11510xdd90c2f2;
        c11510xdd90c2f22.I0(c11808xe47dc718);
        this.f156372r.push(c11510xdd90c2f22);
        m(c11510xdd90c2f22.f156343s);
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.f0();
        }
        c11510xdd90c2f22.X0();
    }

    public void Q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "onResume tid = %d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        Y(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y4(this));
    }

    public void R(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, java.lang.Runnable runnable) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = c11510xdd90c2f2 == null ? "null" : c11510xdd90c2f2.f156336n;
        objArr[1] = c11510xdd90c2f22.f156336n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "onRuntimeClose entered, in.appId[%s], out.appId[%s]", objArr);
        runnable.run();
    }

    public final void S() {
        if (this.f156379y != null) {
            ((android.app.Application) this.f169178d.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f156379y);
            this.f156379y = null;
        }
        mo51612x60543150().mo52319x41012807();
        this.f156374t = null;
    }

    public final void T(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "removeImpl entered appId[%s]", c11510xdd90c2f2.f156336n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b5 b5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b5(this, c11510xdd90c2f2);
        if (n(c11510xdd90c2f2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 i17 = i(c11510xdd90c2f2);
            R(i17, c11510xdd90c2f2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q4(this, c11510xdd90c2f2, i17, b5Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "removeImpl appId[%s], not in runtime stack, just cleanup", c11510xdd90c2f2.f156336n);
            b5Var.run();
        }
    }

    public void U(java.lang.Exception exc) {
    }

    public final void V(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, boolean z17) {
        if (!this.f156372r.contains(c11510xdd90c2f2) || z17) {
            this.f156372r.remove(c11510xdd90c2f2);
            this.f156372r.push(c11510xdd90c2f2);
            if (this.f156371q.indexOfChild(c11510xdd90c2f2.f156343s) == -1) {
                m(c11510xdd90c2f2.f156343s);
            }
            this.f156373s.remove(c11510xdd90c2f2.f156336n);
        }
    }

    public final void W(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        java.util.LinkedList linkedList = this.f156372r;
        linkedList.remove(c11510xdd90c2f2);
        linkedList.push(c11510xdd90c2f2);
        c11510xdd90c2f2.f156343s.setVisibility(0);
        H(c11510xdd90c2f2.f156343s);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeContainer", "runOnUiThread getActivity()==null");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(runnable);
        }
    }

    @Override // xi1.h, xi1.i
    public void d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super.d(i17, c11510xdd90c2f2);
        android.view.View view = (android.view.View) c11510xdd90c2f2.f156343s.getParent();
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    /* renamed from: getActiveRuntime */
    public RUNTIME mo48805xd384d23c() {
        return (RUNTIME) this.f156372r.peek();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    /* renamed from: getStackSize */
    public int mo48806x666b03f3() {
        return this.f156372r.size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0, xi1.g, xi1.s
    /* renamed from: getVDisplayMetrics */
    public final android.util.DisplayMetrics mo48807xad90d981() {
        android.widget.FrameLayout frameLayout = this.f156371q;
        if (!frameLayout.isLaidOut()) {
            return super.mo48807xad90d981();
        }
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        android.util.DisplayMetrics displayMetrics = this.f169182h;
        if (displayMetrics == null) {
            displayMetrics = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0.A(w(), true);
            this.f169182h = displayMetrics;
        }
        if (measuredWidth > 0 && measuredHeight > 0) {
            displayMetrics.widthPixels = measuredWidth;
            displayMetrics.heightPixels = measuredHeight;
        }
        return displayMetrics;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    /* renamed from: getWindowAndroid */
    public xi1.g mo48808xee5260a9() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            throw new java.lang.NullPointerException("Null runtime");
        }
        java.util.ListIterator listIterator = this.f156372r.listIterator();
        boolean z17 = false;
        while (listIterator.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) listIterator.next();
            if (c11510xdd90c2f22 == c11510xdd90c2f2) {
                z17 = true;
            } else if (z17) {
                return c11510xdd90c2f22;
            }
        }
        if (z17) {
            return null;
        }
        throw new java.lang.IllegalAccessError(java.lang.String.format("Runtime not in stack %s", c11510xdd90c2f2.f156336n));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        if (c11808xe47dc718 == null) {
            return;
        }
        w().runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u4(this, c11510xdd90c2f2, c11808xe47dc718));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public final void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            return;
        }
        this.f156372r.remove(c11510xdd90c2f2);
        this.f156373s.remove(c11510xdd90c2f2.f156336n, c11510xdd90c2f2);
        android.view.ViewParent parent = c11510xdd90c2f2.f156343s.getParent();
        android.widget.FrameLayout frameLayout = this.f156371q;
        if (parent == frameLayout) {
            frameLayout.removeView(c11510xdd90c2f2.f156343s);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void l(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        c11510xdd90c2f2.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af.this;
                c11527x5889d9af.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = c11510xdd90c2f2;
                if (c11510xdd90c2f22.f156329e == c11527x5889d9af && c11510xdd90c2f22 == c11527x5889d9af.mo48805xd384d23c()) {
                    if (c11510xdd90c2f22.Y != null) {
                        return;
                    }
                    if (c11527x5889d9af.f156377w || c11527x5889d9af.E()) {
                        c11510xdd90c2f22.f0();
                    }
                }
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar) {
        android.widget.FrameLayout frameLayout = this.f156371q;
        int childCount = frameLayout.getChildCount();
        int i17 = 0;
        if (this.f156378x != null) {
            int childCount2 = frameLayout.getChildCount();
            if (childCount2 > 1 || (childCount2 == 1 && this.f156378x != null)) {
                i17 = childCount - 1;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "attachRtViewToTree: name = [%s], index = [%d]", (java.lang.String) qVar.getTag(), java.lang.Integer.valueOf(i17));
        if (qVar.getParent() != null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            ((android.view.ViewGroup) qVar.getParent()).removeAllViews();
        }
        frameLayout.addView(qVar, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f156378x;
        if (h1Var != null) {
            if (h1Var.getParent() == null) {
                frameLayout.addView(this.f156378x);
            }
            if (frameLayout == this.f156378x.getParent() && frameLayout.indexOfChild(this.f156378x) != frameLayout.getChildCount() - 1) {
                frameLayout.bringChildToFront(this.f156378x);
            }
        }
        mo48805xd384d23c().P(4, 1, this.f156380z);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public boolean n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        return c11510xdd90c2f2 != null && this.f156372r.contains(c11510xdd90c2f2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            return;
        }
        c11510xdd90c2f2.B1(this.f156380z);
        this.f156372r.remove(c11510xdd90c2f2);
        this.f156373s.remove(c11510xdd90c2f2.f156336n, c11510xdd90c2f2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0, xi1.g
    public boolean q5() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b8) this.f156374t).f171112a.F7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            return;
        }
        Y(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a5(this, c11510xdd90c2f2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        java.util.LinkedList linkedList = this.f156372r;
        int i17 = 0;
        for (int size = linkedList.size() - 1; size >= 0; size--) {
            if (linkedList.get(size) == c11510xdd90c2f2) {
                i17++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "stripRuntimeToOneInstance  size: " + i17 + " before " + linkedList);
        if (i17 >= 2) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext() && c11510xdd90c2f2 != it.next()) {
                it.next();
            }
            while (it.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) it.next()) == c11510xdd90c2f2) {
                    it.remove();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "stripRuntimeToOneInstance after " + linkedList);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.Object obj, java.lang.Runnable runnable) {
        android.app.Activity w17;
        if (c11510xdd90c2f2 == null || (w17 = w()) == null) {
            return;
        }
        w17.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w4(this, c11510xdd90c2f2, obj, runnable));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0
    public boolean u() {
        return true;
    }
}
