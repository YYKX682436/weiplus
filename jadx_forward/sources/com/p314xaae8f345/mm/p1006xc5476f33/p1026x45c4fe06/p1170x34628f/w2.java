package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class w2 extends me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 G;
    public android.view.View H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f168725J;
    public boolean K;
    public final int L;
    public final java.util.Map M;
    public final java.util.Set N;
    public int P;
    public int Q;
    public boolean R;
    public final boolean[] S;
    public final z26.e T;
    public boolean U;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 V;

    public w2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var) {
        super(context, null);
        this.I = true;
        this.f168725J = false;
        this.K = false;
        this.M = new java.util.HashMap();
        this.N = new java.util.HashSet();
        this.R = false;
        this.S = new boolean[]{false};
        this.T = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u2(this);
        this.U = false;
        this.G = i3Var;
        int S = m52228xa8f336fc().S();
        if (S <= 0) {
            this.L = super.m147193xd719d8d4();
        } else {
            m147197xd1d239e0(S);
            this.L = S;
        }
    }

    /* renamed from: getLocalClassName */
    private java.lang.String m52220x8d2a51ee() {
        return getClass().getName().replaceFirst(java.util.regex.Pattern.quote("com.tencent.mm.plugin.appbrand"), "");
    }

    public void A() {
        cf.i.b("AppBrandPageProfile| " + m52220x8d2a51ee() + " initView()", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t2(this));
    }

    public boolean B() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = mo14682x9dee9c37();
        if (mo14682x9dee9c37 != null) {
            return mo14682x9dee9c37.p2();
        }
        return false;
    }

    public abstract void C(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar);

    public void D() {
    }

    public abstract void E();

    public abstract void F();

    public abstract void G();

    public final void H(float f17) {
        boolean z17 = this.I;
        if (z17) {
            if (f17 >= 0.0f) {
                setVisibility(0);
            } else if (z17) {
                setVisibility(4);
            }
        }
        clearAnimation();
        setTranslationX((getWidth() / 4.0f) * (1.0f - f17) * (-1.0f));
    }

    public void I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 s2Var) {
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 J(int i17) {
        return null;
    }

    public void K(oi1.n nVar, oi1.l lVar) {
        if (nVar == null) {
            return;
        }
        synchronized (this.M) {
            if (lVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] remove " + nVar);
            } else {
                ((java.util.HashMap) this.M).put(nVar, lVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] add " + nVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPage", "[registerNavigateBackInterceptionInfo] navigateBackInterceptionInfos size=" + ((java.util.HashMap) this.M).size());
        }
    }

    public void L() {
        boolean z17;
        boolean w17;
        if (this.G.mo52154x9a3f0ba2().V1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = mo14682x9dee9c37();
            if (mo14682x9dee9c37 != null ? mo14682x9dee9c37.q2() : false) {
                m147199x8e764904(false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.G;
                if (i3Var.mo52154x9a3f0ba2().f156353y1) {
                    w17 = false;
                } else {
                    boolean z18 = i3Var.m52166xdf2f9ab6() <= 1;
                    if (i3Var.mo52154x9a3f0ba2().R0() && i3Var.mo52154x9a3f0ba2().B0() != null) {
                        z18 = false;
                    }
                    w17 = z18 ? i3Var.w() : true;
                }
                m147199x8e764904(w17);
            }
        } else {
            if (!this.G.mo52154x9a3f0ba2().f156353y1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c372 = mo14682x9dee9c37();
                if (!(mo14682x9dee9c372 != null ? mo14682x9dee9c372.q2() : false)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var2 = this.G;
                    if (i3Var2.m52166xdf2f9ab6() <= 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo52154x9a3f0ba2 = i3Var2.mo52154x9a3f0ba2();
                        if (mo52154x9a3f0ba2.V1()) {
                            throw new java.lang.RuntimeException("Stub!");
                        }
                        if (!(mo52154x9a3f0ba2.f156340p1 && !mo52154x9a3f0ba2.f156353y1)) {
                            z17 = false;
                            m147199x8e764904(z17);
                        }
                    }
                    z17 = true;
                    m147199x8e764904(z17);
                }
            }
            m147199x8e764904(false);
        }
        m147198x62a86d4b(1);
        m147202x1a6eb00e(this.G.X(this));
        m147197xd1d239e0(this.L);
        H(1.0f);
        this.S[0] = false;
        this.R = false;
        e();
    }

    public void M(long j17, java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void N(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r2(this, runnable));
            return;
        }
        java.lang.Object tag = getTag(com.p314xaae8f345.mm.R.id.f564708yo);
        if (tag instanceof android.animation.Animator) {
            ((android.animation.Animator) tag).addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s2(this, runnable));
        } else if (getAnimation() == null) {
            runnable.run();
        } else {
            this.N.add(runnable);
        }
    }

    /* renamed from: getAllElementsRect */
    public java.lang.String m52221xc2087186() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d88()).c();
    }

    /* renamed from: getAppId */
    public java.lang.String m52222x74292566() {
        return this.G.m52168x74292566();
    }

    /* renamed from: getContainer */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 m52223xe6eebdcb() {
        return this.G;
    }

    /* renamed from: getContentView */
    public final android.view.View m52224xc2a54588() {
        return this.H;
    }

    /* renamed from: getCurrentComponentId */
    public int m52225xaa0531b5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = mo14682x9dee9c37();
        if (mo14682x9dee9c37 != null) {
            return mo14682x9dee9c37.mo50260x9f1221c2();
        }
        return -1;
    }

    /* renamed from: getCurrentPageView */
    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37();

    /* renamed from: getCurrentUrl */
    public abstract java.lang.String mo14683xad58292c();

    /* renamed from: getCurrentWindowId */
    public int mo52213x2838138e() {
        return -1;
    }

    /* renamed from: getNativeComponentInfo */
    public java.lang.String m52226x616d093e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 w07 = m52229x9a3f0ba2().w0();
        android.util.SparseArray clone = w07.f173280a.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clone, "clone(...)");
        int size = clone.size();
        for (int i17 = 0; i17 < size; i17++) {
            clone.keyAt(i17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d88()).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.t2((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) clone.valueAt(i17)));
        }
        android.util.SparseArray clone2 = w07.f173281b.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clone2, "clone(...)");
        int size2 = clone2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            clone2.keyAt(i18);
            fl1.b2 b2Var = (fl1.b2) clone2.valueAt(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 m52230xca9c2d88 = m52230xca9c2d88();
            android.view.View mo81952xc2a54588 = b2Var.mo81952xc2a54588();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo81952xc2a54588, "getContentView(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d88).e(mo81952xc2a54588);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 m52230xca9c2d882 = m52230xca9c2d88();
        android.view.ViewGroup viewGroup = mo14682x9dee9c37().mo51311x3eebbc35().f168290a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup, "getRootView(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d882).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.d2(viewGroup));
        tl1.b bVar = (tl1.b) m52229x9a3f0ba2().f156343s.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564722z2);
        if (bVar != null && bVar.getVisibility() == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d88()).e(bVar);
        }
        java.lang.String b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d88()).b();
        int size3 = clone.size();
        for (int i19 = 0; i19 < size3; i19++) {
            clone.keyAt(i19);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d88()).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.t2((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) clone.valueAt(i19)));
        }
        int size4 = clone2.size();
        for (int i27 = 0; i27 < size4; i27++) {
            clone2.keyAt(i27);
            fl1.b2 b2Var2 = (fl1.b2) clone2.valueAt(i27);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 m52230xca9c2d883 = m52230xca9c2d88();
            android.view.View mo81952xc2a545882 = b2Var2.mo81952xc2a54588();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo81952xc2a545882, "getContentView(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d883).h(mo81952xc2a545882);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 m52230xca9c2d884 = m52230xca9c2d88();
        android.view.ViewGroup viewGroup2 = mo14682x9dee9c37().mo51311x3eebbc35().f168290a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup2, "getRootView(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d884).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.d2(viewGroup2));
        if (bVar != null && bVar.getVisibility() == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3) m52230xca9c2d88()).h(bVar);
        }
        return b17;
    }

    /* renamed from: getPageConfig */
    public k91.f m52227x1f6322a7() {
        return mo14682x9dee9c37().M1();
    }

    /* renamed from: getPageContainer */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 m52228xa8f336fc() {
        return this.G;
    }

    /* renamed from: getRuntime */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 m52229x9a3f0ba2() {
        return this.G.mo52154x9a3f0ba2();
    }

    /* renamed from: getSerializer */
    public final synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s2 m52230xca9c2d88() {
        if (this.V == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q3();
            this.V = q3Var;
            I(q3Var);
        }
        return this.V;
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12498x9f7db235 c12498x9f7db235) {
        if (c12498x9f7db235 == null || c12498x9f7db235.getParent() != null) {
            return;
        }
        android.view.View view = this.H;
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).addView(c12498x9f7db235, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    public abstract void k();

    public boolean o(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = mo14682x9dee9c37();
        return mo14682x9dee9c37 != null && mo14682x9dee9c37.mo50260x9f1221c2() == i17;
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        java.util.HashSet hashSet = (java.util.HashSet) this.N;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        hashSet.clear();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (this.I) {
            this.f168725J = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = mo14682x9dee9c37();
        if (mo14682x9dee9c37 != null) {
            mo14682x9dee9c37.x2(configuration);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!this.K && this.I && !this.f168725J && this.P > 0 && this.Q > 0) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.P, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.Q, 1073741824));
            return;
        }
        super.onMeasure(i17, i18);
        this.P = getMeasuredWidth();
        this.Q = getMeasuredHeight();
    }

    public abstract android.view.View p();

    public abstract void r(java.lang.String str, java.lang.String str2, int[] iArr);

    public final void s(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        if (this.G == null) {
            return;
        }
        D();
        t(j17, "onAppRouteDone", wdVar, null, null, null);
        this.G.j(mo14682x9dee9c37());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pa paVar = this.G.f168252y;
        paVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        paVar.b(j17, "routeStartTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), false);
    }

    /* renamed from: setForceDisableMeasureCache */
    public void m52231x4e564163(boolean z17) {
        this.K = z17;
    }

    /* renamed from: setInitialUrl */
    public abstract void mo14685x5050858d(java.lang.String str);

    /* renamed from: setIsAnimating */
    public void m52232xf9241792(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = mo14682x9dee9c37();
        if (mo14682x9dee9c37 != null) {
            mo14682x9dee9c37.Y2(z17);
        }
    }

    public final void t(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 a5Var, org.json.JSONObject jSONObject, java.util.HashMap hashMap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar2;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        org.json.JSONObject jSONObject5;
        sj1.l.e(m52222x74292566(), "internal:prepare", u46.l.k(new java.lang.String[]{"dispatchRoute", str, wdVar.name()}, "-"));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        boolean equals = "onAppRouteDone".equals(str);
        java.lang.String mo14683xad58292c = mo14683xad58292c();
        java.lang.String a17 = nf.z.a(mo14683xad58292c);
        java.util.Map c17 = nf.z.c(mo14683xad58292c);
        hashMap2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, a17);
        hashMap2.put("query", c17);
        hashMap2.put("rawPath", mo14683xad58292c);
        java.util.Map map = (java.util.Map) this.G.f168252y.f168547c.get(j17);
        boolean z17 = map != null && (map.get("overrideEntryPagePath") instanceof java.lang.Boolean) && ((java.lang.Boolean) map.get("overrideEntryPagePath")).booleanValue();
        hashMap2.put("overrideEntryPagePath", java.lang.Boolean.valueOf(z17));
        java.lang.String str2 = map != null ? (java.lang.String) map.get("routeJsRouteId") : null;
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap2.put("routeId", str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pa paVar = this.G.f168252y;
        paVar.getClass();
        if (paVar.f168546b.get(j17, null) != wdVar || (wdVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd) paVar.f168545a.get(j17, null)) == null) {
            wdVar2 = wdVar;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainer.AppRouteMetricsContext", "restore target(%s) -> source(%s), routeId:%d, isAppRouteDone:%b", wdVar, wdVar2, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(equals));
        }
        hashMap2.put("openType", wdVar2.f168765d);
        if (a5Var != null) {
            hashMap2.put("pipMode", a5Var.f167930d);
        }
        if (!equals) {
            hashMap2.put("qualityData", map);
            ni1.e eVar = (ni1.e) mo14682x9dee9c37().B1(ni1.e.class);
            hashMap2.put("resizing", java.lang.Boolean.valueOf(eVar != null && eVar.a()));
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_BACK != wdVar) {
                k91.r m52167x3d3d7e0d = this.G.m52167x3d3d7e0d();
                if (((!m52167x3d3d7e0d.f387270d || (jSONObject5 = m52167x3d3d7e0d.G) == null || jSONObject5.length() == 0) ? m52167x3d3d7e0d.F : m52167x3d3d7e0d.G) != null) {
                    k91.r m52167x3d3d7e0d2 = this.G.m52167x3d3d7e0d();
                    hashMap2.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, ((!m52167x3d3d7e0d2.f387270d || (jSONObject4 = m52167x3d3d7e0d2.G) == null || jSONObject4.length() == 0) ? m52167x3d3d7e0d2.F : m52167x3d3d7e0d2.G).opt(a17));
                }
                k91.r m52167x3d3d7e0d3 = this.G.m52167x3d3d7e0d();
                if (((!m52167x3d3d7e0d3.f387270d || (jSONObject3 = m52167x3d3d7e0d3.I) == null || jSONObject3.length() == 0) ? m52167x3d3d7e0d3.H : m52167x3d3d7e0d3.I) != null) {
                    java.lang.String t17 = u46.l.t(a17, 0, a17.lastIndexOf(".html"));
                    k91.r m52167x3d3d7e0d4 = this.G.m52167x3d3d7e0d();
                    hashMap2.put("preloadRule", ((!m52167x3d3d7e0d4.f387270d || (jSONObject2 = m52167x3d3d7e0d4.I) == null || jSONObject2.length() == 0) ? m52167x3d3d7e0d4.H : m52167x3d3d7e0d4.I).opt(t17));
                }
            }
        }
        mo14682x9dee9c37().B2(equals, hashMap2, wdVar, jSONObject);
        int optInt = mo14682x9dee9c37().p2() ? ((org.json.JSONObject) hashMap2.get("singlePageData")).optInt("pageId", 0) : mo14682x9dee9c37().mo50260x9f1221c2();
        nf.f.c(hashMap2);
        java.lang.String jSONObject6 = new org.json.JSONObject(hashMap2).toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPage", "dispatchRoute, appId:%s, event:%s, type:%s, windowId:%d, pageId:%d, rawPath:%s, data:%s overrideEntryPagePath:%s", m52222x74292566(), str, wdVar.f168765d, java.lang.Integer.valueOf(mo52213x2838138e()), java.lang.Integer.valueOf(optInt), mo14683xad58292c, jSONObject6, "" + z17);
        mo14682x9dee9c37().d(str, jSONObject6, null);
        sj1.l.g(m52222x74292566());
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 u(int i17);

    public oi1.l w(oi1.n nVar) {
        oi1.l lVar;
        synchronized (this.M) {
            lVar = (oi1.l) ((java.util.HashMap) this.M).get(nVar);
        }
        return lVar;
    }

    public abstract boolean x(java.lang.String str);

    public boolean z(int[] iArr, int i17) {
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        for (int i18 : iArr) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }
}
