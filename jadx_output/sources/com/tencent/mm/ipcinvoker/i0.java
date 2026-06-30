package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ipcinvoker.h0[] f68356a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static final boolean[] f68357b = {false};

    public static void a(java.lang.String str) {
        com.tencent.mm.ipcinvoker.q b17 = com.tencent.mm.ipcinvoker.q.b();
        b17.getClass();
        if ((com.tencent.mm.ipcinvoker.y.b(str) || ((java.util.concurrent.ConcurrentHashMap) b17.f68390c).get(str) == null) ? false : true) {
            return;
        }
        com.tencent.mm.ipcinvoker.r0.a(new com.tencent.mm.ipcinvoker.g0(str));
    }

    public static void b() {
        com.tencent.mm.ipcinvoker.h0 h0Var;
        boolean[] zArr = f68357b;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            if (zArr[0]) {
                return;
            }
            com.tencent.mm.ipcinvoker.h0[] h0VarArr = f68356a;
            synchronized (h0VarArr) {
                h0Var = h0VarArr[0];
                if (h0Var == null) {
                    throw new java.lang.IllegalStateException("Please call IPCInvokerBoot.prepare(...) first.");
                }
            }
            android.app.Application application = ((p65.l) h0Var).f352447a;
            iz5.a.d(null, application);
            com.tencent.mm.ipcinvoker.y.f68468a = application;
            com.tencent.mm.ipcinvoker.y.f68471d = new p65.k((p65.l) h0Var);
            com.tencent.mm.ipcinvoker.e0 e0Var = new com.tencent.mm.ipcinvoker.e0(application);
            p65.j jVar = new p65.j((p65.l) h0Var);
            iz5.a.d(null, jVar);
            rk0.c.f396397a = com.tencent.mm.app.x2.INSTANCE;
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.util.Objects.requireNonNull(u0Var);
            p65.j$$a j__a = new p65.j$$a(u0Var);
            rk0.c.c("IPC.IPCInvokeLogic", "setThreadPoolDelegate:%s", j__a.toString());
            com.tencent.mm.ipcinvoker.y.f68470c = j__a;
            jVar.a(new com.tencent.mm.ipcinvoker.f0());
            jVar.b(e0Var);
            rk0.c.c("IPC.IPCInvokerBoot", "setup IPCInvoker(process : %s, application : %s)", com.tencent.mm.ipcinvoker.y.a(), java.lang.Integer.valueOf(application.hashCode()));
            zArr[0] = true;
        }
    }
}
