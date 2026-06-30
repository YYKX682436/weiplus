package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p794xb0fa9b5e.h0[] f149889a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static final boolean[] f149890b = {false};

    public static void a(java.lang.String str) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        b17.getClass();
        if ((com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(str) || ((java.util.concurrent.ConcurrentHashMap) b17.f149923c).get(str) == null) ? false : true) {
            return;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r0.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.g0(str));
    }

    public static void b() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.h0 h0Var;
        boolean[] zArr = f149890b;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            if (zArr[0]) {
                return;
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.h0[] h0VarArr = f149889a;
            synchronized (h0VarArr) {
                h0Var = h0VarArr[0];
                if (h0Var == null) {
                    throw new java.lang.IllegalStateException("Please call IPCInvokerBoot.prepare(...) first.");
                }
            }
            android.app.Application application = ((p65.l) h0Var).f433980a;
            iz5.a.d(null, application);
            com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150001a = application;
            com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150004d = new p65.k((p65.l) h0Var);
            com.p314xaae8f345.mm.p794xb0fa9b5e.e0 e0Var = new com.p314xaae8f345.mm.p794xb0fa9b5e.e0(application);
            p65.j jVar = new p65.j((p65.l) h0Var);
            iz5.a.d(null, jVar);
            rk0.c.f477930a = com.p314xaae8f345.mm.app.x2.INSTANCE;
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.util.Objects.requireNonNull(u0Var);
            p65.C29968x30bb37 c29968x30bb37 = new p65.C29968x30bb37(u0Var);
            rk0.c.c("IPC.IPCInvokeLogic", "setThreadPoolDelegate:%s", c29968x30bb37.toString());
            com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150003c = c29968x30bb37;
            jVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.f0());
            jVar.b(e0Var);
            rk0.c.c("IPC.IPCInvokerBoot", "setup IPCInvoker(process : %s, application : %s)", com.p314xaae8f345.mm.p794xb0fa9b5e.y.a(), java.lang.Integer.valueOf(application.hashCode()));
            zArr[0] = true;
        }
    }
}
