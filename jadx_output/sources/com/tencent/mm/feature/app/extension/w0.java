package com.tencent.mm.feature.app.extension;

/* loaded from: classes11.dex */
public class w0 implements hm0.q {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Locale f65032d;

    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        java.util.Locale locale;
        com.tencent.mm.network.o G;
        if ("language_default".equals(com.tencent.mm.sdk.platformtools.m2.p(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            com.tencent.mars.xlog.Log.i("WorkerProfileAppStatusCallback", "config locale %s", com.tencent.mm.sdk.platformtools.m2.t(configuration.locale));
            java.util.Locale initLanguage = com.tencent.mm.ui.MMActivity.initLanguage(com.tencent.mm.sdk.platformtools.i.a().getBaseContext(), com.tencent.mm.sdk.platformtools.m2.t(configuration.locale));
            com.tencent.mars.xlog.Log.i("WorkerProfileAppStatusCallback", "onConfigurationChanged, locale = %s, n = %s, configuration.locale = %s", f65032d, initLanguage, configuration.locale);
            if (initLanguage == null || (locale = f65032d) == null || initLanguage.equals(locale)) {
                return;
            }
            if (com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
                com.tencent.mars.xlog.Log.w("WorkerProfileAppStatusCallback", "language changed, but isForeground don't restart process!!!");
                return;
            }
            if (gm0.j1.a()) {
                try {
                    com.tencent.mm.network.s sVar = c01.d9.e().f70764d;
                    if (sVar != null && (G = sVar.G()) != null) {
                        G.E(new byte[0], new byte[0], new byte[0], c01.d9.b().C(), 0L);
                        sVar.u0();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("WorkerProfileAppStatusCallback", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.printErrStackTrace("WorkerProfileAppStatusCallback", e17, "what the f$!k", new java.lang.Object[0]);
                }
            }
            com.tencent.mars.xlog.Log.w("WorkerProfileAppStatusCallback", "language changed, restart process");
            m45.b.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(-1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/app/extension/WorkerProfileAppStatusCallback", "initLanguage", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/feature/app/extension/WorkerProfileAppStatusCallback", "initLanguage", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
    }
}
