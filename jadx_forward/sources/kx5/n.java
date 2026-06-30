package kx5;

/* loaded from: classes15.dex */
public class n {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Integer f394842n = 1000;

    /* renamed from: o, reason: collision with root package name */
    public static kx5.n f394843o;

    /* renamed from: a, reason: collision with root package name */
    public kx5.h f394844a;

    /* renamed from: b, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 f394845b;

    /* renamed from: c, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f394846c;

    /* renamed from: d, reason: collision with root package name */
    public int f394847d;

    /* renamed from: e, reason: collision with root package name */
    public mx5.b f394848e;

    /* renamed from: k, reason: collision with root package name */
    public kx5.j f394854k;

    /* renamed from: l, reason: collision with root package name */
    public kx5.i f394855l;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f394849f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f394850g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f394851h = java.lang.Boolean.FALSE;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f394853j = new java.util.concurrent.atomic.AtomicInteger(f394842n.intValue());

    /* renamed from: m, reason: collision with root package name */
    public kx5.l f394856m = null;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f394852i = new android.os.Handler(android.os.Looper.getMainLooper());

    public static void a(kx5.n nVar, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c1;
        nVar.getClass();
        c28580x69eec95e.m137419x5cd39ffa();
        if (nVar.f394850g.size() != 0 || (c28584x3d6c67c1 = nVar.f394845b) == null) {
            return;
        }
        nVar.f394845b = null;
        nVar.f394852i.postDelayed(new kx5.d(nVar, c28584x3d6c67c1), 1000L);
    }

    public static kx5.n h() {
        if (f394843o == null) {
            synchronized (kx5.n.class) {
                f394843o = new kx5.n();
            }
        }
        return f394843o;
    }

    public boolean b() {
        if (this.f394846c == null || this.f394851h.booleanValue()) {
            return false;
        }
        if (g(this.f394847d) == this.f394846c) {
            return true;
        }
        nx5.c.b("WxaRouter.WxaRouter", "WxaRouter canReleasePreloadFlutterEngine error", new java.lang.Object[0]);
        return false;
    }

    public int c() {
        e(this.f394844a, false);
        int i17 = this.f394853j.get();
        nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine defaultFlutterEngine: %d", java.lang.Integer.valueOf(i17));
        d(this.f394844a, true);
        return i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(kx5.h hVar, boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137537xf6bf6fb2;
        long j17;
        boolean z18;
        px5.a aVar = px5.b.f440490a;
        px5.b.f440491b.put(java.lang.String.valueOf(this.f394853j.toString()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f m136951x464ccf4f = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136951x464ccf4f();
        m136951x464ccf4f.m137938x6fa2b5a2(this.f394844a.f394840e);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint(m136951x464ccf4f.m137934x595ee78f(), this.f394844a.f394836a);
        this.f394844a.getClass();
        java.lang.String format = java.lang.String.format("%s-%s", "/", java.lang.Integer.valueOf(this.f394853j.get()));
        if (this.f394854k != null) {
            android.content.Context context = this.f394844a.f394840e;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.List<java.lang.String> list = hVar.f394841f;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                e50.z0 z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class));
                pi0.q qVar = z0Var.f331091e;
                if (qVar != null) {
                    java.lang.Object ref = z0Var.f331100q;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ref, "ref");
                    synchronized (qVar.f436242m) {
                        z18 = qVar.f436242m.contains(ref);
                    }
                } else {
                    z18 = false;
                }
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate provide engine");
                    f50.y yVar = (f50.y) i95.n0.c(f50.y.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
                    e50.z0 z0Var2 = (e50.z0) yVar;
                    z0Var2.getClass();
                    m137537xf6bf6fb2 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) p3325xe03a0797.p3326xc267989b.l.f(null, new pi0.b(z0Var2.Ui(), context, dartEntrypoint, format, true, list, null), 1, null);
                    z0Var2.Ui().f(z0Var2.f331100q);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate provide engine has not ready engineGroup for liteapp");
            kx5.n h17 = h();
            h17.e(h17.f394844a, true);
            m137537xf6bf6fb2 = h17.f394845b.m137537xf6bf6fb2(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options(h17.f394844a.f394840e).m137547x382db23f(dartEntrypoint).m137549x7e19e2e7(format).m137546x1c0b3adc(true).m137548x299bbfbc(list));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137537xf6bf6fb2, "originCreateFlutterEngine(...)");
        } else {
            m137537xf6bf6fb2 = this.f394845b.m137537xf6bf6fb2(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options(this.f394844a.f394840e).m137547x382db23f(dartEntrypoint).m137549x7e19e2e7(format).m137546x1c0b3adc(true).m137548x299bbfbc(hVar.f394841f));
        }
        int i17 = this.f394853j.get();
        if (m137537xf6bf6fb2 != null) {
            this.f394850g.put(i17, m137537xf6bf6fb2);
        } else {
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
        }
        if (!z17 && this.f394846c == null) {
            this.f394846c = m137537xf6bf6fb2;
            this.f394847d = this.f394853j.get();
        }
        nx5.c.c("WxaRouter.WxaRouter", "create flutter engineId:%s", java.lang.Integer.valueOf(this.f394853j.get()));
        nx5.c.c("WxaRouter.WxaRouter", "registerPlugins by wxa router", new java.lang.Object[0]);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (this.f394855l != null) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler k0Var = j62.e.g().l("clicfg_liteapp_video_use_finder", false, true, true) ? new ha3.k0() : new x03.q1();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.m5) ((os5.s) i95.n0.c(os5.s.class))).getClass();
            hashSet2.add(new th2.b());
            hashSet2.add(new io.p3284xd2ae381c.p3310xe3a677a0.p3313xd2ae381c.p3314x1e0673e7.p3315xd0d13ae7.ViewTreeObserverOnGlobalLayoutListenerC28756xe90a0761());
            hashSet2.add(new kx5.p());
            hashSet2.add(k0Var);
            hashSet2.add(new g03.a());
            hashSet2.add(new g03.b());
            hashSet2.add(new g03.c());
            hashSet2.add(new k03.h());
            hashSet2.add(new si0.f());
            hashSet2.add(new zc.b0());
            hashSet2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.b2());
            hashSet2.add(new fa3.r());
            hashSet2.add(new ea3.b0());
            hashSet2.add(new la3.l());
            hashSet2.add(new ca3.t());
            hashSet2.add(new ma3.e());
            hashSet.addAll(hashSet2);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f interfaceC28623x7c9e3e4f = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f) it.next();
            if (m137537xf6bf6fb2.m137439x2173b36a().has(interfaceC28623x7c9e3e4f.getClass())) {
                nx5.c.e("WxaRouter.GeneratedPluginRegistrant", "plugin: " + interfaceC28623x7c9e3e4f.toString() + " has registered.", new java.lang.Object[0]);
                m137537xf6bf6fb2.m137439x2173b36a().mo137495xc84af884((java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>) interfaceC28623x7c9e3e4f.getClass());
            }
            m137537xf6bf6fb2.m137439x2173b36a().add(interfaceC28623x7c9e3e4f);
        }
        i(m137537xf6bf6fb2);
        m137537xf6bf6fb2.m137435x8a0ad399().m138193x7e19e2e7(format);
        if (!m137537xf6bf6fb2.m137427x4255efe8().m137860xb615fc87()) {
            m137537xf6bf6fb2.m137427x4255efe8().m137854x820a9012(dartEntrypoint, hVar.f394841f);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        px5.a aVar2 = px5.b.f440490a;
        java.lang.String key = this.f394853j.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = px5.b.f440491b;
        if (hashMap.containsKey(key)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object obj = hashMap.get(key);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            j17 = currentTimeMillis - ((java.lang.Number) obj).longValue();
        } else {
            j17 = 0;
        }
        objArr[0] = java.lang.Long.valueOf(j17);
        nx5.c.c("WxaRouter.WxaRouter", "TimeRecord createFlutterEngine:%d", objArr);
        this.f394853j.addAndGet(1);
    }

    public final void e(kx5.h hVar, boolean z17) {
        if ((this.f394854k == null || z17) && this.f394845b == null) {
            nx5.c.c("WxaRouter.WxaRouter", "createFlutterEngineGroup", new java.lang.Object[0]);
            this.f394845b = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1(hVar.f394840e);
        }
    }

    public void f(int i17) {
        nx5.c.c("WxaRouter.WxaRouter", "destroyPreloadFlutterEngine engineId:%d default:%d defaultUsed:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f394847d), this.f394851h);
        if (i17 == 0 && (this.f394846c == null || this.f394851h.booleanValue())) {
            return;
        }
        if (i17 == 0) {
            i17 = this.f394847d;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g17 = g(i17);
        if (i17 == this.f394847d && g17 != this.f394846c) {
            nx5.c.b("WxaRouter.WxaRouter", "WxaRouter destroyPreloadFlutterEngine error", new java.lang.Object[0]);
        } else {
            j(i17, "destroyApp", new java.util.HashMap());
            p(i17);
        }
    }

    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g(int i17) {
        return (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) this.f394850g.get(i17);
    }

    public void i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (this.f394844a.f394837b == null) {
            nx5.c.c("WxaRouter.WxaRouter", "no method call handler.", new java.lang.Object[0]);
            return;
        }
        kx5.p pVar = (kx5.p) c28580x69eec95e.m137439x2173b36a().get(kx5.p.class);
        if (pVar != null) {
            java.util.HashSet hashSet = this.f394844a.f394837b;
            java.util.HashSet hashSet2 = pVar.f394859e;
            if (hashSet2.contains(hashSet)) {
                nx5.c.c("WxaRouter.WxaRouterPlugin", "had add method call handler %s", java.lang.Integer.valueOf(hashSet.hashCode()));
            } else {
                hashSet2.addAll(hashSet);
            }
        }
    }

    public void j(int i17, java.lang.String str, java.lang.Object obj) {
        if (this.f394850g.indexOfKey(i17) <= -1) {
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
            return;
        }
        kx5.p pVar = (kx5.p) g(i17).m137439x2173b36a().get(kx5.p.class);
        if (pVar != null) {
            pVar.f394858d.a(str, obj, null);
        }
    }

    public void k(int i17, java.lang.String str, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (this.f394850g.indexOfKey(i17) <= -1) {
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
            return;
        }
        kx5.p pVar = (kx5.p) g(i17).m137439x2173b36a().get(kx5.p.class);
        if (pVar != null) {
            pVar.f394858d.a(str, obj, result);
        }
    }

    public boolean l() {
        return this.f394844a != null;
    }

    public void m() {
        if (this.f394846c == null || this.f394851h.booleanValue()) {
            e(this.f394844a, false);
            this.f394846c = null;
            this.f394851h = java.lang.Boolean.FALSE;
            d(this.f394844a, false);
        }
    }

    public void n(kx5.k kVar) {
        kx5.j jVar = this.f394854k;
        if (jVar == null) {
            e(this.f394844a, false);
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.m) jVar).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(b17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.l(kVar, null), 2, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate prepareFlutterEngineGroup isn't in MainProcess!");
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    public int o(boolean z17, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874) {
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_FLUTTER_ENGINE);
        }
        e(this.f394844a, false);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f394846c;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f394853j;
        if (c28580x69eec95e == null) {
            if (!z17) {
                this.f394851h = java.lang.Boolean.TRUE;
            }
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.FLUTTER_ENGINE_NOT_PRELOADED);
            }
            int i17 = atomicInteger.get();
            nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine defaultFlutterEngine: %d", java.lang.Integer.valueOf(i17));
            d(this.f394844a, false);
            return i17;
        }
        if (this.f394851h.booleanValue()) {
            if (z17) {
                this.f394846c = null;
                this.f394851h = java.lang.Boolean.FALSE;
            }
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.FLUTTER_ENGINE_NOT_PRELOADED);
            }
            int i18 = atomicInteger.get();
            d(this.f394844a, false);
            nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine createEngineId:%d", java.lang.Integer.valueOf(i18));
            return i18;
        }
        nx5.c.c("WxaRouter.WxaRouter", "provideFlutterEngine prepare defaultFlutterEngine: %d", java.lang.Integer.valueOf(this.f394847d));
        if (!z17) {
            this.f394851h = java.lang.Boolean.TRUE;
        }
        if (this.f394854k != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                e50.z0 z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class));
                pi0.q qVar = z0Var.f331091e;
                if (qVar != null) {
                    qVar.f(z0Var.f331100q);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate finishHoldEngineGroup isn't in MainProcess!");
            }
        }
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28889x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.FLUTTER_ENGINE_PRELOADED);
        }
        return this.f394847d;
    }

    public void p(int i17) {
        nx5.c.c("WxaRouter.WxaRouter", "releaseEngine start: %d", java.lang.Integer.valueOf(i17));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e g17 = g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "WxaRouter releaseEngine engine is nil", new java.lang.Object[0]);
            return;
        }
        if (g17 == this.f394846c) {
            this.f394851h = java.lang.Boolean.FALSE;
            this.f394846c = null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("engineId", java.lang.Integer.valueOf(i17));
        kx5.c cVar = new kx5.c(this, i17, g17);
        kx5.f fVar = new kx5.f(this, cVar, "releaseEngine", 3000);
        h().k(i17, "releaseEngine", hashMap, new kx5.g(this, fVar, "releaseEngine", cVar));
        this.f394852i.postDelayed(fVar, 3000);
        this.f394850g.remove(i17);
    }
}
