package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class e1 implements uh1.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.g1 f77738a;

    public e1(com.tencent.mm.plugin.appbrand.debugger.g1 g1Var) {
        this.f77738a = g1Var;
    }

    public void a(int i17, java.lang.String str) {
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketClose code:%d reason:%s ", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f77738a;
        if (android.text.TextUtils.isEmpty(g1Var.f77750d.f77622x) || !g1Var.f77757n) {
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = g1Var.f77750d;
            synchronized (a1Var) {
                i18 = a1Var.f77604f;
            }
            if (!(i18 == 4) && ((long) a1Var.f77620v) < 10) {
                ik1.h0.a().b(new com.tencent.mm.plugin.appbrand.debugger.d1(this), 1000L);
                g1Var.f77750d.f77620v++;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketClose with ws lan");
            if (g1Var.f77755i.isRunning()) {
                com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = g1Var.f77756m;
                l2Var.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.c2(l2Var));
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.f2(l2Var));
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.g2(l2Var));
            }
            g1Var.f77757n = false;
        }
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = g1Var.f77754h;
        n1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClose");
        java.util.concurrent.Future future = n1Var.f77816l;
        if (future != null) {
            future.cancel(false);
        }
        g1Var.f77750d.f();
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var2 = g1Var.f77756m;
        l2Var2.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.c2(l2Var2));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.f2(l2Var2));
        g1Var.f77750d.e(5);
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var3 = g1Var.f77756m;
        l2Var3.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.j2(l2Var3, str));
    }

    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "onSocketError message:%s ", str);
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f77738a;
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = g1Var.f77756m;
        l2Var.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.j2(l2Var, str));
        }
        if (android.text.TextUtils.isEmpty(g1Var.f77750d.f77622x)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugJsEngine", "connect wsEndpoint %s fail, reset it empty", g1Var.f77750d.f77622x);
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var2 = g1Var.f77756m;
        java.lang.String str2 = g1Var.f77750d.f77622x;
        l2Var2.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.z1(l2Var2, str2));
        g1Var.f77750d.f77622x = "";
    }
}
