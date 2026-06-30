package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.HandlerThread f70846a = new android.os.HandlerThread("RunCgi");

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.modelbase.f3 f70847b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.Executor f70848c = new com.tencent.mm.modelbase.z2$$b();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.Executor f70849d = new com.tencent.mm.modelbase.z2$$c();

    public static int a(java.util.concurrent.Executor executor, final com.tencent.mm.modelbase.e3 e3Var, final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.o oVar, final com.tencent.mm.modelbase.m1 m1Var) {
        if (e3Var == null) {
            return 0;
        }
        executor.execute(new java.lang.Runnable() { // from class: com.tencent.mm.modelbase.z2$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.modelbase.e3.this.callback(i17, i18, str, oVar, m1Var);
            }
        });
        return 0;
    }

    public static void b(com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.f3 f3Var = f70847b;
        if (f3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
            return;
        }
        if (((gm0.n) f3Var).f273260a.f273288b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        } else if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: Param scene  == null.");
        } else {
            ((gm0.n) f3Var).f273260a.f273288b.d(m1Var);
        }
    }

    public static boolean c() {
        com.tencent.mm.modelbase.f3 f3Var = f70847b;
        if (f3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
            return false;
        }
        if (((gm0.n) f3Var).f273260a.f273288b != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        return false;
    }

    public static com.tencent.mm.modelbase.m1 d(com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.e3 e3Var, boolean z17) {
        return e(oVar, e3Var, z17, null);
    }

    public static com.tencent.mm.modelbase.m1 e(com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.e3 e3Var, boolean z17, im5.b bVar) {
        com.tencent.mm.modelbase.g3 g3Var = new com.tencent.mm.modelbase.g3(e3Var);
        if (e3Var == null) {
            g3Var = null;
        }
        if (bVar != null && g3Var != null) {
            bVar.keep(g3Var);
        }
        return f(oVar, g3Var, z17 ? f70849d : f70848c, false);
    }

    public static com.tencent.mm.modelbase.m1 f(com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.e3 e3Var, java.util.concurrent.Executor executor, boolean z17) {
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: Param CommReqResp is null");
            return null;
        }
        boolean z18 = true;
        boolean z19 = z17 && com.tencent.mm.sdk.platformtools.x2.p();
        if (!z19) {
            com.tencent.mm.modelbase.f3 f3Var = f70847b;
            if (f3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
                return null;
            }
            if (((gm0.n) f3Var).f273260a.f273288b == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
                return null;
            }
        }
        android.os.HandlerThread handlerThread = f70846a;
        synchronized (handlerThread) {
            if (!handlerThread.isAlive()) {
                try {
                    handlerThread.start();
                } catch (java.lang.IllegalThreadStateException unused) {
                }
            }
        }
        com.tencent.mm.modelbase.c3 c3Var = new com.tencent.mm.modelbase.c3(oVar, executor, e3Var);
        if (z19) {
            com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMPushCore", "[!] MMAutoAuth was not injected into PushCore, pending this scene: %s, funcId: %s", c3Var, java.lang.Integer.valueOf(oVar.f70713d));
                java.util.List list = com.tencent.mm.network.x2.f72171l;
                synchronized (list) {
                    ((java.util.ArrayList) list).add(c3Var);
                }
            } else {
                com.tencent.mm.network.x2.b(c17, c3Var);
            }
        } else {
            z18 = ((gm0.n) f70847b).f273260a.f273288b.h(c3Var, 0);
        }
        if (z18) {
            return c3Var;
        }
        return null;
    }
}
