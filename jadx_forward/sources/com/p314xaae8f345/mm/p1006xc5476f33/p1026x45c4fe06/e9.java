package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class e9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y {
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 D;
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 F;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k9 f159531J;
    public u91.d K;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f159532y = false;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f159533z = false;
    public volatile boolean A = false;
    public final boolean[] B = {false};
    public xi1.g C = new xi1.h();
    public final java.lang.Object E = new byte[0];
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nc[] G = {new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nc()};
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final bm5.x0 I = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11864x5a9baee());

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public org.json.JSONObject A0() {
        return super.A0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public final boolean G0() {
        return this.A;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public final boolean H0() {
        return t3() == null && !this.f159532y;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y
    public void N0(xi1.g gVar) {
        this.C = gVar;
    }

    public final void O0() {
        java.util.LinkedList linkedList;
        synchronized (this.G) {
            linkedList = this.G[0] != null ? new java.util.LinkedList(this.G[0]) : null;
            this.G[0] = null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n1) it.next();
                java.lang.String str = n1Var.f163892a;
                java.lang.String str2 = n1Var.f163893b;
                int i17 = n1Var.f163894c;
                int i18 = n1Var.f163895d;
                if (s(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.a(mo50357xcd94f799(), str, str2, i17, i18);
                }
            }
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n2 P0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n2();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 Q0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9(this);
    }

    public void R0() {
        if (this.K != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "[DirectGame] destroyServiceDirectGameComponentView " + this.K.hashCode());
            this.K.b0();
            this.K = null;
        }
    }

    public void S0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (u46.l.e(str)) {
            return;
        }
        if (f1(str)) {
            if (s(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.a(mo50357xcd94f799(), str, str2, i17, i18);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nc[] ncVarArr = this.G;
        if (ncVarArr[0] != null) {
            synchronized (ncVarArr) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nc ncVar = this.G[0];
                if (ncVar != null) {
                    ncVar.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n1(str, str2, i17, i18));
                    return;
                }
            }
        }
        if (s(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.a(mo50357xcd94f799(), str, str2, i17, i18);
        }
    }

    public java.lang.String T0() {
        return java.lang.String.format(java.util.Locale.US, ";(function(){ if(__wxConfig.preload) { %s; return true; } else { return false; }})();", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.jf.c("onWxConfigReady", "", 0, 0));
    }

    public org.json.JSONObject U0() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        y0(jSONObject2);
        k91.z0 E0 = this.D.E0();
        k91.r m07 = this.D.m0();
        if (E0 == null || m07 == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject3 = (!m07.f387270d || (jSONObject = m07.E) == null || jSONObject.length() == 0) ? m07.D : m07.E;
        java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            try {
                jSONObject2.putOpt(next, jSONObject3.opt(next));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandService", e17.getMessage());
            }
        }
        K0(jSONObject2, "env", new org.json.JSONObject());
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        K0(jSONObject4, "zIndex", 1000);
        K0(jSONObject4, "viewId", 1);
        K0(jSONObject2, "menuButtonInfo", jSONObject4);
        try {
            K0(jSONObject2, "networkType", be1.z.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f101073d);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandService", "generateWxConfig(%s) set networkType get exception:%s", mo48798x74292566(), e18);
        }
        return jSONObject2;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0() {
        return W0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5.class);
    }

    public <T extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5> T W0(java.lang.Class<T> cls) {
        if (this.D == null || this.D.x0() == null) {
            return null;
        }
        if (this.D.x0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandService", "getCurrentPageView NULL PageContainer, appId=%s", mo48798x74292566());
            if (this.D.Q1()) {
                return null;
            }
            throw new java.lang.IllegalStateException("getCurrentPageView NULL PageContainer");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = this.D.x0().m52169xfdaa7672();
        if (m52169xfdaa7672 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandService", "getCurrentPageView NULL Page, appId=%s", mo48798x74292566());
            return null;
        }
        T t17 = (T) m52169xfdaa7672.mo14682x9dee9c37();
        if (cls.isInstance(t17)) {
            return t17;
        }
        return null;
    }

    public java.lang.String X0() {
        return "";
    }

    public u91.d Y0() {
        u91.d dVar = this.K;
        if (dVar != null) {
            return dVar;
        }
        this.K = new u91.d(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "[DirectGame] getOrCreateServiceDirectGameComponentView " + this.K.hashCode());
        return this.K;
    }

    public final android.app.Activity Z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = V0();
        android.content.Context mo50352x76847179 = V0 == null ? mo50352x76847179() : V0.mo50352x76847179();
        if (android.app.Activity.class.isInstance(mo50352x76847179)) {
            return (android.app.Activity) mo50352x76847179;
        }
        return null;
    }

    public java.lang.String a1(java.lang.String str) {
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public java.lang.String b0() {
        return "AppBrandService";
    }

    public java.lang.String b1() {
        return "";
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 c1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 x9Var;
        if (!h1()) {
            return null;
        }
        synchronized (this.E) {
            x9Var = this.F;
        }
        return x9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public final void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (mo50262x39e05d35()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = this.D.x0();
            x07.getClass();
            x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w3(x07, str, str2, iArr));
        }
    }

    public void d1() {
        org.json.JSONObject U0 = U0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "injectConfig(%s): %s", mo48798x74292566(), U0.toString());
        java.lang.String str = this.D.m0().f387269J;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "injectConfig start, hash=%d", java.lang.Integer.valueOf(mo50260x9f1221c2()));
        if (mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0.class) != null) {
            java.lang.String jSONObject = U0.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0) mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f9 f9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f9(this, jSONObject);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) b0Var;
            ((cl.a) nVar.c0()).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m(nVar, f9Var, "__native_custom_event__wxConfig_inject", jSONObject, 0, ""), false);
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String jSONObject2 = U0.toString();
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);var __wxIndexPage = \"%s\";", jSONObject2, str);
        if (mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class)).Q(null, null, null, 0, format, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g9(this, jSONObject2));
        } else {
            mo50357xcd94f799().mo14660x738236e6(format, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h9(this, currentTimeMillis, jSONObject2));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public final void e(java.lang.String str, java.lang.String str2, int i17) {
        S0(str, str2, i17, 0);
    }

    public final void e1() {
        if (h1()) {
            synchronized (this.E) {
                if (this.F == null) {
                    this.F = Q0();
                }
                synchronized (this.H) {
                    java.util.LinkedList linkedList = new java.util.LinkedList(this.H);
                    this.H.clear();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l9) it.next())).a(this.F);
                    }
                }
            }
        }
    }

    public boolean f1(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public java.util.Map<java.lang.String, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0> g0() {
        return null;
    }

    public boolean g1() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getComponentId */
    public final int mo50260x9f1221c2() {
        return super.mo50260x9f1221c2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t3() {
        return this.D;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getWindowAndroid */
    public xi1.g mo50261xee5260a9() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public void h() {
        this.f159533z = false;
        this.f159532y = true;
        synchronized (this.B) {
            this.B[0] = false;
        }
        this.D = null;
        super.h();
        synchronized (this.E) {
            if (this.F != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 x9Var = this.F;
                x9Var.f173923j.set(true);
                x9Var.f173916c.f();
                x9Var.f173914a = null;
                x9Var.f173920g.clear();
                this.F = null;
            }
        }
    }

    public boolean h1() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t i0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g(null, null);
    }

    public void i1() {
        d1();
        O0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: isRunning */
    public boolean mo50262x39e05d35() {
        return this.f159533z && !this.f159532y && super.mo50262x39e05d35();
    }

    public void j1() {
    }

    public void k1() {
        if (mo50262x39e05d35()) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m2().x(this.D);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandService", "onRuntimePause but not running appId %s", mo48798x74292566());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public final void l0() {
        super.l0();
        e1();
        q1();
        this.f159533z = true;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.D.E;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = this.f163113m;
        concurrentLinkedDeque2.clear();
        concurrentLinkedDeque2.addAll(concurrentLinkedDeque);
        i1();
    }

    public void l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.D = c11510xdd90c2f2;
        N0(c11510xdd90c2f2.mo48803xee5260a9());
        if (h1()) {
            e1();
            if (!g1()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 c17 = c1();
                java.util.Objects.requireNonNull(c17);
                c17.f173922i.set(true);
                java.lang.String mo48798x74292566 = c17.f173914a.mo48798x74292566();
                c17.f173918e = mo48798x74292566;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWorkerContainer", "onRuntimeReady %s", mo48798x74292566);
                c17.f173916c.h();
                c17.h();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o9 o9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n9.f167590a;
        o9Var.getClass();
        int mo50260x9f1221c2 = mo50260x9f1221c2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "notify service:%d", java.lang.Integer.valueOf(mo50260x9f1221c2));
        synchronized (o9Var) {
            java.util.List list = (java.util.List) o9Var.f167774a.get(mo50260x9f1221c2);
            if (list == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "notify listenerList empty");
                o9Var.f167775b.put(mo50260x9f1221c2, 1);
            } else {
                if (list.size() <= 0) {
                    return;
                }
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(list.get(0));
                throw null;
            }
        }
    }

    public void m1(boolean z17, boolean z18) {
        if (!mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandService", "onRuntimeResume but not running, appId %s, willRelaunch %b", mo48798x74292566(), java.lang.Boolean.valueOf(z17));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n2 P0 = P0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.D;
        P0.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject c17 = c11510xdd90c2f2.u0().c();
        if (c17 != null) {
            hashMap.put("referrerInfo", c17);
        }
        hashMap.put("relaunch", java.lang.Boolean.valueOf(z17));
        hashMap.put("reLaunch", java.lang.Boolean.valueOf(z17));
        if (z18) {
            hashMap.put("useNewNavStack", java.lang.Boolean.TRUE);
        }
        java.util.LinkedList linkedList = c11510xdd90c2f2.f156330f;
        java.lang.String t07 = (!z18 || linkedList.isEmpty()) ? z17 ? c11510xdd90c2f2.t0() : c11510xdd90c2f2.x0().m52170xad58292c() : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z5) linkedList.get(linkedList.size() - 1)).f173980d;
        hashMap.put("rawPath", t07);
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, nf.z.a(t07));
        hashMap.put("query", nf.z.c(t07));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnAppEnterForegroundEvent", "path: %s, query: %s, relaunch: %s, url: %s", hashMap.get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714), hashMap.get("query"), hashMap.get("relaunch"), t07);
        nf.f.c(hashMap);
        org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
        P0.y(c11510xdd90c2f2, z17, jSONObject);
        P0.f163907f = jSONObject.toString();
        P0.u(c11510xdd90c2f2.C0());
        P0.m();
        P0.x(c11510xdd90c2f2, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public android.content.Context n() {
        return mo50352x76847179();
    }

    public final void n1() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String mo48798x74292566 = mo48798x74292566();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (mo48798x74292566 == null) {
            mo48798x74292566 = "";
        }
        objArr[0] = mo48798x74292566;
        objArr[1] = java.lang.Integer.valueOf(mo50260x9f1221c2());
        objArr[2] = android.util.Log.getStackTraceString(new java.lang.Throwable());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "pauseJsThreads appId:%s, serviceId:%d, stack:%s", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.I.d();
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0 k0Var = mo50357xcd94f799() != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0) mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0.class) : null;
        if (k0Var != null) {
            k0Var.mo51548x65825f6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 c17 = c1();
        if (c17 != null) {
            java.util.Iterator it = c17.f173916c.f124219b.values().iterator();
            while (it.hasNext()) {
                cl.a aVar = (cl.a) ((cl.q0) it.next()).f124257b;
                aVar.f124102b.mo15038x65825f6();
                cl.a.f124100z.b(aVar);
            }
        }
    }

    public final void o1() {
        n0();
        e1();
        D0(A0());
        this.A = true;
        j1();
        if (mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g0.class) == null) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g0.class));
        throw null;
    }

    public void p1(java.lang.String str, long j17, long j18, java.lang.Object obj) {
    }

    public final void q1() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String mo48798x74292566 = mo48798x74292566();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (mo48798x74292566 == null) {
            mo48798x74292566 = "";
        }
        objArr[0] = mo48798x74292566;
        objArr[1] = java.lang.Integer.valueOf(mo50260x9f1221c2());
        objArr[2] = android.util.Log.getStackTraceString(new java.lang.Throwable());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "resumeJsThreads appId:%s, serviceId:%d, stack:%s", objArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.I.d();
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0 k0Var = mo50357xcd94f799() != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0) mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k0.class) : null;
        if (k0Var != null) {
            k0Var.mo51549xc84dc82d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 c17 = c1();
        if (c17 != null) {
            java.util.Iterator it = c17.f173916c.f124219b.values().iterator();
            while (it.hasNext()) {
                cl.a aVar = (cl.a) ((cl.q0) it.next()).f124257b;
                aVar.f124102b.mo15040xc84dc82d();
                cl.a.f124100z.a(aVar);
            }
        }
    }

    public final void r1(long j17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.String mo48798x74292566 = mo48798x74292566();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (mo48798x74292566 == null) {
            mo48798x74292566 = "";
        }
        objArr[0] = mo48798x74292566;
        objArr[1] = java.lang.Integer.valueOf(mo50260x9f1221c2());
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = android.util.Log.getStackTraceString(new java.lang.Throwable());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandService", "schedulePauseJsThreads appId:%s, serviceId:%d, delayMillis:%d, stack:%s", objArr);
        if (j17 <= 0) {
            n1();
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.I.b();
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.e9$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9.this.n1();
            }
        }, j17);
    }

    public void s1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.D = c11510xdd90c2f2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 t0(java.lang.Class cls) {
        boolean z17;
        synchronized (this.B) {
            z17 = this.B[0];
        }
        if (z17) {
            return super.t0(cls);
        }
        return null;
    }

    public void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l9 l9Var) {
        if (l9Var == null) {
            return;
        }
        synchronized (this.E) {
            if (this.F != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a8) l9Var).a(this.F);
            } else {
                synchronized (this.H) {
                    this.H.add(l9Var);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public void y0(org.json.JSONObject jSONObject) {
        super.y0(jSONObject);
        if (mo50357xcd94f799() != null) {
            K0(jSONObject, "nativeBufferEnabled", java.lang.Boolean.valueOf(mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v.class) != null));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0
    public void z0(org.json.JSONObject jSONObject) {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ag().a(jSONObject);
    }
}
