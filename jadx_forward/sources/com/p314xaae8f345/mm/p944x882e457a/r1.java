package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public final class r1 implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.app.t2 {

    /* renamed from: y, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p944x882e457a.r1 f152295y = null;

    /* renamed from: z, reason: collision with root package name */
    public static int f152296z = 1;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.s f152297d;

    /* renamed from: f, reason: collision with root package name */
    public final int f152299f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Vector f152300g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Vector f152301h;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f152303m;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f152309s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.h2 f152310t;

    /* renamed from: u, reason: collision with root package name */
    public final long f152311u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f152312v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f152313w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f152314x;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 f152298e = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f152302i = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f152304n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f152305o = null;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f152306p = new java.lang.Object();

    /* renamed from: q, reason: collision with root package name */
    public final q01.i f152307q = new q01.i();

    /* renamed from: r, reason: collision with root package name */
    public final x51.q1 f152308r = new x51.q1("clicfg_netscenequeue_threadpool_enable");

    public r1(com.p314xaae8f345.mm.p944x882e457a.h2 h2Var) {
        com.p314xaae8f345.mm.p944x882e457a.k2 k2Var = com.p314xaae8f345.mm.p944x882e457a.k2.f152193a;
        this.f152309s = com.p314xaae8f345.mm.p944x882e457a.k2.f152196d;
        this.f152311u = 21600000L;
        this.f152312v = false;
        this.f152313w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p944x882e457a.x1(this), true);
        this.f152314x = false;
        this.f152299f = mm.k.E1.h() ? java.lang.Math.max(50, 100) : 50;
        this.f152300g = q01.e0.f440803a.a();
        this.f152301h = new java.util.Vector();
        this.f152303m = new com.p314xaae8f345.mm.p944x882e457a.y1(this, android.os.Looper.getMainLooper());
        this.f152310t = h2Var;
        com.p314xaae8f345.mm.app.d5 d5Var = com.p314xaae8f345.mm.app.d5.f134917a;
        com.p314xaae8f345.mm.app.d5.f134919c.add(new com.p314xaae8f345.mm.p944x882e457a.z1(this));
        com.p314xaae8f345.mm.p944x882e457a.a2 a2Var = new com.p314xaae8f345.mm.p944x882e457a.a2(this);
        com.p314xaae8f345.mm.app.d5.f134918b.add(a2Var);
        if (com.p314xaae8f345.mm.app.d5.f134920d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixLifecycleForegroundMonitor", "Already in foreground, call callback immediately");
            try {
                a2Var.mo8896x832bee5c();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MatrixLifecycleForegroundMonitor", "Error calling immediate onEnterForeground: " + e17.getMessage());
            }
        }
    }

    public void a(int i17, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        synchronized (this.f152302i) {
            java.util.Set set = (java.util.Set) this.f152302i.get(java.lang.Integer.valueOf(i17));
            if (set == null) {
                set = new java.util.HashSet(16);
                this.f152302i.put(java.lang.Integer.valueOf(i17), set);
            }
            synchronized (set) {
                if (set.add(u0Var)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.k2.b(u0Var);
                }
            }
        }
    }

    public final void b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f152303m.mo50293x3498a0(new com.p314xaae8f345.mm.p944x882e457a.u1(this, m1Var, i17, i18, str));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0());
        q01.f fVar = q01.f.f440809e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        q01.g gVar = new q01.g(fVar, i17, i18, str, m1Var);
        q01.i iVar = this.f152307q;
        iVar.getClass();
        java.util.List<java.lang.Object> c17 = kz5.b0.c(gVar);
        try {
            e75.h hVar = (e75.h) iVar.f331513a.get(valueOf);
            if (hVar != null) {
                hVar.mo127124xc2079749(c17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mvvm.NetSceneObserverOwner", e17, "doNotify", new java.lang.Object[0]);
        }
    }

    public void c(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.d2 d2Var = new com.p314xaae8f345.mm.p944x882e457a.d2(this, i17);
        x51.q1 q1Var = this.f152308r;
        q1Var.getClass();
        q1Var.a(d2Var, 0L, true);
    }

    public void d(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", java.lang.Integer.valueOf(m1Var.hashCode()));
        m1Var.mo9408xae7a2e7a();
        synchronized (this.f152306p) {
            this.f152301h.remove(m1Var);
            this.f152300g.remove(m1Var);
            com.p314xaae8f345.mm.p944x882e457a.k2.f152193a.c(m1Var.mo808xfb85f7b0());
            e();
        }
    }

    public final void e() {
        synchronized (this.f152306p) {
            q01.e0.f440803a.c(this.f152300g.size(), this.f152301h.size());
        }
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "clearRunningQueue");
        synchronized (this.f152306p) {
            java.util.Vector<com.p314xaae8f345.mm.p944x882e457a.m1> vector = this.f152300g;
            this.f152300g = q01.e0.f440803a.a();
            for (com.p314xaae8f345.mm.p944x882e457a.m1 m1Var : vector) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + m1Var.mo808xfb85f7b0());
                m1Var.mo9408xae7a2e7a();
                m1Var.mo47957xb0a065f6(3, -1, "doScene failed clearRunningQueue");
                b(3, -1, "doScene failed clearRunningQueue", m1Var);
            }
            vector.clear();
            com.p314xaae8f345.mm.p944x882e457a.k2.f152193a.a();
        }
    }

    public boolean g(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
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
    public boolean h(com.p314xaae8f345.mm.p944x882e457a.m1 r8, int r9) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p944x882e457a.r1.h(com.tencent.mm.modelbase.m1, int):boolean");
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
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(final com.p314xaae8f345.mm.p944x882e457a.m1 r28, int r29) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p944x882e457a.r1.i(com.tencent.mm.modelbase.m1, int):void");
    }

    public final void j(final com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18, int i19) {
        int i27;
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        com.p314xaae8f345.mm.p944x882e457a.u0 m48002x65c7b8c0 = m1Var.m48002x65c7b8c0();
        q01.e0 e0Var = q01.e0.f440803a;
        if (m48002x65c7b8c0 == null) {
            m48002x65c7b8c0 = this;
        }
        if (e0Var.e()) {
            synchronized (m1Var) {
                if (m48002x65c7b8c0 instanceof com.p314xaae8f345.mm.p944x882e457a.r1) {
                    m48002x65c7b8c0 = new q01.x(m1Var, m48002x65c7b8c0);
                }
            }
        }
        m1Var.m48019x9345c5b0(m48002x65c7b8c0);
        if (m1Var.m48006xc9602be3() || (sVar = this.f152297d) == null) {
            i27 = 0;
        } else {
            i27 = m1Var.mo807x6c193ac1(sVar, m48002x65c7b8c0);
            if (i27 >= 0) {
                java.lang.Object[] objArr = new java.lang.Object[7];
                objArr[0] = java.lang.Integer.valueOf(i17);
                objArr[1] = java.lang.Integer.valueOf(i18);
                objArr[2] = java.lang.Integer.valueOf(i19);
                objArr[3] = java.lang.Integer.valueOf(this.f152300g.size());
                objArr[4] = java.lang.Integer.valueOf(this.f152301h.size());
                objArr[5] = java.lang.Integer.valueOf(i27);
                com.p314xaae8f345.mm.p971x6de15a2e.s sVar2 = this.f152297d;
                objArr[6] = java.lang.Integer.valueOf(sVar2 == null ? 0 : sVar2.hashCode());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "On doscene  mmcgi type:%d hash[%d,%d] run:%d wait:%d ret:%d autoauth:%d", objArr);
                m1Var.m48017xd0f4c159(false);
                return;
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[8];
        objArr2[0] = java.lang.Integer.valueOf(i17);
        objArr2[1] = java.lang.Integer.valueOf(i18);
        objArr2[2] = java.lang.Integer.valueOf(i19);
        objArr2[3] = java.lang.Boolean.valueOf(m1Var.m48006xc9602be3());
        objArr2[4] = java.lang.Integer.valueOf(this.f152300g.size());
        objArr2[5] = java.lang.Integer.valueOf(this.f152301h.size());
        objArr2[6] = java.lang.Integer.valueOf(i27);
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar3 = this.f152297d;
        objArr2[7] = java.lang.Integer.valueOf(sVar3 != null ? sVar3.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueue", "doscene mmcgi Failed type:%d hash[%d,%d] cancel[%b] run:%d wait:%d ret:%d autoauth:%d", objArr2);
        m1Var.m48019x9345c5b0(null);
        synchronized (this.f152306p) {
            this.f152300g.remove(m1Var);
            com.p314xaae8f345.mm.p944x882e457a.k2.f152193a.c(i17);
        }
        if (m1Var.m48006xc9602be3()) {
            return;
        }
        this.f152303m.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.r1$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p944x882e457a.r1.this.mo815x76e0bfae(3, -1, "doScene failed", m1Var);
            }
        });
    }

    public com.p314xaae8f345.mm.p971x6de15a2e.s k() {
        return this.f152297d;
    }

    public java.lang.String l() {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = this.f152297d;
        return sVar != null ? sVar.A0() : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
    }

    public boolean m() {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = this.f152297d;
        if (sVar != null) {
            return sVar.g0();
        }
        return true;
    }

    public int n() {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        try {
            sVar = this.f152297d;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueue", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        if (sVar != null && sVar.s1() != null) {
            return this.f152297d.s1().Wh();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueue", "[arthurdan.getNetworkStatus] Notice!!! autoAuth and autoAuth.getNetworkEvent() is null!!!!");
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 6 : 0;
    }

    public void o(int i17, p012xc85e97e9.p093xedfae76a.y yVar, q01.e eVar) {
        if (i17 == -1) {
            throw new java.lang.IllegalArgumentException("BROADCAST TYPE Not support, use add addSceneEndListener");
        }
        this.f152307q.a(i17, yVar, e75.g.f69659x9393ed43, eVar);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "onAppBackground");
        u(false);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "onAppForeground");
        u(true);
        v(false);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.m48017xd0f4c159(true);
        synchronized (this.f152306p) {
            this.f152300g.remove(m1Var);
            com.p314xaae8f345.mm.p944x882e457a.k2.f152193a.c(m1Var.mo808xfb85f7b0());
        }
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0());
        objArr[1] = java.lang.Integer.valueOf(m1Var.hashCode());
        objArr[2] = java.lang.Integer.valueOf(m1Var.m48000xf87ae66());
        objArr[3] = java.lang.Integer.valueOf(this.f152300g.size());
        objArr[4] = java.lang.Integer.valueOf(this.f152301h.size());
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = this.f152297d;
        objArr[5] = java.lang.Integer.valueOf(sVar == null ? 0 : sVar.hashCode());
        objArr[6] = java.lang.Integer.valueOf(i17);
        objArr[7] = java.lang.Integer.valueOf(i18);
        objArr[8] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "onSceneEnd mmcgi type:%d hash[%d,%d] run:%d wait:%d autoauth:%d [%d,%d,%s]", objArr);
        if (i17 == 4 && (i18 == -100 || i18 == -2023)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5146xcc9c5522 c5146xcc9c5522 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5146xcc9c5522();
            am.c cVar = c5146xcc9c5522.f135496g;
            cVar.f87827a = i17;
            cVar.f87828b = i18;
            cVar.f87829c = str;
            c5146xcc9c5522.e();
        }
        w(2);
        q01.q qVar = q01.q.f440855a;
        q01.l lVar = (q01.l) q01.q.f440856b.remove(java.lang.Integer.valueOf(m1Var.hashCode()));
        if (lVar != null) {
            lVar.f440842l = java.lang.Integer.valueOf(i17);
            lVar.f440841k = java.lang.Integer.valueOf(i18);
            long j17 = 0;
            long j18 = (lVar.f440835e <= 0 || lVar.f440834d <= 0) ? 0L : lVar.f440835e - lVar.f440834d;
            if (lVar.f440838h > 0 && lVar.f440837g > 0) {
                j17 = lVar.f440838h - lVar.f440837g;
            }
            long j19 = j17;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("enterQueueCostMs", java.lang.Long.valueOf(j18));
            linkedHashMap.put("threadStartCostMs", java.lang.Long.valueOf(j19));
            linkedHashMap.put("waitingQueueLength", java.lang.Integer.valueOf(lVar.f440836f));
            linkedHashMap.put("sceneType", lVar.f440832b);
            linkedHashMap.put("sceneDesc", lVar.f440833c);
            java.lang.Integer num = lVar.f440842l;
            if (num != null) {
                linkedHashMap.put("errType", java.lang.Integer.valueOf(num.intValue()));
            }
            java.lang.Integer num2 = lVar.f440841k;
            if (num2 != null) {
                linkedHashMap.put("errCode", java.lang.Integer.valueOf(num2.intValue()));
            }
            linkedHashMap.put("isCoreCgi", java.lang.Boolean.valueOf(lVar.f440840j));
            linkedHashMap.put("experimentGroup", lVar.f440839i);
            ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
            java.lang.String[] strArr = new java.lang.String[6];
            strArr[0] = lVar.f440832b.toString();
            strArr[1] = java.lang.String.valueOf(j18);
            strArr[2] = java.lang.String.valueOf(j19);
            strArr[3] = java.lang.String.valueOf(lVar.f440836f);
            strArr[4] = lVar.f440840j ? "1" : "0";
            strArr[5] = lVar.f440839i;
            ap.a.a(10001, "cgiPerformanceMetrics", null, linkedHashMap, strArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cgi.NetScenePerformanceMonitor", "Report complete metrics: type=" + lVar.f440832b + ", enterQueue=" + j18 + "ms, threadStart=" + j19 + "ms, waitingQueue=" + lVar.f440836f + ", isCoreCgi=" + lVar.f440840j + ", experimentGroup=" + lVar.f440839i);
        }
        b(i17, i18, str, m1Var);
        if (this.f152312v && this.f152300g.isEmpty() && this.f152301h.isEmpty()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f152313w;
            long j27 = this.f152311u;
            b4Var.c(j27, j27);
        }
    }

    public void p(int i17, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        if (i17 == -1) {
            throw new java.lang.IllegalArgumentException("BROADCAST TYPE Not support, use add removeSceneEndListener");
        }
        q01.i iVar = this.f152307q;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        q01.j jVar = new q01.j(u0Var);
        iVar.getClass();
        synchronized (iVar.f331513a) {
            e75.h hVar = (e75.h) iVar.f331513a.get(valueOf);
            if (hVar != null) {
                hVar.mo127128xb5bdeb7a(jVar);
                if (!hVar.m127122xc01c0f90()) {
                    iVar.f331513a.remove(valueOf);
                }
            }
        }
    }

    public void q(int i17, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        synchronized (this.f152302i) {
            try {
                java.util.Set set = (java.util.Set) this.f152302i.get(java.lang.Integer.valueOf(i17));
                if (set != null) {
                    synchronized (set) {
                        if (set.remove(u0Var)) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.k2.c(u0Var);
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "reset");
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = this.f152297d;
        if (sVar != null) {
            sVar.mo48028x6761d4f();
        }
        f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "clearWaitingQueue");
        synchronized (this.f152306p) {
            java.util.Vector vector = this.f152301h;
            q01.e0 e0Var = q01.e0.f440803a;
            this.f152301h = new java.util.Vector();
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "reset::cancel scene " + m1Var.mo808xfb85f7b0());
                m1Var.mo9408xae7a2e7a();
                m1Var.mo47957xb0a065f6(3, -1, "doScene failed clearRunningQueue");
                b(3, -1, "doScene failed clearWaitingQueue", m1Var);
            }
            vector.clear();
            e();
        }
        q01.i iVar = this.f152307q;
        synchronized (iVar.f331513a) {
            iVar.f331513a.clear();
        }
    }

    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "resetDispatcher");
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = this.f152297d;
        if (sVar != null) {
            sVar.mo48028x6761d4f();
            this.f152297d = null;
        }
    }

    public void t(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        this.f152297d = sVar;
        sVar.h1(new com.p314xaae8f345.mm.p944x882e457a.c2(this));
        sVar.R(this.f152304n);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#autoAuth, cost=");
        long j17 = com.p314xaae8f345.mm.app.x.f135439a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis() - j17);
        sb6.append("ms");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", sb6.toString());
        w(1);
    }

    public final void u(boolean z17) {
        this.f152304n = z17;
        this.f152305o = java.lang.Boolean.valueOf(z17);
        z65.c.f551988a = z17;
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar = this.f152297d;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueue", "setForeground autoAuth  == null");
        } else {
            sVar.R(z17);
        }
    }

    public void v(boolean z17) {
        this.f152312v = z17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f152313w;
        if (!z17) {
            b4Var.d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueue", "the working process is ready to be killed");
        long j17 = this.f152311u;
        b4Var.c(j17, j17);
    }

    public final void w(int i17) {
        synchronized (this.f152306p) {
            if (this.f152301h.size() > 0) {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) this.f152301h.get(0);
                if (i17 == 1) {
                    m1Var.m48022x4479fa06().g(1);
                }
                int mo48001x3662b71a = m1Var.mo48001x3662b71a();
                for (int i18 = 1; i18 < this.f152301h.size(); i18++) {
                    com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = (com.p314xaae8f345.mm.p944x882e457a.m1) this.f152301h.get(i18);
                    if (i17 == 1) {
                        m1Var2.m48022x4479fa06().g(1);
                    }
                    if (m1Var2.mo48001x3662b71a() > mo48001x3662b71a) {
                        if (this.f152300g.size() < this.f152299f) {
                            mo48001x3662b71a = m1Var2.mo48001x3662b71a();
                            m1Var = m1Var2;
                        }
                    }
                }
                this.f152301h.remove(m1Var);
                m1Var.m48022x4479fa06().g(i17 != 1 ? i17 != 2 ? i17 != 3 ? 200 : 203 : 202 : 201);
                e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "waiting2running waitingQueue_size = " + this.f152301h.size());
                i(m1Var, 0);
            }
        }
    }
}
