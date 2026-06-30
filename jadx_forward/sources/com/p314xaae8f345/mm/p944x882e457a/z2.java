package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.HandlerThread f152379a = new android.os.HandlerThread("RunCgi");

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p944x882e457a.f3 f152380b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.Executor f152381c = new com.p314xaae8f345.mm.p944x882e457a.ExecutorC11115x6ce79ea();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.Executor f152382d = new com.p314xaae8f345.mm.p944x882e457a.ExecutorC11116x6ce79eb();

    public static int a(java.util.concurrent.Executor executor, final com.p314xaae8f345.mm.p944x882e457a.e3 e3Var, final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.o oVar, final com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (e3Var == null) {
            return 0;
        }
        executor.execute(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.z2$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p944x882e457a.e3.this.mo1034xf5bc2045(i17, i18, str, oVar, m1Var);
            }
        });
        return 0;
    }

    public static void b(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.f3 f3Var = f152380b;
        if (f3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
            return;
        }
        if (((gm0.n) f3Var).f354793a.f354821b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        } else if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: Param scene  == null.");
        } else {
            ((gm0.n) f3Var).f354793a.f354821b.d(m1Var);
        }
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p944x882e457a.f3 f3Var = f152380b;
        if (f3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
            return false;
        }
        if (((gm0.n) f3Var).f354793a.f354821b != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        return false;
    }

    public static com.p314xaae8f345.mm.p944x882e457a.m1 d(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.e3 e3Var, boolean z17) {
        return e(oVar, e3Var, z17, null);
    }

    public static com.p314xaae8f345.mm.p944x882e457a.m1 e(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.e3 e3Var, boolean z17, im5.b bVar) {
        com.p314xaae8f345.mm.p944x882e457a.g3 g3Var = new com.p314xaae8f345.mm.p944x882e457a.g3(e3Var);
        if (e3Var == null) {
            g3Var = null;
        }
        if (bVar != null && g3Var != null) {
            bVar.mo46316x322b85(g3Var);
        }
        return f(oVar, g3Var, z17 ? f152382d : f152381c, false);
    }

    public static com.p314xaae8f345.mm.p944x882e457a.m1 f(com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.e3 e3Var, java.util.concurrent.Executor executor, boolean z17) {
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: Param CommReqResp is null");
            return null;
        }
        boolean z18 = true;
        boolean z19 = z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p();
        if (!z19) {
            com.p314xaae8f345.mm.p944x882e457a.f3 f3Var = f152380b;
            if (f3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
                return null;
            }
            if (((gm0.n) f3Var).f354793a.f354821b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
                return null;
            }
        }
        android.os.HandlerThread handlerThread = f152379a;
        synchronized (handlerThread) {
            if (!handlerThread.isAlive()) {
                try {
                    handlerThread.start();
                } catch (java.lang.IllegalThreadStateException unused) {
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.c3 c3Var = new com.p314xaae8f345.mm.p944x882e457a.c3(oVar, executor, e3Var);
        if (z19) {
            com.p314xaae8f345.mm.p971x6de15a2e.g1 c17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMPushCore", "[!] MMAutoAuth was not injected into PushCore, pending this scene: %s, funcId: %s", c3Var, java.lang.Integer.valueOf(oVar.f152246d));
                java.util.List list = com.p314xaae8f345.mm.p971x6de15a2e.x2.f153704l;
                synchronized (list) {
                    ((java.util.ArrayList) list).add(c3Var);
                }
            } else {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.b(c17, c3Var);
            }
        } else {
            z18 = ((gm0.n) f152380b).f354793a.f354821b.h(c3Var, 0);
        }
        if (z18) {
            return c3Var;
        }
        return null;
    }
}
