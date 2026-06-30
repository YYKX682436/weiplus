package w11;

/* loaded from: classes12.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final x51.q1 f523532a = new x51.q1("clicfg_sync_service_threadpool_enable");

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f523533b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Queue f523534c = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f523535d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public w11.u f523536e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f523537f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f523538g = null;

    /* renamed from: h, reason: collision with root package name */
    public final w11.h2 f523539h = new w11.h2(new w11.f2(this));

    public static void b(java.lang.String str, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "ASSERT now msg:%s", str);
        iz5.a.h(str);
        throw null;
    }

    public final void a(final w11.u uVar) {
        if (w11.a1.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "tryStart dkinit never do sync before init done :%s ", uVar);
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: w11.d2$$b
            @Override // java.lang.Runnable
            public final void run() {
                w11.d2 d2Var = w11.d2.this;
                w11.u uVar2 = uVar;
                if (uVar2 != null) {
                    d2Var.getClass();
                    if (uVar2 instanceof z11.c) {
                        ((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523534c).add(uVar2);
                    } else {
                        ((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523533b).add(uVar2);
                    }
                }
                d2Var.d(null);
            }
        };
        x51.q1 q1Var = this.f523532a;
        q1Var.getClass();
        q1Var.a(runnable, 0L, true);
    }

    public int c(long j17, int i17, java.lang.String str, r45.cx4 cx4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "dealWithSelector selector:%d aiScene:%d xml:%s ", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str);
        if ((256 & j17) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47().e();
        }
        if ((2097152 & j17) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5822x76918f51().e();
        }
        if ((128 & j17) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6139xfc5b076a().e();
        }
        if ((16777216 & j17) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5535xce15fb19().e();
        }
        if ((32 & j17) != 0) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5218x7db5f878().e();
        }
        long j18 = j17 & (-16777217) & (-33) & (-257) & (-2097153) & 95;
        int i18 = 0;
        if (j18 != 0 && gm0.j1.a() && gm0.j1.u().c() != null) {
            boolean z17 = !gm0.m.r() && gm0.j1.a();
            gm0.j1.u().c().w(8196, java.lang.Long.valueOf(j18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "dealWithSelector ContinueFlag:%s cu:%s", java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(z17));
            if (z17) {
                z11.b bVar = new z11.b(this, i17, 7, 0, cx4Var);
                a(bVar);
                i18 = bVar.hashCode();
            } else {
                w11.z0 z0Var = new w11.z0(i17);
                int hashCode = z0Var.hashCode();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "dealWithSelector syncHash: %d", java.lang.Integer.valueOf(hashCode));
                if (gm0.j1.n().f354821b.h(z0Var, 0)) {
                    i18 = hashCode;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "dealWithSelector doScene failed, hash: %d, zero hash will be return.", java.lang.Integer.valueOf(hashCode));
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679 c5206xdf10b679 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5206xdf10b679();
            am.c1 c1Var = c5206xdf10b679.f135545g;
            c1Var.f87831a = 3;
            c1Var.f87832b = str;
            c5206xdf10b679.e();
        }
        return i18;
    }

    public void d(w11.u uVar) {
        java.lang.String str;
        if (uVar == null) {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            int length = stackTrace.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    str = "<native>";
                    break;
                }
                java.lang.StackTraceElement stackTraceElement = stackTrace[i17];
                if (!stackTraceElement.getClassName().contains(w11.d2.class.getName())) {
                    str = stackTraceElement.toString();
                    break;
                }
                i17++;
            }
        } else {
            str = uVar.getClass().getName();
        }
        e(uVar, str);
    }

    public final void e(final w11.u uVar, java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = uVar != null ? uVar : "null";
        objArr[1] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "doLoop %s, from=%s", objArr);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: w11.d2$$a
            @Override // java.lang.Runnable
            public final void run() {
                boolean z17;
                boolean z18;
                boolean z19;
                w11.d2 d2Var = w11.d2.this;
                w11.u uVar2 = uVar;
                d2Var.getClass();
                if (gm0.m.r() || !gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "begin to doLoop but MMCore account has not ready or MMCore is hold.");
                    return;
                }
                if (uVar2 != null) {
                    w11.u uVar3 = d2Var.f523536e;
                    long j17 = d2Var.f523537f;
                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "finish proc:%s running:%s RunTime:%s ", uVar2, uVar3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                    if (d2Var.f523536e != null && uVar2.hashCode() != d2Var.f523536e.hashCode()) {
                        for (java.lang.Integer num : d2Var.f523535d.keySet()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "check unfinish proc :%s timediff:%s", num, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Long) d2Var.f523535d.get(num)).longValue()));
                        }
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) d2Var.f523535d.remove(java.lang.Integer.valueOf(uVar2.hashCode())), -1L) != -1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "oldproc timeout, should in timeoutMap: %s", objArr2);
                        return;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(jx3.f.A((int) (java.lang.System.currentTimeMillis() - d2Var.f523537f), new int[]{200, 500, 800, 1500, 3000, 5000, 10000, 30000, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54064xffc564fb}, new java.lang.Integer[]{70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80}), "null cannot be cast to non-null type kotlin.Int");
                    jx3.f.INSTANCE.mo68477x336bdfd8(99L, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) r2), 1L, false);
                    d2Var.f523536e = null;
                    d2Var.f523537f = 0L;
                    d2Var.i();
                }
                if (d2Var.f523536e != null) {
                    long j18 = d2Var.f523537f;
                    boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
                    if (currentTimeMillis <= 90000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "tryStart last proc:%s running:%s ", d2Var.f523536e, java.lang.Long.valueOf(currentTimeMillis));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "tryStart last proc:%s TIMEOUT:%s Run Next Now.", d2Var.f523536e, java.lang.Long.valueOf(currentTimeMillis));
                    w11.u p17 = d2Var.f523536e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
                    if ((p17 instanceof z11.b) || (p17 instanceof w11.v)) {
                        jx3.f fVar = jx3.f.INSTANCE;
                        fVar.d(11098, 3571, "" + z65.c.f551988a + ';' + a21.a.a());
                        fVar.mo68477x336bdfd8(99L, z65.c.f551988a ? 30 : 34, 1L, false);
                    } else if (p17 instanceof z11.c) {
                        jx3.f fVar2 = jx3.f.INSTANCE;
                        fVar2.d(11098, 3572, "" + z65.c.f551988a + ';' + a21.a.a());
                        fVar2.mo68477x336bdfd8(99L, z65.c.f551988a ? 31 : 35, 1L, false);
                    } else if (p17 instanceof z11.a) {
                        jx3.f fVar3 = jx3.f.INSTANCE;
                        fVar3.d(11098, 3573, "" + z65.c.f551988a + ';' + a21.a.a());
                        fVar3.mo68477x336bdfd8(99L, z65.c.f551988a ? 32 : 36, 1L, false);
                    } else {
                        jx3.f fVar4 = jx3.f.INSTANCE;
                        fVar4.d(11098, 3574, "" + z65.c.f551988a + ';' + a21.a.a());
                        fVar4.mo68477x336bdfd8(99L, z65.c.f551988a ? 33 : 37, 1L, false);
                    }
                    d2Var.f523535d.put(java.lang.Integer.valueOf(d2Var.f523536e.hashCode()), java.lang.Long.valueOf(d2Var.f523537f));
                    d2Var.f523536e = null;
                    d2Var.f523537f = 0L;
                    d2Var.i();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class));
                c01.wc wi6 = x0Var.wi();
                synchronized (wi6) {
                    wi6.a();
                    z17 = wi6.f119089e == 2;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "Warning: Set SyncService Pause Now.");
                    x0Var.wi().c();
                } else {
                    c01.wc wi7 = x0Var.wi();
                    synchronized (wi7) {
                        wi7.a();
                        z18 = wi7.f119089e == 3;
                    }
                    if (!z18) {
                        z19 = false;
                        if (z19 || d2Var.f(new z11.a(d2Var), d2Var.f523533b, "LightPush")) {
                        }
                        while (!((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523534c).isEmpty()) {
                            w11.u uVar4 = (w11.u) ((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523534c).poll();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "tryStart check NotifyData ListSize:%s proc:%s", java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523534c).size()), uVar4);
                            if (d2Var.f(uVar4, d2Var.f523534c, "NotifyData")) {
                                return;
                            }
                        }
                        if (!((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523533b).isEmpty()) {
                            w11.u uVar5 = (w11.u) ((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523533b).poll();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "tryStart check Sync ListSize:%s proc:%s", java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523533b).size()), uVar5);
                            if (d2Var.f(uVar5, d2Var.f523533b, "NetSync")) {
                                return;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "tryStart FINISH Check running:%s sync:%s notify:%s", d2Var.f523536e, java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523533b).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523534c).size()));
                        w11.d2.b("", d2Var.f523536e == null && ((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523533b).isEmpty() && ((java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523534c).isEmpty());
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "Warning: SyncService is Paused.");
                }
                z19 = true;
                if (z19) {
                }
            }
        };
        x51.q1 q1Var = this.f523532a;
        q1Var.getClass();
        q1Var.a(runnable, 0L, true);
    }

    public final boolean f(w11.u uVar, java.util.Queue queue, java.lang.String str) {
        if (uVar == null || !uVar.t(queue)) {
            return false;
        }
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "wakelock tag:%s syncWakerLock:%s", str, this.f523538g);
            if (this.f523538g == null) {
                this.f523538g = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "MicroMsg.SyncService", new w11.e2(this));
            }
            b("lock", !this.f523538g.mo40012xf1a1864d());
            if (!z65.c.f551988a) {
                this.f523538g.m40015x32c52b(30000L, str);
            }
        }
        this.f523536e = uVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f523537f = java.lang.System.currentTimeMillis();
        return true;
    }

    public void g(o45.yh yhVar, int i17, r45.cx4 cx4Var) {
        boolean z17 = false;
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2552x5026199c.C20558x9bb4f599()) == 1 ? !w11.z.f523712a ? w11.z.f523713b : false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "notify data check false, can not handle notify data");
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2552x5026199c.C20558x9bb4f599()) == 1 && !w11.z.f523712a && !w11.z.f523713b) {
                z17 = true;
            }
            if (z17) {
                h(12);
                return;
            }
            return;
        }
        if (!gm0.m.r() && gm0.j1.a()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "triggerNotifyDataSync checkUse:%s resp:%s syncflag:%s recvtime:%s", java.lang.Boolean.valueOf(z17), yhVar, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(cx4Var.f453432e));
        if (z17) {
            a(new z11.c(this, yhVar, i17, cx4Var));
        } else {
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new w11.z0(yhVar, i17, cx4Var.f453432e));
        }
    }

    public int h(int i17) {
        boolean z17 = !gm0.m.r() && gm0.j1.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "triggerSync checkUse:%s scene:%s [%s]", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (z17) {
            z11.b bVar = new z11.b(this, i17, 7, 0, com.p314xaae8f345.mm.p642xad8b531f.x1.e());
            a(bVar);
            return bVar.hashCode();
        }
        w11.z0 z0Var = new w11.z0(i17);
        gm0.j1.n().f354821b.g(z0Var);
        return z0Var.hashCode();
    }

    public final synchronized void i() {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9 = this.f523538g;
        if (c4549xd1736fd9 != null && c4549xd1736fd9.mo40012xf1a1864d()) {
            this.f523538g.mo40017xcdd95364();
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd92 = this.f523538g;
        objArr[0] = c4549xd1736fd92 == null ? "null" : java.lang.Boolean.valueOf(c4549xd1736fd92.mo40012xf1a1864d());
        objArr[1] = java.lang.Boolean.valueOf(z65.c.f551988a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "wakeUnlock syncWakerLock locking?:%s foreground:%s", objArr);
    }
}
