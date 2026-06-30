package ku5;

/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.concurrent.Executor f394153a;

    public static void a(android.content.Context context, ku5.s sVar) {
        java.lang.Object a17;
        com.p314xaae8f345.mm.p642xad8b531f.p3 p3Var = (com.p314xaae8f345.mm.p642xad8b531f.p3) sVar;
        p3Var.getClass();
        ku5.o.f394132c = new com.p314xaae8f345.mm.p642xad8b531f.i3(p3Var);
        ku5.o.f394131b = new com.p314xaae8f345.mm.p642xad8b531f.j3(p3Var);
        ku5.o.f394130a = new com.p314xaae8f345.mm.p642xad8b531f.k3(p3Var);
        ku5.b bVar = new ku5.b();
        ku5.c a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? com.p314xaae8f345.mm.p642xad8b531f.o3.f145070e.a(bVar) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() ? com.p314xaae8f345.mm.p642xad8b531f.o3.f145071f.a(bVar) : com.p314xaae8f345.mm.p642xad8b531f.o3.f145072g.a(bVar);
        pu5.g.f440004a = new ou5.d(context, a18);
        int max = java.lang.Math.max(1, a18.f394087a / 2);
        int max2 = java.lang.Math.max(1, max / 3);
        int ordinal = a18.f394091e.ordinal();
        tu5.j.f503709a = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? new tu5.d() : new tu5.a(max2, max2) : new tu5.k(max) : new tu5.c(1000L, max, max2) : new tu5.f(1000L, 500.0f, max, max2) : new tu5.e(max, max2);
        synchronized (ku5.t0.class) {
            ku5.t0 t0Var = new ku5.t0(a18);
            ku5.t0.f394148d = t0Var;
            ku5.t0.f394149e = t0Var;
        }
        if (a18.f394092f) {
            try {
                zu5.a aVar = new zu5.a(android.os.AsyncTask.class, "THREAD_POOL_EXECUTOR");
                synchronized (aVar) {
                    a17 = aVar.a(false);
                }
                f394153a = (java.util.concurrent.Executor) a17;
                ku5.r rVar = new ku5.r();
                zu5.a aVar2 = new zu5.a(android.os.AsyncTask.class, "THREAD_POOL_EXECUTOR");
                synchronized (aVar2) {
                    aVar2.c(null, rVar, false);
                }
            } catch (java.lang.Exception e17) {
                ku5.o.f394132c.e("ThreadModuleBoot", e17.toString(), new java.lang.Object[0]);
            }
        }
        if (a18.f394093g) {
            try {
                com.p314xaae8f345.p3003xb96b9126.p3004xc267989b.p3005x30f523.C26126xe80a2e4b c26126xe80a2e4b = com.p314xaae8f345.p3003xb96b9126.p3004xc267989b.p3005x30f523.C26126xe80a2e4b.f49886x4fbc8495;
                com.p314xaae8f345.p3003xb96b9126.p3004xc267989b.p3005x30f523.C26126xe80a2e4b.class.getDeclaredMethod("setup", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            } catch (java.lang.ClassNotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Cannot enable hook coroutines dispatchers without depending threadpool-coroutines.");
            } catch (java.lang.NoSuchMethodException unused2) {
                throw new java.lang.IllegalStateException("ThreadPool internal error. Cannot find method setup in coroutines dispatchers hook initializer.");
            } catch (java.lang.Exception unused3) {
                throw new java.lang.IllegalStateException("ThreadPool internal error. Cannot call method setup in coroutines dispatchers hook initializer.");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", "onBootDone: setup stub");
        yu5.g gVar = yu5.g.INSTANCE;
        yu5.a aVar3 = yu5.b.f547447a;
        yu5.b.f547447a = gVar;
    }
}
