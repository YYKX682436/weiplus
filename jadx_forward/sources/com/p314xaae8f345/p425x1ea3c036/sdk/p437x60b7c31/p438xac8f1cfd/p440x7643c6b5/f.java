package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public abstract class f implements com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f128939d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 f128940e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e1 f128941f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseIntArray f128942g = new android.util.SparseIntArray();

    public f(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 contextManager) {
        this.f128939d = env;
        this.f128940e = contextManager;
        jz5.g gVar = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.h1.f128971a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextManager, "contextManager");
        this.f128941f = ((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.h1.f128971a).mo141623x754a37bb()).booleanValue() ? new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.k1(env, contextManager) : new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f1(contextManager);
    }

    public void A(java.lang.String str) {
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r t07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).t0();
        i(t07);
        l(t07, null);
        return t07;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: alloc */
    public final int m32111x589a335() {
        int m32112x8c74ab18 = m32112x8c74ab18();
        if (m32112x8c74ab18 <= 0) {
            return m32112x8c74ab18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).x0(m32112x8c74ab18);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = yVar.x();
        if (x17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc get NULL LibReader, id[%d], appId[%s]", java.lang.Integer.valueOf(m32112x8c74ab18), yVar.mo48798x74292566());
            return 0;
        }
        java.lang.String g17 = g();
        x(m32112x8c74ab18, g17);
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(g17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                android.util.Pair j17 = j(x07, g(), x17);
                arrayList2.add((java.lang.Boolean) j17.first);
                arrayList3.add((cl.k1) j17.second);
                w(m32112x8c74ab18, arrayList, currentTimeMillis, arrayList2, arrayList3);
                return x07.o();
            } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 unused) {
                A(g());
                w(m32112x8c74ab18, arrayList, currentTimeMillis, arrayList2, arrayList3);
                return 0;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSContextInterface[multicontext]", e17, "alloc::injectSdkScript::" + g(), new java.lang.Object[0]);
                throw new java.lang.RuntimeException(e17);
            }
        } catch (java.lang.Throwable th6) {
            w(m32112x8c74ab18, arrayList, currentTimeMillis, arrayList2, arrayList3);
            throw th6;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: allocEmpty */
    public final int m32112x8c74ab18() {
        boolean z17 = false;
        try {
            p();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r a17 = a();
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), allocJsContext failed", yVar.mo48798x74292566());
                o(false);
                return -2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: created context id is %d", java.lang.Integer.valueOf(a17.o()));
            a17.mo14673x29497b66(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.g(this, a17));
            this.f128941f.a(a17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) a17).mo14660x738236e6(java.lang.String.format(java.util.Locale.US, "var __wxConfig = %s;", yVar.A0().toString()), null);
            try {
                int o17 = a17.o();
                o(true);
                return o17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z17 = true;
                o(z17);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: allocFromSnapshot */
    public int m32113x5888d763(final java.lang.String str, int i17) {
        boolean z17 = false;
        try {
            r(str, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "allocFromSnapshot, contextName: %s, snapshotContextIndex: %d", str, java.lang.Integer.valueOf(i17));
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r b17 = b(str, i17);
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "alloc with appID(%s), allocJsContext failed", yVar.mo48798x74292566());
                q(str, i17, false);
                return -2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: created context id is %d", java.lang.Integer.valueOf(b17.o()));
            b17.mo14673x29497b66(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s() { // from class: com.tencent.luggage.sdk.jsapi.component.service.f$$a
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s
                public final void a(java.lang.String str2, java.lang.String str3) {
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f.this;
                    fVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: on exception! message: %s, stacktrace %s", str2, str3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lf.a(b17, "onError", java.lang.String.format("{'message':'%s', 'stack': '%s'}", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str2), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str3)), 0);
                    java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f436464a.f436465a).get(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35205x24728b);
                    if (list != null && list.size() > 0) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(list.get(0));
                        throw null;
                    }
                    fVar.v(str, str2, str3);
                }
            });
            this.f128941f.a(b17);
            t(str, i17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) b17).mo14660x738236e6(java.lang.String.format(java.util.Locale.US, ";globalThis.__wxConfig=%s;WeixinSnapshot.snapshotContextReady();", yVar.A0()), null);
            s(str, i17);
            try {
                int o17 = b17.o();
                q(str, i17, true);
                return o17;
            } catch (java.lang.Throwable th6) {
                th = th6;
                z17 = true;
                q(str, i17, z17);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r b(java.lang.String str, int i17) {
        java.lang.Object m17 = m(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).f165503h;
        int incrementAndGet = pVar.f165558b.incrementAndGet();
        cl.a aVar = (cl.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d) pVar.f165557a).f165516a.f165501f;
        cl.q0 q0Var = new cl.q0(aVar, aVar.b(), new cl.g(aVar, incrementAndGet, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.q(q0Var, incrementAndGet);
        if (q0Var.f() == null) {
            qVar = null;
        } else {
            synchronized (pVar.f165559c) {
                pVar.f165559c.put(incrementAndGet, qVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "allocJsContextFromSnapshot id:%d, index: %d", java.lang.Integer.valueOf(incrementAndGet), java.lang.Integer.valueOf(i17));
        }
        if (qVar == null) {
            return null;
        }
        i(qVar);
        n(i17, m17);
        l(qVar, str);
        return qVar;
    }

    public void c(java.lang.String str, boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] nVarArr, boolean[] zArr, java.lang.Object[] objArr, long j17, long j18) {
    }

    @android.webkit.JavascriptInterface
    /* renamed from: create */
    public final int m32114xaf65a0fc(java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s)", yVar.mo48798x74292566(), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), nil appScriptPath", yVar.mo48798x74292566());
            return -1;
        }
        int m32111x589a335 = m32111x589a335();
        if (m32111x589a335 <= 0) {
            return m32111x589a335;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).x0(m32111x589a335);
        sj1.l.e(yVar.mo48798x74292566(), "public:inject", "代码注入-" + str);
        int m32116x360a3a60 = m32116x360a3a60(m32111x589a335, str);
        sj1.l.g(yVar.mo48798x74292566());
        if (m32116x360a3a60 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s), appScriptPath(%s), eval ret = %d", yVar.mo48798x74292566(), str, java.lang.Integer.valueOf(m32116x360a3a60));
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "create with appID(%s) appScriptPath(%s), success with contextId(%d)", yVar.mo48798x74292566(), str, java.lang.Integer.valueOf(x07.o()));
        return x07.o();
    }

    public void d(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "beforeEvaluateScriptFile appId:%s, contextId:%d", yVar.mo48798x74292566(), java.lang.Integer.valueOf(rVar.o()));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: destroy */
    public final void m32115x5cd39ffa(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.p pVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).f165503h;
        pVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyJsContext id:%d", java.lang.Integer.valueOf(i17));
        synchronized (pVar.f165559c) {
            nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) pVar.f165559c.get(i17);
            pVar.f165559c.delete(i17);
        }
        if (nVar != null) {
            nVar.mo14659x5cd39ffa();
        }
    }

    public int e() {
        return 1;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: evaluateScriptFile */
    public final int m32116x360a3a60(int i17, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d) appScriptPath(%s)", yVar.mo48798x74292566(), java.lang.Integer.valueOf(i17), str);
        iz5.a.g(null, i17 > 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).x0(i17);
        if (x07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) contextId(%d), appScriptPath(%s), get null context", yVar.mo48798x74292566(), java.lang.Integer.valueOf(i17), str);
            return -1;
        }
        if (x07.l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile with appID(%s) scriptPath(%s), but want to inject main-context", yVar.mo48798x74292566(), str);
            return -1;
        }
        android.util.SparseIntArray sparseIntArray = this.f128942g;
        if (sparseIntArray.get(i17, 0) <= 0) {
            d(yVar, x07);
            sparseIntArray.put(i17, 1);
        }
        if (yVar.mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class) != null) {
            try {
                return k(x07, str) > 0 ? 1 : 0;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSContextInterface[multicontext]", e17, "evaluateScriptFile::injectWxaScript::" + str, new java.lang.Object[0]);
                throw e17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile without v8, appID(%s) contextId(%s) scriptPath(%s)", yVar.mo48798x74292566(), java.lang.Integer.valueOf(i17), str);
        try {
            try {
                h(x07, str, f(yVar, str));
                return 1;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSContextInterface[multicontext]", e18, "evaluateScriptFile::injectAppScript::" + str, new java.lang.Object[0]);
                throw e18;
            }
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "evaluateScriptFile without v8, with appID(%s) contextId(%d), appScriptPath(%s), %s", yVar.mo48798x74292566(), java.lang.Integer.valueOf(i17), str, e19.getMessage());
            return 0;
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSContextInterface[multicontext]", e27, "getSubContextAppScript", new java.lang.Object[0]);
            throw e27;
        }
    }

    public java.lang.String f(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, java.lang.String str) {
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(yVar.t3(), str);
        if (android.text.TextUtils.isEmpty(p17)) {
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6(str);
        }
        return p17;
    }

    public abstract java.lang.String g();

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        ik1.b0 b0Var = new ik1.b0();
        sj1.l.e(this.f128939d.mo50260x9f1221c2() + "", "public:inject", "代码注入-" + str);
        ze.n t37 = this.f128939d.t3();
        java.lang.String str4 = str.replace('/', '_') + "_" + this.f128939d.mo48798x74292566();
        java.lang.String str5 = this.f128939d.t3().E0().f387385r.f156905md5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3 i3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3.USR;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.j jVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.j(this, b0Var, c19762x487075a);
        if (t37 == null || t37.C0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsValidationInjectorWC", "hy: runtime or service is null!");
        } else {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nf.a(t37, str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.g(t37.C0(), i3Var));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(rVar, null, a17, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.h(t37.C0(), rVar, str, str4, str5, 0, str2, i3Var, jVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectAppScript with appID(%s), contextId(%d), appScriptPath(%s), succeed(%b)", this.f128939d.mo48798x74292566(), java.lang.Integer.valueOf(rVar.o()), str, java.lang.Boolean.valueOf(c19762x487075a.f38859x6ac9171));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sj1.l.g(this.f128939d.mo50260x9f1221c2() + "");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
        nVar.f128885i = str;
        nVar.f128886j = str3;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        nVar.f128887k = str3.length();
        z(nVar, c19762x487075a.f38859x6ac9171, currentTimeMillis, currentTimeMillis2, b0Var.f373357a);
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar) {
        if (cl.q0.f124255l != null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w) rVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w.class);
        if (wVar == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).n0().f124265j) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) rVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e O = yVar instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y ? yVar.A1().O() : null;
            if (l0Var == null || O == null) {
                return;
            }
            long L = l0Var.L();
            long G = l0Var.G();
            long z17 = l0Var.z();
            if (L == 0 || G == 0 || z17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectConsoleOnContextCreate: invalid ptrs [isolate=%d, ctx=%d, loop=%d], V8Context unavailable, skip", java.lang.Long.valueOf(L), java.lang.Long.valueOf(G), java.lang.Long.valueOf(z17));
            } else {
                O.f128931a.m43147xa622ddac(L, G, z17);
            }
        }
    }

    public final android.util.Pair j(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, final java.lang.String str, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec;
        ik1.b0 b0Var;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a;
        java.lang.String str2;
        java.lang.String str3;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sj1.l.e(this.f128939d.mo50260x9f1221c2() + "", "public:inject", "代码注入-" + str);
        final com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        final ik1.b0 b0Var2 = new ik1.b0();
        final com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.tencent.luggage.sdk.jsapi.component.service.f$$b
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.String str4 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar2 = rVar;
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f.this;
                fVar.getClass();
                java.lang.String d17 = ik1.f.d(interfaceC11702x4ae7c33.a(str4));
                if (android.text.TextUtils.isEmpty(d17)) {
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6(str4);
                }
                c19769x48b92ec2.f38866x6ac9171 = d17.length();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.h(fVar.f128939d, rVar2, str4, str4, org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V + fVar.f128939d.x().getF172191d().mo49191x1c82a56c(), fVar.e(), d17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3.LIB, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.l(fVar, b0Var2, c19762x487075a2));
                return null;
            }
        };
        android.content.res.AssetFileDescriptor G0 = y() ? interfaceC11702x4ae7c33.G0(str) : null;
        if (G0 == null) {
            callable.call();
            c19769x48b92ec = c19769x48b92ec2;
            b0Var = b0Var2;
            c19762x487075a = c19762x487075a2;
            str2 = "";
            str3 = str;
        } else {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            c19769x48b92ec2.f38866x6ac9171 = G0.getLength();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectSdkScript-injectWithFd, contextId:%d, path:%s", java.lang.Integer.valueOf(rVar.o()), str);
            c19769x48b92ec = c19769x48b92ec2;
            b0Var = b0Var2;
            c19762x487075a = c19762x487075a2;
            str2 = "";
            str3 = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.j(this.f128939d, rVar, str, str, org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V + this.f128939d.x().getF172191d().mo49191x1c82a56c(), e(), G0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3.LIB, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.m(this, b0Var2, c19762x487075a2, rVar, str, c19772x1c2cd081));
            if (!c19762x487075a.f38859x6ac9171 && "Abort for empty source".equals(c19772x1c2cd081.f38869x6ac9171)) {
                callable.call();
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sj1.l.g(this.f128939d.mo50260x9f1221c2() + str2);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
        nVar.f128885i = str3;
        nVar.f128886j = null;
        nVar.f128887k = c19769x48b92ec.f38866x6ac9171;
        z(nVar, c19762x487075a.f38859x6ac9171, currentTimeMillis, currentTimeMillis2, b0Var.f373357a);
        return new android.util.Pair(java.lang.Boolean.valueOf(c19762x487075a.f38859x6ac9171), (cl.k1) b0Var.f373357a);
    }

    public int k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sj1.l.e(this.f128939d.mo50260x9f1221c2() + "", "public:inject", "代码注入-" + str);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(this.f128939d.t3(), false);
        if (o17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript pkgListReader is null, err, appId(%s) scriptPath(%s)", this.f128939d.mo48798x74292566(), str);
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = o17.mo49254xc00e82af(str);
        if (mo49254xc00e82af == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript, scriptFileInfo is null, appId(%s) scriptPath(%s)", this.f128939d.mo48798x74292566(), str);
            return 0;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.b(this.f128939d, rVar, str, new java.lang.String[]{str}, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.k(this, c19762x487075a, b0Var, c19767x257d7f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "injectWxaScript with appID(%s), contextId(%d), appScriptPath(%s), succeed(%b), entry(%s)", this.f128939d.mo48798x74292566(), java.lang.Integer.valueOf(rVar.o()), str, java.lang.Boolean.valueOf(c19762x487075a.f38859x6ac9171), java.lang.String.format(java.util.Locale.ENGLISH, "FileEntry{providerId:%s, appVersion:%d, appVersionStr:%s, fileName:%s, fileOffset:%d, fileLength:%d}", mo49254xc00e82af.f157573a, java.lang.Integer.valueOf(mo49254xc00e82af.f157574b), mo49254xc00e82af.f157575c, mo49254xc00e82af.f157578f, java.lang.Integer.valueOf(mo49254xc00e82af.f157579g), java.lang.Integer.valueOf(mo49254xc00e82af.f157580h)));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sj1.l.g(this.f128939d.mo50260x9f1221c2() + "");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
        nVar.f128885i = str;
        nVar.f128886j = null;
        nVar.f128887k = c19767x257d7f.f38864x6ac9171;
        nVar.f157573a = mo49254xc00e82af.f157573a;
        nVar.f157574b = mo49254xc00e82af.f157574b;
        z(nVar, c19762x487075a.f38859x6ac9171, currentTimeMillis, currentTimeMillis2, b0Var.f373357a);
        return c19767x257d7f.f38864x6ac9171;
    }

    public final void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str) {
        if (rVar == null) {
            return;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 A1 = this.f128939d.A1();
        if (A1.Y()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) rVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
            if (l0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "notifySubContextCreated, contextV8 is null");
                return;
            }
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.e O = A1.O();
            if (O == null) {
                return;
            }
            com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 c5128x72a3f151 = O.f128931a;
            if (android.text.TextUtils.isEmpty(str)) {
                str = "SubContext-" + rVar.o();
            }
            java.lang.String str2 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "notifySubContextCreated, contextName: %s", str2);
            c5128x72a3f151.m43149x16735de2(l0Var.L(), l0Var.G(), str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    @android.webkit.JavascriptInterface
    /* renamed from: loadJsFilesWithOptions */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m32117x81ca2f0(int r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f.m32117x81ca2f0(int, java.lang.String, java.lang.String):void");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: loadLibFiles */
    public void m32118x7d38d5f8(int i17, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        java.lang.StringBuilder sb6;
        org.json.JSONArray jSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar;
        int i18;
        java.util.ArrayList arrayList5;
        long j17;
        java.util.ArrayList arrayList6;
        java.util.ArrayList arrayList7;
        org.json.JSONArray jSONArray2;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        try {
            x(i17, str);
            sj1.l.e(yVar.mo50260x9f1221c2() + "", "public:inject", "代码注入-" + str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles appId:%s, contextId:%d, paths:%s", yVar.mo48798x74292566(), java.lang.Integer.valueOf(i17), str);
            iz5.a.g(null, i17 >= 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r x07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).x0(i17);
            try {
                if (x07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get NULL context by id[%d], appId[%s]", java.lang.Integer.valueOf(i17), yVar.mo48798x74292566());
                    sb6 = new java.lang.StringBuilder();
                } else {
                    try {
                        jSONArray = new org.json.JSONArray(str);
                        x17 = yVar.x();
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles parse paths failed, id[%d] appId[%s] e=%s", java.lang.Integer.valueOf(i17), yVar.mo48798x74292566(), e17);
                        sb6 = new java.lang.StringBuilder();
                        sb6.append(yVar.mo50260x9f1221c2());
                    }
                    if (x17 != null) {
                        int length = jSONArray.length();
                        arrayList = new java.util.ArrayList(length);
                        try {
                            arrayList2 = new java.util.ArrayList(length);
                            try {
                                arrayList4 = new java.util.ArrayList(length);
                                int i19 = 0;
                                while (i19 < length) {
                                    try {
                                        arrayList2.add(z18);
                                        arrayList4.add(z18);
                                        java.lang.String optString = jSONArray.optString(i19);
                                        arrayList.add(optString);
                                        if (android.text.TextUtils.isEmpty(optString)) {
                                            jSONArray2 = jSONArray;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get EMPTY name by index[%d] id[%d] appId[%s]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), yVar.mo48798x74292566());
                                        } else {
                                            jSONArray2 = jSONArray;
                                            try {
                                                try {
                                                    java.util.Objects.requireNonNull(optString);
                                                    android.util.Pair j18 = j(x07, optString, x17);
                                                    arrayList2.set(i19, (java.lang.Boolean) j18.first);
                                                    arrayList4.set(i19, (cl.k1) j18.second);
                                                } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 unused) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get EMPTY script by name[%s] index[%d] id[%d] appId[%s]", optString, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), yVar.mo48798x74292566());
                                                }
                                            } catch (java.lang.Exception e18) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSContextInterface[multicontext]", e18, "loadLibFiles::injectSdkScript::" + optString, new java.lang.Object[0]);
                                                throw new java.lang.RuntimeException(e18);
                                            }
                                        }
                                        i19++;
                                        jSONArray = jSONArray2;
                                        z18 = false;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        arrayList3 = arrayList;
                                        sj1.l.g(yVar.mo50260x9f1221c2() + "");
                                        w(i17, arrayList3, currentTimeMillis, arrayList2, arrayList4);
                                        throw th;
                                    }
                                }
                                sj1.l.g(yVar.mo50260x9f1221c2() + "");
                                fVar = this;
                                i18 = i17;
                                arrayList5 = arrayList;
                                j17 = currentTimeMillis;
                                arrayList6 = arrayList2;
                                arrayList7 = arrayList4;
                                fVar.w(i18, arrayList5, j17, arrayList6, arrayList7);
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                arrayList3 = arrayList;
                                arrayList4 = null;
                                sj1.l.g(yVar.mo50260x9f1221c2() + "");
                                w(i17, arrayList3, currentTimeMillis, arrayList2, arrayList4);
                                throw th;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            arrayList2 = null;
                            arrayList3 = arrayList;
                            arrayList4 = null;
                            sj1.l.g(yVar.mo50260x9f1221c2() + "");
                            w(i17, arrayList3, currentTimeMillis, arrayList2, arrayList4);
                            throw th;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadLibFiles get NULL LibReader, id[%d], appId[%s]", java.lang.Integer.valueOf(i17), yVar.mo48798x74292566());
                    sb6 = new java.lang.StringBuilder();
                }
                sb6.append(yVar.mo50260x9f1221c2());
                sb6.append("");
                sj1.l.g(sb6.toString());
                arrayList5 = null;
                fVar = this;
                i18 = i17;
                j17 = currentTimeMillis;
                arrayList6 = null;
                arrayList7 = null;
                fVar.w(i18, arrayList5, j17, arrayList6, arrayList7);
            } catch (java.lang.Throwable th9) {
                th = th9;
                arrayList3 = null;
                arrayList4 = null;
                arrayList2 = null;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            arrayList = null;
        }
    }

    public java.lang.Object m(int i17) {
        return null;
    }

    public void n(int i17, java.lang.Object obj) {
    }

    public void o(boolean z17) {
    }

    public void p() {
    }

    public void q(java.lang.String str, int i17, boolean z17) {
    }

    public void r(java.lang.String str, int i17) {
    }

    public void s(java.lang.String str, int i17) {
    }

    public void t(java.lang.String str, int i17) {
    }

    public void u() {
        this.f128941f.b();
    }

    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    public void w(int i17, java.util.ArrayList arrayList, long j17, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
    }

    public void x(int i17, java.lang.String str) {
    }

    public boolean y() {
        return true;
    }

    public void z(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
    }
}
