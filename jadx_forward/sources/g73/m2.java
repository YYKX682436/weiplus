package g73;

/* loaded from: classes15.dex */
public final class m2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f350823d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f350824e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f350825f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f350826g;

    /* renamed from: h, reason: collision with root package name */
    public int f350827h;

    /* renamed from: i, reason: collision with root package name */
    public final int f350828i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f350829m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f350830n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f350831o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f350832p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f350833q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f350834r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Collection f350835s;

    /* renamed from: t, reason: collision with root package name */
    public long f350836t;

    /* renamed from: u, reason: collision with root package name */
    public long f350837u;

    /* renamed from: v, reason: collision with root package name */
    public final g73.l2 f350838v;

    public m2(android.os.Looper looper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(looper, "looper");
        this.f350824e = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f350825f = true;
        this.f350826g = "4G";
        this.f350828i = 3;
        this.f350829m = true;
        this.f350830n = new java.util.LinkedHashMap();
        this.f350831o = new java.util.LinkedHashMap();
        this.f350832p = new java.util.LinkedHashMap();
        this.f350833q = new java.util.LinkedHashMap();
        this.f350834r = new java.util.LinkedHashMap();
        this.f350838v = new g73.l2(looper, this);
    }

    public final void a() {
        g73.l2 l2Var = this.f350838v;
        if (l2Var.mo50285x8fc9be06(1)) {
            return;
        }
        l2Var.mo50307xb9e94560(1, 300L);
    }

    public final void b() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f350824e;
        if (concurrentLinkedQueue.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "message queue is empty, set queueWorking = false");
            this.f350823d = false;
            return;
        }
        try {
            java.lang.String str = (java.lang.String) kz5.n0.W(concurrentLinkedQueue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            i(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HandOff.StatusManager", e17, "", new java.lang.Object[0]);
            this.f350823d = false;
        }
    }

    public final void c() {
        ((java.util.LinkedHashMap) this.f350830n).clear();
        ((java.util.LinkedHashMap) this.f350831o).clear();
        ((java.util.LinkedHashMap) this.f350832p).clear();
        ((java.util.LinkedHashMap) this.f350833q).clear();
        ((java.util.LinkedHashMap) this.f350834r).clear();
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 handOff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOff, "handOff");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "del " + handOff.getId());
        java.util.Map map = this.f350833q;
        if (!map.containsKey(handOff.getKey())) {
            map.put(handOff.getKey(), java.lang.Boolean.TRUE);
            this.f350834r.put(handOff.getKey(), handOff.getId());
        }
        this.f350830n.remove(handOff.getKey());
        this.f350831o.remove(handOff.getKey());
        this.f350832p.put(handOff.getKey(), handOff);
        a();
    }

    public final void e(java.util.Collection handOffList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handOffList, "handOffList");
        try {
            java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m40061x1de3608b, "getFormatedNetType(...)");
            this.f350826g = m40061x1de3608b;
            this.f350836t = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HANDOFF_SEQ_LONG_SYNC, 0L);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HandOff.StatusManager", e17, "restoreFromBallInfoList fail, exp:%s", e17);
            this.f350836t = 0L;
        }
        gm0.j1.n().f354821b.q(251, this);
        gm0.j1.n().f354821b.a(251, this);
        g73.o0.f350844d.k8();
    }

    public final void f() {
        if (this.f350823d) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "launch queue, set queueWorking = true");
        this.f350823d = true;
        b();
    }

    public final void g() {
        boolean z17 = true;
        int i17 = this.f350827h + 1;
        this.f350827h = i17;
        int i18 = this.f350828i;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f350824e;
        if (i17 >= i18) {
            concurrentLinkedQueue.poll();
            this.f350827h = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "send handoff failed, retry: " + this.f350827h);
        int n17 = gm0.j1.d().n();
        if (n17 != 4 && n17 != 6) {
            z17 = false;
        }
        if (z17) {
            if (!this.f350825f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "network become available, send all list");
                java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m40061x1de3608b, "getFormatedNetType(...)");
                this.f350826g = m40061x1de3608b;
                g73.o0.f350844d.k8();
            }
            b();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "network unavailable, clear message queue and retry after 30s");
            concurrentLinkedQueue.clear();
            this.f350838v.mo50307xb9e94560(2, 30000L);
        }
        this.f350825f = z17;
    }

    public final void h(int i17, java.util.Collection collection) {
        this.f350824e.add(new e73.k(i17, collection, 0L, 4, null).a(wo.w0.k(), this.f350826g, 1000, 57344));
        f();
    }

    public final void i(java.lang.String str) {
        boolean z17;
        boolean z18;
        boolean x17 = c01.z1.x();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f350824e;
        if (x17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "device is ex device, don't send handoff: " + str);
            concurrentLinkedQueue.poll();
            b();
            return;
        }
        if (!z65.c.a() && !(z18 = this.f350829m)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "debugger: " + z65.c.a() + ", handoff enabled: " + z18 + ", don't send handoff: " + str);
            concurrentLinkedQueue.poll();
            b();
            return;
        }
        this.f350837u = this.f350836t;
        java.lang.String str2 = str;
        while (true) {
            z17 = false;
            if (!r26.n0.D(str2, "<![CSEQ]>", false, 2, null)) {
                break;
            }
            str2 = r26.i0.x(str2, "<![CSEQ]>", java.lang.String.valueOf(this.f350837u), false, 4, null);
            if (this.f350837u == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                this.f350837u = 0L;
            }
            this.f350837u++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "send handoff: " + str2);
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p957x53236a1b.g1.f152859g;
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneStatusNotify", "sendHandOffSyncCmd fail due to account has not initialized");
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.g1(c01.z1.r(), 11, "HandOffMaster", str2));
            z17 = true;
        }
        if (z17) {
            return;
        }
        g();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (scene.mo47948x7f0c4558() instanceof com.p314xaae8f345.mm.p944x882e457a.o) {
            com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = scene.mo47948x7f0c4558();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo47948x7f0c4558, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            if (((com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558).f152243a.f152217a instanceof r45.yd6) {
                com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c45582 = scene.mo47948x7f0c4558();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo47948x7f0c45582, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c45582).f152243a.f152217a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StatusNotifyRequest");
                r45.xd6 xd6Var = ((r45.yd6) fVar).f472533m;
                if (xd6Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xd6Var.f471531d, "HandOffMaster")) {
                    return;
                }
                if (i17 == 0 && i18 == 0) {
                    this.f350824e.poll();
                    this.f350827h = 0;
                    this.f350836t = this.f350837u;
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HANDOFF_SEQ_LONG_SYNC, java.lang.Long.valueOf(this.f350836t));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.StatusManager", "send handoff succeed, check next message");
                    b();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HandOff.StatusManager", "send handoff fail, errType:" + i17 + ", errCode:" + i18);
                g();
            }
        }
    }
}
