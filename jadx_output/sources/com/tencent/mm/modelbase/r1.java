package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public final class r1 implements com.tencent.mm.modelbase.u0, com.tencent.mm.app.t2 {

    /* renamed from: y, reason: collision with root package name */
    public static com.tencent.mm.modelbase.r1 f70762y = null;

    /* renamed from: z, reason: collision with root package name */
    public static int f70763z = 1;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.network.s f70764d;

    /* renamed from: f, reason: collision with root package name */
    public final int f70766f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Vector f70767g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Vector f70768h;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f70770m;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f70776s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.modelbase.h2 f70777t;

    /* renamed from: u, reason: collision with root package name */
    public final long f70778u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f70779v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f70780w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f70781x;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.u3 f70765e = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f70769i = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f70771n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f70772o = null;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f70773p = new java.lang.Object();

    /* renamed from: q, reason: collision with root package name */
    public final q01.i f70774q = new q01.i();

    /* renamed from: r, reason: collision with root package name */
    public final x51.q1 f70775r = new x51.q1("clicfg_netscenequeue_threadpool_enable");

    public r1(com.tencent.mm.modelbase.h2 h2Var) {
        com.tencent.mm.modelbase.k2 k2Var = com.tencent.mm.modelbase.k2.f70660a;
        this.f70776s = com.tencent.mm.modelbase.k2.f70663d;
        this.f70778u = 21600000L;
        this.f70779v = false;
        this.f70780w = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelbase.x1(this), true);
        this.f70781x = false;
        this.f70766f = mm.k.E1.h() ? java.lang.Math.max(50, 100) : 50;
        this.f70767g = q01.e0.f359270a.a();
        this.f70768h = new java.util.Vector();
        this.f70770m = new com.tencent.mm.modelbase.y1(this, android.os.Looper.getMainLooper());
        this.f70777t = h2Var;
        com.tencent.mm.app.d5 d5Var = com.tencent.mm.app.d5.f53384a;
        com.tencent.mm.app.d5.f53386c.add(new com.tencent.mm.modelbase.z1(this));
        com.tencent.mm.modelbase.a2 a2Var = new com.tencent.mm.modelbase.a2(this);
        com.tencent.mm.app.d5.f53385b.add(a2Var);
        if (com.tencent.mm.app.d5.f53387d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "Already in foreground, call callback immediately");
            try {
                a2Var.onEnterForeground();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MatrixLifecycleForegroundMonitor", "Error calling immediate onEnterForeground: " + e17.getMessage());
            }
        }
    }

    public void a(int i17, com.tencent.mm.modelbase.u0 u0Var) {
        synchronized (this.f70769i) {
            java.util.Set set = (java.util.Set) this.f70769i.get(java.lang.Integer.valueOf(i17));
            if (set == null) {
                set = new java.util.HashSet(16);
                this.f70769i.put(java.lang.Integer.valueOf(i17), set);
            }
            synchronized (set) {
                if (set.add(u0Var)) {
                    com.tencent.mm.sdk.platformtools.k2.b(u0Var);
                }
            }
        }
    }

    public final void b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        this.f70770m.post(new com.tencent.mm.modelbase.u1(this, m1Var, i17, i18, str));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m1Var.getType());
        q01.f fVar = q01.f.f359276e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        q01.g gVar = new q01.g(fVar, i17, i18, str, m1Var);
        q01.i iVar = this.f70774q;
        iVar.getClass();
        java.util.List<java.lang.Object> c17 = kz5.b0.c(gVar);
        try {
            e75.h hVar = (e75.h) iVar.f249980a.get(valueOf);
            if (hVar != null) {
                hVar.notify(c17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mvvm.NetSceneObserverOwner", e17, "doNotify", new java.lang.Object[0]);
        }
    }

    public void c(int i17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.d2 d2Var = new com.tencent.mm.modelbase.d2(this, i17);
        x51.q1 q1Var = this.f70775r;
        q1Var.getClass();
        q1Var.a(d2Var, 0L, true);
    }

    public void d(com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", java.lang.Integer.valueOf(m1Var.hashCode()));
        m1Var.cancel();
        synchronized (this.f70773p) {
            this.f70768h.remove(m1Var);
            this.f70767g.remove(m1Var);
            com.tencent.mm.modelbase.k2.f70660a.c(m1Var.getType());
            e();
        }
    }

    public final void e() {
        synchronized (this.f70773p) {
            q01.e0.f359270a.c(this.f70767g.size(), this.f70768h.size());
        }
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "clearRunningQueue");
        synchronized (this.f70773p) {
            java.util.Vector<com.tencent.mm.modelbase.m1> vector = this.f70767g;
            this.f70767g = q01.e0.f359270a.a();
            for (com.tencent.mm.modelbase.m1 m1Var : vector) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + m1Var.getType());
                m1Var.cancel();
                m1Var.callbackErrorIfNeed(3, -1, "doScene failed clearRunningQueue");
                b(3, -1, "doScene failed clearRunningQueue", m1Var);
            }
            vector.clear();
            com.tencent.mm.modelbase.k2.f70660a.a();
        }
    }

    public boolean g(com.tencent.mm.modelbase.m1 m1Var) {
        return h(m1Var, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(com.tencent.mm.modelbase.m1 r8, int r9) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.r1.h(com.tencent.mm.modelbase.m1, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0298  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(final com.tencent.mm.modelbase.m1 r28, int r29) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.r1.i(com.tencent.mm.modelbase.m1, int):void");
    }

    public final void j(final com.tencent.mm.modelbase.m1 m1Var, int i17, int i18, int i19) {
        int i27;
        com.tencent.mm.network.s sVar;
        com.tencent.mm.modelbase.u0 queueCallback = m1Var.getQueueCallback();
        q01.e0 e0Var = q01.e0.f359270a;
        if (queueCallback == null) {
            queueCallback = this;
        }
        if (e0Var.e()) {
            synchronized (m1Var) {
                if (queueCallback instanceof com.tencent.mm.modelbase.r1) {
                    queueCallback = new q01.x(m1Var, queueCallback);
                }
            }
        }
        m1Var.setOnSceneEnd(queueCallback);
        if (m1Var.isCanceled() || (sVar = this.f70764d) == null) {
            i27 = 0;
        } else {
            i27 = m1Var.doScene(sVar, queueCallback);
            if (i27 >= 0) {
                java.lang.Object[] objArr = new java.lang.Object[7];
                objArr[0] = java.lang.Integer.valueOf(i17);
                objArr[1] = java.lang.Integer.valueOf(i18);
                objArr[2] = java.lang.Integer.valueOf(i19);
                objArr[3] = java.lang.Integer.valueOf(this.f70767g.size());
                objArr[4] = java.lang.Integer.valueOf(this.f70768h.size());
                objArr[5] = java.lang.Integer.valueOf(i27);
                com.tencent.mm.network.s sVar2 = this.f70764d;
                objArr[6] = java.lang.Integer.valueOf(sVar2 == null ? 0 : sVar2.hashCode());
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "On doscene  mmcgi type:%d hash[%d,%d] run:%d wait:%d ret:%d autoauth:%d", objArr);
                m1Var.setHasCallbackToQueue(false);
                return;
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[8];
        objArr2[0] = java.lang.Integer.valueOf(i17);
        objArr2[1] = java.lang.Integer.valueOf(i18);
        objArr2[2] = java.lang.Integer.valueOf(i19);
        objArr2[3] = java.lang.Boolean.valueOf(m1Var.isCanceled());
        objArr2[4] = java.lang.Integer.valueOf(this.f70767g.size());
        objArr2[5] = java.lang.Integer.valueOf(this.f70768h.size());
        objArr2[6] = java.lang.Integer.valueOf(i27);
        com.tencent.mm.network.s sVar3 = this.f70764d;
        objArr2[7] = java.lang.Integer.valueOf(sVar3 != null ? sVar3.hashCode() : 0);
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueue", "doscene mmcgi Failed type:%d hash[%d,%d] cancel[%b] run:%d wait:%d ret:%d autoauth:%d", objArr2);
        m1Var.setOnSceneEnd(null);
        synchronized (this.f70773p) {
            this.f70767g.remove(m1Var);
            com.tencent.mm.modelbase.k2.f70660a.c(i17);
        }
        if (m1Var.isCanceled()) {
            return;
        }
        this.f70770m.post(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.r1$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.modelbase.r1.this.onSceneEnd(3, -1, "doScene failed", m1Var);
            }
        });
    }

    public com.tencent.mm.network.s k() {
        return this.f70764d;
    }

    public java.lang.String l() {
        com.tencent.mm.network.s sVar = this.f70764d;
        return sVar != null ? sVar.A0() : com.eclipsesource.mmv8.Platform.UNKNOWN;
    }

    public boolean m() {
        com.tencent.mm.network.s sVar = this.f70764d;
        if (sVar != null) {
            return sVar.g0();
        }
        return true;
    }

    public int n() {
        com.tencent.mm.network.s sVar;
        try {
            sVar = this.f70764d;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueue", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        if (sVar != null && sVar.s1() != null) {
            return this.f70764d.s1().Wh();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueue", "[arthurdan.getNetworkStatus] Notice!!! autoAuth and autoAuth.getNetworkEvent() is null!!!!");
        return com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 6 : 0;
    }

    public void o(int i17, androidx.lifecycle.y yVar, q01.e eVar) {
        if (i17 == -1) {
            throw new java.lang.IllegalArgumentException("BROADCAST TYPE Not support, use add addSceneEndListener");
        }
        this.f70774q.a(i17, yVar, e75.g.MainThread, eVar);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "onAppBackground");
        u(false);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "onAppForeground");
        u(true);
        v(false);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.setHasCallbackToQueue(true);
        synchronized (this.f70773p) {
            this.f70767g.remove(m1Var);
            com.tencent.mm.modelbase.k2.f70660a.c(m1Var.getType());
        }
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = java.lang.Integer.valueOf(m1Var.getType());
        objArr[1] = java.lang.Integer.valueOf(m1Var.hashCode());
        objArr[2] = java.lang.Integer.valueOf(m1Var.getMMReqRespHash());
        objArr[3] = java.lang.Integer.valueOf(this.f70767g.size());
        objArr[4] = java.lang.Integer.valueOf(this.f70768h.size());
        com.tencent.mm.network.s sVar = this.f70764d;
        objArr[5] = java.lang.Integer.valueOf(sVar == null ? 0 : sVar.hashCode());
        objArr[6] = java.lang.Integer.valueOf(i17);
        objArr[7] = java.lang.Integer.valueOf(i18);
        objArr[8] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "onSceneEnd mmcgi type:%d hash[%d,%d] run:%d wait:%d autoauth:%d [%d,%d,%s]", objArr);
        if (i17 == 4 && (i18 == -100 || i18 == -2023)) {
            com.tencent.mm.autogen.events.AccountExpiredEvent accountExpiredEvent = new com.tencent.mm.autogen.events.AccountExpiredEvent();
            am.c cVar = accountExpiredEvent.f53963g;
            cVar.f6294a = i17;
            cVar.f6295b = i18;
            cVar.f6296c = str;
            accountExpiredEvent.e();
        }
        w(2);
        q01.q qVar = q01.q.f359322a;
        q01.l lVar = (q01.l) q01.q.f359323b.remove(java.lang.Integer.valueOf(m1Var.hashCode()));
        if (lVar != null) {
            lVar.f359309l = java.lang.Integer.valueOf(i17);
            lVar.f359308k = java.lang.Integer.valueOf(i18);
            long j17 = 0;
            long j18 = (lVar.f359302e <= 0 || lVar.f359301d <= 0) ? 0L : lVar.f359302e - lVar.f359301d;
            if (lVar.f359305h > 0 && lVar.f359304g > 0) {
                j17 = lVar.f359305h - lVar.f359304g;
            }
            long j19 = j17;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("enterQueueCostMs", java.lang.Long.valueOf(j18));
            linkedHashMap.put("threadStartCostMs", java.lang.Long.valueOf(j19));
            linkedHashMap.put("waitingQueueLength", java.lang.Integer.valueOf(lVar.f359303f));
            linkedHashMap.put("sceneType", lVar.f359299b);
            linkedHashMap.put("sceneDesc", lVar.f359300c);
            java.lang.Integer num = lVar.f359309l;
            if (num != null) {
                linkedHashMap.put("errType", java.lang.Integer.valueOf(num.intValue()));
            }
            java.lang.Integer num2 = lVar.f359308k;
            if (num2 != null) {
                linkedHashMap.put("errCode", java.lang.Integer.valueOf(num2.intValue()));
            }
            linkedHashMap.put("isCoreCgi", java.lang.Boolean.valueOf(lVar.f359307j));
            linkedHashMap.put("experimentGroup", lVar.f359306i);
            ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
            java.lang.String[] strArr = new java.lang.String[6];
            strArr[0] = lVar.f359299b.toString();
            strArr[1] = java.lang.String.valueOf(j18);
            strArr[2] = java.lang.String.valueOf(j19);
            strArr[3] = java.lang.String.valueOf(lVar.f359303f);
            strArr[4] = lVar.f359307j ? "1" : "0";
            strArr[5] = lVar.f359306i;
            ap.a.a(10001, "cgiPerformanceMetrics", null, linkedHashMap, strArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.cgi.NetScenePerformanceMonitor", "Report complete metrics: type=" + lVar.f359299b + ", enterQueue=" + j18 + "ms, threadStart=" + j19 + "ms, waitingQueue=" + lVar.f359303f + ", isCoreCgi=" + lVar.f359307j + ", experimentGroup=" + lVar.f359306i);
        }
        b(i17, i18, str, m1Var);
        if (this.f70779v && this.f70767g.isEmpty() && this.f70768h.isEmpty()) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f70780w;
            long j27 = this.f70778u;
            b4Var.c(j27, j27);
        }
    }

    public void p(int i17, com.tencent.mm.modelbase.u0 u0Var) {
        if (i17 == -1) {
            throw new java.lang.IllegalArgumentException("BROADCAST TYPE Not support, use add removeSceneEndListener");
        }
        q01.i iVar = this.f70774q;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        q01.j jVar = new q01.j(u0Var);
        iVar.getClass();
        synchronized (iVar.f249980a) {
            e75.h hVar = (e75.h) iVar.f249980a.get(valueOf);
            if (hVar != null) {
                hVar.removeObserver(jVar);
                if (!hVar.hasObserver()) {
                    iVar.f249980a.remove(valueOf);
                }
            }
        }
    }

    public void q(int i17, com.tencent.mm.modelbase.u0 u0Var) {
        synchronized (this.f70769i) {
            try {
                java.util.Set set = (java.util.Set) this.f70769i.get(java.lang.Integer.valueOf(i17));
                if (set != null) {
                    synchronized (set) {
                        if (set.remove(u0Var)) {
                            com.tencent.mm.sdk.platformtools.k2.c(u0Var);
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void r() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "reset");
        com.tencent.mm.network.s sVar = this.f70764d;
        if (sVar != null) {
            sVar.reset();
        }
        f();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "clearWaitingQueue");
        synchronized (this.f70773p) {
            java.util.Vector vector = this.f70768h;
            q01.e0 e0Var = q01.e0.f359270a;
            this.f70768h = new java.util.Vector();
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + m1Var.getType());
                m1Var.cancel();
                m1Var.callbackErrorIfNeed(3, -1, "doScene failed clearRunningQueue");
                b(3, -1, "doScene failed clearWaitingQueue", m1Var);
            }
            vector.clear();
            e();
        }
        q01.i iVar = this.f70774q;
        synchronized (iVar.f249980a) {
            iVar.f249980a.clear();
        }
    }

    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "resetDispatcher");
        com.tencent.mm.network.s sVar = this.f70764d;
        if (sVar != null) {
            sVar.reset();
            this.f70764d = null;
        }
    }

    public void t(com.tencent.mm.network.s sVar) {
        this.f70764d = sVar;
        sVar.h1(new com.tencent.mm.modelbase.c2(this));
        sVar.R(this.f70771n);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#autoAuth, cost=");
        long j17 = com.tencent.mm.app.x.f53906a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis() - j17);
        sb6.append("ms");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", sb6.toString());
        w(1);
    }

    public final void u(boolean z17) {
        this.f70771n = z17;
        this.f70772o = java.lang.Boolean.valueOf(z17);
        z65.c.f470455a = z17;
        com.tencent.mm.network.s sVar = this.f70764d;
        if (sVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueue", "setForeground autoAuth  == null");
        } else {
            sVar.R(z17);
        }
    }

    public void v(boolean z17) {
        this.f70779v = z17;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f70780w;
        if (!z17) {
            b4Var.d();
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueue", "the working process is ready to be killed");
        long j17 = this.f70778u;
        b4Var.c(j17, j17);
    }

    public final void w(int i17) {
        synchronized (this.f70773p) {
            if (this.f70768h.size() > 0) {
                com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) this.f70768h.get(0);
                if (i17 == 1) {
                    m1Var.trackState().g(1);
                }
                int priority = m1Var.getPriority();
                for (int i18 = 1; i18 < this.f70768h.size(); i18++) {
                    com.tencent.mm.modelbase.m1 m1Var2 = (com.tencent.mm.modelbase.m1) this.f70768h.get(i18);
                    if (i17 == 1) {
                        m1Var2.trackState().g(1);
                    }
                    if (m1Var2.getPriority() > priority) {
                        if (this.f70767g.size() < this.f70766f) {
                            priority = m1Var2.getPriority();
                            m1Var = m1Var2;
                        }
                    }
                }
                this.f70768h.remove(m1Var);
                m1Var.trackState().g(i17 != 1 ? i17 != 2 ? i17 != 3 ? 200 : 203 : 202 : 201);
                e();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "waiting2running waitingQueue_size = " + this.f70768h.size());
                i(m1Var, 0);
            }
        }
    }
}
