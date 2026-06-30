package p65;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f433972a = java.lang.System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public km0.c f433973b = null;

    public static void c(android.content.Context context) {
        fp.d0.o("stlport_shared");
        fp.d0.o("c++_shared");
        fp.d0.o("cxxstl.200");
    }

    public final com.p314xaae8f345.mm.p642xad8b531f.s a(android.app.Application application) {
        com.p314xaae8f345.mm.p642xad8b531f.s b17 = com.p314xaae8f345.mm.p642xad8b531f.s.b(application);
        this.f433973b.f390525f = b17;
        if (z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            if (application instanceof com.p314xaae8f345.mm.app.ApplicationC4994xc00dad30) {
                ((com.p314xaae8f345.mm.app.ApplicationC4994xc00dad30) application).m42946xac28aeeb();
            } else if (application instanceof com.p314xaae8f345.mm.app.ApplicationC4997x4de828a7) {
                ((com.p314xaae8f345.mm.app.ApplicationC4997x4de828a7) application).m42956xac28aeeb();
            }
        }
        return b17;
    }

    public final void b(android.app.Application application) {
        java.lang.Object invoke;
        android.content.Context baseContext;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.content.Context m42944x23d85138 = application instanceof com.p314xaae8f345.mm.app.ApplicationC4994xc00dad30 ? ((com.p314xaae8f345.mm.app.ApplicationC4994xc00dad30) application).m42944x23d85138() : application instanceof com.p314xaae8f345.mm.app.ApplicationC4997x4de828a7 ? ((com.p314xaae8f345.mm.app.ApplicationC4997x4de828a7) application).m42954x23d85138() : application.getBaseContext();
        while ((m42944x23d85138 instanceof android.content.ContextWrapper) && (baseContext = ((android.content.ContextWrapper) m42944x23d85138).getBaseContext()) != null) {
            m42944x23d85138 = baseContext;
        }
        try {
            try {
                java.lang.reflect.Field declaredField = m42944x23d85138.getClass().getDeclaredField("mPackageInfo");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(m42944x23d85138);
                java.lang.reflect.Method declaredMethod = obj.getClass().getDeclaredMethod("getResources", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new java.lang.Object[0]);
                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mApplication");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, application);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStartupRoutine", "[+] Inject app instance into LoadedApk done.");
            } finally {
                try {
                    java.lang.reflect.Field declaredField3 = m42944x23d85138.getClass().getDeclaredField("mMainThread");
                    declaredField3.setAccessible(true);
                    invoke = declaredField3.get(m42944x23d85138);
                } catch (java.lang.Throwable unused) {
                    java.lang.reflect.Method declaredMethod2 = java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new java.lang.Class[0]);
                    declaredMethod2.setAccessible(true);
                    invoke = declaredMethod2.invoke(null, new java.lang.Object[0]);
                }
                java.lang.reflect.Field declaredField4 = invoke.getClass().getDeclaredField("mInitialApplication");
                declaredField4.setAccessible(true);
                declaredField4.set(invoke, application);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStartupRoutine", "[+] Inject app instance into ActivityThread done.");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStartupRoutine", "[+] injectAppInstanceForEarlyFetching() costs %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            try {
                java.lang.reflect.Field declaredField32 = m42944x23d85138.getClass().getDeclaredField("mMainThread");
                declaredField32.setAccessible(true);
                invoke = declaredField32.get(m42944x23d85138);
                java.lang.reflect.Field declaredField42 = invoke.getClass().getDeclaredField("mInitialApplication");
                declaredField42.setAccessible(true);
                declaredField42.set(invoke, application);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStartupRoutine", "[+] Inject app instance into ActivityThread done.");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseStartupRoutine", th6, "[-] Fail to inject app instance into ActivityThread.", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStartupRoutine", "[+] injectAppInstanceForEarlyFetching() costs %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseStartupRoutine", "[+] injectAppInstanceForEarlyFetching() costs %s ms.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void d() {
        android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        if (com.p314xaae8f345.mm.app.v5.a(a17).f135402f) {
            if (android.os.Build.MANUFACTURER.equals("samsung") && android.os.Build.VERSION.SDK_INT <= 24) {
                a17.registerActivityLifecycleCallbacks(new um0.d(a17));
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        }
        boolean z17 = com.p314xaae8f345.mm.p849xbf8d97c1.l.f150255a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixDelegate", "onAppCreate");
        try {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g0.a(a17, ir0.f.f375460a);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MatrixDelegate", th6, "init Matrix-lifecycle failed", new java.lang.Object[0]);
            ((java.util.ArrayList) com.p314xaae8f345.mm.p849xbf8d97c1.l.f150256b).add(new com.p314xaae8f345.mm.p849xbf8d97c1.n(24556, 110, bm5.f1.a() + " - " + android.util.Log.getStackTraceString(th6)));
        }
    }

    public abstract void e(android.app.Application application);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x077d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0820 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0470 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList f(final android.app.Application r15) {
        /*
            Method dump skipped, instructions count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p65.a.f(android.app.Application):java.util.ArrayList");
    }

    public void g(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((wu5.c) it.next()).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseStartupRoutine", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
