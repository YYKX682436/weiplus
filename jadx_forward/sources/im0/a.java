package im0;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static long f373696b;

    /* renamed from: c, reason: collision with root package name */
    public static long f373697c;

    /* renamed from: a, reason: collision with root package name */
    public im0.b f373698a;

    public static final void a(java.lang.String str, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            gm0.c2.a("MMSkeleton.Boot", str, new java.lang.Object[0]);
        } else {
            gm0.c2.a("MMSkeleton.Boot", str, objArr);
        }
    }

    public void b(km0.b bVar) {
        a("boot execute extension... ", new java.lang.Object[0]);
        ((im0.h) this.f373698a).getClass();
        a("startup final step, account initialize... for parallels", new java.lang.Object[0]);
        if (bVar.a() && gm0.j1.b().m()) {
            gm0.j1.b().w(false);
        }
        boolean z17 = bVar.a() && gm0.j1.b().m();
        if (!gm0.j1.a()) {
            i95.n0.k(false);
        }
        nm.j jVar = nm.j.f419976g;
        nm.c cVar = nm.c.Now;
        if (jVar.f419982f.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement", "initialize pending plugins from %s", cVar);
            im0.g gVar = im0.g.f373700g;
            gVar.getClass();
            int[] iArr = nm.a.f419933a;
            gm0.c2.b("initializePendingPlugins");
            if (gVar.f373703f.compareAndSet(false, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CallbacksProxy", "initialize pending plugins.");
                gm0.c2.b("configureAndExecutePendingPlugins");
                gm0.c2.b("configureAndExecutePendingPlugins done");
                gVar.f373702e = true;
                if (((km0.c) gm0.j1.p().a()).a()) {
                    if (gm0.j1.b().m()) {
                        gm0.c2.b("preloadServicesWithAsyncModeOnDemand-before_firstscreen");
                        i95.n0.e(false, false);
                    }
                    gm0.j1.b().b();
                }
                gm0.c2.b("initializePendingPlugins done");
            }
            synchronized (jVar) {
                jVar.f419979c = true;
                jVar.b();
            }
        }
        if (z17) {
            gm0.j1.b().C();
        }
        int[] iArr2 = nm.a.f419933a;
        gm0.c2.b("afterAccountInit");
    }

    public void c() {
        f373697c = android.os.SystemClock.elapsedRealtime();
        a("hello WeChat.", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p815xbe0af3c9.app.j jVar = (com.p314xaae8f345.mm.p815xbe0af3c9.app.j) this.f373698a;
        jVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            try {
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9[] c4549xd1736fd9Arr = com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.f144768w;
                if (c4549xd1736fd9Arr[0] == null) {
                    synchronized (c4549xd1736fd9Arr) {
                        if (c4549xd1736fd9Arr[0] == null) {
                            c4549xd1736fd9Arr[0] = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(context, "push_wake");
                        }
                    }
                }
                c4549xd1736fd9Arr[0].mo40014x32c52b(300000L);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CoreService", th6, "[-] Fail to call tryToAvoidHibernating().", new java.lang.Object[0]);
            }
        }
        int[] iArr = nm.a.f419933a;
        gm0.c2.b("helloWeChat");
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p815xbe0af3c9.app.i(jVar), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? 180000L : 360000L);
    }
}
