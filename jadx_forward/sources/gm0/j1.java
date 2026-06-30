package gm0;

/* loaded from: classes12.dex */
public final class j1 {

    /* renamed from: m, reason: collision with root package name */
    public static gm0.j1 f354739m;

    /* renamed from: a, reason: collision with root package name */
    public final gm0.z1 f354741a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 f354742b;

    /* renamed from: c, reason: collision with root package name */
    public final c01.kd f354743c;

    /* renamed from: d, reason: collision with root package name */
    public gm0.b0 f354744d;

    /* renamed from: e, reason: collision with root package name */
    public gm0.m f354745e;

    /* renamed from: f, reason: collision with root package name */
    public gm0.y f354746f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f354750j;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String[] f354738l = {":appbrand0", ":appbrand1", ":appbrand2", ":appbrand3", ":appbrand4"};

    /* renamed from: n, reason: collision with root package name */
    public static final gm0.p1 f354740n = new gm0.p1();

    /* renamed from: g, reason: collision with root package name */
    public final bm5.x0 f354747g = new bm5.x0(new gm0.C28426x5ec8d7a());

    /* renamed from: h, reason: collision with root package name */
    public final gm0.n1 f354748h = new gm0.n1(null);

    /* renamed from: i, reason: collision with root package name */
    public final gm0.w f354749i = new gm0.w();

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f354751k = false;

    public j1(km0.c cVar) {
        gm0.z1 z1Var;
        this.f354743c = null;
        synchronized (gm0.z1.class) {
            if (gm0.z1.f354828j != null) {
                gm0.c2.a("MicroMsg.MMSkeleton", "Kernel not null, has initialized.", new java.lang.Object[0]);
                z1Var = gm0.z1.f354828j;
            } else {
                gm0.c2.a("MicroMsg.MMSkeleton", "Initialize skeleton, create whole world.", new java.lang.Object[0]);
                gm0.z1 z1Var2 = new gm0.z1(cVar);
                gm0.z1.f354828j = z1Var2;
                z1Var = z1Var2;
            }
        }
        this.f354741a = z1Var;
        boolean a17 = ((km0.c) z1Var.b().a()).a();
        this.f354750j = a17;
        if (a17) {
            this.f354743c = new c01.kd();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 u3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.u3(s75.a.a("worker"));
            this.f354742b = u3Var;
            u3Var.j(new gm0.k1(this));
        }
    }

    public static boolean a() {
        gm0.m mVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (mVar = i().f354745e) != null && mVar.m()) {
            return mVar.f354786p;
        }
        return false;
    }

    public static gm0.m b() {
        iz5.a.d("mCoreAccount not initialized!", i().f354745e);
        return i().f354745e;
    }

    public static com.p314xaae8f345.mm.p944x882e457a.r1 d() {
        i();
        return n().f354821b;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 e() {
        iz5.a.g(null, i().f354750j);
        return i().f354742b;
    }

    public static c01.kd f() {
        iz5.a.g(null, i().f354750j);
        return i().f354743c;
    }

    public static synchronized void g(km0.c cVar) {
        synchronized (gm0.j1.class) {
            gm0.j1 j1Var = f354739m;
            if (j1Var != null) {
                ((km0.c) j1Var.f354741a.b().a()).f390522c = cVar.f390522c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKernel", "Kernel not null, has initialized.");
            } else {
                gm0.c2.f354705b = new gm0.l1();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKernel", "Initialize kernel, create whole WeChat world.");
                f354739m = new gm0.j1(cVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKernel", "[+] Call post initialized callbacks now.");
                f354740n.s();
            }
        }
    }

    public static boolean h() {
        return f354739m != null;
    }

    public static gm0.j1 i() {
        iz5.a.d("Kernel not initialized by MMApplication!", f354739m);
        return f354739m;
    }

    public static boolean j() {
        gm0.m mVar = i().f354745e;
        if (mVar != null) {
            return mVar.f354786p;
        }
        return false;
    }

    public static gm0.y n() {
        iz5.a.d("mCoreNetwork not initialized!", i().f354746f);
        return i().f354746f;
    }

    public static gm0.z o() {
        gm0.z zVar = i().f354741a.f354829a;
        iz5.a.d("mCorePlugins not initialized!", zVar);
        iz5.a.d("mCorePlugins not initialized!", zVar);
        gm0.z zVar2 = i().f354741a.f354829a;
        iz5.a.d("mCorePlugins not initialized!", zVar2);
        return zVar2;
    }

    public static gm0.a0 p() {
        iz5.a.d("mCoreProcess not initialized!", i().f354741a.b());
        return i().f354741a.b();
    }

    public static void q(java.lang.Class cls, lm0.a aVar) {
        i();
        gm0.z o17 = o();
        o17.f354827a.a(cls, new lm0.f(aVar));
    }

    public static lm0.a s(java.lang.Class cls) {
        i();
        lm0.a b17 = o().f354827a.b(cls);
        if (b17 != null) {
            return b17;
        }
        iz5.a.d("Skeleton not initialized!", gm0.z1.f354828j);
        android.app.Application application = gm0.z1.f354828j.b().a().f390522c;
        return null;
    }

    public static s85.d t() {
        return (s85.d) i().f354747g.b();
    }

    public static gm0.b0 u() {
        iz5.a.d("mCoreStorage not initialized!", i().f354744d);
        return i().f354744d;
    }

    public void c(hm0.x xVar) {
        gm0.z1 z1Var = this.f354741a;
        z1Var.a(z1Var.f354837i, xVar);
    }

    public void k(int i17) {
        gm0.m b17 = b();
        b17.getClass();
        if ((i17 != 0) && gm0.l.a(gm0.m.f354766v) == i17 && b17.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreAccount", "loginUin, uin not changed, return :%d", java.lang.Integer.valueOf(i17));
            return;
        }
        synchronized (b17.f354773c) {
            gm0.l.b(gm0.m.f354766v, i17);
            b17.y();
            b17.f354784n = android.os.SystemClock.elapsedRealtime();
            b17.p(true);
        }
    }

    public void l(java.lang.String str) {
        java.lang.String a17 = kk.v.a(this.f354745e.h());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMKernel", "logoutAccount uin:%s info:%s stack:%s", a17, str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        gm0.m.f354767w = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true) + str;
        this.f354745e.l().a((long) this.f354745e.h());
        r();
        this.f354745e.getClass();
        gm0.l.b(gm0.m.f354766v, 0);
        gm0.m.f354765u = false;
    }

    public void m(hm0.x xVar) {
        gm0.z1 z1Var = this.f354741a;
        z1Var.a(z1Var.f354836h, xVar);
    }

    public void r() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[1];
        gm0.m mVar = this.f354745e;
        java.lang.String a17 = mVar != null ? kk.v.a(mVar.h()) : "-1";
        objArr[0] = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMKernel", "release uin:%s ", objArr);
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = this.f354746f.f354821b;
        if (r1Var != null) {
            r1Var.r();
        }
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        synchronized (t0Var) {
            if (t0Var.f394150a.compareAndSet(false, true)) {
                java.util.Iterator it = xu5.b.f538833e.values().iterator();
                while (it.hasNext()) {
                    ((xu5.b) it.next()).f538836b.g();
                }
                xu5.b.f538833e.clear();
                vu5.l lVar = t0Var.f394152c;
                vu5.f fVar = lVar.f521892a;
                if (fVar.f521878d.compareAndSet(false, true)) {
                    fVar.e();
                }
                vu5.j jVar = lVar.f521893b;
                if (jVar.f521878d.compareAndSet(false, true)) {
                    jVar.d();
                }
                vu5.q qVar = lVar.f521894c;
                if (qVar.f521878d.compareAndSet(false, true)) {
                    qVar.d();
                }
                ku5.o.f394132c.i("PoolAdapter", "[shutdown]", new java.lang.Object[0]);
                java.util.Iterator it6 = ru5.k.f481342a.values().iterator();
                while (it6.hasNext()) {
                    ((ru5.j) it6.next()).j();
                }
                java.util.Iterator it7 = ru5.d.f481326c.values().iterator();
                while (it7.hasNext()) {
                    android.os.Handler handler = (android.os.Handler) ((java.lang.ref.WeakReference) it7.next()).get();
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                }
                ku5.o.f394130a.mo8887xf5e80656();
            }
        }
        pu5.g.f440004a.j();
        if (((ku5.t0) ku5.t0.f394148d).f394151b.f394092f) {
            try {
                java.util.concurrent.Executor executor = ku5.u.f394153a;
                zu5.a aVar = new zu5.a(android.os.AsyncTask.class, "THREAD_POOL_EXECUTOR");
                synchronized (aVar) {
                    aVar.c(null, executor, false);
                }
            } catch (java.lang.Exception e17) {
                ku5.o.f394132c.e("ThreadModuleBoot", e17.toString(), new java.lang.Object[0]);
            }
            ku5.u.f394153a = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 u3Var = this.f354742b;
        if (u3Var != null) {
            gm0.m1 m1Var = new gm0.m1(this);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset tid[%d] stack:%s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            iz5.a.g("syncReset should in mainThread", com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e());
            long id6 = u3Var.f274548a.getId();
            byte[] bArr = new byte[0];
            com.p314xaae8f345.mm.sdk.p2603x2137b148.p3 p3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.p3(u3Var, m1Var, u3Var.f274550c, bArr);
            synchronized (bArr) {
                int g17 = u3Var.g(p3Var);
                long id7 = u3Var.f274548a.getId();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMHandlerThread", "syncReset postAtFrontOfWorker ret[%d], oldTid[%d], curTid[%d]", java.lang.Integer.valueOf(g17), java.lang.Long.valueOf(id6), java.lang.Long.valueOf(id7));
                if (g17 == 0 && id6 == id7) {
                    try {
                        bArr.wait();
                    } catch (java.lang.Exception e18) {
                        e18.getMessage();
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMKernel", "release uin:%s finish!!! cost:%sms", a17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
