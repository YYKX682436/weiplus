package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class v5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 A;
    public java.lang.String A1;
    public final java.lang.Class B;
    public boolean[] B1;
    public java.lang.ref.WeakReference C;
    public final java.lang.Object C1;
    public java.lang.String D;
    public int[] D1;
    public java.lang.String E;
    public int[] E1;
    public android.view.ViewGroup F;
    public final java.util.concurrent.atomic.AtomicBoolean F1;
    public al1.l G;
    public boolean G1;
    public al1.b H;
    public volatile p012xc85e97e9.p093xedfae76a.y H1;
    public android.widget.FrameLayout I;
    public final java.util.Set I1;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia f168694J;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb L;
    public jg1.b M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m N;
    public volatile boolean P;
    public volatile boolean Q;
    public volatile boolean R;
    public al1.j0 S;
    public xi1.m T;
    public java.util.List U;
    public final ul1.e V;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 W;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ud X;
    public xi1.g Y;
    public boolean Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f168695l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f168696p0;

    /* renamed from: p1, reason: collision with root package name */
    public long f168697p1;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.LinkedList f168698x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.LinkedList f168699x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f168700y0;

    /* renamed from: y1, reason: collision with root package name */
    public final fl1.d2 f168701y1;

    /* renamed from: z, reason: collision with root package name */
    public final int f168702z;

    /* renamed from: z1, reason: collision with root package name */
    public tj1.m f168703z1;

    public v5(java.lang.Class cls) {
        this.f168702z = com.p314xaae8f345.mm.R.id.f564620w8;
        this.C = new java.lang.ref.WeakReference(null);
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = null;
        this.V = new ul1.e(this);
        this.X = null;
        this.Y = new xi1.h();
        this.Z = false;
        this.f168696p0 = false;
        this.f168698x0 = new java.util.LinkedList();
        this.f168700y0 = -1;
        this.f168695l1 = 0;
        this.f168697p1 = 0L;
        this.f168699x1 = new java.util.LinkedList();
        this.f168701y1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g6(this);
        this.f168703z1 = null;
        this.C1 = new byte[0];
        this.D1 = new int[0];
        this.E1 = new int[0];
        this.F1 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.G1 = false;
        this.I1 = new java.util.HashSet();
        this.B = cls;
    }

    private void c2(p012xc85e97e9.p093xedfae76a.m mVar) {
        if (this.H1 == null) {
            return;
        }
        if (p012xc85e97e9.p093xedfae76a.m.ON_DESTROY != mVar || ((p012xc85e97e9.p093xedfae76a.b0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n6) this.H1).f168441d).f93138c.a(p012xc85e97e9.p093xedfae76a.n.CREATED)) {
            ((p012xc85e97e9.p093xedfae76a.b0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n6) this.H1).f168441d).f(mVar);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ud A1() {
        return this.X;
    }

    public final void A2() {
        M2();
        if (Q1() != null) {
            Q1().m();
        }
        D();
        c2(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
        synchronized (this.I1) {
            ((java.util.HashSet) this.I1).clear();
        }
    }

    public final <T> T B1(java.lang.Class<T> cls) {
        if (Q1() != null) {
            return (T) Q1().r(cls);
        }
        return null;
    }

    public void B2(boolean z17, java.util.Map<java.lang.String, java.lang.Object> map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, org.json.JSONObject jSONObject) {
        int optInt;
        int i17;
        boolean z18 = true;
        if (!z17) {
            if (this.B1 == null) {
                this.B1 = new boolean[]{Q1() != null && Q1().g()};
            }
            if (this.B1[0]) {
                map.put("notFound", java.lang.Boolean.TRUE);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REWRITE_ROUTE == wdVar) {
                synchronized (this.C1) {
                    mo50260x9f1221c2();
                    i17 = this.D1[0];
                }
                map.put("originalWebviewId", java.lang.Integer.valueOf(i17));
            }
            if (jSONObject != null && (optInt = jSONObject.optInt(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b7.f167964c, -1)) != -1) {
                map.put("originalWebviewId", java.lang.Integer.valueOf(optInt));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 Q1 = Q1();
            if (Q1 != null) {
                Q1.u(map, wdVar);
            }
        }
        if (p2()) {
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            try {
                jSONObject.put("windowId", b2());
                jSONObject.put("pageId", mo50260x9f1221c2());
                if (b2() != mo50260x9f1221c2()) {
                    z18 = false;
                }
                jSONObject.put("isNewEngineHomePage", z18);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageView", "dispatchRouteImpl, event:%s, type:%s, put viewId for customRoute, get exception:%s", e17);
            }
            map.put("singlePageData", jSONObject);
        }
    }

    public final xi1.m C1() {
        xi1.m mVar = this.T;
        if (mVar != null) {
            return mVar;
        }
        if (mo50261xee5260a9() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageView", "getFullscreenImpl NULL windowAndroid, appId[%s] url[%s]", mo48798x74292566(), X1());
            return null;
        }
        xi1.m mo51609xe80d1173 = mo50261xee5260a9().mo51609xe80d1173(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x5(this));
        this.T = mo51609xe80d1173;
        mo51609xe80d1173.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y5(this));
        return this.T;
    }

    public final void C2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o4 o4Var;
        N0(t3().mo48803xee5260a9());
        this.R = true;
        if (Q1() != null) {
            Q1().n();
        }
        N2();
        Y();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = t3();
        if (t37 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
            o4Var = null;
        } else {
            o4Var = t37.T1;
        }
        if (o4Var != null) {
            boolean j37 = j3();
            boolean z17 = o4Var.f172058c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f172057b, "setHiddenInBackgroundSwitch, runtimeSwitch: " + z17 + ", pageSwitch: " + j37);
            if (z17) {
                o4Var.b();
            } else if (j37) {
                o4Var.b();
            } else {
                o4Var.a();
            }
        }
        c2(p012xc85e97e9.p093xedfae76a.m.ON_START);
        c2(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51312xabfae012() {
        return t3().D1;
    }

    public final void D2(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.W;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 m52228xa8f336fc = w2Var != null ? w2Var.m52228xa8f336fc() : t3() != null ? t3().x0() : null;
        if (m52228xa8f336fc != null) {
            long x17 = x1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pa paVar = m52228xa8f336fc.f168252y;
            paVar.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            paVar.b(x17, "routeInitReadyTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), false);
        }
        boolean andSet = this.F1.getAndSet(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageView", "onInitReady appId:%s, url:%s, reason:%s, called:%b", mo48798x74292566(), X1(), str, java.lang.Boolean.valueOf(andSet));
        if (andSet) {
            return;
        }
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a6(this));
    }

    public final android.view.ViewGroup E1() {
        return I1().mo14679xe6eebdcb();
    }

    public boolean E2(android.view.View view, java.lang.Runnable runnable) {
        return false;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 F1() {
        if (mo50352x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4) mo50352x76847179();
        }
        return null;
    }

    public boolean F2(android.view.View view, java.lang.Runnable runnable, long j17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public final boolean G0() {
        if (Q1() == null) {
            return this.Q;
        }
        ni1.i iVar = (ni1.i) Q1().r(ni1.i.class);
        if (iVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc) iVar;
        return wcVar.f0() != null && wcVar.f0().i0();
    }

    public final java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0> G1() {
        if (this.U == null) {
            this.U = j1();
        }
        return this.U;
    }

    public void G2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ge geVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.C.get();
        if (c11510xdd90c2f2 == null || c11510xdd90c2f2.x0() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pa paVar = c11510xdd90c2f2.x0().f168252y;
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public final boolean H0() {
        if (Q1() == null) {
            return t3() == null;
        }
        ni1.i iVar = (ni1.i) Q1().r(ni1.i.class);
        return iVar != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc) iVar).a0();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 H1(int i17) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var : G1()) {
            if (u0Var != null && u0Var.f167526a == i17) {
                return u0Var;
            }
        }
        return null;
    }

    public void H2(java.lang.String str) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib I1() {
        return this.K;
    }

    public void I2(java.util.List list, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w5(this, this, new java.util.LinkedList(list), false, runnable, runnable2).g();
    }

    public java.lang.String J1() {
        al1.b r17 = r1();
        java.lang.CharSequence m2212xefd74969 = r17 == null ? null : r17.m2212xefd74969();
        return m2212xefd74969 != null ? m2212xefd74969.toString() : "";
    }

    public final void J2() {
        this.G.m2239xb6ab3395(true);
    }

    public final java.lang.String K1() {
        return nf.z.a(this.A1);
    }

    public void K2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar = this.L;
        if (fbVar != null) {
            fbVar.mo14659x5cd39ffa();
        }
        if (mo51311x3eebbc35() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35 = mo51311x3eebbc35();
            mo51311x3eebbc35.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ca caVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ca(mo51311x3eebbc35, 1000L, java.lang.Boolean.FALSE);
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                caVar.a(null);
            }
            caVar.a(mo51311x3eebbc35.f168291b);
        }
        if (r1() != null) {
            r1().f();
        }
        android.view.ViewGroup viewGroup = this.F;
        if (viewGroup != null) {
            viewGroup.removeAllViewsInLayout();
        }
        al1.l lVar = this.G;
        if (lVar != null) {
            lVar.m2239xb6ab3395(false);
            this.G.removeAllViewsInLayout();
        }
        android.widget.FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            frameLayout.removeAllViewsInLayout();
        }
        P1().b(true);
        if (t3() != null) {
            fl1.g2 m48801x784fb1e3 = t3().m48801x784fb1e3();
            ((x.d) ((fl1.c0) m48801x784fb1e3).f345255q).remove(this.f168701y1);
        }
        this.L = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = this.f168694J;
        if (iaVar != null) {
            iaVar.h();
        }
        this.f168694J = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.H = null;
        this.N = null;
        l1();
        this.f168699x1.clear();
    }

    public final java.lang.String L1() {
        return this.A1;
    }

    public void L2() {
    }

    public final k91.f M1() {
        k91.r m07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = t3();
        if (t37 == null || (m07 = t37.m0()) == null) {
            return null;
        }
        return m07.c(X1());
    }

    public void M2() {
        this.P = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y
    public void N0(xi1.g gVar) {
        this.Y = gVar;
        if (gVar != null) {
            if (Q1() != null) {
                Q1().c(gVar);
            }
            xi1.m mVar = this.T;
            if (mVar != null) {
                mVar.g();
                this.T = null;
                C1();
            }
        }
    }

    public java.lang.String N1() {
        return M1().f387257m;
    }

    public void N2() {
    }

    public p012xc85e97e9.p093xedfae76a.y O1() {
        return this.H1;
    }

    public void O2() {
    }

    public ul1.e P1() {
        return this.V;
    }

    public void P2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m mVar = this.N;
        if (mVar != null) {
            mVar.f168398b = true;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 Q1() {
        java.lang.Class cls = this.B;
        if (cls == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 d7Var = this.A;
        if (d7Var != null) {
            return d7Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 d7Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7) new d56.b(cls, cls).d(this).f308165b;
        this.A = d7Var2;
        return d7Var2;
    }

    public final void Q2() {
        n0();
        this.Q = true;
        if (Q1() != null) {
            ni1.i iVar = (ni1.i) Q1().r(ni1.i.class);
            if (iVar == null) {
                throw new java.lang.IllegalAccessError(java.lang.String.format(java.util.Locale.US, "Renderer[%s] impl not supports preload", Q1().getClass().getName()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc wcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wc) iVar;
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).n0();
            wcVar.f0().x();
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) wcVar.F()).m0();
        }
    }

    public android.graphics.Bitmap R1() {
        return S1(false);
    }

    public final void R2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y6 y6Var) {
        if (!mo50262x39e05d35() || t3() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = t3().x0();
        synchronized (x07.f168242o) {
            x07.f168245r.push(y6Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public boolean S() {
        return u46.a.b(new xi1.o[]{xi1.o.LANDSCAPE_SENSOR, xi1.o.LANDSCAPE_LOCKED, xi1.o.LANDSCAPE_LEFT, xi1.o.LANDSCAPE_RIGHT}, mo50261xee5260a9().mo51612x60543150().a());
    }

    public android.graphics.Bitmap S1(boolean z17) {
        if (a2() == null) {
            return null;
        }
        android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ie.b(a2().mo14669x50cdf8a2());
        if (b17 != null && !z17) {
            android.view.ViewGroup E1 = E1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ie.a(E1, E1, new android.graphics.Canvas(b17));
        }
        return b17;
    }

    public void S2() {
        X();
    }

    public int T1() {
        return 0;
    }

    public void T2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z6 z6Var) {
        synchronized (this.I1) {
            ((java.util.HashSet) this.I1).remove(z6Var);
        }
    }

    /* renamed from: U1 */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 v3() {
        if (t3() == null) {
            return null;
        }
        return t3().C0();
    }

    public void U2() {
        synchronized (this.C1) {
            this.E1 = new int[0];
            mo50260x9f1221c2();
        }
    }

    public jg1.b V1() {
        jg1.b bVar = this.M;
        if (bVar != null) {
            return bVar;
        }
        jg1.b bVar2 = new jg1.b(t3() == null ? mo50352x76847179() : t3().f156328d, this);
        this.M = bVar2;
        return bVar2;
    }

    public void V2() {
        T0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l6(this));
    }

    public void W0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z6 z6Var) {
        synchronized (this.I1) {
            ((java.util.HashSet) this.I1).add(z6Var);
        }
    }

    public tj1.m W1() {
        return this.f168703z1;
    }

    public void W2() {
    }

    public void X0(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, java.lang.Runnable runnable, long j17) {
    }

    public final java.lang.String X1() {
        return this.D;
    }

    public final void X2(java.lang.String str) {
        if ("dark".equalsIgnoreCase(str)) {
            this.S = al1.j0.BLACK;
        } else {
            this.S = al1.j0.WHITE;
        }
    }

    public void Y0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m mVar = this.N;
        if (mVar == null) {
            return;
        }
        this.H.m2229xd3ce77b7(mVar);
        this.H.mo2227x506dbe6b(false);
        if (this.N.f168398b) {
            d2();
        }
    }

    public final java.lang.String Y1() {
        return this.E;
    }

    public void Y2(boolean z17) {
    }

    public void Z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        k91.f M1 = M1();
        java.util.Objects.requireNonNull(M1);
        a1(wdVar, M1);
    }

    public final java.lang.String Z1() {
        ni1.e eVar = (ni1.e) B1(ni1.e.class);
        if (eVar != null) {
            return eVar.mo14689x776c71f8();
        }
        return null;
    }

    public void Z2(int i17) {
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e6(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public final void a(int i17, java.lang.String str) {
        if (Q1() == null || !Q1().a(i17, str)) {
            super.d0(i17, str, null);
        }
    }

    public void a1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, k91.f fVar) {
        int i17;
        ni1.h hVar;
        ni1.h hVar2;
        boolean a17 = fVar.a();
        java.lang.String str = fVar.f387251g;
        p1(a17);
        e3(fVar.f387245a);
        a3(1.0d);
        try {
            try {
                i17 = ik1.w.l(fVar.f387248d);
            } catch (java.lang.Exception unused) {
                i17 = -1;
            }
        } catch (java.lang.Exception unused2) {
            i17 = ik1.w.l(str);
        }
        Z2(i17);
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h6(this, fVar.f387246b));
        if (Q1() != null && (hVar2 = (ni1.h) Q1().r(ni1.h.class)) != null) {
            hVar2.c(fVar.f387254j);
        }
        if (Q1() != null && (hVar = (ni1.h) Q1().r(ni1.h.class)) != null) {
            hVar.b(fVar.f387256l, str);
        }
        b3(!fVar.f387250f, al1.h0.PageConfig);
        if (j2()) {
            r1().mo2227x506dbe6b(true);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb a2() {
        return this.L;
    }

    public void a3(double d17) {
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d6(this, d17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public java.lang.String b0() {
        return "AppBrandPageView";
    }

    public void b1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 Q1;
        if (!p2() || (Q1 = Q1()) == null) {
            return;
        }
        Q1.A();
    }

    public int b2() {
        return this.f168695l1;
    }

    public void b3(final boolean z17, final al1.h0 h0Var) {
        m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.v5$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5.this;
                al1.b r17 = v5Var.r1();
                boolean z18 = z17;
                if (r17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageView", "setNavigationBarCapsule visible(%b) but null == getActionBar()", java.lang.Boolean.valueOf(z18));
                } else {
                    v5Var.r1().l(z18, h0Var);
                }
            }
        });
    }

    public final void c1(pf1.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageView", "attachHTMLVConsoleView view:%s", cVar);
        this.f168699x1.add(cVar);
    }

    public void c3(int i17) {
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i6(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.C.get();
        if (c11510xdd90c2f2 == null || c11510xdd90c2f2.C0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageView", "publish runtime destroyed, event %s", str);
        } else if (Q1() == null || !Q1().d(str, str2, iArr)) {
            c11510xdd90c2f2.C0().e(str, str2, mo50260x9f1221c2());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public final void d0(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        if (c0Var == mo50357xcd94f799() || c0Var == null) {
            a(i17, str);
        } else {
            super.d0(i17, str, c0Var);
        }
    }

    public void d1(android.animation.Animator... animatorArr) {
        for (android.animation.Animator animator : animatorArr) {
            this.f168698x0.add(animator);
            animator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k6(this));
        }
    }

    public void d2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m mVar = this.N;
        if (mVar != null) {
            if (mVar.f168399c) {
                this.H.mo2227x506dbe6b(true);
            }
            P2();
        }
    }

    public void d3(boolean z17) {
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j6(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public final void e(java.lang.String str, java.lang.String str2, int i17) {
        if (Q1() == null) {
            super.e(str, str2, i17);
        } else {
            if (Q1().e(str, str2, i17)) {
                return;
            }
            super.e(str, str2, i17);
        }
    }

    public final boolean e1() {
        if (this.f168700y0 == -1) {
            this.f168700y0 = T1();
        }
        return this.f168700y0 > 0;
    }

    public void e2() {
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c6(this));
    }

    public void e3(java.lang.String str) {
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f6(this, str));
    }

    public void f1() {
        java.util.LinkedList linkedList = this.f168698x0;
        if (linkedList.size() > 0) {
            java.util.Iterator it = new java.util.LinkedList(linkedList).iterator();
            while (it.hasNext()) {
                ((android.animation.Animator) it.next()).cancel();
            }
        }
    }

    public void f2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.C = new java.lang.ref.WeakReference(c11510xdd90c2f2);
        this.P = true;
        this.N = h1();
        this.H1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n6(this);
        N0(c11510xdd90c2f2.mo48803xee5260a9());
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = c11510xdd90c2f2.E;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = this.f163113m;
        concurrentLinkedDeque2.clear();
        concurrentLinkedDeque2.addAll(concurrentLinkedDeque);
        super.l0();
        m51033x1e742f27(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i() { // from class: com.tencent.mm.plugin.appbrand.page.v5$$b
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i
            public final boolean c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5.this;
                if (c0Var == null) {
                    v5Var.getClass();
                } else if (c0Var != v5Var.mo50357xcd94f799() && (v5Var.v3() == null || c0Var != v5Var.v3().mo50357xcd94f799())) {
                    if ((c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb) c0Var).mo52157xaf156f4a() == v5Var && v5Var.mo50357xcd94f799() == null) {
                        return false;
                    }
                    java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "checkIsActivatedForEval, weired with worker(%s), appId:%s, api:%s", c0Var, v5Var.mo48798x74292566(), str);
                    if (v5Var.a0()) {
                        iz5.a.h(format);
                        throw null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageView", format);
                }
                return true;
            }
        });
        if (Q1() != null) {
            android.content.Context context2 = t3().f156328d;
            android.view.View view = (android.view.View) cf.i.a("AppBrandPageViewProfile| onCreateView", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o6(this, context2));
            cf.i.b("AppBrandPageViewProfile| onViewCreated", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p6(this, context2, view));
            cf.i.b("AppBrandPageViewProfile| initActionBar", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q6(this));
            this.I = (android.widget.FrameLayout) view;
            this.K = Q1().i();
            this.f168694J = Q1().mo14692x3eebbc35();
        }
        mi1.v vVar = c11510xdd90c2f2.f156354z;
        vVar.getClass();
        mi1.l lVar = new mi1.l(vVar, this);
        mi1.m mVar = vVar.f408245k;
        mVar.getClass();
        mVar.f408149a.put(hashCode(), lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageView", "AppBrandPageViewProfile| dispatchStart");
        if (Q1() != null) {
            Q1().v();
        }
    }

    public void f3(java.lang.String str) {
        T0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m6(this, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public final java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0> g0() {
        if (Q1() != null) {
            return Q1().p();
        }
        return null;
    }

    public void g1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.W;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 m52228xa8f336fc = w2Var != null ? w2Var.m52228xa8f336fc() : t3() != null ? t3().x0() : null;
        if (m52228xa8f336fc != null && m52228xa8f336fc.g0(w1())) {
            Y0();
        }
    }

    public final boolean g2() {
        return this.G1;
    }

    public void g3(tj1.m mVar) {
        this.f168703z1 = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getComponentId */
    public final int mo50260x9f1221c2() {
        int i17;
        synchronized (this.C1) {
            int[] iArr = this.E1;
            if (iArr == null || iArr.length <= 0) {
                int hash = java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                this.E1 = new int[]{hash};
                int[] iArr2 = this.D1;
                if (iArr2 == null || iArr2.length <= 0) {
                    this.D1 = new int[]{hash};
                }
            }
            i17 = this.E1[0];
        }
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    /* renamed from: getContentView */
    public final android.view.View mo51310xc2a54588() {
        return this.F;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    /* renamed from: getPageArea */
    public final android.widget.FrameLayout mo51313xaf0c0532() {
        return this.I;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t3() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.C.get();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getWindowAndroid */
    public xi1.g mo50261xee5260a9() {
        return this.Y;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public final void h() {
        super.h();
        K2();
        X();
        f1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.C.get();
        if (c11510xdd90c2f2 == null || c11510xdd90c2f2.x0() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pa paVar = c11510xdd90c2f2.x0().f168252y;
        long x17 = x1();
        paVar.f168547c.remove(x17);
        paVar.f168545a.remove(x17);
        paVar.f168546b.remove(x17);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m h1() {
        iz5.a.g(null, com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e());
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m(this);
    }

    public final boolean h2() {
        return this.f168696p0;
    }

    public void h3(boolean z17) {
        boolean[] zArr = this.B1;
        if (zArr == null || zArr[0] != z17) {
            this.B1 = new boolean[]{z17};
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb i0() {
        android.content.Context mo50352x76847179 = mo50352x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb D = Q1() != null ? Q1().D(mo50352x76847179) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wa(mo50352x76847179, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9(this));
        this.L = D;
        return D;
    }

    public boolean i2() {
        return false;
    }

    public void i3(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("MicroMsg.AppBrandPageView", "setWindowId  windowId[%d], componentId[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f168695l1 = i17;
        int[] iArr = {i18};
        this.E1 = iArr;
        int[] iArr2 = this.D1;
        if (iArr2 == null || iArr2.length <= 0) {
            this.D1 = new int[]{iArr[0]};
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: isRunning */
    public boolean mo50262x39e05d35() {
        return this.P && super.mo50262x39e05d35();
    }

    public java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0> j1() {
        return java.util.Collections.emptyList();
    }

    public final boolean j2() {
        return this.Z;
    }

    public final boolean j3() {
        k91.f M1 = M1();
        return M1 != null && "hidden".equals(M1.f387260p);
    }

    public android.view.View k1(android.view.ViewGroup viewGroup) {
        return null;
    }

    public boolean k2() {
        return false;
    }

    public void k3() {
        m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b6(this));
    }

    public void l1() {
        jg1.b bVar = this.M;
        if (bVar != null) {
            bVar.B();
            this.M = null;
        }
    }

    public boolean l2() {
        return this.R;
    }

    public void l3() {
    }

    public final void m1(pf1.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageView", "detachHTMLVConsoleView view:%s", cVar);
        this.f168699x1.remove(cVar);
    }

    public final boolean m2() {
        return this.F1.get();
    }

    public void m3() {
        if (Q1() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageView", "AppBrandPullDown startPullDownRefresh appId[%s], url[%s]", mo48798x74292566(), X1());
            ni1.h hVar = (ni1.h) Q1().r(ni1.h.class);
            if (hVar != null) {
                hVar.d();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageView", "startPullDownRefresh no extension impl provided appId[%s], url[%s]", mo48798x74292566(), X1());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public android.content.Context n() {
        return mo50352x76847179();
    }

    public void n1(int i17, boolean z17) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var : G1()) {
            if (u0Var != null && u0Var.f167526a == i17) {
                u0Var.f167528c = z17;
                return;
            }
        }
    }

    public boolean n2() {
        if (r1() != null) {
            return r1().f87282z.getVisibility() == 0;
        }
        return false;
    }

    public void n3() {
        if (Q1() != null) {
            ni1.h hVar = (ni1.h) Q1().r(ni1.h.class);
            if (hVar != null) {
                hVar.e();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageView", "stopPullDownRefresh no extension impl provided");
            }
        }
    }

    public void o1(boolean z17) {
        ni1.h hVar;
        if (Q1() == null || (hVar = (ni1.h) Q1().r(ni1.h.class)) == null) {
            return;
        }
        hVar.f(z17);
    }

    public boolean o2() {
        return false;
    }

    public void o3() {
    }

    public void p1(boolean z17) {
        this.G1 = z17;
        android.view.ViewGroup.LayoutParams layoutParams = this.G.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutParams2 = this.I.getLayoutParams();
        if (!(layoutParams instanceof android.widget.RelativeLayout.LayoutParams) || !(layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams)) {
            if (a0()) {
                throw new java.lang.IllegalStateException("ActionBarContainer and Renderer's PageArea should be in RelativeLayout");
            }
            return;
        }
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(10);
        if (z17) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams2).removeRule(3);
        } else {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams2).addRule(3, com.p314xaae8f345.mm.R.id.f564621w9);
        }
        this.F.requestLayout();
        this.H.m2222xad580900(this.G1);
    }

    public boolean p2() {
        if (Q1() != null) {
            return Q1().b();
        }
        return false;
    }

    public boolean p3(java.lang.String str) {
        ni1.b bVar = (ni1.b) Q1().r(ni1.b.class);
        return bVar != null && gf.y0.a(((gf.d0) bVar).J(), str);
    }

    public void q1() {
    }

    public boolean q2() {
        return false;
    }

    public final al1.b r1() {
        return this.H;
    }

    public boolean r2(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        this.f168697p1 = j17;
        synchronized (this.C1) {
            if (this.A1 == null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.A1 = str == null ? "" : str;
            }
        }
        this.D = nf.z.a(str);
        this.E = str;
        this.L.mo14678x12a97505(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z5(this));
        if (Q1() != null) {
            return Q1().j(str, wdVar);
        }
        Z0(wdVar);
        if (M0().d(this.D)) {
            return true;
        }
        H2(str);
        D2("onPageScriptNotFound");
        return false;
    }

    public final al1.l s1() {
        return this.G;
    }

    public final void s2() {
        this.Z = true;
    }

    public final al1.j0 t1() {
        return this.S;
    }

    public void t2(int i17) {
        java.util.HashSet hashSet;
        synchronized (this.I1) {
            hashSet = new java.util.HashSet(this.I1);
        }
        java.util.Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    public android.view.View u1() {
        return null;
    }

    public boolean u2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 Q1 = Q1();
        if (this.T.g()) {
            if (Q1 != null) {
                Q1.e("onRequestExitFullscreen", "", 0);
            }
            return true;
        }
        if (Q1 == null || !Q1.t()) {
            return H();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    public final android.app.Activity v1() {
        return mo50261xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) mo50261xee5260a9()).w() : q75.a.a(mo50352x76847179());
    }

    public final void v2() {
        this.R = false;
        if (Q1() != null) {
            Q1().k();
        }
        L2();
        V();
        c2(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
        c2(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w1() {
        return this.W;
    }

    public void w2(int i17) {
    }

    public long x1() {
        return this.f168697p1;
    }

    public void x2(android.content.res.Configuration configuration) {
        if (Q1() != null) {
            for (java.lang.Object obj : ((re.a) Q1()).E()) {
                if (obj instanceof ni1.c) {
                    ((ni1.c) obj).mo14690x50e1c15d(configuration);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35() {
        return this.f168694J;
    }

    public android.view.View y2() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia M(boolean z17) {
        return z17 ? mo51312xabfae012() : mo51311x3eebbc35();
    }

    public android.view.View z2(android.content.Context context) {
        return null;
    }

    public v5() {
        this(null);
    }
}
