package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {com.tencent.mm.ipcinvoker.wx_extension.i0.class})
/* loaded from: classes7.dex */
public class e1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.z0 f75061d = new com.tencent.mm.plugin.appbrand.utils.z0();

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAppBrand", "installedOfPluginAppBrand()");
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            m91.j jVar = m91.j.f324955a;
            com.tencent.mm.app.i4.a(new m91.i());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAppBrand", "configure()");
        com.tencent.mm.ipcinvoker.extension.c.a(gk1.b.f272460w);
        com.tencent.mm.plugin.appbrand.utils.q3 q3Var = com.tencent.mm.plugin.appbrand.utils.q3.f90534a;
        if (!com.tencent.mm.sdk.platformtools.x2.n() && pq5.j.f357688a == null) {
            lm5.j jVar2 = new lm5.j(new pq5.e(new com.tencent.mm.sdk.platformtools.n3(s75.a.a("WeChat.WORKER").getLooper())), "WeChat.WORKER");
            pq5.j.f357688a = jVar2;
            lm5.i.c("WeChat.WORKER", jVar2);
        }
        boolean z17 = true;
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            com.tencent.mm.plugin.appbrand.app.r7.b();
            if (!m91.f.f324952b.getAndSet(true)) {
                com.tencent.mm.app.MMCrashReportContents.S.f(m91.d.f324949d);
                com.tencent.mm.app.MMBugReportContents.f53230k.f53733w.f(m91.e.f324950d);
            }
        }
        if (dj1.a.a()) {
            com.tencent.mm.plugin.appbrand.keylogger.f0 f0Var = new com.tencent.mm.plugin.appbrand.keylogger.f0();
            com.tencent.mm.plugin.appbrand.keylogger.z zVar = com.tencent.mm.plugin.appbrand.keylogger.w.f84202a;
            zVar.getClass();
            com.tencent.mars.xlog.Log.i("KeyStepLoggerWrapper", "setLoggerDelegate");
            zVar.f84207a = f0Var;
            com.tencent.mm.plugin.appbrand.keylogger.w.f84203b = true;
        }
        com.tencent.mm.plugin.appbrand.report.quality.w1 w1Var = com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a;
        com.tencent.mm.plugin.appbrand.keylogger.x xVar = com.tencent.mm.plugin.appbrand.keylogger.y.f84205a;
        java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.plugin.appbrand.keylogger.t.f84200a.f84201a;
        java.util.List list = (java.util.List) hashMap.get(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.NAME);
        if (list == null) {
            list = new java.util.LinkedList();
            hashMap.put(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.NAME, list);
        }
        list.add(w1Var);
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            boolean z18 = ja1.e.f298603a;
            ja1.a aVar = new ja1.a();
            ah.d.f4713b = aVar;
            g8.c.f269408a = new ah.b(aVar);
            com.tencent.mm.udp.libmmudp.c.f196448a = new ja1.b();
            com.tencent.mm.tcp.libmmtcp.c.f196412a = new ja1.c();
            ij0.c.f291668a = new ja1.d();
            java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_android_appbrand_disable_preinit_egl", "");
            if (aj6 == null || !aj6.equals("1")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginAppBrand", "try to pre initialize egl");
                int[] iArr = new int[2];
                android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
                if (eglGetDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginAppBrand", "initialize egl done, version = [%d.%d]", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
                }
            }
            ik1.w.f291844c = false;
            zx5.n.b(com.tencent.mm.sdk.platformtools.x2.f193071a, hm1.o.f282219a);
        }
        android.app.Application a17 = com.tencent.mm.sdk.platformtools.i.a();
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            a17.registerActivityLifecycleCallbacks(com.tencent.mm.plugin.appbrand.app.r0.f75244i);
            com.tencent.mm.plugin.appbrand.app.r0.f75243h.set(true);
            jx3.f.INSTANCE.idkeyStat(365L, 4L, 1L, false);
            com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver.f158127d = 1000;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.j()) {
            com.tencent.mm.plugin.appbrand.report.l2 l2Var = com.tencent.mm.plugin.appbrand.report.l2.f87911b;
            ne.p.f336485a = l2Var;
            ne.m.f336484a = l2Var;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (!com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (!z65.c.a()) {
                    z17 = false;
                }
            }
            if (z17) {
                com.tencent.mm.plugin.appbrand.debugger.DebuggerShell debuggerShell = (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell) com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77582b.b();
                debuggerShell.getClass();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.appbrand.debugger");
                if (fp.h.a(33)) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(debuggerShell, intentFilter);
                } else {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(debuggerShell, intentFilter, 2);
                }
                for (com.tencent.mm.plugin.appbrand.debugger.e eVar : com.tencent.mm.plugin.appbrand.debugger.c.f77636a) {
                    if (eVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(eVar.name())) {
                        ((java.util.HashMap) debuggerShell.f77585a).put(eVar.name(), eVar);
                    }
                }
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            try {
                boolean a18 = fp.h.a(33);
                com.tencent.mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1 debuggerShellClientProcessHelper$receiver$1 = com.tencent.mm.plugin.appbrand.debugger.f.f77740a;
                if (a18) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
                    intentFilter2.addAction("com.tencent.mm.appbrand.debugger.appbrand_process_reload_configs");
                    context2.registerReceiver(debuggerShellClientProcessHelper$receiver$1, intentFilter2);
                } else {
                    android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    android.content.IntentFilter intentFilter3 = new android.content.IntentFilter();
                    intentFilter3.addAction("com.tencent.mm.appbrand.debugger.appbrand_process_reload_configs");
                    context3.registerReceiver(debuggerShellClientProcessHelper$receiver$1, intentFilter3, 2);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.DebuggerShellClientProcessHelper", "setup get exception " + th6);
            }
            com.tencent.mm.plugin.appbrand.utils.z0 z0Var = this.f75061d;
            z0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.AppSingletonRegistry ");
            a17.registerActivityLifecycleCallbacks(z0Var);
            com.tencent.mm.plugin.appbrand.utils.z0 z0Var2 = this.f75061d;
            z0Var2.f90631f = true;
            z0Var2.f90632g = a17;
            jk1.a aVar2 = jk1.a.INST;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppSingletonRegistry", "registerAppSingleton() called with: singleton = [%s]", aVar2);
            ((java.util.LinkedList) z0Var2.f90629d).offer(aVar2);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.ui.qk.f209573b;
            a17.registerActivityLifecycleCallbacks(new com.tencent.mm.ui.mk(new com.tencent.mm.ui.lk()));
            com.tencent.mm.ui.qk.f209573b.set(true);
        }
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            com.tencent.mars.WeChatMars.loadDependentLibraries();
            com.tencent.mm.plugin.appbrand.app.b1 b1Var = new com.tencent.mm.plugin.appbrand.app.b1(this);
            com.tencent.mars.cdn.CdnManager cdnManager = new com.tencent.mars.cdn.CdnManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
            cdnManager.onCreate(com.tencent.mm.vfs.w6.i("/data/user/0/" + com.tencent.mm.sdk.platformtools.x2.f193072b + "/MicroMsg/CronetCache/appbrand/cache/", true), "cdnwx2013usrname", java.lang.Boolean.valueOf(true ^ c01.e2.a0()));
            cdnManager.setAppCallback(b1Var);
            com.tencent.mars.cdn.CdnC2Java.setCallback(new com.tencent.mars.cdn.CdnC2JavaCallBack());
            com.tencent.mars.cdn.CronetLogic.setCallback(new com.tencent.mars.cdn.CronetLogicCallBack());
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginAppBrand", "CronetLogic setCallback init");
            com.tencent.mm.plugin.appbrand.app.c1 c1Var = com.tencent.mm.plugin.appbrand.app.c1.f75029a;
            if (c1Var == null) {
                synchronized (com.tencent.mm.plugin.appbrand.app.c1.class) {
                    if (com.tencent.mm.plugin.appbrand.app.c1.f75029a == null) {
                        com.tencent.mm.plugin.appbrand.app.c1.f75029a = new com.tencent.mm.plugin.appbrand.app.c1();
                    }
                }
                c1Var = com.tencent.mm.plugin.appbrand.app.c1.f75029a;
            }
            com.tencent.mars.cdn.CronetLogic.setGetHostImpl(c1Var);
        }
    }
}
