package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class y1 extends com.tencent.mm.plugin.appbrand.page.w2 {
    public boolean A1;
    public final java.lang.Runnable B1;
    public final java.lang.Runnable C1;
    public final java.util.LinkedList D1;
    public java.lang.String W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.FrameLayout f87266l1;

    /* renamed from: p0, reason: collision with root package name */
    public final android.util.SparseIntArray f87267p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f87268p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f87269x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.Map f87270x1;

    /* renamed from: y0, reason: collision with root package name */
    public zl1.t f87271y0;

    /* renamed from: y1, reason: collision with root package name */
    public final android.util.SparseArray f87272y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f87273z1;

    public y1(android.content.Context context, com.tencent.mm.plugin.appbrand.page.i3 i3Var) {
        super(context, i3Var);
        this.f87267p0 = new android.util.SparseIntArray();
        this.f87270x1 = new java.util.HashMap();
        this.f87272y1 = new android.util.SparseArray();
        this.f87273z1 = false;
        this.A1 = false;
        this.B1 = new com.tencent.mm.plugin.appbrand.page.z1(this);
        this.C1 = new com.tencent.mm.plugin.appbrand.page.b2(this);
        this.D1 = new java.util.LinkedList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r6.getChildAt(r6.getChildCount() - 1) == r2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void O(com.tencent.mm.plugin.appbrand.page.y1 r21, long r22, java.lang.String r24, com.tencent.mm.plugin.appbrand.page.wd r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.y1.O(com.tencent.mm.plugin.appbrand.page.y1, long, java.lang.String, com.tencent.mm.plugin.appbrand.page.wd):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void C(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        R(j17, str, null, wdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void D() {
        getCurrentPageView().getClass();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void E() {
        getCurrentUrl();
        getCurrentPageView().v2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void F() {
        getCurrentUrl();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87268p1;
        if (v5Var != null) {
            v5Var.A2();
        }
        java.util.Iterator it = new x.d(((java.util.HashMap) this.f87270x1).values()).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.page.v5) it.next()).A2();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void G() {
        getCurrentUrl();
        L();
        setVisibility(0);
        getCurrentPageView().C2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void I(com.tencent.mm.plugin.appbrand.wxassistant.s2 s2Var) {
        ((com.tencent.mm.plugin.appbrand.wxassistant.q3) s2Var).e(this.f87271y0);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public com.tencent.mm.plugin.appbrand.page.v5 J(int i17) {
        com.tencent.mm.plugin.appbrand.page.k2 k2Var;
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiplePage", "recycleAppBrandPageView webviewId:%d", java.lang.Integer.valueOf(i17));
        java.util.Map map = this.f87270x1;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (true) {
            k2Var = null;
            if (!it.hasNext()) {
                str = "";
                v5Var = null;
                break;
            }
            str = (java.lang.String) it.next();
            v5Var = (com.tencent.mm.plugin.appbrand.page.v5) ((java.util.HashMap) map).get(str);
            if (v5Var != null && i17 == v5Var.getComponentId()) {
                v5Var.S2();
                break;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.appbrand.page.b7 b7Var = com.tencent.mm.plugin.appbrand.page.b7.f86429a;
            ((java.util.HashMap) map).put(str, com.tencent.mm.plugin.appbrand.page.b7.f86432d);
            java.util.LinkedList linkedList = this.D1;
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.page.k2 k2Var2 = (com.tencent.mm.plugin.appbrand.page.k2) it6.next();
                if (str.equals(k2Var2.f86816d)) {
                    k2Var = k2Var2;
                    break;
                }
            }
            if (k2Var != null) {
                removeCallbacks(k2Var);
                linkedList.remove(k2Var);
            }
        }
        return v5Var;
    }

    public final void P(boolean z17) {
        java.util.LinkedList linkedList = this.D1;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.k2 k2Var = (com.tencent.mm.plugin.appbrand.page.k2) it.next();
            removeCallbacks(k2Var);
            if (z17) {
                k2Var.run();
            } else {
                k2Var.f86818f = true;
            }
        }
        linkedList.clear();
    }

    public synchronized com.tencent.mm.plugin.appbrand.page.v5 Q(boolean z17) {
        if (!z17) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87268p1;
            if (v5Var != null) {
                return v5Var;
            }
        }
        return (com.tencent.mm.plugin.appbrand.page.v5) ((java.util.HashMap) this.f87270x1).get(nf.z.a(this.W));
    }

    public final void R(long j17, final java.lang.String str, com.tencent.mm.plugin.appbrand.page.j2 j2Var, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        int i17;
        int i18;
        boolean z17;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        u65.a aVar;
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiplePage", "AppBrandPageProfile| loadUrl, appId:%s, url:%s", getAppId(), str);
        com.tencent.mm.plugin.appbrand.page.v5 Q = Q(true);
        if (Q != null) {
            int b27 = Q.b2();
            int componentId = Q.getComponentId();
            z17 = Q.p2();
            i17 = b27;
            i18 = componentId;
        } else {
            i17 = -1;
            i18 = -1;
            z17 = false;
        }
        if (u46.l.c(str, this.W) && this.f87267p0.get(str.hashCode(), 0) == 1) {
            if (j2Var != null) {
                j2Var.b(this, str);
                com.tencent.mm.plugin.appbrand.page.jb skylineRouter = getContainer().getSkylineRouter();
                if (skylineRouter != null && wdVar == com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB) {
                    ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) skylineRouter).f(j17, str, z17, i17, i18, z17, i17, i18, wdVar, null, null);
                }
                j2Var.a(this, str);
                return;
            }
            return;
        }
        int b17 = this.f87271y0.b(str);
        if (b17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMultiplePage", "loadUrl, index not found, appId:%s, url:%s", getAppId(), str);
            if (j2Var != null) {
                j2Var.c(this, str);
                return;
            }
            return;
        }
        P(true);
        this.W = str;
        this.f87267p0.put(str.hashCode(), 1);
        this.f87271y0.f(b17);
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = (com.tencent.mm.plugin.appbrand.page.v5) ((java.util.HashMap) this.f87270x1).get(nf.z.a(str));
        if (!(v5Var2 == null ? true : v5Var2.equals(com.tencent.mm.plugin.appbrand.page.b7.f86432d))) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var3 = (com.tencent.mm.plugin.appbrand.page.v5) ((java.util.HashMap) this.f87270x1).get(nf.z.a(str));
            final com.tencent.mm.plugin.appbrand.page.f2 f2Var = new com.tencent.mm.plugin.appbrand.page.f2(this, str, v5Var3, wdVar, j17, z17, i17, i18, j2Var);
            if (v5Var3 == null || !v5Var3.p2()) {
                f2Var.run();
                return;
            }
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            v5Var3.X0(io.flutter.embedding.android.RenderMode.texture, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.page.y1 y1Var = com.tencent.mm.plugin.appbrand.page.y1.this;
                    y1Var.getClass();
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    com.tencent.mm.plugin.appbrand.utils.s3.b("MicroMsg.AppBrandMultiplePage", "Tab[%s][%s] switchToImage received, time: %d", y1Var.getAppId(), str, java.lang.Long.valueOf(currentTimeMillis2));
                    f2Var.run();
                }
            }, 500L);
            v5Var3.o3();
            if (((java.util.HashMap) this.f87270x1).size() > 1) {
                this.D1.addLast(f2Var);
                postDelayed(f2Var, 500L);
                return;
            }
            return;
        }
        java.lang.String a17 = nf.z.a(str);
        synchronized (this) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var4 = this.f87268p1;
            if (v5Var4 != null) {
                this.f87268p1 = null;
            } else {
                v5Var4 = getContainer().o(a17);
                v5Var4.W = this;
            }
            v5Var = v5Var4;
            ((java.util.HashMap) this.f87270x1).put(a17, v5Var);
            this.f87266l1.addView(v5Var.getContentView(), 0);
        }
        boolean[] zArr = new boolean[1];
        com.tencent.mm.plugin.appbrand.page.e2 e2Var = new com.tencent.mm.plugin.appbrand.page.e2(this, j2Var, zArr, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMultiplePage", "loadAndWait appId[%s] url[%s]", getAppId(), str);
        final com.tencent.mm.plugin.appbrand.page.g2 g2Var = new com.tencent.mm.plugin.appbrand.page.g2(this, str, j17, wdVar, e2Var);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean3 = new java.util.concurrent.atomic.AtomicBoolean(false);
        try {
            final long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            final u65.a aVar2 = new u65.a(v5Var.p2() ? 2 : 1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$c
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.page.y1 y1Var = com.tencent.mm.plugin.appbrand.page.y1.this;
                    y1Var.getClass();
                    boolean z19 = atomicBoolean3.get();
                    com.tencent.mm.plugin.appbrand.page.k2 k2Var = g2Var;
                    if (z19) {
                        k2Var.run();
                    } else {
                        y1Var.post(k2Var);
                    }
                }
            });
            if (v5Var.p2()) {
                try {
                    atomicBoolean2 = atomicBoolean3;
                    aVar = aVar2;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    atomicBoolean2 = atomicBoolean3;
                    atomicBoolean = atomicBoolean2;
                    atomicBoolean.set(true);
                    throw th;
                }
                try {
                    v5Var.X0(io.flutter.embedding.android.RenderMode.texture, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$d
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.appbrand.page.y1 y1Var = com.tencent.mm.plugin.appbrand.page.y1.this;
                            y1Var.getClass();
                            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
                            com.tencent.mm.plugin.appbrand.utils.s3.b("MicroMsg.AppBrandMultiplePage", "Tab[%s][%s] switchToImage received, time: %d", y1Var.getAppId(), str, java.lang.Long.valueOf(currentTimeMillis3));
                            aVar2.b();
                        }
                    }, 500L);
                    v5Var.o3();
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    atomicBoolean = atomicBoolean2;
                    atomicBoolean.set(true);
                    throw th;
                }
            } else {
                aVar = aVar2;
                atomicBoolean2 = atomicBoolean3;
            }
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean4 = atomicBoolean2;
            try {
                v5Var.P(new com.tencent.mm.plugin.appbrand.page.h2(this, v5Var, currentTimeMillis2, str, aVar));
                if (((java.util.HashMap) this.f87270x1).size() > 1) {
                    try {
                        this.D1.addLast(g2Var);
                        postDelayed(g2Var, 500L);
                        z18 = true;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        atomicBoolean = atomicBoolean4;
                        atomicBoolean.set(true);
                        throw th;
                    }
                } else {
                    z18 = true;
                }
                this.f87273z1 = z18;
                v5Var.r2(j17, str, wdVar);
                atomicBoolean4.set(z18);
                int b28 = v5Var.b2();
                int componentId2 = v5Var.getComponentId();
                boolean p27 = v5Var.p2();
                com.tencent.mm.plugin.appbrand.page.jb skylineRouter2 = getContainer().getSkylineRouter();
                if (skylineRouter2 != null && wdVar == com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB) {
                    ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) skylineRouter2).f(j17, str, z17, i17, i18, p27, b28, componentId2, wdVar, null, null);
                }
                if (j2Var != null) {
                    j2Var.b(this, str);
                    zArr[0] = true;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            atomicBoolean = atomicBoolean3;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public synchronized com.tencent.mm.plugin.appbrand.page.v5 getCurrentPageView() {
        return Q(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public java.lang.String getCurrentUrl() {
        return this.W;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public int getCurrentWindowId() {
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.page.v5> linkedList = new java.util.LinkedList(((java.util.HashMap) this.f87270x1).values());
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87268p1;
        if (v5Var != null) {
            linkedList.add(v5Var);
        }
        int i17 = -1;
        for (com.tencent.mm.plugin.appbrand.page.v5 v5Var2 : linkedList) {
            if (v5Var2.p2()) {
                if (i17 == -1) {
                    i17 = v5Var2.b2();
                } else if (i17 != v5Var2.b2()) {
                    com.tencent.mm.plugin.appbrand.utils.s3.a("MicroMsg.AppBrandMultiplePage", "mPageViews has diff windowId,error ,windowId is [%d],other windowId is [%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v5Var2.b2()));
                }
            }
        }
        return i17;
    }

    public zl1.t getTabBar() {
        return this.f87271y0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void i(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView appBrandPageFullScreenView) {
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMultiplePage", "getCurrentFullScreenView err, pageView is null");
            return;
        }
        if (appBrandPageFullScreenView == null || appBrandPageFullScreenView.getParent() != null) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f87269x0;
        if (viewGroup instanceof android.view.ViewGroup) {
            viewGroup.addView(appBrandPageFullScreenView, new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f87272y1.put(v5Var.hashCode(), appBrandPageFullScreenView);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void k() {
        this.A1 = true;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87268p1;
        if (v5Var != null) {
            v5Var.h();
        }
        java.util.Map map = this.f87270x1;
        java.util.Iterator it = new x.d(((java.util.HashMap) map).values()).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.page.v5) it.next()).h();
        }
        P(false);
        removeCallbacks(this.B1);
        removeCallbacks(this.C1);
        zl1.t tVar = this.f87271y0;
        if (tVar != null) {
            tVar.setClickListener(null);
            this.f87271y0.a();
            this.f87271y0 = null;
        }
        this.f87266l1 = null;
        ((java.util.HashMap) map).clear();
        removeAllViews();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public boolean o(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList(((java.util.HashMap) this.f87270x1).values());
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87268p1;
        if (v5Var != null) {
            linkedList.add(v5Var);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.appbrand.page.v5) it.next()).getComponentId() == i17) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        if (view2 instanceof al1.l) {
            if (!this.A1) {
                post(this.B1);
            }
            if (this.A1) {
                return;
            }
            java.lang.Runnable runnable = this.C1;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (!this.A1) {
            post(this.B1);
        }
        if (this.A1) {
            return;
        }
        java.lang.Runnable runnable = this.C1;
        removeCallbacks(runnable);
        post(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public android.view.View p() {
        if (this.f87269x0 == null) {
            com.tencent.mm.plugin.appbrand.page.l2 l2Var = new com.tencent.mm.plugin.appbrand.page.l2(this, getContext());
            this.f87266l1 = new android.widget.FrameLayout(getContext());
            this.f87271y0 = (zl1.t) cf.i.a("createTabBar", new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.page.y1$$b
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.plugin.appbrand.page.y1 y1Var = com.tencent.mm.plugin.appbrand.page.y1.this;
                    zl1.t tVar = (zl1.t) y1Var.getContainer().getDecorWidgetFactory().a(y1Var.getContext(), zl1.t.class);
                    tVar.setId(com.tencent.mm.R.id.f483173yn);
                    k91.n e17 = y1Var.getContainer().getAppConfig().e();
                    tVar.setPosition(e17.f305683a);
                    tVar.e(new zl1.g(tVar, e17.f305684b, e17.f305685c, e17.f305686d, e17.f305687e));
                    java.util.Iterator it = e17.f305689g.iterator();
                    while (it.hasNext()) {
                        k91.o oVar = (k91.o) it.next();
                        com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem appBrandTabBarItem = (com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem) y1Var.getContainer().getDecorWidgetFactory().a(y1Var.getContext(), com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem.class);
                        java.lang.String str = oVar.f305697a;
                        zl1.r rVar = new zl1.r();
                        rVar.f473606b = new zl1.v(oVar.f305699c, new zl1.h(tVar));
                        rVar.f473607c = new zl1.v(oVar.f305700d, new zl1.i(tVar));
                        rVar.f473608d = oVar.f305698b;
                        rVar.f473605a = str;
                        tVar.f473621m.add(new android.util.Pair(rVar.f473606b, rVar.f473607c));
                        if (rVar.f473608d == null && (rVar.f473606b.a() == null || rVar.f473607c.a() == null)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageTabBar", "illegal data");
                        } else {
                            if (appBrandTabBarItem == null) {
                                appBrandTabBarItem = new com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem(tVar.getContext());
                            }
                            tVar.g(appBrandTabBarItem, rVar);
                            zk1.m.a(appBrandTabBarItem, null, null, false, null, null, null, new zl1.j(tVar, rVar), null, null, null, null, null);
                            appBrandTabBarItem.setOnClickListener(new zl1.k(tVar));
                            tVar.f473620i.add(rVar);
                            tVar.f473616e.addView(appBrandTabBarItem);
                        }
                    }
                    tVar.setClickListener(new com.tencent.mm.plugin.appbrand.page.c2(y1Var, e17));
                    return tVar;
                }
            });
            if (getContainer().getAppConfig().e().f305688f) {
                this.f87271y0.setVisibility(8);
            }
            if ("top".equals(getContainer().getAppConfig().e().f305683a)) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                l2Var.addView(this.f87266l1, layoutParams);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(10);
                l2Var.addView(this.f87271y0, layoutParams2);
            } else {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(12);
                l2Var.addView(this.f87271y0, layoutParams3);
                android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams4.addRule(2, this.f87271y0.getId());
                layoutParams4.removeRule(12);
                l2Var.addView(this.f87266l1, layoutParams4);
            }
            this.f87269x0 = l2Var;
            com.tencent.mm.plugin.appbrand.page.v5 o17 = getContainer().o(this.W);
            this.f87268p1 = o17;
            o17.W = this;
            java.lang.String currentUrl = getCurrentUrl();
            o17.D = nf.z.a(currentUrl);
            o17.E = currentUrl;
        }
        return this.f87269x0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void r(java.lang.String str, java.lang.String str2, int[] iArr) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87268p1;
        if (v5Var != null && z(iArr, v5Var.getComponentId())) {
            this.f87268p1.g(str, str2);
        }
        java.util.Iterator it = new x.d(((java.util.HashMap) this.f87270x1).values()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = (com.tencent.mm.plugin.appbrand.page.v5) it.next();
            if (z(iArr, v5Var2.getComponentId())) {
                v5Var2.g(str, str2);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void setInitialUrl(java.lang.String str) {
        this.W = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public com.tencent.mm.plugin.appbrand.page.v5 u(int i17) {
        for (com.tencent.mm.plugin.appbrand.page.v5 v5Var : ((java.util.HashMap) this.f87270x1).values()) {
            if (v5Var.getComponentId() == i17) {
                return v5Var;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public boolean x(java.lang.String str) {
        return this.f87271y0.b(str) != -1;
    }
}
