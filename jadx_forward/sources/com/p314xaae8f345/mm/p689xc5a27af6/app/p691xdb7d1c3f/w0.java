package com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f;

/* loaded from: classes11.dex */
public class w0 implements hm0.q {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Locale f146565d;

    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
        java.util.Locale locale;
        com.p314xaae8f345.mm.p971x6de15a2e.o G;
        if ("language_default".equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WorkerProfileAppStatusCallback", "config locale %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.t(configuration.locale));
            java.util.Locale m78473x26f04c88 = com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78473x26f04c88(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().getBaseContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.t(configuration.locale));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WorkerProfileAppStatusCallback", "onConfigurationChanged, locale = %s, n = %s, configuration.locale = %s", f146565d, m78473x26f04c88, configuration.locale);
            if (m78473x26f04c88 == null || (locale = f146565d) == null || m78473x26f04c88.equals(locale)) {
                return;
            }
            if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WorkerProfileAppStatusCallback", "language changed, but isForeground don't restart process!!!");
                return;
            }
            if (gm0.j1.a()) {
                try {
                    com.p314xaae8f345.mm.p971x6de15a2e.s sVar = c01.d9.e().f152297d;
                    if (sVar != null && (G = sVar.G()) != null) {
                        G.E(new byte[0], new byte[0], new byte[0], c01.d9.b().C(), 0L);
                        sVar.u0();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WorkerProfileAppStatusCallback", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WorkerProfileAppStatusCallback", e17, "what the f$!k", new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WorkerProfileAppStatusCallback", "language changed, restart process");
            m45.b.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(-1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/app/extension/WorkerProfileAppStatusCallback", "initLanguage", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/feature/app/extension/WorkerProfileAppStatusCallback", "initLanguage", "(Landroid/content/res/Configuration;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
    }
}
